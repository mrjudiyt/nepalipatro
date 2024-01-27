package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat */
public class j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f2535b;

    /* renamed from: a  reason: collision with root package name */
    private final l f2536a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* compiled from: WindowInsetsCompat */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f2537a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f2538b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f2539c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2540d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2537a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2538b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2539c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e10.getMessage());
            }
        }

        public static j0 a(View view) {
            if (f2540d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2537a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2538b.get(obj);
                        Rect rect2 = (Rect) f2539c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            j0 a10 = new b().b(androidx.core.graphics.c.c(rect)).c(androidx.core.graphics.c.c(rect2)).a();
                            a10.s(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e10.getMessage());
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class e extends d {
        e() {
        }

        e(j0 j0Var) {
            super(j0Var);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final j0 f2549a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.c[] f2550b;

        f() {
            this(new j0((j0) null));
        }

        /* access modifiers changed from: protected */
        public final void a() {
            androidx.core.graphics.c[] cVarArr = this.f2550b;
            if (cVarArr != null) {
                androidx.core.graphics.c cVar = cVarArr[m.b(1)];
                androidx.core.graphics.c cVar2 = this.f2550b[m.b(2)];
                if (cVar2 == null) {
                    cVar2 = this.f2549a.f(2);
                }
                if (cVar == null) {
                    cVar = this.f2549a.f(1);
                }
                f(androidx.core.graphics.c.a(cVar, cVar2));
                androidx.core.graphics.c cVar3 = this.f2550b[m.b(16)];
                if (cVar3 != null) {
                    e(cVar3);
                }
                androidx.core.graphics.c cVar4 = this.f2550b[m.b(32)];
                if (cVar4 != null) {
                    c(cVar4);
                }
                androidx.core.graphics.c cVar5 = this.f2550b[m.b(64)];
                if (cVar5 != null) {
                    g(cVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public j0 b() {
            a();
            return this.f2549a;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.c cVar) {
        }

        f(j0 j0Var) {
            this.f2549a = j0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class i extends h {
        i(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public j0 a() {
            return j0.v(this.f2556c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!Objects.equals(this.f2556c, iVar.f2556c) || !Objects.equals(this.f2560g, iVar.f2560g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public c f() {
            return c.e(this.f2556c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f2556c.hashCode();
        }

        i(j0 j0Var, i iVar) {
            super(j0Var, (h) iVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final j0 f2565q = j0.v(WindowInsets.CONSUMED);

        k(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public androidx.core.graphics.c g(int i10) {
            return androidx.core.graphics.c.d(this.f2556c.getInsets(n.a(i10)));
        }

        public boolean p(int i10) {
            return this.f2556c.isVisible(n.a(i10));
        }

        k(j0 j0Var, k kVar) {
            super(j0Var, (j) kVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class l {

        /* renamed from: b  reason: collision with root package name */
        static final j0 f2566b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final j0 f2567a;

        l(j0 j0Var) {
            this.f2567a = j0Var;
        }

        /* access modifiers changed from: package-private */
        public j0 a() {
            return this.f2567a;
        }

        /* access modifiers changed from: package-private */
        public j0 b() {
            return this.f2567a;
        }

        /* access modifiers changed from: package-private */
        public j0 c() {
            return this.f2567a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(j0 j0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (o() != lVar.o() || n() != lVar.n() || !androidx.core.util.c.a(k(), lVar.k()) || !androidx.core.util.c.a(i(), lVar.i()) || !androidx.core.util.c.a(f(), lVar.f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public c f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c g(int i10) {
            return androidx.core.graphics.c.f2316e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c i() {
            return androidx.core.graphics.c.f2316e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c j() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c k() {
            return androidx.core.graphics.c.f2316e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c l() {
            return k();
        }

        /* access modifiers changed from: package-private */
        public j0 m(int i10, int i11, int i12, int i13) {
            return f2566b;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i10) {
            return true;
        }

        public void q(androidx.core.graphics.c[] cVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void r(androidx.core.graphics.c cVar) {
        }

        /* access modifiers changed from: package-private */
        public void s(j0 j0Var) {
        }

        public void t(androidx.core.graphics.c cVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static final class n {
        static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2535b = k.f2565q;
        } else {
            f2535b = l.f2566b;
        }
    }

    private j0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2536a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f2536a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f2536a = new i(this, windowInsets);
        } else if (i10 >= 21) {
            this.f2536a = new h(this, windowInsets);
        } else if (i10 >= 20) {
            this.f2536a = new g(this, windowInsets);
        } else {
            this.f2536a = new l(this);
        }
    }

    static androidx.core.graphics.c m(androidx.core.graphics.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.f2317a - i10);
        int max2 = Math.max(0, cVar.f2318b - i11);
        int max3 = Math.max(0, cVar.f2319c - i12);
        int max4 = Math.max(0, cVar.f2320d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return cVar;
        }
        return androidx.core.graphics.c.b(max, max2, max3, max4);
    }

    public static j0 v(WindowInsets windowInsets) {
        return w(windowInsets, (View) null);
    }

    public static j0 w(WindowInsets windowInsets, View view) {
        j0 j0Var = new j0((WindowInsets) androidx.core.util.h.b(windowInsets));
        if (view != null && z.E(view)) {
            j0Var.s(z.w(view));
            j0Var.d(view.getRootView());
        }
        return j0Var;
    }

    @Deprecated
    public j0 a() {
        return this.f2536a.a();
    }

    @Deprecated
    public j0 b() {
        return this.f2536a.b();
    }

    @Deprecated
    public j0 c() {
        return this.f2536a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f2536a.d(view);
    }

    public c e() {
        return this.f2536a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return androidx.core.util.c.a(this.f2536a, ((j0) obj).f2536a);
    }

    public androidx.core.graphics.c f(int i10) {
        return this.f2536a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.c g() {
        return this.f2536a.i();
    }

    @Deprecated
    public int h() {
        return this.f2536a.k().f2320d;
    }

    public int hashCode() {
        l lVar = this.f2536a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f2536a.k().f2317a;
    }

    @Deprecated
    public int j() {
        return this.f2536a.k().f2319c;
    }

    @Deprecated
    public int k() {
        return this.f2536a.k().f2318b;
    }

    public j0 l(int i10, int i11, int i12, int i13) {
        return this.f2536a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f2536a.n();
    }

    public boolean o(int i10) {
        return this.f2536a.p(i10);
    }

    @Deprecated
    public j0 p(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.c.b(i10, i11, i12, i13)).a();
    }

    /* access modifiers changed from: package-private */
    public void q(androidx.core.graphics.c[] cVarArr) {
        this.f2536a.q(cVarArr);
    }

    /* access modifiers changed from: package-private */
    public void r(androidx.core.graphics.c cVar) {
        this.f2536a.r(cVar);
    }

    /* access modifiers changed from: package-private */
    public void s(j0 j0Var) {
        this.f2536a.s(j0Var);
    }

    /* access modifiers changed from: package-private */
    public void t(androidx.core.graphics.c cVar) {
        this.f2536a.t(cVar);
    }

    public WindowInsets u() {
        l lVar = this.f2536a;
        if (lVar instanceof g) {
            return ((g) lVar).f2556c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f2542e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f2543f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f2544g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2545h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f2546c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.c f2547d;

        c() {
            this.f2546c = h();
        }

        private static WindowInsets h() {
            if (!f2543f) {
                try {
                    f2542e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f2543f = true;
            }
            Field field = f2542e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f2545h) {
                try {
                    f2544g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f2545h = true;
            }
            Constructor<WindowInsets> constructor = f2544g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public j0 b() {
            a();
            j0 v10 = j0.v(this.f2546c);
            v10.q(this.f2550b);
            v10.t(this.f2547d);
            return v10;
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.c cVar) {
            this.f2547d = cVar;
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.c cVar) {
            WindowInsets windowInsets = this.f2546c;
            if (windowInsets != null) {
                this.f2546c = windowInsets.replaceSystemWindowInsets(cVar.f2317a, cVar.f2318b, cVar.f2319c, cVar.f2320d);
            }
        }

        c(j0 j0Var) {
            super(j0Var);
            this.f2546c = j0Var.u();
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f2548c;

        d() {
            this.f2548c = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        public j0 b() {
            a();
            j0 v10 = j0.v(this.f2548c.build());
            v10.q(this.f2550b);
            return v10;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.core.graphics.c cVar) {
            this.f2548c.setMandatorySystemGestureInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.c cVar) {
            this.f2548c.setStableInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.c cVar) {
            this.f2548c.setSystemGestureInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.c cVar) {
            this.f2548c.setSystemWindowInsets(cVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.c cVar) {
            this.f2548c.setTappableElementInsets(cVar.e());
        }

        d(j0 j0Var) {
            super(j0Var);
            WindowInsets.Builder builder;
            WindowInsets u10 = j0Var.u();
            if (u10 != null) {
                builder = new WindowInsets.Builder(u10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f2548c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.c f2561m = null;

        h(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public j0 b() {
            return j0.v(this.f2556c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public j0 c() {
            return j0.v(this.f2556c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.c i() {
            if (this.f2561m == null) {
                this.f2561m = androidx.core.graphics.c.b(this.f2556c.getStableInsetLeft(), this.f2556c.getStableInsetTop(), this.f2556c.getStableInsetRight(), this.f2556c.getStableInsetBottom());
            }
            return this.f2561m;
        }

        /* access modifiers changed from: package-private */
        public boolean n() {
            return this.f2556c.isConsumed();
        }

        public void t(androidx.core.graphics.c cVar) {
            this.f2561m = cVar;
        }

        h(j0 j0Var, h hVar) {
            super(j0Var, (g) hVar);
            this.f2561m = hVar.f2561m;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2551h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f2552i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f2553j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f2554k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f2555l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f2556c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.c[] f2557d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.c f2558e;

        /* renamed from: f  reason: collision with root package name */
        private j0 f2559f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.c f2560g;

        g(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var);
            this.f2558e = null;
            this.f2556c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.c u(int i10, boolean z10) {
            androidx.core.graphics.c cVar = androidx.core.graphics.c.f2316e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    cVar = androidx.core.graphics.c.a(cVar, v(i11, z10));
                }
            }
            return cVar;
        }

        private androidx.core.graphics.c w() {
            j0 j0Var = this.f2559f;
            if (j0Var != null) {
                return j0Var.g();
            }
            return androidx.core.graphics.c.f2316e;
        }

        private androidx.core.graphics.c x(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2551h) {
                    z();
                }
                Method method = f2552i;
                if (!(method == null || f2553j == null || f2554k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f2554k.get(f2555l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.c.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to get visible insets. (Reflection error). ");
                        sb.append(e10.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void z() {
            try {
                f2552i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2553j = cls;
                f2554k = cls.getDeclaredField("mVisibleInsets");
                f2555l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2554k.setAccessible(true);
                f2555l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e10.getMessage());
            }
            f2551h = true;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            androidx.core.graphics.c x10 = x(view);
            if (x10 == null) {
                x10 = androidx.core.graphics.c.f2316e;
            }
            r(x10);
        }

        /* access modifiers changed from: package-private */
        public void e(j0 j0Var) {
            j0Var.s(this.f2559f);
            j0Var.r(this.f2560g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2560g, ((g) obj).f2560g);
        }

        public androidx.core.graphics.c g(int i10) {
            return u(i10, false);
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.c k() {
            if (this.f2558e == null) {
                this.f2558e = androidx.core.graphics.c.b(this.f2556c.getSystemWindowInsetLeft(), this.f2556c.getSystemWindowInsetTop(), this.f2556c.getSystemWindowInsetRight(), this.f2556c.getSystemWindowInsetBottom());
            }
            return this.f2558e;
        }

        /* access modifiers changed from: package-private */
        public j0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(j0.v(this.f2556c));
            bVar.c(j0.m(k(), i10, i11, i12, i13));
            bVar.b(j0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f2556c.isRound();
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean p(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !y(i11)) {
                    return false;
                }
            }
            return true;
        }

        public void q(androidx.core.graphics.c[] cVarArr) {
            this.f2557d = cVarArr;
        }

        /* access modifiers changed from: package-private */
        public void r(androidx.core.graphics.c cVar) {
            this.f2560g = cVar;
        }

        /* access modifiers changed from: package-private */
        public void s(j0 j0Var) {
            this.f2559f = j0Var;
        }

        /* access modifiers changed from: protected */
        public androidx.core.graphics.c v(int i10, boolean z10) {
            int i11;
            c cVar;
            if (i10 != 1) {
                androidx.core.graphics.c cVar2 = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        androidx.core.graphics.c[] cVarArr = this.f2557d;
                        if (cVarArr != null) {
                            cVar2 = cVarArr[m.b(8)];
                        }
                        if (cVar2 != null) {
                            return cVar2;
                        }
                        androidx.core.graphics.c k10 = k();
                        androidx.core.graphics.c w10 = w();
                        int i12 = k10.f2320d;
                        if (i12 > w10.f2320d) {
                            return androidx.core.graphics.c.b(0, 0, 0, i12);
                        }
                        androidx.core.graphics.c cVar3 = this.f2560g;
                        if (cVar3 == null || cVar3.equals(androidx.core.graphics.c.f2316e) || (i11 = this.f2560g.f2320d) <= w10.f2320d) {
                            return androidx.core.graphics.c.f2316e;
                        }
                        return androidx.core.graphics.c.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return j();
                    } else {
                        if (i10 == 32) {
                            return h();
                        }
                        if (i10 == 64) {
                            return l();
                        }
                        if (i10 != 128) {
                            return androidx.core.graphics.c.f2316e;
                        }
                        j0 j0Var = this.f2559f;
                        if (j0Var != null) {
                            cVar = j0Var.e();
                        } else {
                            cVar = f();
                        }
                        if (cVar != null) {
                            return androidx.core.graphics.c.b(cVar.b(), cVar.d(), cVar.c(), cVar.a());
                        }
                        return androidx.core.graphics.c.f2316e;
                    }
                } else if (z10) {
                    androidx.core.graphics.c w11 = w();
                    androidx.core.graphics.c i13 = i();
                    return androidx.core.graphics.c.b(Math.max(w11.f2317a, i13.f2317a), 0, Math.max(w11.f2319c, i13.f2319c), Math.max(w11.f2320d, i13.f2320d));
                } else {
                    androidx.core.graphics.c k11 = k();
                    j0 j0Var2 = this.f2559f;
                    if (j0Var2 != null) {
                        cVar2 = j0Var2.g();
                    }
                    int i14 = k11.f2320d;
                    if (cVar2 != null) {
                        i14 = Math.min(i14, cVar2.f2320d);
                    }
                    return androidx.core.graphics.c.b(k11.f2317a, 0, k11.f2319c, i14);
                }
            } else if (z10) {
                return androidx.core.graphics.c.b(0, Math.max(w().f2318b, k().f2318b), 0, 0);
            } else {
                return androidx.core.graphics.c.b(0, k().f2318b, 0, 0);
            }
        }

        /* access modifiers changed from: protected */
        public boolean y(int i10) {
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 4) {
                    return false;
                }
                if (!(i10 == 8 || i10 == 128)) {
                    return true;
                }
            }
            return !v(i10, false).equals(androidx.core.graphics.c.f2316e);
        }

        g(j0 j0Var, g gVar) {
            this(j0Var, new WindowInsets(gVar.f2556c));
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.c f2562n = null;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.c f2563o = null;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.c f2564p = null;

        j(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c h() {
            if (this.f2563o == null) {
                this.f2563o = androidx.core.graphics.c.d(this.f2556c.getMandatorySystemGestureInsets());
            }
            return this.f2563o;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c j() {
            if (this.f2562n == null) {
                this.f2562n = androidx.core.graphics.c.d(this.f2556c.getSystemGestureInsets());
            }
            return this.f2562n;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.c l() {
            if (this.f2564p == null) {
                this.f2564p = androidx.core.graphics.c.d(this.f2556c.getTappableElementInsets());
            }
            return this.f2564p;
        }

        /* access modifiers changed from: package-private */
        public j0 m(int i10, int i11, int i12, int i13) {
            return j0.v(this.f2556c.inset(i10, i11, i12, i13));
        }

        public void t(androidx.core.graphics.c cVar) {
        }

        j(j0 j0Var, j jVar) {
            super(j0Var, (i) jVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f2541a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2541a = new e();
            } else if (i10 >= 29) {
                this.f2541a = new d();
            } else if (i10 >= 20) {
                this.f2541a = new c();
            } else {
                this.f2541a = new f();
            }
        }

        public j0 a() {
            return this.f2541a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.c cVar) {
            this.f2541a.d(cVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.c cVar) {
            this.f2541a.f(cVar);
            return this;
        }

        public b(j0 j0Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f2541a = new e(j0Var);
            } else if (i10 >= 29) {
                this.f2541a = new d(j0Var);
            } else if (i10 >= 20) {
                this.f2541a = new c(j0Var);
            } else {
                this.f2541a = new f(j0Var);
            }
        }
    }

    public j0(j0 j0Var) {
        if (j0Var != null) {
            l lVar = j0Var.f2536a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f2536a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f2536a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f2536a = new i(this, (i) lVar);
            } else if (i10 >= 21 && (lVar instanceof h)) {
                this.f2536a = new h(this, (h) lVar);
            } else if (i10 < 20 || !(lVar instanceof g)) {
                this.f2536a = new l(this);
            } else {
                this.f2536a = new g(this, (g) lVar);
            }
            lVar.e(this);
            return;
        }
        this.f2536a = new l(this);
    }
}
