package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f2289a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f2290b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2291c = new Object();

    /* compiled from: ResourcesCompat */
    static class a {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    static class b {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f2292a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f2293b;

        /* renamed from: c  reason: collision with root package name */
        final int f2294c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i10;
            this.f2292a = colorStateList;
            this.f2293b = configuration;
            if (theme == null) {
                i10 = 0;
            } else {
                i10 = theme.hashCode();
            }
            this.f2294c = i10;
        }
    }

    /* compiled from: ResourcesCompat */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Resources f2295a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f2296b;

        d(Resources resources, Resources.Theme theme) {
            this.f2295a = resources;
            this.f2296b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f2295a.equals(dVar.f2295a) || !androidx.core.util.c.a(this.f2296b, dVar.f2296b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f2295a, this.f2296b);
        }
    }

    /* compiled from: ResourcesCompat */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(int i10, Handler handler) {
            e(handler).post(new i(this, i10));
        }

        public final void d(Typeface typeface, Handler handler) {
            e(handler).post(new j(this, typeface));
        }

        /* renamed from: h */
        public abstract void f(int i10);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    /* compiled from: ResourcesCompat */
    public static final class f {

        /* compiled from: ResourcesCompat */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f2297a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f2298b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f2299c;

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* Code decompiled incorrectly, please refer to instructions dump. */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = f2297a
                    monitor-enter(r0)
                    boolean r1 = f2299c     // Catch:{ all -> 0x0029 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001a
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0018 }
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0018 }
                    f2298b = r3     // Catch:{ NoSuchMethodException -> 0x0018 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0018 }
                L_0x0018:
                    f2299c = r1     // Catch:{ all -> 0x0029 }
                L_0x001a:
                    java.lang.reflect.Method r1 = f2298b     // Catch:{ all -> 0x0029 }
                    if (r1 == 0) goto L_0x0027
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    r1.invoke(r6, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0024 }
                    goto L_0x0027
                L_0x0024:
                    r6 = 0
                    f2298b = r6     // Catch:{ all -> 0x0029 }
                L_0x0027:
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    return
                L_0x0029:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0029 }
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* compiled from: ResourcesCompat */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(theme);
            } else if (i10 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2291c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f2290b;
            SparseArray sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i10, new c(colorStateList, dVar.f2295a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.d r5, int r6) {
        /*
            java.lang.Object r0 = f2291c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.h$d, android.util.SparseArray<androidx.core.content.res.h$c>> r1 = f2290b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.h$c r2 = (androidx.core.content.res.h.c) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f2293b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f2295a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f2296b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f2294c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f2294c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f2292a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$d, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b10 = b(dVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList g10 = g(resources, i10, theme);
        if (g10 != null) {
            a(dVar, i10, g10, theme);
            return g10;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return b.b(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable d(Resources resources, int i10, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(resources, i10, theme);
        }
        return resources.getDrawable(i10);
    }

    public static Typeface e(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i10, typedValue, i11, eVar, (Handler) null, true, false);
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f2289a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList g(Resources resources, int i10, Resources.Theme theme) {
        if (h(resources, i10)) {
            return null;
        }
        try {
            return c.a(resources, resources.getXml(i10), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean h(Resources resources, int i10) {
        TypedValue f10 = f();
        resources.getValue(i10, f10, true);
        int i11 = f10.type;
        if (i11 < 28 || i11 > 31) {
            return false;
        }
        return true;
    }

    private static Typeface i(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        int i12 = i10;
        resources.getValue(i10, typedValue, true);
        Typeface j10 = j(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (j10 != null || eVar != null || z11) {
            return j10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface j(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.res.h.e r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r2 = r16
            r0 = r17
            r3 = r18
            r10 = r20
            r11 = r21
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00a1
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L_0x0022
            if (r10 == 0) goto L_0x0021
            r10.c(r13, r11)
        L_0x0021:
            return r14
        L_0x0022:
            int r1 = r0.assetCookie
            r6 = r19
            android.graphics.Typeface r1 = androidx.core.graphics.e.f(r2, r3, r12, r1, r6)
            if (r1 == 0) goto L_0x0032
            if (r10 == 0) goto L_0x0031
            r10.d(r1, r11)
        L_0x0031:
            return r1
        L_0x0032:
            if (r23 == 0) goto L_0x0035
            return r14
        L_0x0035:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r1 == 0) goto L_0x0066
            android.content.res.XmlResourceParser r1 = r2.getXml(r3)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            androidx.core.content.res.e$b r1 = androidx.core.content.res.e.b(r1, r2)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r1 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0050
            r10.c(r13, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
        L_0x0050:
            return r14
        L_0x0051:
            int r5 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            r0 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            android.graphics.Typeface r0 = androidx.core.graphics.e.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            return r0
        L_0x0066:
            int r4 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r12
            r5 = r19
            android.graphics.Typeface r0 = androidx.core.graphics.e.d(r0, r1, r2, r3, r4, r5)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            if (r10 == 0) goto L_0x007f
            if (r0 == 0) goto L_0x007c
            r10.d(r0, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
            goto L_0x007f
        L_0x007c:
            r10.c(r13, r11)     // Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0080 }
        L_0x007f:
            return r0
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            r0.append(r1)
            r0.append(r12)
            goto L_0x009b
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
            r0.append(r1)
            r0.append(r12)
        L_0x009b:
            if (r10 == 0) goto L_0x00a0
            r10.c(r13, r11)
        L_0x00a0:
            return r14
        L_0x00a1:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r2.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r18)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
