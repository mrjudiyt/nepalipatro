package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.z;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {

    /* renamed from: y  reason: collision with root package name */
    private static final int f2635y = ViewConfiguration.getTapTimeout();

    /* renamed from: h  reason: collision with root package name */
    final C0042a f2636h = new C0042a();

    /* renamed from: i  reason: collision with root package name */
    private final Interpolator f2637i = new AccelerateInterpolator();

    /* renamed from: j  reason: collision with root package name */
    final View f2638j;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f2639k;

    /* renamed from: l  reason: collision with root package name */
    private float[] f2640l = {0.0f, 0.0f};

    /* renamed from: m  reason: collision with root package name */
    private float[] f2641m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n  reason: collision with root package name */
    private int f2642n;

    /* renamed from: o  reason: collision with root package name */
    private int f2643o;

    /* renamed from: p  reason: collision with root package name */
    private float[] f2644p = {0.0f, 0.0f};

    /* renamed from: q  reason: collision with root package name */
    private float[] f2645q = {0.0f, 0.0f};

    /* renamed from: r  reason: collision with root package name */
    private float[] f2646r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: s  reason: collision with root package name */
    private boolean f2647s;

    /* renamed from: t  reason: collision with root package name */
    boolean f2648t;

    /* renamed from: u  reason: collision with root package name */
    boolean f2649u;

    /* renamed from: v  reason: collision with root package name */
    boolean f2650v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2651w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f2652x;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    private static class C0042a {

        /* renamed from: a  reason: collision with root package name */
        private int f2653a;

        /* renamed from: b  reason: collision with root package name */
        private int f2654b;

        /* renamed from: c  reason: collision with root package name */
        private float f2655c;

        /* renamed from: d  reason: collision with root package name */
        private float f2656d;

        /* renamed from: e  reason: collision with root package name */
        private long f2657e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f2658f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f2659g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f2660h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f2661i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f2662j;

        /* renamed from: k  reason: collision with root package name */
        private int f2663k;

        C0042a() {
        }

        private float e(long j10) {
            long j11 = this.f2657e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f2661i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / ((float) this.f2653a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2662j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / ((float) this.f2663k), 0.0f, 1.0f));
        }

        private float g(float f10) {
            return (-4.0f * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f2658f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f2658f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f2658f)) * g10;
                this.f2659g = (int) (this.f2655c * f10);
                this.f2660h = (int) (f10 * this.f2656d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f2659g;
        }

        public int c() {
            return this.f2660h;
        }

        public int d() {
            float f10 = this.f2655c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f2656d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f2661i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2661i + ((long) this.f2663k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2663k = a.f((int) (currentAnimationTimeMillis - this.f2657e), 0, this.f2654b);
            this.f2662j = e(currentAnimationTimeMillis);
            this.f2661i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f2654b = i10;
        }

        public void k(int i10) {
            this.f2653a = i10;
        }

        public void l(float f10, float f11) {
            this.f2655c = f10;
            this.f2656d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2657e = currentAnimationTimeMillis;
            this.f2661i = -1;
            this.f2658f = currentAnimationTimeMillis;
            this.f2662j = 0.5f;
            this.f2659g = 0;
            this.f2660h = 0;
        }
    }

    /* compiled from: AutoScrollHelper */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f2650v) {
                if (aVar.f2648t) {
                    aVar.f2648t = false;
                    aVar.f2636h.m();
                }
                C0042a aVar2 = a.this.f2636h;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f2650v = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f2649u) {
                    aVar3.f2649u = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                z.N(a.this.f2638j, this);
            }
        }
    }

    public a(View view) {
        this.f2638j = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (float) ((int) ((1575.0f * f10) + 0.5f));
        o(f11, f11);
        float f12 = (float) ((int) ((f10 * 315.0f) + 0.5f));
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2635y);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f2640l[i10], f11, this.f2641m[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f2644p[i10];
        float f14 = this.f2645q[i10];
        float f15 = this.f2646r[i10];
        float f16 = f13 * f12;
        if (i11 > 0) {
            return e(h10 * f16, f14, f15);
        }
        return -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2642n;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                return (!this.f2650v || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    private float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f2637i.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f2637i.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f2648t) {
            this.f2650v = false;
        } else {
            this.f2636h.i();
        }
    }

    private void v() {
        int i10;
        if (this.f2639k == null) {
            this.f2639k = new b();
        }
        this.f2650v = true;
        this.f2648t = true;
        if (this.f2647s || (i10 = this.f2643o) <= 0) {
            this.f2639k.run();
        } else {
            z.O(this.f2638j, this.f2639k, (long) i10);
        }
        this.f2647s = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2638j.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f2643o = i10;
        return this;
    }

    public a l(int i10) {
        this.f2642n = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f2651w && !z10) {
            i();
        }
        this.f2651w = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f2641m;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f2646r;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2651w
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f2649u = r2
            r5.f2647s = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2638j
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2638j
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2636h
            r7.l(r0, r6)
            boolean r6 = r5.f2650v
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f2652x
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2650v
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f2645q;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f2636h.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f2636h.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f2640l;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f2644p;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0042a aVar = this.f2636h;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
