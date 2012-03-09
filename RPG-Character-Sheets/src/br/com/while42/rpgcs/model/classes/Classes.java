package br.com.while42.rpgcs.model.classes;

import java.io.IOException;	
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;  

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import br.com.while42.rpgcs.model.character.attributes.TypeCode;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;

public class Classes {
	public TypeCode[] getTypeCodes(Context context, String packageName) {
		List<CharacterClass> classes = getModels(context, packageName);
		
		TypeCode[] types = new TypeCode[classes.size()];
		
		int i = 0;
		for (CharacterClass c : classes) {
			types[i++] = c.getClassType();
		}
		
		return types;
	}
	
	private List<CharacterClass> getModels(Context context, String packageName) {

		String apkName;
		List<CharacterClass> classes = new ArrayList<CharacterClass>();
		
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
			if (entry.startsWith(packageName)) {

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
						try {
							AbstractClass character = (AbstractClass) entryClass.newInstance();							
							classes.add(character);
							
						} catch (InstantiationException e) {
							Log.d("DEBUG", e.getMessage());
							e.printStackTrace();
							
						} catch (IllegalAccessException e) {
							Log.d("DEBUG", e.getMessage());
							e.printStackTrace();
						}
					}					
				}
			}
		}

		return classes;
	}
}
