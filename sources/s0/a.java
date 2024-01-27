package s0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* compiled from: MultiDex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<File> f11296a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f11297b = m(System.getProperty("java.vm.version"));

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* compiled from: MultiDex */
    private static final class C0194a {

        /* renamed from: b  reason: collision with root package name */
        private static final int f11298b = 4;

        /* renamed from: a  reason: collision with root package name */
        private final C0195a f11299a;

        /* renamed from: s0.a$a$a  reason: collision with other inner class name */
        /* compiled from: MultiDex */
        private interface C0195a {
            Object a(File file, DexFile dexFile);
        }

        /* renamed from: s0.a$a$b */
        /* compiled from: MultiDex */
        private static class b implements C0195a {

            /* renamed from: a  reason: collision with root package name */
            private final Constructor<?> f11300a;

            b(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f11300a = constructor;
                constructor.setAccessible(true);
            }

            public Object a(File file, DexFile dexFile) {
                return this.f11300a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: s0.a$a$c */
        /* compiled from: MultiDex */
        private static class c implements C0195a {

            /* renamed from: a  reason: collision with root package name */
            private final Constructor<?> f11301a;

            c(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f11301a = constructor;
                constructor.setAccessible(true);
            }

            public Object a(File file, DexFile dexFile) {
                return this.f11301a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: s0.a$a$d */
        /* compiled from: MultiDex */
        private static class d implements C0195a {

            /* renamed from: a  reason: collision with root package name */
            private final Constructor<?> f11302a;

            d(Class<?> cls) {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f11302a = constructor;
                constructor.setAccessible(true);
            }

            public Object a(File file, DexFile dexFile) {
                return this.f11302a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0194a() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                s0.a$a$b r1 = new s0.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                s0.a$a$c r1 = new s0.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                s0.a$a$d r1 = new s0.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f11299a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.C0194a.<init>():void");
        }

        static void a(ClassLoader classLoader, List<? extends File> list) {
            Object obj = a.g(classLoader, "pathList").get(classLoader);
            Object[] b10 = new C0194a().b(list);
            try {
                a.f(obj, "dexElements", b10);
            } catch (NoSuchFieldException unused) {
                a.f(obj, "pathElements", b10);
            }
        }

        private Object[] b(List<? extends File> list) {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                File file = (File) list.get(i10);
                objArr[i10] = this.f11299a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }

        private static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f11298b) + ".dex").getPath();
        }
    }

    /* compiled from: MultiDex */
    private static final class b {
        static void a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = a.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field a10 = a.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a10.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a10.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) a.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* compiled from: MultiDex */
    private static final class c {
        static void a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field a10 = a.g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a10.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a10.set(classLoader, sb.toString());
            a.f(classLoader, "mPaths", strArr);
            a.f(classLoader, "mFiles", fileArr);
            a.f(classLoader, "mZips", zipFileArr);
            a.f(classLoader, "mDexs", dexFileArr);
        }
    }

    private static void d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Deleted old secondary dex dir ");
            sb7.append(file.getPath());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[SYNTHETIC, Splitter:B:34:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078 A[Catch:{ RuntimeException -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void e(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            java.util.Set<java.io.File> r0 = f11296a
            monitor-enter(r0)
            boolean r1 = r0.contains(r6)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x000b:
            r0.add(r6)     // Catch:{ all -> 0x0081 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0081 }
            r2 = 20
            if (r1 <= r2) goto L_0x0046
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r3.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "MultiDex is not guaranteed to work in SDK version "
            r3.append(r4)     // Catch:{ all -> 0x0081 }
            r3.append(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = ": SDK version higher than "
            r3.append(r1)     // Catch:{ all -> 0x0081 }
            r3.append(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = " should be backed by "
            r3.append(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r3.append(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "case here: java.vm.version=\""
            r3.append(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0081 }
            r3.append(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "\""
            r3.append(r1)     // Catch:{ all -> 0x0081 }
        L_0x0046:
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch:{ RuntimeException -> 0x007f }
            if (r1 != 0) goto L_0x004e
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x004e:
            d(r5)     // Catch:{ all -> 0x0051 }
        L_0x0051:
            java.io.File r7 = j(r5, r7, r8)     // Catch:{ all -> 0x0081 }
            s0.b r8 = new s0.b     // Catch:{ all -> 0x0081 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x0081 }
            r6 = 0
            r2 = 0
            java.util.List r2 = r8.J(r5, r9, r2)     // Catch:{ all -> 0x007a }
            l(r1, r7, r2)     // Catch:{ IOException -> 0x0064 }
            goto L_0x006f
        L_0x0064:
            r2 = move-exception
            if (r10 == 0) goto L_0x0079
            r10 = 1
            java.util.List r5 = r8.J(r5, r9, r10)     // Catch:{ all -> 0x007a }
            l(r1, r7, r5)     // Catch:{ all -> 0x007a }
        L_0x006f:
            r8.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r6 = move-exception
        L_0x0074:
            if (r6 != 0) goto L_0x0078
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x0078:
            throw r6     // Catch:{ all -> 0x0081 }
        L_0x0079:
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r5 = move-exception
            r8.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            throw r5     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.e(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    public static void f(Object obj, String str, Object[] objArr) {
        Field g10 = g(obj, str);
        Object[] objArr2 = (Object[]) g10.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g10.set(obj, objArr3);
    }

    /* access modifiers changed from: private */
    public static Field g(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    public static Method h(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static File j(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            n(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            n(file2);
        }
        File file3 = new File(file2, str);
        n(file3);
        return file3;
    }

    public static void k(Context context) {
        if (!f11297b) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 4) {
                try {
                    ApplicationInfo i11 = i(context);
                    if (i11 != null) {
                        e(context, new File(i11.sourceDir), new File(i11.dataDir), "secondary-dexes", "", true);
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
                }
            } else {
                throw new RuntimeException("MultiDex installation failed. SDK " + i10 + " is unsupported. Min SDK version is " + 4 + ".");
            }
        }
    }

    private static void l(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 19) {
                b.a(classLoader, list, file);
            } else if (i10 >= 14) {
                C0194a.a(classLoader, list);
            } else {
                c.a(classLoader, list);
            }
        }
    }

    static boolean m(String str) {
        boolean z10 = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z10 ? " has multidex support" : " does not have multidex support");
        return z10;
    }

    private static void n(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
