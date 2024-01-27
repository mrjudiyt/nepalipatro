package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.h;

/* compiled from: WindowInsetsControllerCompat */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f2568a;

    /* compiled from: WindowInsetsControllerCompat */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f2569a;

        /* renamed from: b  reason: collision with root package name */
        private final w f2570b;

        a(Window window, w wVar) {
            this.f2569a = window;
            this.f2570b = wVar;
        }

        /* access modifiers changed from: protected */
        public void c(int i10) {
            View decorView = this.f2569a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            this.f2569a.addFlags(i10);
        }

        /* access modifiers changed from: protected */
        public void e(int i10) {
            View decorView = this.f2569a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void f(int i10) {
            this.f2569a.clearFlags(i10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class b extends a {
        b(Window window, w wVar) {
            super(window, wVar);
        }

        public void b(boolean z10) {
            if (z10) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class c extends b {
        c(Window window, w wVar) {
            super(window, wVar);
        }

        public void a(boolean z10) {
            if (z10) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }

    public k0(Window window, View view) {
        w wVar = new w(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2568a = new d(window, this, wVar);
        } else if (i10 >= 26) {
            this.f2568a = new c(window, wVar);
        } else if (i10 >= 23) {
            this.f2568a = new b(window, wVar);
        } else if (i10 >= 20) {
            this.f2568a = new a(window, wVar);
        } else {
            this.f2568a = new e();
        }
    }

    public void a(boolean z10) {
        this.f2568a.a(z10);
    }

    public void b(boolean z10) {
        this.f2568a.b(z10);
    }

    /* compiled from: WindowInsetsControllerCompat */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final k0 f2571a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f2572b;

        /* renamed from: c  reason: collision with root package name */
        final w f2573c;

        /* renamed from: d  reason: collision with root package name */
        private final h<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2574d;

        /* renamed from: e  reason: collision with root package name */
        protected Window f2575e;

        d(Window window, k0 k0Var, w wVar) {
            this(window.getInsetsController(), k0Var, wVar);
            this.f2575e = window;
        }

        public void a(boolean z10) {
            if (z10) {
                if (this.f2575e != null) {
                    c(16);
                }
                this.f2572b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f2575e != null) {
                d(16);
            }
            this.f2572b.setSystemBarsAppearance(0, 16);
        }

        public void b(boolean z10) {
            if (z10) {
                if (this.f2575e != null) {
                    c(8192);
                }
                this.f2572b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f2575e != null) {
                d(8192);
            }
            this.f2572b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: protected */
        public void c(int i10) {
            View decorView = this.f2575e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            View decorView = this.f2575e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, k0 k0Var, w wVar) {
            this.f2574d = new h<>();
            this.f2572b = windowInsetsController;
            this.f2571a = k0Var;
            this.f2573c = wVar;
        }
    }
}
