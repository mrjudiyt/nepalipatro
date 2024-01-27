package l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<f0> f9789a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f9790b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f9791c;

    /* renamed from: d  reason: collision with root package name */
    g0 f9792d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9793e;

    /* renamed from: f  reason: collision with root package name */
    private final h0 f9794f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    class a extends h0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9795a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f9796b = 0;

        a() {
        }

        public void b(View view) {
            int i10 = this.f9796b + 1;
            this.f9796b = i10;
            if (i10 == h.this.f9789a.size()) {
                g0 g0Var = h.this.f9792d;
                if (g0Var != null) {
                    g0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f9795a) {
                this.f9795a = true;
                g0 g0Var = h.this.f9792d;
                if (g0Var != null) {
                    g0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f9796b = 0;
            this.f9795a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f9793e) {
            Iterator<f0> it = this.f9789a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f9793e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f9793e = false;
    }

    public h c(f0 f0Var) {
        if (!this.f9793e) {
            this.f9789a.add(f0Var);
        }
        return this;
    }

    public h d(f0 f0Var, f0 f0Var2) {
        this.f9789a.add(f0Var);
        f0Var2.j(f0Var.d());
        this.f9789a.add(f0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f9793e) {
            this.f9790b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f9793e) {
            this.f9791c = interpolator;
        }
        return this;
    }

    public h g(g0 g0Var) {
        if (!this.f9793e) {
            this.f9792d = g0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f9793e) {
            Iterator<f0> it = this.f9789a.iterator();
            while (it.hasNext()) {
                f0 next = it.next();
                long j10 = this.f9790b;
                if (j10 >= 0) {
                    next.f(j10);
                }
                Interpolator interpolator = this.f9791c;
                if (interpolator != null) {
                    next.g(interpolator);
                }
                if (this.f9792d != null) {
                    next.h(this.f9794f);
                }
                next.l();
            }
            this.f9793e = true;
        }
    }
}
