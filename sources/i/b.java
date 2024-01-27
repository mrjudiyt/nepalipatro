package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: DrawableContainer */
class b extends Drawable implements Drawable.Callback {

    /* renamed from: h  reason: collision with root package name */
    private c f9015h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f9016i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f9017j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f9018k;

    /* renamed from: l  reason: collision with root package name */
    private int f9019l = 255;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9020m;

    /* renamed from: n  reason: collision with root package name */
    private int f9021n = -1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9022o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f9023p;

    /* renamed from: q  reason: collision with root package name */
    private long f9024q;

    /* renamed from: r  reason: collision with root package name */
    private long f9025r;

    /* renamed from: s  reason: collision with root package name */
    private C0147b f9026s;

    /* compiled from: DrawableContainer */
    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: i.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableContainer */
    static class C0147b implements Drawable.Callback {

        /* renamed from: h  reason: collision with root package name */
        private Drawable.Callback f9028h;

        C0147b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f9028h;
            this.f9028h = null;
            return callback;
        }

        public C0147b b(Drawable.Callback callback) {
            this.f9028h = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f9028h;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9028h;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer */
    static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f9029a;

        /* renamed from: b  reason: collision with root package name */
        Resources f9030b;

        /* renamed from: c  reason: collision with root package name */
        int f9031c = 160;

        /* renamed from: d  reason: collision with root package name */
        int f9032d;

        /* renamed from: e  reason: collision with root package name */
        int f9033e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f9034f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f9035g;

        /* renamed from: h  reason: collision with root package name */
        int f9036h;

        /* renamed from: i  reason: collision with root package name */
        boolean f9037i;

        /* renamed from: j  reason: collision with root package name */
        boolean f9038j;

        /* renamed from: k  reason: collision with root package name */
        Rect f9039k;

        /* renamed from: l  reason: collision with root package name */
        boolean f9040l;

        /* renamed from: m  reason: collision with root package name */
        boolean f9041m;

        /* renamed from: n  reason: collision with root package name */
        int f9042n;

        /* renamed from: o  reason: collision with root package name */
        int f9043o;

        /* renamed from: p  reason: collision with root package name */
        int f9044p;

        /* renamed from: q  reason: collision with root package name */
        int f9045q;

        /* renamed from: r  reason: collision with root package name */
        boolean f9046r;

        /* renamed from: s  reason: collision with root package name */
        int f9047s;

        /* renamed from: t  reason: collision with root package name */
        boolean f9048t;

        /* renamed from: u  reason: collision with root package name */
        boolean f9049u;

        /* renamed from: v  reason: collision with root package name */
        boolean f9050v;

        /* renamed from: w  reason: collision with root package name */
        boolean f9051w;

        /* renamed from: x  reason: collision with root package name */
        boolean f9052x;

        /* renamed from: y  reason: collision with root package name */
        boolean f9053y;

        /* renamed from: z  reason: collision with root package name */
        int f9054z;

        c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            this.f9037i = false;
            this.f9040l = false;
            this.f9052x = true;
            this.A = 0;
            this.B = 0;
            this.f9029a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = cVar != null ? cVar.f9030b : null;
            }
            this.f9030b = resources2;
            int f10 = b.f(resources, cVar != null ? cVar.f9031c : 0);
            this.f9031c = f10;
            if (cVar != null) {
                this.f9032d = cVar.f9032d;
                this.f9033e = cVar.f9033e;
                this.f9050v = true;
                this.f9051w = true;
                this.f9037i = cVar.f9037i;
                this.f9040l = cVar.f9040l;
                this.f9052x = cVar.f9052x;
                this.f9053y = cVar.f9053y;
                this.f9054z = cVar.f9054z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.f9031c == f10) {
                    if (cVar.f9038j) {
                        this.f9039k = new Rect(cVar.f9039k);
                        this.f9038j = true;
                    }
                    if (cVar.f9041m) {
                        this.f9042n = cVar.f9042n;
                        this.f9043o = cVar.f9043o;
                        this.f9044p = cVar.f9044p;
                        this.f9045q = cVar.f9045q;
                        this.f9041m = true;
                    }
                }
                if (cVar.f9046r) {
                    this.f9047s = cVar.f9047s;
                    this.f9046r = true;
                }
                if (cVar.f9048t) {
                    this.f9049u = cVar.f9049u;
                    this.f9048t = true;
                }
                Drawable[] drawableArr = cVar.f9035g;
                this.f9035g = new Drawable[drawableArr.length];
                this.f9036h = cVar.f9036h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f9034f;
                if (sparseArray != null) {
                    this.f9034f = sparseArray.clone();
                } else {
                    this.f9034f = new SparseArray<>(this.f9036h);
                }
                int i10 = this.f9036h;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null) {
                        Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                        if (constantState != null) {
                            this.f9034f.put(i11, constantState);
                        } else {
                            this.f9035g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f9035g = new Drawable[10];
            this.f9036h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f9034f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f9035g[this.f9034f.keyAt(i10)] = s(this.f9034f.valueAt(i10).newDrawable(this.f9030b));
                }
                this.f9034f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f9054z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9029a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f9036h;
            if (i10 >= this.f9035g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9029a);
            this.f9035g[i10] = drawable;
            this.f9036h++;
            this.f9033e = drawable.getChangingConfigurations() | this.f9033e;
            p();
            this.f9039k = null;
            this.f9038j = false;
            this.f9041m = false;
            this.f9050v = false;
            return i10;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f9036h;
                Drawable[] drawableArr = this.f9035g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && drawableArr[i11].canApplyTheme()) {
                        drawableArr[i11].applyTheme(theme);
                        this.f9033e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f9050v) {
                return this.f9051w;
            }
            e();
            this.f9050v = true;
            int i10 = this.f9036h;
            Drawable[] drawableArr = this.f9035g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f9051w = false;
                    return false;
                }
            }
            this.f9051w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i10 = this.f9036h;
            Drawable[] drawableArr = this.f9035g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f9034f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f9041m = true;
            e();
            int i10 = this.f9036h;
            Drawable[] drawableArr = this.f9035g;
            this.f9043o = -1;
            this.f9042n = -1;
            this.f9045q = 0;
            this.f9044p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9042n) {
                    this.f9042n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9043o) {
                    this.f9043o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9044p) {
                    this.f9044p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9045q) {
                    this.f9045q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f9035g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f9035g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f9034f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(this.f9034f.valueAt(indexOfKey).newDrawable(this.f9030b));
            this.f9035g[i10] = s10;
            this.f9034f.removeAt(indexOfKey);
            if (this.f9034f.size() == 0) {
                this.f9034f = null;
            }
            return s10;
        }

        public int getChangingConfigurations() {
            return this.f9032d | this.f9033e;
        }

        public final int h() {
            return this.f9036h;
        }

        public final int i() {
            if (!this.f9041m) {
                d();
            }
            return this.f9043o;
        }

        public final int j() {
            if (!this.f9041m) {
                d();
            }
            return this.f9045q;
        }

        public final int k() {
            if (!this.f9041m) {
                d();
            }
            return this.f9044p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f9037i) {
                return null;
            }
            Rect rect2 = this.f9039k;
            if (rect2 != null || this.f9038j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f9036h;
            Drawable[] drawableArr = this.f9035g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f9038j = true;
            this.f9039k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f9041m) {
                d();
            }
            return this.f9042n;
        }

        public final int n() {
            if (this.f9046r) {
                return this.f9047s;
            }
            e();
            int i10 = this.f9036h;
            Drawable[] drawableArr = this.f9035g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f9047s = opacity;
            this.f9046r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            System.arraycopy(this.f9035g, 0, drawableArr, 0, i10);
            this.f9035g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f9046r = false;
            this.f9048t = false;
        }

        public final boolean q() {
            return this.f9040l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z10) {
            this.f9040l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i10, int i11) {
            int i12 = this.f9036h;
            Drawable[] drawableArr = this.f9035g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i13].setLayoutDirection(i10) : false;
                    if (i13 == i11) {
                        z10 = layoutDirection;
                    }
                }
            }
            this.f9054z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f9037i = z10;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.f9030b = resources;
                int f10 = b.f(resources, this.f9031c);
                int i10 = this.f9031c;
                this.f9031c = f10;
                if (i10 != f10) {
                    this.f9041m = false;
                    this.f9038j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.f9026s == null) {
            this.f9026s = new C0147b();
        }
        drawable.setCallback(this.f9026s.b(drawable.getCallback()));
        try {
            if (this.f9015h.A <= 0 && this.f9020m) {
                drawable.setAlpha(this.f9019l);
            }
            c cVar = this.f9015h;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, cVar.F);
                }
                c cVar2 = this.f9015h;
                if (cVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9015h.f9052x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i10 >= 19) {
                drawable.setAutoMirrored(this.f9015h.C);
            }
            Rect rect = this.f9016i;
            if (i10 >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f9026s.a());
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.e(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9020m = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9017j
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f9024q
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f9019l
            r3.setAlpha(r9)
            r13.f9024q = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            i.b$c r9 = r13.f9015h
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9019l
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f9024q = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f9018k
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f9025r
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f9018k = r0
            r13.f9025r = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$c r4 = r13.f9015h
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f9019l
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f9025r = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f9023p
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f9015h.b(theme);
    }

    /* access modifiers changed from: package-private */
    public c b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f9021n;
    }

    public boolean canApplyTheme() {
        return this.f9015h.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9018k;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9021n
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$c r0 = r9.f9015h
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f9018k
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f9017j
            if (r0 == 0) goto L_0x0029
            r9.f9018k = r0
            i.b$c r0 = r9.f9015h
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9025r = r0
            goto L_0x0035
        L_0x0029:
            r9.f9018k = r4
            r9.f9025r = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f9017j
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            i.b$c r0 = r9.f9015h
            int r1 = r0.f9036h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f9017j = r0
            r9.f9021n = r10
            if (r0 == 0) goto L_0x005a
            i.b$c r10 = r9.f9015h
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9024q = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f9017j = r4
            r10 = -1
            r9.f9021n = r10
        L_0x005a:
            long r0 = r9.f9024q
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f9025r
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f9023p
            if (r0 != 0) goto L_0x0073
            i.b$a r0 = new i.b$a
            r0.<init>()
            r9.f9023p = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f9019l;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9015h.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f9015h.c()) {
            return null;
        }
        this.f9015h.f9032d = getChangingConfigurations();
        return this.f9015h;
    }

    public Drawable getCurrent() {
        return this.f9017j;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9016i;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f9015h.q()) {
            return this.f9015h.i();
        }
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f9015h.q()) {
            return this.f9015h.m();
        }
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f9015h.q()) {
            return this.f9015h.j();
        }
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f9015h.q()) {
            return this.f9015h.k();
        }
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f9017j;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f9015h.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z10;
        Rect l10 = this.f9015h.l();
        if (l10 != null) {
            rect.set(l10);
            z10 = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f9017j;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void h(c cVar) {
        this.f9015h = cVar;
        int i10 = this.f9021n;
        if (i10 >= 0) {
            Drawable g10 = cVar.g(i10);
            this.f9017j = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f9018k = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f9015h.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f9015h;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable == this.f9017j && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f9015h.C;
    }

    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f9018k;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9018k = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f9017j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9020m) {
                this.f9017j.setAlpha(this.f9019l);
            }
        }
        if (this.f9025r != 0) {
            this.f9025r = 0;
            z10 = true;
        }
        if (this.f9024q != 0) {
            this.f9024q = 0;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f9022o && super.mutate() == this) {
            c b10 = b();
            b10.r();
            h(b10);
            this.f9022o = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9018k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9017j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return this.f9015h.w(i10, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f9018k;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f9017j;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9018k;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9017j;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f9017j && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (!this.f9020m || this.f9019l != i10) {
            this.f9020m = true;
            this.f9019l = i10;
            Drawable drawable = this.f9017j;
            if (drawable == null) {
                return;
            }
            if (this.f9024q == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z10) {
        c cVar = this.f9015h;
        if (cVar.C != z10) {
            cVar.C = z10;
            Drawable drawable = this.f9017j;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z10);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f9015h;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f9017j;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z10) {
        c cVar = this.f9015h;
        if (cVar.f9052x != z10) {
            cVar.f9052x = z10;
            Drawable drawable = this.f9017j;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f9016i;
        if (rect == null) {
            this.f9016i = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f9017j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i10, i11, i12, i13);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f9015h;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f9017j, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f9015h;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f9017j, mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f9018k;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f9017j;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f9017j && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
