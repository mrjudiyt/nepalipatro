package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.k0;
import androidx.core.graphics.b;
import f.c;
import f.e;

/* compiled from: AppCompatDrawableManager */
public final class i {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1120b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static i f1121c;

    /* renamed from: a  reason: collision with root package name */
    private k0 f1122a;

    /* compiled from: AppCompatDrawableManager */
    class a implements k0.e {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1123a = {e.S, e.Q, e.f8231a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f1124b = {e.f8245o, e.B, e.f8250t, e.f8246p, e.f8247q, e.f8249s, e.f8248r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f1125c = {e.P, e.R, e.f8241k, e.I, e.J, e.L, e.N, e.K, e.M, e.O};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f1126d = {e.f8253w, e.f8239i, e.f8252v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f1127e = {e.H, e.T};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f1128f = {e.f8233c, e.f8237g, e.f8234d, e.f8238h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = p0.c(context, f.a.f8205v);
            int b10 = p0.b(context, f.a.f8203t);
            return new ColorStateList(new int[][]{p0.f1203b, p0.f1206e, p0.f1204c, p0.f1210i}, new int[]{b10, b.c(c10, i10), b.c(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, p0.c(context, f.a.f8202s));
        }

        private ColorStateList j(Context context) {
            return h(context, p0.c(context, f.a.f8203t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = f.a.f8207x;
            ColorStateList e10 = p0.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = p0.f1203b;
                iArr2[0] = p0.b(context, i10);
                iArr[1] = p0.f1207f;
                iArr2[1] = p0.c(context, f.a.f8204u);
                iArr[2] = p0.f1210i;
                iArr2[2] = p0.c(context, i10);
            } else {
                iArr[0] = p0.f1203b;
                iArr2[0] = e10.getColorForState(iArr[0], 0);
                iArr[1] = p0.f1207f;
                iArr2[1] = p0.c(context, f.a.f8204u);
                iArr[2] = p0.f1210i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f1120b;
            }
            drawable.setColorFilter(i.e(i10, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.i.f1120b
                int[] r1 = r6.f1123a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = f.a.f8206w
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1125c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = f.a.f8204u
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1126d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = f.e.f8251u
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = f.e.f8242l
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.c0.a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.p0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.i.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i10) {
            if (i10 == e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(k0 k0Var, Context context, int i10) {
            if (i10 != e.f8240j) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{k0Var.j(context, e.f8239i), k0Var.j(context, e.f8241k)});
        }

        public ColorStateList d(Context context, int i10) {
            if (i10 == e.f8243m) {
                return h.a.c(context, c.f8215e);
            }
            if (i10 == e.G) {
                return h.a.c(context, c.f8218h);
            }
            if (i10 == e.F) {
                return k(context);
            }
            if (i10 == e.f8236f) {
                return j(context);
            }
            if (i10 == e.f8232b) {
                return g(context);
            }
            if (i10 == e.f8235e) {
                return i(context);
            }
            if (i10 == e.D || i10 == e.E) {
                return h.a.c(context, c.f8217g);
            }
            if (f(this.f1124b, i10)) {
                return p0.e(context, f.a.f8206w);
            }
            if (f(this.f1127e, i10)) {
                return h.a.c(context, c.f8214d);
            }
            if (f(this.f1128f, i10)) {
                return h.a.c(context, c.f8213c);
            }
            if (i10 == e.A) {
                return h.a.c(context, c.f8216f);
            }
            return null;
        }

        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = f.a.f8206w;
                l(findDrawableByLayerId, p0.c(context, i11), i.f1120b);
                l(layerDrawable.findDrawableByLayerId(16908303), p0.c(context, i11), i.f1120b);
                l(layerDrawable.findDrawableByLayerId(16908301), p0.c(context, f.a.f8204u), i.f1120b);
                return true;
            } else if (i10 != e.f8255y && i10 != e.f8254x && i10 != e.f8256z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(16908288), p0.b(context, f.a.f8206w), i.f1120b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = f.a.f8204u;
                l(findDrawableByLayerId2, p0.c(context, i12), i.f1120b);
                l(layerDrawable2.findDrawableByLayerId(16908301), p0.c(context, i12), i.f1120b);
                return true;
            }
        }
    }

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            if (f1121c == null) {
                h();
            }
            iVar = f1121c;
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (i.class) {
            l10 = k0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (i.class) {
            if (f1121c == null) {
                i iVar = new i();
                f1121c = iVar;
                iVar.f1122a = k0.h();
                f1121c.f1122a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, s0 s0Var, int[] iArr) {
        k0.w(drawable, s0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1122a.j(context, i10);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1122a.k(context, i10, z10);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i10) {
        return this.f1122a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1122a.s(context);
    }
}
