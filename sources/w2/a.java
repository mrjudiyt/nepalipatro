package w2;

import a3.b;
import a3.j;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.f;
import com.bumptech.glide.load.resource.bitmap.i;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e2.e;
import e2.g;
import e2.k;
import java.util.Map;
import w2.a;

/* compiled from: BaseRequestOptions */
public abstract class a<T extends a<T>> implements Cloneable {
    private boolean A;
    private Resources.Theme B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F = true;
    private boolean G;

    /* renamed from: h  reason: collision with root package name */
    private int f12664h;

    /* renamed from: i  reason: collision with root package name */
    private float f12665i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private h2.a f12666j = h2.a.f8940e;

    /* renamed from: k  reason: collision with root package name */
    private f f12667k = f.NORMAL;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f12668l;

    /* renamed from: m  reason: collision with root package name */
    private int f12669m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f12670n;

    /* renamed from: o  reason: collision with root package name */
    private int f12671o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12672p = true;

    /* renamed from: q  reason: collision with root package name */
    private int f12673q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f12674r = -1;

    /* renamed from: s  reason: collision with root package name */
    private e f12675s = z2.a.c();

    /* renamed from: t  reason: collision with root package name */
    private boolean f12676t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f12677u = true;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f12678v;

    /* renamed from: w  reason: collision with root package name */
    private int f12679w;

    /* renamed from: x  reason: collision with root package name */
    private g f12680x = new g();

    /* renamed from: y  reason: collision with root package name */
    private Map<Class<?>, k<?>> f12681y = new b();

    /* renamed from: z  reason: collision with root package name */
    private Class<?> f12682z = Object.class;

    private boolean F(int i10) {
        return G(this.f12664h, i10);
    }

    private static boolean G(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T M() {
        return this;
    }

    private T N() {
        if (!this.A) {
            return M();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final boolean A() {
        return this.G;
    }

    public final boolean B() {
        return this.D;
    }

    public final boolean C() {
        return this.f12672p;
    }

    public final boolean D() {
        return F(8);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.F;
    }

    public final boolean H() {
        return this.f12676t;
    }

    public final boolean I() {
        return a3.k.s(this.f12674r, this.f12673q);
    }

    public T J() {
        this.A = true;
        return M();
    }

    public T K(int i10, int i11) {
        if (this.C) {
            return clone().K(i10, i11);
        }
        this.f12674r = i10;
        this.f12673q = i11;
        this.f12664h |= 512;
        return N();
    }

    public T L(f fVar) {
        if (this.C) {
            return clone().L(fVar);
        }
        this.f12667k = (f) j.d(fVar);
        this.f12664h |= 8;
        return N();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e2.f<Y>, java.lang.Object, e2.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T O(e2.f<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.O(r2, r3)
            return r2
        L_0x000d:
            a3.j.d(r2)
            a3.j.d(r3)
            e2.g r0 = r1.f12680x
            r0.e(r2, r3)
            w2.a r2 = r1.N()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.O(e2.f, java.lang.Object):w2.a");
    }

    public T P(e eVar) {
        if (this.C) {
            return clone().P(eVar);
        }
        this.f12675s = (e) j.d(eVar);
        this.f12664h |= 1024;
        return N();
    }

    public T Q(float f10) {
        if (this.C) {
            return clone().Q(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f12665i = f10;
        this.f12664h |= 2;
        return N();
    }

    public T R(boolean z10) {
        if (this.C) {
            return clone().R(true);
        }
        this.f12672p = !z10;
        this.f12664h |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        return N();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e2.k, e2.k<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T S(com.bumptech.glide.load.resource.bitmap.j r2, e2.k<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.S(r2, r3)
            return r2
        L_0x000d:
            r1.g(r2)
            w2.a r2 = r1.T(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.S(com.bumptech.glide.load.resource.bitmap.j, e2.k):w2.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e2.k, e2.k<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T T(e2.k<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            w2.a r2 = r1.U(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.T(e2.k):w2.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e2.k, e2.k<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T U(e2.k<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r2.clone()
            w2.a r3 = r0.U(r3, r4)
            return r3
        L_0x000d:
            com.bumptech.glide.load.resource.bitmap.m r0 = new com.bumptech.glide.load.resource.bitmap.m
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.V(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.V(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            e2.k r0 = r0.c()
            r2.V(r1, r0, r4)
            java.lang.Class<r2.c> r0 = r2.c.class
            r2.f r1 = new r2.f
            r1.<init>(r3)
            r2.V(r0, r1, r4)
            w2.a r3 = r2.N()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.U(e2.k, boolean):w2.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [e2.k, java.lang.Object, e2.k<Y>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T V(java.lang.Class<Y> r2, e2.k<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.C
            if (r0 == 0) goto L_0x000d
            w2.a r0 = r1.clone()
            w2.a r2 = r0.V(r2, r3, r4)
            return r2
        L_0x000d:
            a3.j.d(r2)
            a3.j.d(r3)
            java.util.Map<java.lang.Class<?>, e2.k<?>> r0 = r1.f12681y
            r0.put(r2, r3)
            int r2 = r1.f12664h
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f12664h = r2
            r3 = 1
            r1.f12677u = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f12664h = r2
            r0 = 0
            r1.F = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f12664h = r2
            r1.f12676t = r3
        L_0x0032:
            w2.a r2 = r1.N()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.V(java.lang.Class, e2.k, boolean):w2.a");
    }

    public T W(boolean z10) {
        if (this.C) {
            return clone().W(z10);
        }
        this.G = z10;
        this.f12664h |= 1048576;
        return N();
    }

    public T a(a<?> aVar) {
        if (this.C) {
            return clone().a(aVar);
        }
        if (G(aVar.f12664h, 2)) {
            this.f12665i = aVar.f12665i;
        }
        if (G(aVar.f12664h, 262144)) {
            this.D = aVar.D;
        }
        if (G(aVar.f12664h, 1048576)) {
            this.G = aVar.G;
        }
        if (G(aVar.f12664h, 4)) {
            this.f12666j = aVar.f12666j;
        }
        if (G(aVar.f12664h, 8)) {
            this.f12667k = aVar.f12667k;
        }
        if (G(aVar.f12664h, 16)) {
            this.f12668l = aVar.f12668l;
            this.f12669m = 0;
            this.f12664h &= -33;
        }
        if (G(aVar.f12664h, 32)) {
            this.f12669m = aVar.f12669m;
            this.f12668l = null;
            this.f12664h &= -17;
        }
        if (G(aVar.f12664h, 64)) {
            this.f12670n = aVar.f12670n;
            this.f12671o = 0;
            this.f12664h &= -129;
        }
        if (G(aVar.f12664h, 128)) {
            this.f12671o = aVar.f12671o;
            this.f12670n = null;
            this.f12664h &= -65;
        }
        if (G(aVar.f12664h, UserVerificationMethods.USER_VERIFY_HANDPRINT)) {
            this.f12672p = aVar.f12672p;
        }
        if (G(aVar.f12664h, 512)) {
            this.f12674r = aVar.f12674r;
            this.f12673q = aVar.f12673q;
        }
        if (G(aVar.f12664h, 1024)) {
            this.f12675s = aVar.f12675s;
        }
        if (G(aVar.f12664h, 4096)) {
            this.f12682z = aVar.f12682z;
        }
        if (G(aVar.f12664h, 8192)) {
            this.f12678v = aVar.f12678v;
            this.f12679w = 0;
            this.f12664h &= -16385;
        }
        if (G(aVar.f12664h, 16384)) {
            this.f12679w = aVar.f12679w;
            this.f12678v = null;
            this.f12664h &= -8193;
        }
        if (G(aVar.f12664h, 32768)) {
            this.B = aVar.B;
        }
        if (G(aVar.f12664h, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST)) {
            this.f12677u = aVar.f12677u;
        }
        if (G(aVar.f12664h, 131072)) {
            this.f12676t = aVar.f12676t;
        }
        if (G(aVar.f12664h, 2048)) {
            this.f12681y.putAll(aVar.f12681y);
            this.F = aVar.F;
        }
        if (G(aVar.f12664h, 524288)) {
            this.E = aVar.E;
        }
        if (!this.f12677u) {
            this.f12681y.clear();
            int i10 = this.f12664h & -2049;
            this.f12664h = i10;
            this.f12676t = false;
            this.f12664h = i10 & -131073;
            this.F = true;
        }
        this.f12664h |= aVar.f12664h;
        this.f12680x.d(aVar.f12680x);
        return N();
    }

    public T b() {
        if (!this.A || this.C) {
            this.C = true;
            return J();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public T c() {
        return S(com.bumptech.glide.load.resource.bitmap.j.f5874e, new i());
    }

    /* renamed from: d */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            g gVar = new g();
            t10.f12680x = gVar;
            gVar.d(this.f12680x);
            b bVar = new b();
            t10.f12681y = bVar;
            bVar.putAll(this.f12681y);
            t10.A = false;
            t10.C = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T e(Class<?> cls) {
        if (this.C) {
            return clone().e(cls);
        }
        this.f12682z = (Class) j.d(cls);
        this.f12664h |= 4096;
        return N();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f12665i, this.f12665i) == 0 && this.f12669m == aVar.f12669m && a3.k.d(this.f12668l, aVar.f12668l) && this.f12671o == aVar.f12671o && a3.k.d(this.f12670n, aVar.f12670n) && this.f12679w == aVar.f12679w && a3.k.d(this.f12678v, aVar.f12678v) && this.f12672p == aVar.f12672p && this.f12673q == aVar.f12673q && this.f12674r == aVar.f12674r && this.f12676t == aVar.f12676t && this.f12677u == aVar.f12677u && this.D == aVar.D && this.E == aVar.E && this.f12666j.equals(aVar.f12666j) && this.f12667k == aVar.f12667k && this.f12680x.equals(aVar.f12680x) && this.f12681y.equals(aVar.f12681y) && this.f12682z.equals(aVar.f12682z) && a3.k.d(this.f12675s, aVar.f12675s) && a3.k.d(this.B, aVar.B)) {
            return true;
        }
        return false;
    }

    public T f(h2.a aVar) {
        if (this.C) {
            return clone().f(aVar);
        }
        this.f12666j = (h2.a) j.d(aVar);
        this.f12664h |= 4;
        return N();
    }

    public T g(com.bumptech.glide.load.resource.bitmap.j jVar) {
        return O(com.bumptech.glide.load.resource.bitmap.j.f5877h, j.d(jVar));
    }

    public int hashCode() {
        return a3.k.n(this.B, a3.k.n(this.f12675s, a3.k.n(this.f12682z, a3.k.n(this.f12681y, a3.k.n(this.f12680x, a3.k.n(this.f12667k, a3.k.n(this.f12666j, a3.k.o(this.E, a3.k.o(this.D, a3.k.o(this.f12677u, a3.k.o(this.f12676t, a3.k.m(this.f12674r, a3.k.m(this.f12673q, a3.k.o(this.f12672p, a3.k.n(this.f12678v, a3.k.m(this.f12679w, a3.k.n(this.f12670n, a3.k.m(this.f12671o, a3.k.n(this.f12668l, a3.k.m(this.f12669m, a3.k.k(this.f12665i)))))))))))))))))))));
    }

    public final h2.a i() {
        return this.f12666j;
    }

    public final int k() {
        return this.f12669m;
    }

    public final Drawable l() {
        return this.f12668l;
    }

    public final Drawable m() {
        return this.f12678v;
    }

    public final int n() {
        return this.f12679w;
    }

    public final boolean o() {
        return this.E;
    }

    public final g p() {
        return this.f12680x;
    }

    public final int q() {
        return this.f12673q;
    }

    public final int r() {
        return this.f12674r;
    }

    public final Drawable s() {
        return this.f12670n;
    }

    public final int t() {
        return this.f12671o;
    }

    public final f u() {
        return this.f12667k;
    }

    public final Class<?> v() {
        return this.f12682z;
    }

    public final e w() {
        return this.f12675s;
    }

    public final float x() {
        return this.f12665i;
    }

    public final Resources.Theme y() {
        return this.B;
    }

    public final Map<Class<?>, k<?>> z() {
        return this.f12681y;
    }
}
