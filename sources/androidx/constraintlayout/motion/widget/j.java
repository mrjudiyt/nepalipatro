package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MotionLayout */
public class j extends ConstraintLayout implements q {
    public static boolean E0;
    private boolean A0;
    e B0;
    private boolean C0;
    ArrayList<Integer> D0;
    l F;
    Interpolator G;
    Interpolator H;
    float I;
    /* access modifiers changed from: private */
    public int J;
    int K;
    /* access modifiers changed from: private */
    public int L;
    private boolean M;
    HashMap<View, g> N;
    private long O;
    private float P;
    float Q;
    float R;
    private long S;
    float T;
    private boolean U;
    boolean V;
    private d W;

    /* renamed from: a0  reason: collision with root package name */
    int f1540a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f1541b0;

    /* renamed from: c0  reason: collision with root package name */
    private x.b f1542c0;

    /* renamed from: d0  reason: collision with root package name */
    private b f1543d0;

    /* renamed from: e0  reason: collision with root package name */
    boolean f1544e0;

    /* renamed from: f0  reason: collision with root package name */
    float f1545f0;

    /* renamed from: g0  reason: collision with root package name */
    float f1546g0;

    /* renamed from: h0  reason: collision with root package name */
    long f1547h0;

    /* renamed from: i0  reason: collision with root package name */
    float f1548i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f1549j0;

    /* renamed from: k0  reason: collision with root package name */
    private ArrayList<h> f1550k0;

    /* renamed from: l0  reason: collision with root package name */
    private ArrayList<h> f1551l0;

    /* renamed from: m0  reason: collision with root package name */
    private ArrayList<h> f1552m0;

    /* renamed from: n0  reason: collision with root package name */
    private CopyOnWriteArrayList<d> f1553n0;

    /* renamed from: o0  reason: collision with root package name */
    private int f1554o0;

    /* renamed from: p0  reason: collision with root package name */
    private float f1555p0;

    /* renamed from: q0  reason: collision with root package name */
    boolean f1556q0;

    /* renamed from: r0  reason: collision with root package name */
    protected boolean f1557r0;

    /* renamed from: s0  reason: collision with root package name */
    float f1558s0;

    /* renamed from: t0  reason: collision with root package name */
    private t.c f1559t0;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f1560u0;
    /* access modifiers changed from: private */

    /* renamed from: v0  reason: collision with root package name */
    public c f1561v0;

    /* renamed from: w0  reason: collision with root package name */
    private Runnable f1562w0;

    /* renamed from: x0  reason: collision with root package name */
    private int[] f1563x0;

    /* renamed from: y0  reason: collision with root package name */
    int f1564y0;

    /* renamed from: z0  reason: collision with root package name */
    private int f1565z0;

    /* compiled from: MotionLayout */
    class a implements Runnable {
        a() {
        }

        public void run() {
            j.this.f1561v0.a();
        }
    }

    /* compiled from: MotionLayout */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1567a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.j$e[] r0 = androidx.constraintlayout.motion.widget.j.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1567a = r0
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1567a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1567a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1567a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.j$e r1 = androidx.constraintlayout.motion.widget.j.e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.b.<clinit>():void");
        }
    }

    /* compiled from: MotionLayout */
    class c {

        /* renamed from: a  reason: collision with root package name */
        float f1568a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f1569b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f1570c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f1571d = -1;

        /* renamed from: e  reason: collision with root package name */
        final String f1572e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        final String f1573f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        final String f1574g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        final String f1575h = "motion.EndState";

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i10 = this.f1570c;
            if (!(i10 == -1 && this.f1571d == -1)) {
                if (i10 == -1) {
                    j.this.N(this.f1571d);
                } else {
                    int i11 = this.f1571d;
                    if (i11 == -1) {
                        j.this.K(i10, -1, -1);
                    } else {
                        j.this.L(i10, i11);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (!Float.isNaN(this.f1569b)) {
                j.this.J(this.f1568a, this.f1569b);
                this.f1568a = Float.NaN;
                this.f1569b = Float.NaN;
                this.f1570c = -1;
                this.f1571d = -1;
            } else if (!Float.isNaN(this.f1568a)) {
                j.this.setProgress(this.f1568a);
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1568a);
            bundle.putFloat("motion.velocity", this.f1569b);
            bundle.putInt("motion.StartState", this.f1570c);
            bundle.putInt("motion.EndState", this.f1571d);
            return bundle;
        }

        public void c() {
            this.f1571d = j.this.L;
            this.f1570c = j.this.J;
            this.f1569b = j.this.getVelocity();
            this.f1568a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f1571d = i10;
        }

        public void e(float f10) {
            this.f1568a = f10;
        }

        public void f(int i10) {
            this.f1570c = i10;
        }

        public void g(Bundle bundle) {
            this.f1568a = bundle.getFloat("motion.progress");
            this.f1569b = bundle.getFloat("motion.velocity");
            this.f1570c = bundle.getInt("motion.StartState");
            this.f1571d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f1569b = f10;
        }
    }

    /* compiled from: MotionLayout */
    public interface d {
        void a(j jVar, int i10, int i11, float f10);

        void b(j jVar, int i10, int i11);

        void c(j jVar, int i10);
    }

    /* compiled from: MotionLayout */
    enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void F() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.W != null || ((copyOnWriteArrayList = this.f1553n0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1555p0 != this.Q) {
            if (this.f1554o0 != -1) {
                d dVar = this.W;
                if (dVar != null) {
                    dVar.b(this, this.J, this.L);
                }
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1553n0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<d> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.J, this.L);
                    }
                }
                this.f1556q0 = true;
            }
            this.f1554o0 = -1;
            float f10 = this.Q;
            this.f1555p0 = f10;
            d dVar2 = this.W;
            if (dVar2 != null) {
                dVar2.a(this, this.J, this.L, f10);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f1553n0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<d> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.J, this.L, this.Q);
                }
            }
            this.f1556q0 = true;
        }
    }

    private void I() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.W != null || ((copyOnWriteArrayList = this.f1553n0) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f1556q0 = false;
            Iterator<Integer> it = this.D0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                d dVar = this.W;
                if (dVar != null) {
                    dVar.c(this, next.intValue());
                }
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1553n0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().c(this, next.intValue());
                    }
                }
            }
            this.D0.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(float f10) {
    }

    /* access modifiers changed from: package-private */
    public void E(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        float f10;
        boolean z15;
        if (this.S == -1) {
            this.S = getNanoTime();
        }
        float f11 = this.R;
        if (f11 > 0.0f && f11 < 1.0f) {
            this.K = -1;
        }
        if (this.f1549j0 || (this.V && (z10 || this.T != f11))) {
            float signum = Math.signum(this.T - f11);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.G;
            float f12 = !(interpolator instanceof i) ? ((((float) (nanoTime - this.S)) * signum) * 1.0E-9f) / this.P : 0.0f;
            float f13 = this.R + f12;
            if (this.U) {
                f13 = this.T;
            }
            int i12 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i12 <= 0 || f13 < this.T) && (signum > 0.0f || f13 > this.T)) {
                z13 = false;
            } else {
                f13 = this.T;
                this.V = false;
                z13 = true;
            }
            this.R = f13;
            this.Q = f13;
            this.S = nanoTime;
            if (interpolator == null || z13) {
                this.I = f12;
            } else {
                if (this.f1541b0) {
                    f10 = interpolator.getInterpolation(((float) (nanoTime - this.O)) * 1.0E-9f);
                    Interpolator interpolator2 = this.G;
                    if (interpolator2 != this.f1542c0) {
                        this.R = f10;
                        this.S = nanoTime;
                        if (interpolator2 instanceof i) {
                            float a10 = ((i) interpolator2).a();
                            this.I = a10;
                            int i13 = ((Math.abs(a10) * this.P) > 1.0E-5f ? 1 : ((Math.abs(a10) * this.P) == 1.0E-5f ? 0 : -1));
                            if (a10 <= 0.0f || f10 < 1.0f) {
                                z15 = false;
                            } else {
                                this.R = 1.0f;
                                z15 = false;
                                this.V = false;
                                f10 = 1.0f;
                            }
                            if (a10 < 0.0f && f10 <= 0.0f) {
                                this.R = 0.0f;
                                this.V = z15;
                                f13 = 0.0f;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    f10 = interpolator.getInterpolation(f13);
                    Interpolator interpolator3 = this.G;
                    if (interpolator3 instanceof i) {
                        this.I = ((i) interpolator3).a();
                    } else {
                        this.I = ((interpolator3.getInterpolation(f13 + f12) - f10) * signum) / f12;
                    }
                }
                f13 = f10;
            }
            if (Math.abs(this.I) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((i12 > 0 && f13 >= this.T) || (signum <= 0.0f && f13 <= this.T)) {
                f13 = this.T;
                this.V = false;
            }
            if (f13 >= 1.0f || f13 <= 0.0f) {
                z14 = false;
                this.V = false;
                setState(e.FINISHED);
            } else {
                z14 = false;
            }
            int childCount = getChildCount();
            this.f1549j0 = z14;
            long nanoTime2 = getNanoTime();
            this.f1558s0 = f13;
            Interpolator interpolator4 = this.H;
            float interpolation = interpolator4 == null ? f13 : interpolator4.getInterpolation(f13);
            Interpolator interpolator5 = this.H;
            if (interpolator5 != null) {
                float interpolation2 = interpolator5.getInterpolation((signum / this.P) + f13);
                this.I = interpolation2;
                this.I = interpolation2 - this.H.getInterpolation(f13);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                g gVar = this.N.get(childAt);
                if (gVar != null) {
                    this.f1549j0 = gVar.c(childAt, interpolation, nanoTime2, this.f1559t0) | this.f1549j0;
                }
            }
            boolean z16 = (i12 > 0 && f13 >= this.T) || (signum <= 0.0f && f13 <= this.T);
            if (!this.f1549j0 && !this.V && z16) {
                setState(e.FINISHED);
            }
            if (this.f1557r0) {
                requestLayout();
            }
            z11 = true;
            boolean z17 = this.f1549j0 | (!z16);
            this.f1549j0 = z17;
            if (f13 <= 0.0f && (i11 = this.J) != -1 && this.K != i11) {
                this.K = i11;
                throw null;
            } else if (((double) f13) < 1.0d || this.K == (i10 = this.L)) {
                if (z17 || this.V) {
                    invalidate();
                } else if ((i12 > 0 && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f)) {
                    setState(e.FINISHED);
                }
                if (!this.f1549j0 && !this.V && ((i12 > 0 && f13 == 1.0f) || (signum < 0.0f && f13 == 0.0f))) {
                    H();
                }
            } else {
                this.K = i10;
                throw null;
            }
        } else {
            z11 = true;
        }
        float f14 = this.R;
        if (f14 >= 1.0f) {
            int i15 = this.K;
            int i16 = this.L;
            if (i15 == i16) {
                z11 = false;
            }
            this.K = i16;
        } else if (f14 <= 0.0f) {
            int i17 = this.K;
            int i18 = this.J;
            if (i17 == i18) {
                z11 = false;
            }
            this.K = i18;
        } else {
            z12 = false;
            this.C0 |= z12;
            if (z12 && !this.f1560u0) {
                requestLayout();
            }
            this.Q = this.R;
        }
        z12 = z11;
        this.C0 |= z12;
        requestLayout();
        this.Q = this.R;
    }

    /* access modifiers changed from: protected */
    public void G() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.W != null || ((copyOnWriteArrayList = this.f1553n0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1554o0 == -1) {
            this.f1554o0 = this.K;
            if (!this.D0.isEmpty()) {
                ArrayList<Integer> arrayList = this.D0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.K;
            if (!(i10 == i11 || i11 == -1)) {
                this.D0.add(Integer.valueOf(i11));
            }
        }
        I();
        Runnable runnable = this.f1562w0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f1563x0;
        if (iArr != null && this.f1564y0 > 0) {
            N(iArr[0]);
            int[] iArr2 = this.f1563x0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f1564y0--;
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
    }

    public void J(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f1561v0 == null) {
                this.f1561v0 = new c();
            }
            this.f1561v0.e(f10);
            this.f1561v0.h(f11);
            return;
        }
        setProgress(f10);
        setState(e.MOVING);
        this.I = f11;
        float f12 = 1.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            if (i10 <= 0) {
                f12 = 0.0f;
            }
            D(f12);
        } else if (f10 != 0.0f && f10 != 1.0f) {
            if (f10 <= 0.5f) {
                f12 = 0.0f;
            }
            D(f12);
        }
    }

    public void K(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.K = i10;
        this.J = -1;
        this.L = -1;
        androidx.constraintlayout.widget.d dVar = this.f1611r;
        if (dVar != null) {
            dVar.d(i10, (float) i11, (float) i12);
        }
    }

    public void L(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f1561v0 == null) {
                this.f1561v0 = new c();
            }
            this.f1561v0.f(i10);
            this.f1561v0.d(i11);
        }
    }

    public void M() {
        D(1.0f);
        this.f1562w0 = null;
    }

    public void N(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f1561v0 == null) {
                this.f1561v0 = new c();
            }
            this.f1561v0.d(i10);
            return;
        }
        O(i10, -1, -1);
    }

    public void O(int i10, int i11, int i12) {
        P(i10, i11, i12, -1);
    }

    public void P(int i10, int i11, int i12, int i13) {
        int i14 = this.K;
        if (i14 != i10) {
            if (this.J == i10) {
                D(0.0f);
                if (i13 > 0) {
                    this.P = ((float) i13) / 1000.0f;
                }
            } else if (this.L == i10) {
                D(1.0f);
                if (i13 > 0) {
                    this.P = ((float) i13) / 1000.0f;
                }
            } else {
                this.L = i10;
                if (i14 != -1) {
                    L(i14, i10);
                    D(1.0f);
                    this.R = 0.0f;
                    M();
                    if (i13 > 0) {
                        this.P = ((float) i13) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f1541b0 = false;
                this.T = 1.0f;
                this.Q = 0.0f;
                this.R = 0.0f;
                this.S = getNanoTime();
                this.O = getNanoTime();
                this.U = false;
                this.G = null;
                if (i13 == -1) {
                    throw null;
                }
                this.J = -1;
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f1552m0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        E(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.K;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.f1543d0 == null) {
            this.f1543d0 = new b(this);
        }
        return this.f1543d0;
    }

    public int getEndState() {
        return this.L;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.R;
    }

    public l getScene() {
        return this.F;
    }

    public int getStartState() {
        return this.J;
    }

    public float getTargetPosition() {
        return this.T;
    }

    public Bundle getTransitionState() {
        if (this.f1561v0 == null) {
            this.f1561v0 = new c();
        }
        this.f1561v0.c();
        return this.f1561v0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.P * 1000.0f);
    }

    public float getVelocity() {
        return this.I;
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!(!this.f1544e0 && i10 == 0 && i11 == 0)) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f1544e0 = false;
    }

    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public boolean l(View view, View view2, int i10, int i11) {
        return false;
    }

    public void m(View view, View view2, int i10, int i11) {
        this.f1547h0 = getNanoTime();
        this.f1548i0 = 0.0f;
        this.f1545f0 = 0.0f;
        this.f1546g0 = 0.0f;
    }

    public void n(View view, int i10) {
    }

    public void o(View view, int i10, int i11, int[] iArr, int i12) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            this.f1565z0 = display.getRotation();
        }
        H();
        c cVar = this.f1561v0;
        if (cVar == null) {
            return;
        }
        if (this.A0) {
            post(new a());
        } else {
            cVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1560u0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f1560u0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onRtlPropertiesChanged(int i10) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f1553n0 == null) {
                this.f1553n0 = new CopyOnWriteArrayList<>();
            }
            this.f1553n0.add(hVar);
            if (hVar.v()) {
                if (this.f1550k0 == null) {
                    this.f1550k0 = new ArrayList<>();
                }
                this.f1550k0.add(hVar);
            }
            if (hVar.u()) {
                if (this.f1551l0 == null) {
                    this.f1551l0 = new ArrayList<>();
                }
                this.f1551l0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f1552m0 == null) {
                    this.f1552m0 = new ArrayList<>();
                }
                this.f1552m0.add(hVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f1550k0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f1551l0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        if (!this.f1557r0) {
            int i10 = this.K;
        }
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void s(int i10) {
        this.f1611r = null;
    }

    public void setDebugMode(int i10) {
        this.f1540a0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.A0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.M = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.f1551l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1551l0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.f1550k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1550k0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 >= 0) {
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.f1561v0 == null) {
                this.f1561v0 = new c();
            }
            this.f1561v0.e(f10);
        } else if (i10 <= 0) {
            if (this.R == 1.0f && this.K == this.L) {
                setState(e.MOVING);
            }
            this.K = this.J;
            if (this.R == 0.0f) {
                setState(e.FINISHED);
            }
        } else if (f10 >= 1.0f) {
            if (this.R == 0.0f && this.K == this.J) {
                setState(e.MOVING);
            }
            this.K = this.L;
            if (this.R == 1.0f) {
                setState(e.FINISHED);
            }
        } else {
            this.K = -1;
            setState(e.MOVING);
        }
    }

    public void setScene(l lVar) {
        q();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.f1561v0 == null) {
                this.f1561v0 = new c();
            }
            this.f1561v0.f(i10);
            this.f1561v0.d(i10);
            return;
        }
        this.K = i10;
    }

    /* access modifiers changed from: package-private */
    public void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar != eVar2 || this.K != -1) {
            e eVar3 = this.B0;
            this.B0 = eVar;
            e eVar4 = e.MOVING;
            if (eVar3 == eVar4 && eVar == eVar4) {
                F();
            }
            int i10 = b.f1567a[eVar3.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (eVar == eVar4) {
                    F();
                }
                if (eVar == eVar2) {
                    G();
                }
            } else if (i10 == 3 && eVar == eVar2) {
                G();
            }
        }
    }

    public void setTransition(int i10) {
    }

    /* access modifiers changed from: protected */
    public void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
    }

    public void setTransitionListener(d dVar) {
        this.W = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1561v0 == null) {
            this.f1561v0 = new c();
        }
        this.f1561v0.g(bundle);
        if (isAttachedToWindow()) {
            this.f1561v0.a();
        }
    }

    public String toString() {
        Context context = getContext();
        return a.a(context, this.J) + "->" + a.a(context, this.L) + " (pos:" + this.R + " Dpos/Dt:" + this.I;
    }
}
