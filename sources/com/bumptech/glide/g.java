package com.bumptech.glide;

import a3.j;
import a3.k;
import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w2.b;
import w2.c;
import w2.d;
import w2.e;
import w2.f;
import w2.h;

/* compiled from: RequestBuilder */
public class g<TranscodeType> extends w2.a<g<TranscodeType>> {
    protected static final h V = ((h) ((h) ((h) new h().f(h2.a.f8938c)).L(f.LOW)).R(true));
    private final Context H;
    private final h I;
    private final Class<TranscodeType> J;
    private final b K;
    private final d L;
    private i<?, ? super TranscodeType> M;
    private Object N;
    private List<w2.g<TranscodeType>> O;
    private g<TranscodeType> P;
    private g<TranscodeType> Q;
    private Float R;
    private boolean S = true;
    private boolean T;
    private boolean U;

    /* compiled from: RequestBuilder */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5612a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5613b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.f[] r0 = com.bumptech.glide.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5613b = r0
                r1 = 1
                com.bumptech.glide.f r2 = com.bumptech.glide.f.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5613b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.f r3 = com.bumptech.glide.f.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5613b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.f r4 = com.bumptech.glide.f.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f5613b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.f r5 = com.bumptech.glide.f.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f5612a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f5612a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f5612a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f5612a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f5612a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f5612a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5612a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f5612a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    protected g(b bVar, h hVar, Class<TranscodeType> cls, Context context) {
        this.K = bVar;
        this.I = hVar;
        this.J = cls;
        this.H = context;
        this.M = hVar.n(cls);
        this.L = bVar.i();
        e0(hVar.l());
        a(hVar.m());
    }

    private d Z(x2.d<TranscodeType> dVar, w2.g<TranscodeType> gVar, w2.a<?> aVar, Executor executor) {
        return a0(new Object(), dVar, gVar, (e) null, this.M, aVar.u(), aVar.r(), aVar.q(), aVar, executor);
    }

    private d a0(Object obj, x2.d<TranscodeType> dVar, w2.g<TranscodeType> gVar, e eVar, i<?, ? super TranscodeType> iVar, f fVar, int i10, int i11, w2.a<?> aVar, Executor executor) {
        b bVar;
        b bVar2;
        if (this.Q != null) {
            bVar2 = new b(obj, eVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = eVar;
        }
        d b02 = b0(obj, dVar, gVar, bVar2, iVar, fVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return b02;
        }
        int r10 = this.Q.r();
        int q10 = this.Q.q();
        if (k.s(i10, i11) && !this.Q.I()) {
            r10 = aVar.r();
            q10 = aVar.q();
        }
        g<TranscodeType> gVar2 = this.Q;
        b bVar3 = bVar;
        bVar3.p(b02, gVar2.a0(obj, dVar, gVar, bVar3, gVar2.M, gVar2.u(), r10, q10, this.Q, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [w2.a<?>, w2.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w2.d b0(java.lang.Object r19, x2.d<TranscodeType> r20, w2.g<TranscodeType> r21, w2.e r22, com.bumptech.glide.i<?, ? super TranscodeType> r23, com.bumptech.glide.f r24, int r25, int r26, w2.a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.g<TranscodeType> r0 = r11.P
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.U
            if (r1 != 0) goto L_0x008c
            com.bumptech.glide.i<?, ? super TranscodeType> r1 = r0.M
            boolean r2 = r0.S
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.D()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.g<TranscodeType> r0 = r11.P
            com.bumptech.glide.f r0 = r0.u()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.f r0 = r11.d0(r13)
        L_0x002b:
            r15 = r0
            com.bumptech.glide.g<TranscodeType> r0 = r11.P
            int r0 = r0.r()
            com.bumptech.glide.g<TranscodeType> r1 = r11.P
            int r1 = r1.q()
            boolean r2 = a3.k.s(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.bumptech.glide.g<TranscodeType> r2 = r11.P
            boolean r2 = r2.I()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.r()
            int r1 = r27.q()
        L_0x004e:
            r16 = r0
            r17 = r1
            w2.k r10 = new w2.k
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            w2.d r10 = r0.m0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.U = r0
            com.bumptech.glide.g<TranscodeType> r9 = r11.P
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            w2.d r0 = r0.a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.U = r1
            r13.o(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.R
            if (r0 == 0) goto L_0x00d4
            w2.k r14 = new w2.k
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            w2.d r15 = r0.m0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            w2.a r0 = r27.clone()
            java.lang.Float r1 = r11.R
            float r1 = r1.floatValue()
            w2.a r4 = r0.Q(r1)
            com.bumptech.glide.f r7 = r11.d0(r13)
            r0 = r18
            r1 = r19
            w2.d r0 = r0.m0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.o(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            w2.d r0 = r0.m0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.b0(java.lang.Object, x2.d, w2.g, w2.e, com.bumptech.glide.i, com.bumptech.glide.f, int, int, w2.a, java.util.concurrent.Executor):w2.d");
    }

    private f d0(f fVar) {
        int i10 = a.f5613b[fVar.ordinal()];
        if (i10 == 1) {
            return f.NORMAL;
        }
        if (i10 == 2) {
            return f.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return f.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + u());
    }

    @SuppressLint({"CheckResult"})
    private void e0(List<w2.g<Object>> list) {
        for (w2.g<Object> X : list) {
            X(X);
        }
    }

    private <Y extends x2.d<TranscodeType>> Y h0(Y y10, w2.g<TranscodeType> gVar, w2.a<?> aVar, Executor executor) {
        j.d(y10);
        if (this.T) {
            d Z = Z(y10, gVar, aVar, executor);
            d i10 = y10.i();
            if (!Z.d(i10) || i0(aVar, i10)) {
                this.I.k(y10);
                y10.c(Z);
                this.I.t(y10, Z);
                return y10;
            }
            if (!((d) j.d(i10)).isRunning()) {
                i10.h();
            }
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean i0(w2.a<?> aVar, d dVar) {
        return !aVar.C() && dVar.j();
    }

    private g<TranscodeType> l0(Object obj) {
        this.N = obj;
        this.T = true;
        return this;
    }

    private d m0(Object obj, x2.d<TranscodeType> dVar, w2.g<TranscodeType> gVar, w2.a<?> aVar, e eVar, i<?, ? super TranscodeType> iVar, f fVar, int i10, int i11, Executor executor) {
        Context context = this.H;
        d dVar2 = this.L;
        return w2.j.x(context, dVar2, obj, this.N, this.J, aVar, i10, i11, fVar, dVar, gVar, this.O, eVar, dVar2.e(), iVar.b(), executor);
    }

    public g<TranscodeType> X(w2.g<TranscodeType> gVar) {
        if (gVar != null) {
            if (this.O == null) {
                this.O = new ArrayList();
            }
            this.O.add(gVar);
        }
        return this;
    }

    /* renamed from: Y */
    public g<TranscodeType> a(w2.a<?> aVar) {
        j.d(aVar);
        return (g) super.a(aVar);
    }

    /* renamed from: c0 */
    public g<TranscodeType> d() {
        g<TranscodeType> gVar = (g) super.clone();
        gVar.M = gVar.M.clone();
        return gVar;
    }

    public <Y extends x2.d<TranscodeType>> Y f0(Y y10) {
        return g0(y10, (w2.g) null, a3.e.b());
    }

    /* access modifiers changed from: package-private */
    public <Y extends x2.d<TranscodeType>> Y g0(Y y10, w2.g<TranscodeType> gVar, Executor executor) {
        return h0(y10, gVar, this, executor);
    }

    public g<TranscodeType> j0(Object obj) {
        return l0(obj);
    }

    public g<TranscodeType> k0(String str) {
        return l0(str);
    }

    public c<TranscodeType> n0() {
        return o0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public c<TranscodeType> o0(int i10, int i11) {
        f fVar = new f(i10, i11);
        return (c) g0(fVar, fVar, a3.e.a());
    }
}
