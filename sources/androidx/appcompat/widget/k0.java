package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.collection.h;
import androidx.collection.i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ResourceManagerInternal */
public final class k0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1136h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static k0 f1137i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1138j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, i<ColorStateList>> f1139a;

    /* renamed from: b  reason: collision with root package name */
    private h<String, d> f1140b;

    /* renamed from: c  reason: collision with root package name */
    private i<String> f1141c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.e<WeakReference<Drawable.ConstantState>>> f1142d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1143e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1144f;

    /* renamed from: g  reason: collision with root package name */
    private e f1145g;

    /* compiled from: ResourceManagerInternal */
    static class a implements d {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class b implements d {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class c extends androidx.collection.f<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(a(i10, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal */
    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal */
    interface e {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(k0 k0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal */
    private static class f implements d {
        f() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f1140b == null) {
            this.f1140b = new h<>();
        }
        this.f1140b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.e eVar = this.f1142d.get(context);
        if (eVar == null) {
            eVar = new androidx.collection.e();
            this.f1142d.put(context, eVar);
        }
        eVar.k(j10, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1139a == null) {
            this.f1139a = new WeakHashMap<>();
        }
        i iVar = this.f1139a.get(context);
        if (iVar == null) {
            iVar = new i();
            this.f1139a.put(context, iVar);
        }
        iVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (!this.f1144f) {
            this.f1144f = true;
            Drawable j10 = j(context, j.a.f9360a);
            if (j10 == null || !q(j10)) {
                this.f1144f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i10) {
        Drawable drawable;
        if (this.f1143e == null) {
            this.f1143e = new TypedValue();
        }
        TypedValue typedValue = this.f1143e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        e eVar = this.f1145g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.c(this, context, i10);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized k0 h() {
        k0 k0Var;
        synchronized (k0.class) {
            if (f1137i == null) {
                k0 k0Var2 = new k0();
                f1137i = k0Var2;
                p(k0Var2);
            }
            k0Var = f1137i;
        }
        return k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1142d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.e r0 = (androidx.collection.e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.e(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.l(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (k0.class) {
            c cVar = f1138j;
            b10 = cVar.b(i10, mode);
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                cVar.c(i10, mode, b10);
            }
        }
        return b10;
    }

    private ColorStateList n(Context context, int i10) {
        i iVar;
        WeakHashMap<Context, i<ColorStateList>> weakHashMap = this.f1139a;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) iVar.e(i10);
    }

    private static void p(k0 k0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            k0Var.a("vector", new f());
            k0Var.a("animated-vector", new b());
            k0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            androidx.collection.h<java.lang.String, androidx.appcompat.widget.k0$d> r0 = r10.f1140b
            r1 = 0
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ab
            androidx.collection.i<java.lang.String> r0 = r10.f1141c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.h<java.lang.String, androidx.appcompat.widget.k0$d> r3 = r10.f1140b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.i r0 = new androidx.collection.i
            r0.<init>()
            r10.f1141c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1143e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1143e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1143e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00a3
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00a3
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.i<java.lang.String> r8 = r10.f1141c     // Catch:{ Exception -> 0x00a2 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.h<java.lang.String, androidx.appcompat.widget.k0$d> r8 = r10.f1140b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.k0$d r3 = (androidx.appcompat.widget.k0.d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00a3
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a3
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
        L_0x00a3:
            if (r6 != 0) goto L_0x00aa
            androidx.collection.i<java.lang.String> r11 = r10.f1141c
            r11.a(r12, r2)
        L_0x00aa:
            return r6
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 != null) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable q10 = androidx.core.graphics.drawable.a.q(drawable);
            androidx.core.graphics.drawable.a.n(q10, m10);
            PorterDuff.Mode o10 = o(i10);
            if (o10 == null) {
                return q10;
            }
            androidx.core.graphics.drawable.a.o(q10, o10);
            return q10;
        }
        e eVar = this.f1145g;
        if ((eVar == null || !eVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, s0 s0Var, int[] iArr) {
        if (!c0.a(drawable) || drawable.mutate() == drawable) {
            boolean z10 = s0Var.f1224d;
            if (z10 || s0Var.f1223c) {
                drawable.setColorFilter(g(z10 ? s0Var.f1221a : null, s0Var.f1223c ? s0Var.f1222b : f1136h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.f(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            c0.b(r10);
        }
        return r10;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            e eVar = this.f1145g;
            n10 = eVar == null ? null : eVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i10) {
        e eVar = this.f1145g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i10);
    }

    public synchronized void s(Context context) {
        androidx.collection.e eVar = this.f1142d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, z0 z0Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = z0Var.c(i10);
        }
        if (r10 == null) {
            return null;
        }
        return v(context, i10, false, r10);
    }

    public synchronized void u(e eVar) {
        this.f1145g = eVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        e eVar = this.f1145g;
        return eVar != null && eVar.a(context, i10, drawable);
    }
}
