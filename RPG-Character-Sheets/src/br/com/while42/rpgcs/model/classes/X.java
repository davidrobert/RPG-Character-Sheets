package br.com.while42.rpgcs.model.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;

public class X {
	public static TypeRpgClass[] getTypeCodes(Context context, String packageName) {
		List<TypeRpgClass> types = new ArrayList<TypeRpgClass>();
		
		List<Class<? extends AbstractClass>> classes = getModels(context, packageName);
		
		for (Class<? extends AbstractClass> c : classes) {
			try {
				types.add(c.getClass().newInstance().getClassType());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return (TypeRpgClass[]) types.toArray();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Class<? extends AbstractClass>> getModels(Context context, String packageName) {

		String apkName;
		List<Class<? extends AbstractClass>> classes = new ArrayList<Class<? extends AbstractClass>>();
		
		try {
			apkName = context.getPackageManager().getApplicationInfo(packageName, 0).sourceDir;
		} catch (NameNotFoundException e1) {
			Log.d("DEBUG", e1.getMessage());
			return classes;
		}
		
		DexFile dexFile;
		try {
			dexFile = new DexFile(apkName);
		} catch (IOException e1) {
			Log.d("DEBUG", e1.getMessage());
			return classes;
		}

		PathClassLoader classLoader2 = new PathClassLoader(apkName, Thread.currentThread().getContextClassLoader());
		DexClassLoader classLoader = new DexClassLoader(apkName, new ContextWrapper(context).getCacheDir().getAbsolutePath(), null, classLoader2);
		
		Enumeration<String> entries = dexFile.entries();

		while (entries.hasMoreElements()) {
			String entry = entries.nextElement();

			// only check items that exists in source package, not in libraries, etc.
			if (entry.startsWith(packageName + ".model.classes")) {

				Class<?> entryClass;
				try {
					entryClass = classLoader.loadClass(entry); // dexFile.loadClass(entry,
				} catch (ClassNotFoundException e) {
					Log.d("DEBUG", e.getMessage());
					continue;
				}
				
				if (entryClass != null) {												
					Class<?> superclass = entryClass.getSuperclass();
					if (superclass != null && superclass == AbstractClass.class) {
						classes.add((Class<? extends AbstractClass>) superclass);
					}					
				}
			}
		}

		return classes;
	}
}
