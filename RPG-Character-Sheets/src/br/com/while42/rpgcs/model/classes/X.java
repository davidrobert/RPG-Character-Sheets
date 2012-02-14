package br.com.while42.rpgcs.model.classes;

import java.io.IOException;
import java.lang.annotation.Annotation;
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

public class X {
	public static List<TypeCode> getModels(Context context, String packageName) {

		String apkName;
		List<TypeCode> classes = new ArrayList<TypeCode>();
		
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
		DexClassLoader classLoader = new DexClassLoader(apkName, new ContextWrapper(context).getCacheDir()
				.getAbsolutePath(), null, classLoader2);

		
		Enumeration<String> entries = dexFile.entries();

		while (entries.hasMoreElements()) {
			String entry = entries.nextElement();

			// only check items that exists in source package, not in libraries,
			// etc.
			if (entry.startsWith(packageName + ".model.classes")) {

				Class<?> entryClass;
				try {
					entryClass = classLoader.loadClass(entry); // dexFile.loadClass(entry,
				} catch (ClassNotFoundException e) {
					Log.d("DEBUG", e.getMessage());
					continue;
				}

				if (entryClass != null) {
					// Log.i(">>>#######>", entryClass.getName());
					Annotation[] annotations = entryClass.getAnnotations();
					for (Annotation annotation : annotations) {
						Log.i(">>>%%%>", entryClass.getName());
						if (annotation instanceof Deprecated && annotation instanceof CharacterClass) {
							Class<CharacterClass> cc = (Class<CharacterClass>) entryClass;
							
							//classes.add(cc.getClassType());
						}
					}
				}
			}
		}

		return classes;
	}
}
