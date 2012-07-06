package br.com.while42.rpgcs.reflection;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;

public class ClassByReflection {
	private static Map<String, List<?>> cache = new HashMap<String, List<?>>();
	
	@SuppressWarnings("unchecked")
	public static <T, K> List<K> getAll(Context context, String packageName, Class<T> superc) {
		if (cache.containsKey(superc.getCanonicalName())) {
			Log.d("CACHE", "GET");
			return (List<K>) cache.get(superc.getCanonicalName());
		}

		String apkName;
		List<K> list = new ArrayList<K>();

		try {
			apkName = context.getPackageManager().getApplicationInfo(packageName, 0).sourceDir;
		} catch (NameNotFoundException e1) {
			Log.d("DEBUG", e1.getMessage());
			return list;
		}

		DexFile dexFile;
		try {
			dexFile = new DexFile(apkName);
		} catch (IOException e1) {
			Log.d("DEBUG", e1.getMessage());
			return list;
		}

		PathClassLoader classLoader2 = new PathClassLoader(apkName, Thread.currentThread().getContextClassLoader());
		DexClassLoader classLoader = new DexClassLoader(apkName, new ContextWrapper(context).getCacheDir()
				.getAbsolutePath(), null, classLoader2);

		Enumeration<String> entries = dexFile.entries();

		while (entries.hasMoreElements()) {
			String entry = entries.nextElement();

			// only check items that exists in source package, not in libraries,
			// etc.
			if (entry.startsWith(packageName)) {

				Class<?> entryClass;
				try {
					entryClass = classLoader.loadClass(entry); // dexFile.loadClass(entry,
				} catch (ClassNotFoundException e) {
					Log.d("DEBUG", e.getMessage());
					continue;
				}				

				if (entryClass != null && !entryClass.isInterface() && !Modifier.isAbstract(entryClass.getModifiers())) {
					
					boolean isPublic = false;
					Constructor<?>[] constructors = entryClass.getConstructors();
					for (Constructor<?> c: constructors) {
						isPublic = Modifier.isPublic(c.getModifiers());
					}
					
					if (!isPublic) {
						continue;
					}
					
					Class<?> superclass = entryClass.getSuperclass();
					while (superclass != null && superclass != superc) {
						superclass = superclass.getSuperclass();
					}

					if (superclass != null && superclass == superc) {
						try {
							K obj = (K) entryClass.newInstance();
							list.add(obj);

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

		Log.d("CACHE", "PUT");
		cache.put(superc.getCanonicalName(), new ArrayList<K>(list));
		return list;
	}
}
