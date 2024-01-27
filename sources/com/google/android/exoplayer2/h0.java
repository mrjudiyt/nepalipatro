package com.google.android.exoplayer2;

import a6.k;
import a6.m0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.w0;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.common.collect.x;
import e4.l;
import e4.m;
import e4.s;
import e4.v;
import f4.i1;
import g5.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.u;
import x4.a;
import y5.o;
import y5.p;

/* compiled from: ExoPlayerImplInternal */
final class h0 implements Handler.Callback, j.a, o.a, r0.d, g.a, u0.a {
    private final i0 A;
    private final long B;
    private v C;
    private s0 D;
    private e E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;
    /* access modifiers changed from: private */
    public boolean N;
    private boolean O;
    private int P;
    private h Q;
    private long R;
    private int S;
    private boolean T;
    private ExoPlaybackException U;
    private long V;

    /* renamed from: h  reason: collision with root package name */
    private final w0[] f6691h;

    /* renamed from: i  reason: collision with root package name */
    private final s[] f6692i;

    /* renamed from: j  reason: collision with root package name */
    private final o f6693j;

    /* renamed from: k  reason: collision with root package name */
    private final p f6694k;

    /* renamed from: l  reason: collision with root package name */
    private final l f6695l;

    /* renamed from: m  reason: collision with root package name */
    private final z5.e f6696m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final k f6697n;

    /* renamed from: o  reason: collision with root package name */
    private final HandlerThread f6698o;

    /* renamed from: p  reason: collision with root package name */
    private final Looper f6699p;

    /* renamed from: q  reason: collision with root package name */
    private final a1.c f6700q;

    /* renamed from: r  reason: collision with root package name */
    private final a1.b f6701r;

    /* renamed from: s  reason: collision with root package name */
    private final long f6702s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f6703t;

    /* renamed from: u  reason: collision with root package name */
    private final g f6704u;

    /* renamed from: v  reason: collision with root package name */
    private final ArrayList<d> f6705v;

    /* renamed from: w  reason: collision with root package name */
    private final a6.b f6706w;

    /* renamed from: x  reason: collision with root package name */
    private final f f6707x;

    /* renamed from: y  reason: collision with root package name */
    private final o0 f6708y;

    /* renamed from: z  reason: collision with root package name */
    private final r0 f6709z;

    /* compiled from: ExoPlayerImplInternal */
    class a implements w0.a {
        a() {
        }

        public void a() {
            h0.this.f6697n.f(2);
        }

        public void b(long j10) {
            if (j10 >= 2000) {
                boolean unused = h0.this.N = true;
            }
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<r0.c> f6711a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final w f6712b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f6713c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f6714d;

        /* synthetic */ b(List list, w wVar, int i10, long j10, a aVar) {
            this(list, wVar, i10, j10);
        }

        private b(List<r0.c> list, w wVar, int i10, long j10) {
            this.f6711a = list;
            this.f6712b = wVar;
            this.f6713c = i10;
            this.f6714d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6715a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6716b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6717c;

        /* renamed from: d  reason: collision with root package name */
        public final w f6718d;
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class d implements Comparable<d> {

        /* renamed from: h  reason: collision with root package name */
        public final u0 f6719h;

        /* renamed from: i  reason: collision with root package name */
        public int f6720i;

        /* renamed from: j  reason: collision with root package name */
        public long f6721j;

        /* renamed from: k  reason: collision with root package name */
        public Object f6722k;

        public d(u0 u0Var) {
            this.f6719h = u0Var;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f6722k;
            if ((obj == null) != (dVar.f6722k == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f6720i - dVar.f6720i;
            if (i10 != 0) {
                return i10;
            }
            return m0.p(this.f6721j, dVar.f6721j);
        }

        public void d(int i10, long j10, Object obj) {
            this.f6720i = i10;
            this.f6721j = j10;
            this.f6722k = obj;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f6723a;

        /* renamed from: b  reason: collision with root package name */
        public s0 f6724b;

        /* renamed from: c  reason: collision with root package name */
        public int f6725c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6726d;

        /* renamed from: e  reason: collision with root package name */
        public int f6727e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6728f;

        /* renamed from: g  reason: collision with root package name */
        public int f6729g;

        public e(s0 s0Var) {
            this.f6724b = s0Var;
        }

        public void b(int i10) {
            this.f6723a |= i10 > 0;
            this.f6725c += i10;
        }

        public void c(int i10) {
            this.f6723a = true;
            this.f6728f = true;
            this.f6729g = i10;
        }

        public void d(s0 s0Var) {
            this.f6723a |= this.f6724b != s0Var;
            this.f6724b = s0Var;
        }

        public void e(int i10) {
            boolean z10 = true;
            if (!this.f6726d || this.f6727e == 5) {
                this.f6723a = true;
                this.f6726d = true;
                this.f6727e = i10;
                return;
            }
            if (i10 != 5) {
                z10 = false;
            }
            a6.a.a(z10);
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public interface f {
        void a(e eVar);
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final k.a f6730a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6731b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6732c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6733d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6734e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6735f;

        public g(k.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f6730a = aVar;
            this.f6731b = j10;
            this.f6732c = j11;
            this.f6733d = z10;
            this.f6734e = z11;
            this.f6735f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final a1 f6736a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6737b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6738c;

        public h(a1 a1Var, int i10, long j10) {
            this.f6736a = a1Var;
            this.f6737b = i10;
            this.f6738c = j10;
        }
    }

    public h0(w0[] w0VarArr, o oVar, p pVar, l lVar, z5.e eVar, int i10, boolean z10, i1 i1Var, v vVar, i0 i0Var, long j10, boolean z11, Looper looper, a6.b bVar, f fVar) {
        w0[] w0VarArr2 = w0VarArr;
        z5.e eVar2 = eVar;
        i1 i1Var2 = i1Var;
        long j11 = j10;
        a6.b bVar2 = bVar;
        this.f6707x = fVar;
        this.f6691h = w0VarArr2;
        this.f6693j = oVar;
        this.f6694k = pVar;
        this.f6695l = lVar;
        this.f6696m = eVar2;
        this.K = i10;
        this.L = z10;
        this.C = vVar;
        this.A = i0Var;
        this.B = j11;
        this.V = j11;
        this.G = z11;
        this.f6706w = bVar2;
        this.f6702s = lVar.c();
        this.f6703t = lVar.b();
        s0 k10 = s0.k(pVar);
        this.D = k10;
        this.E = new e(k10);
        this.f6692i = new s[w0VarArr2.length];
        for (int i11 = 0; i11 < w0VarArr2.length; i11++) {
            w0VarArr2[i11].f(i11);
            this.f6692i[i11] = w0VarArr2[i11].m();
        }
        this.f6704u = new g(this, bVar2);
        this.f6705v = new ArrayList<>();
        this.f6700q = new a1.c();
        this.f6701r = new a1.b();
        oVar.b(this, eVar2);
        this.T = true;
        Handler handler = new Handler(looper);
        this.f6708y = new o0(i1Var2, handler);
        this.f6709z = new r0(this, i1Var2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f6698o = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f6699p = looper2;
        this.f6697n = bVar2.b(looper2, this);
    }

    private void A0(boolean z10) {
        k.a aVar = this.f6708y.p().f6864f.f6875a;
        long D0 = D0(aVar, this.D.f7077s, true, false);
        if (D0 != this.D.f7077s) {
            s0 s0Var = this.D;
            this.D = K(aVar, D0, s0Var.f7061c, s0Var.f7062d, z10, 5);
        }
    }

    private long B() {
        return C(this.D.f7075q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ all -> 0x0147 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae A[Catch:{ all -> 0x0147 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B0(com.google.android.exoplayer2.h0.h r20) {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            com.google.android.exoplayer2.h0$e r1 = r11.E
            r8 = 1
            r1.b(r8)
            com.google.android.exoplayer2.s0 r1 = r11.D
            com.google.android.exoplayer2.a1 r1 = r1.f7059a
            int r4 = r11.K
            boolean r5 = r11.L
            com.google.android.exoplayer2.a1$c r6 = r11.f6700q
            com.google.android.exoplayer2.a1$b r7 = r11.f6701r
            r3 = 1
            r2 = r20
            android.util.Pair r1 = w0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004b
            com.google.android.exoplayer2.s0 r7 = r11.D
            com.google.android.exoplayer2.a1 r7 = r7.f7059a
            android.util.Pair r7 = r11.z(r7)
            java.lang.Object r9 = r7.first
            com.google.android.exoplayer2.source.k$a r9 = (com.google.android.exoplayer2.source.k.a) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            com.google.android.exoplayer2.s0 r7 = r11.D
            com.google.android.exoplayer2.a1 r7 = r7.f7059a
            boolean r7 = r7.q()
            r7 = r7 ^ r8
            r10 = r7
            r17 = r4
        L_0x0047:
            r4 = r12
            r12 = r17
            goto L_0x00a1
        L_0x004b:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f6738c
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x005d
            r9 = r4
            goto L_0x005e
        L_0x005d:
            r9 = r12
        L_0x005e:
            com.google.android.exoplayer2.o0 r14 = r11.f6708y
            com.google.android.exoplayer2.s0 r15 = r11.D
            com.google.android.exoplayer2.a1 r15 = r15.f7059a
            com.google.android.exoplayer2.source.k$a r7 = r14.A(r15, r7, r12)
            boolean r14 = r7.b()
            if (r14 == 0) goto L_0x0093
            com.google.android.exoplayer2.s0 r4 = r11.D
            com.google.android.exoplayer2.a1 r4 = r4.f7059a
            java.lang.Object r5 = r7.f8900a
            com.google.android.exoplayer2.a1$b r12 = r11.f6701r
            r4.h(r5, r12)
            com.google.android.exoplayer2.a1$b r4 = r11.f6701r
            int r5 = r7.f8901b
            int r4 = r4.i(r5)
            int r5 = r7.f8902c
            if (r4 != r5) goto L_0x008d
            com.google.android.exoplayer2.a1$b r4 = r11.f6701r
            long r4 = r4.f()
            r12 = r4
            goto L_0x008e
        L_0x008d:
            r12 = r2
        L_0x008e:
            r4 = r12
            r12 = r9
            r10 = 1
            r9 = r7
            goto L_0x00a1
        L_0x0093:
            long r14 = r0.f6738c
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x009b
            r4 = 1
            goto L_0x009c
        L_0x009b:
            r4 = 0
        L_0x009c:
            r17 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a1:
            com.google.android.exoplayer2.s0 r7 = r11.D     // Catch:{ all -> 0x0147 }
            com.google.android.exoplayer2.a1 r7 = r7.f7059a     // Catch:{ all -> 0x0147 }
            boolean r7 = r7.q()     // Catch:{ all -> 0x0147 }
            if (r7 == 0) goto L_0x00ae
            r11.Q = r0     // Catch:{ all -> 0x0147 }
            goto L_0x00bd
        L_0x00ae:
            r0 = 4
            if (r1 != 0) goto L_0x00c0
            com.google.android.exoplayer2.s0 r1 = r11.D     // Catch:{ all -> 0x0147 }
            int r1 = r1.f7063e     // Catch:{ all -> 0x0147 }
            if (r1 == r8) goto L_0x00ba
            r11.Y0(r0)     // Catch:{ all -> 0x0147 }
        L_0x00ba:
            r11.p0(r6, r8, r6, r8)     // Catch:{ all -> 0x0147 }
        L_0x00bd:
            r7 = r4
            goto L_0x0134
        L_0x00c0:
            com.google.android.exoplayer2.s0 r1 = r11.D     // Catch:{ all -> 0x0147 }
            com.google.android.exoplayer2.source.k$a r1 = r1.f7060b     // Catch:{ all -> 0x0147 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x010f
            com.google.android.exoplayer2.o0 r1 = r11.f6708y     // Catch:{ all -> 0x0147 }
            com.google.android.exoplayer2.l0 r1 = r1.p()     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x00e3
            boolean r7 = r1.f6862d     // Catch:{ all -> 0x0147 }
            if (r7 == 0) goto L_0x00e3
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            com.google.android.exoplayer2.source.j r1 = r1.f6859a     // Catch:{ all -> 0x0147 }
            e4.v r2 = r11.C     // Catch:{ all -> 0x0147 }
            long r1 = r1.c(r4, r2)     // Catch:{ all -> 0x0147 }
            goto L_0x00e4
        L_0x00e3:
            r1 = r4
        L_0x00e4:
            long r14 = e4.c.e(r1)     // Catch:{ all -> 0x0147 }
            com.google.android.exoplayer2.s0 r3 = r11.D     // Catch:{ all -> 0x0147 }
            long r6 = r3.f7077s     // Catch:{ all -> 0x0147 }
            long r6 = e4.c.e(r6)     // Catch:{ all -> 0x0147 }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0110
            com.google.android.exoplayer2.s0 r3 = r11.D     // Catch:{ all -> 0x0147 }
            int r6 = r3.f7063e     // Catch:{ all -> 0x0147 }
            r7 = 2
            if (r6 == r7) goto L_0x00fe
            r7 = 3
            if (r6 != r7) goto L_0x0110
        L_0x00fe:
            long r7 = r3.f7077s     // Catch:{ all -> 0x0147 }
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.google.android.exoplayer2.s0 r0 = r1.K(r2, r3, r5, r7, r9, r10)
            r11.D = r0
            return
        L_0x010f:
            r1 = r4
        L_0x0110:
            com.google.android.exoplayer2.s0 r3 = r11.D     // Catch:{ all -> 0x0147 }
            int r3 = r3.f7063e     // Catch:{ all -> 0x0147 }
            if (r3 != r0) goto L_0x0118
            r0 = 1
            goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            long r14 = r11.C0(r9, r1, r0)     // Catch:{ all -> 0x0147 }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r8 = 0
        L_0x0123:
            r8 = r8 | r10
            com.google.android.exoplayer2.s0 r0 = r11.D     // Catch:{ all -> 0x0143 }
            com.google.android.exoplayer2.a1 r4 = r0.f7059a     // Catch:{ all -> 0x0143 }
            com.google.android.exoplayer2.source.k$a r5 = r0.f7060b     // Catch:{ all -> 0x0143 }
            r1 = r19
            r2 = r4
            r3 = r9
            r6 = r12
            r1.j1(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0143 }
            r10 = r8
            r7 = r14
        L_0x0134:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.google.android.exoplayer2.s0 r0 = r1.K(r2, r3, r5, r7, r9, r10)
            r11.D = r0
            return
        L_0x0143:
            r0 = move-exception
            r10 = r8
            r7 = r14
            goto L_0x0149
        L_0x0147:
            r0 = move-exception
            r7 = r4
        L_0x0149:
            r14 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            com.google.android.exoplayer2.s0 r1 = r1.K(r2, r3, r5, r7, r9, r10)
            r11.D = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h0.B0(com.google.android.exoplayer2.h0$h):void");
    }

    private long C(long j10) {
        l0 j11 = this.f6708y.j();
        if (j11 == null) {
            return 0;
        }
        return Math.max(0, j10 - j11.y(this.R));
    }

    private long C0(k.a aVar, long j10, boolean z10) {
        return D0(aVar, j10, this.f6708y.p() != this.f6708y.q(), z10);
    }

    private void D(j jVar) {
        if (this.f6708y.v(jVar)) {
            this.f6708y.y(this.R);
            T();
        }
    }

    private long D0(k.a aVar, long j10, boolean z10, boolean z11) {
        h1();
        this.I = false;
        if (z11 || this.D.f7063e == 3) {
            Y0(2);
        }
        l0 p10 = this.f6708y.p();
        l0 l0Var = p10;
        while (l0Var != null && !aVar.equals(l0Var.f6864f.f6875a)) {
            l0Var = l0Var.j();
        }
        if (z10 || p10 != l0Var || (l0Var != null && l0Var.z(j10) < 0)) {
            for (w0 n10 : this.f6691h) {
                n(n10);
            }
            if (l0Var != null) {
                while (this.f6708y.p() != l0Var) {
                    this.f6708y.b();
                }
                this.f6708y.z(l0Var);
                l0Var.x(0);
                q();
            }
        }
        if (l0Var != null) {
            this.f6708y.z(l0Var);
            if (!l0Var.f6862d) {
                l0Var.f6864f = l0Var.f6864f.b(j10);
            } else {
                long j11 = l0Var.f6864f.f6879e;
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    j10 = Math.max(0, j11 - 1);
                }
                if (l0Var.f6863e) {
                    long n11 = l0Var.f6859a.n(j10);
                    l0Var.f6859a.t(n11 - this.f6702s, this.f6703t);
                    j10 = n11;
                }
            }
            r0(j10);
            T();
        } else {
            this.f6708y.f();
            r0(j10);
        }
        F(false);
        this.f6697n.f(2);
        return j10;
    }

    private void E(IOException iOException, int i10) {
        ExoPlaybackException c10 = ExoPlaybackException.c(iOException, i10);
        l0 p10 = this.f6708y.p();
        if (p10 != null) {
            c10 = c10.a(p10.f6864f.f6875a);
        }
        a6.p.d("ExoPlayerImplInternal", "Playback error", c10);
        g1(false, false);
        this.D = this.D.f(c10);
    }

    private void E0(u0 u0Var) {
        if (u0Var.e() == -9223372036854775807L) {
            F0(u0Var);
        } else if (this.D.f7059a.q()) {
            this.f6705v.add(new d(u0Var));
        } else {
            d dVar = new d(u0Var);
            a1 a1Var = this.D.f7059a;
            if (t0(dVar, a1Var, a1Var, this.K, this.L, this.f6700q, this.f6701r)) {
                this.f6705v.add(dVar);
                Collections.sort(this.f6705v);
                return;
            }
            u0Var.k(false);
        }
    }

    private void F(boolean z10) {
        long j10;
        l0 j11 = this.f6708y.j();
        k.a aVar = j11 == null ? this.D.f7060b : j11.f6864f.f6875a;
        boolean z11 = !this.D.f7069k.equals(aVar);
        if (z11) {
            this.D = this.D.b(aVar);
        }
        s0 s0Var = this.D;
        if (j11 == null) {
            j10 = s0Var.f7077s;
        } else {
            j10 = j11.i();
        }
        s0Var.f7075q = j10;
        this.D.f7076r = B();
        if ((z11 || z10) && j11 != null && j11.f6862d) {
            k1(j11.n(), j11.o());
        }
    }

    private void F0(u0 u0Var) {
        if (u0Var.c() == this.f6699p) {
            m(u0Var);
            int i10 = this.D.f7063e;
            if (i10 == 3 || i10 == 2) {
                this.f6697n.f(2);
                return;
            }
            return;
        }
        this.f6697n.j(15, u0Var).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G(com.google.android.exoplayer2.a1 r25, boolean r26) {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            com.google.android.exoplayer2.s0 r2 = r11.D
            com.google.android.exoplayer2.h0$h r3 = r11.Q
            com.google.android.exoplayer2.o0 r4 = r11.f6708y
            int r5 = r11.K
            boolean r6 = r11.L
            com.google.android.exoplayer2.a1$c r7 = r11.f6700q
            com.google.android.exoplayer2.a1$b r8 = r11.f6701r
            r1 = r25
            com.google.android.exoplayer2.h0$g r7 = v0(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.exoplayer2.source.k$a r8 = r7.f6730a
            long r9 = r7.f6732c
            boolean r0 = r7.f6733d
            long r13 = r7.f6731b
            com.google.android.exoplayer2.s0 r1 = r11.D
            com.google.android.exoplayer2.source.k$a r1 = r1.f7060b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            com.google.android.exoplayer2.s0 r1 = r11.D
            long r1 = r1.f7077s
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = 0
            goto L_0x003a
        L_0x0038:
            r16 = 1
        L_0x003a:
            r17 = 3
            r6 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f6734e     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x0053
            com.google.android.exoplayer2.s0 r1 = r11.D     // Catch:{ all -> 0x0121 }
            int r1 = r1.f7063e     // Catch:{ all -> 0x0121 }
            if (r1 == r15) goto L_0x0050
            r11.Y0(r4)     // Catch:{ all -> 0x0121 }
        L_0x0050:
            r11.p0(r5, r5, r5, r15)     // Catch:{ all -> 0x0121 }
        L_0x0053:
            if (r16 != 0) goto L_0x006f
            com.google.android.exoplayer2.o0 r1 = r11.f6708y     // Catch:{ all -> 0x0121 }
            long r3 = r11.R     // Catch:{ all -> 0x0121 }
            long r21 = r24.y()     // Catch:{ all -> 0x0121 }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = 0
            r5 = r21
            boolean r0 = r1.F(r2, r3, r5)     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x00a1
            r11.A0(r15)     // Catch:{ all -> 0x011e }
            goto L_0x00a1
        L_0x006f:
            r15 = 0
            r20 = 4
            boolean r1 = r25.q()     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x00a1
            com.google.android.exoplayer2.o0 r1 = r11.f6708y     // Catch:{ all -> 0x011e }
            com.google.android.exoplayer2.l0 r1 = r1.p()     // Catch:{ all -> 0x011e }
        L_0x007e:
            if (r1 == 0) goto L_0x009c
            com.google.android.exoplayer2.m0 r2 = r1.f6864f     // Catch:{ all -> 0x011e }
            com.google.android.exoplayer2.source.k$a r2 = r2.f6875a     // Catch:{ all -> 0x011e }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0097
            com.google.android.exoplayer2.o0 r2 = r11.f6708y     // Catch:{ all -> 0x011e }
            com.google.android.exoplayer2.m0 r3 = r1.f6864f     // Catch:{ all -> 0x011e }
            com.google.android.exoplayer2.m0 r2 = r2.r(r12, r3)     // Catch:{ all -> 0x011e }
            r1.f6864f = r2     // Catch:{ all -> 0x011e }
            r1.A()     // Catch:{ all -> 0x011e }
        L_0x0097:
            com.google.android.exoplayer2.l0 r1 = r1.j()     // Catch:{ all -> 0x011e }
            goto L_0x007e
        L_0x009c:
            long r0 = r11.C0(r8, r13, r0)     // Catch:{ all -> 0x011e }
            r13 = r0
        L_0x00a1:
            com.google.android.exoplayer2.s0 r0 = r11.D
            com.google.android.exoplayer2.a1 r4 = r0.f7059a
            com.google.android.exoplayer2.source.k$a r5 = r0.f7060b
            boolean r0 = r7.f6735f
            if (r0 == 0) goto L_0x00ad
            r6 = r13
            goto L_0x00af
        L_0x00ad:
            r6 = r18
        L_0x00af:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.j1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00c1
            com.google.android.exoplayer2.s0 r0 = r11.D
            long r0 = r0.f7061c
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00ff
        L_0x00c1:
            com.google.android.exoplayer2.s0 r0 = r11.D
            com.google.android.exoplayer2.source.k$a r1 = r0.f7060b
            java.lang.Object r1 = r1.f8900a
            com.google.android.exoplayer2.a1 r0 = r0.f7059a
            if (r16 == 0) goto L_0x00e0
            if (r26 == 0) goto L_0x00e0
            boolean r2 = r0.q()
            if (r2 != 0) goto L_0x00e0
            com.google.android.exoplayer2.a1$b r2 = r11.f6701r
            com.google.android.exoplayer2.a1$b r0 = r0.h(r1, r2)
            boolean r0 = r0.f6239f
            if (r0 != 0) goto L_0x00e0
            r23 = 1
            goto L_0x00e2
        L_0x00e0:
            r23 = 0
        L_0x00e2:
            com.google.android.exoplayer2.s0 r0 = r11.D
            long r5 = r0.f7062d
            int r0 = r12.b(r1)
            r1 = -1
            if (r0 != r1) goto L_0x00ef
            r17 = 4
        L_0x00ef:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.google.android.exoplayer2.s0 r0 = r1.K(r2, r3, r5, r7, r9, r10)
            r11.D = r0
        L_0x00ff:
            r24.q0()
            com.google.android.exoplayer2.s0 r0 = r11.D
            com.google.android.exoplayer2.a1 r0 = r0.f7059a
            r11.u0(r12, r0)
            com.google.android.exoplayer2.s0 r0 = r11.D
            com.google.android.exoplayer2.s0 r0 = r0.j(r12)
            r11.D = r0
            boolean r0 = r25.q()
            if (r0 != 0) goto L_0x011a
            r6 = 0
            r11.Q = r6
        L_0x011a:
            r11.F(r15)
            return
        L_0x011e:
            r0 = move-exception
            r6 = 0
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            r15 = 0
            r20 = 4
        L_0x0125:
            com.google.android.exoplayer2.s0 r1 = r11.D
            com.google.android.exoplayer2.a1 r4 = r1.f7059a
            com.google.android.exoplayer2.source.k$a r5 = r1.f7060b
            boolean r1 = r7.f6735f
            if (r1 == 0) goto L_0x0131
            r18 = r13
        L_0x0131:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.j1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x0146
            com.google.android.exoplayer2.s0 r1 = r11.D
            long r1 = r1.f7061c
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0184
        L_0x0146:
            com.google.android.exoplayer2.s0 r1 = r11.D
            com.google.android.exoplayer2.source.k$a r2 = r1.f7060b
            java.lang.Object r2 = r2.f8900a
            com.google.android.exoplayer2.a1 r1 = r1.f7059a
            if (r16 == 0) goto L_0x0165
            if (r26 == 0) goto L_0x0165
            boolean r3 = r1.q()
            if (r3 != 0) goto L_0x0165
            com.google.android.exoplayer2.a1$b r3 = r11.f6701r
            com.google.android.exoplayer2.a1$b r1 = r1.h(r2, r3)
            boolean r1 = r1.f6239f
            if (r1 != 0) goto L_0x0165
            r23 = 1
            goto L_0x0167
        L_0x0165:
            r23 = 0
        L_0x0167:
            com.google.android.exoplayer2.s0 r1 = r11.D
            long r5 = r1.f7062d
            int r1 = r12.b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0174
            r17 = 4
        L_0x0174:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.google.android.exoplayer2.s0 r1 = r1.K(r2, r3, r5, r7, r9, r10)
            r11.D = r1
        L_0x0184:
            r24.q0()
            com.google.android.exoplayer2.s0 r1 = r11.D
            com.google.android.exoplayer2.a1 r1 = r1.f7059a
            r11.u0(r12, r1)
            com.google.android.exoplayer2.s0 r1 = r11.D
            com.google.android.exoplayer2.s0 r1 = r1.j(r12)
            r11.D = r1
            boolean r1 = r25.q()
            if (r1 != 0) goto L_0x019e
            r11.Q = r15
        L_0x019e:
            r1 = 0
            r11.F(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h0.G(com.google.android.exoplayer2.a1, boolean):void");
    }

    private void G0(u0 u0Var) {
        Looper c10 = u0Var.c();
        if (!c10.getThread().isAlive()) {
            a6.p.h("TAG", "Trying to send message on a dead thread.");
            u0Var.k(false);
            return;
        }
        this.f6706w.b(c10, (Handler.Callback) null).c(new f0(this, u0Var));
    }

    private void H(j jVar) {
        if (this.f6708y.v(jVar)) {
            l0 j10 = this.f6708y.j();
            j10.p(this.f6704u.i().f8134a, this.D.f7059a);
            k1(j10.n(), j10.o());
            if (j10 == this.f6708y.p()) {
                r0(j10.f6864f.f6876b);
                q();
                s0 s0Var = this.D;
                k.a aVar = s0Var.f7060b;
                long j11 = j10.f6864f.f6876b;
                this.D = K(aVar, j11, s0Var.f7061c, j11, false, 5);
            }
            T();
        }
    }

    private void H0(long j10) {
        for (w0 w0Var : this.f6691h) {
            if (w0Var.getStream() != null) {
                I0(w0Var, j10);
            }
        }
    }

    private void I(m mVar, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.E.b(1);
            }
            this.D = this.D.g(mVar);
        }
        n1(mVar.f8134a);
        for (w0 w0Var : this.f6691h) {
            if (w0Var != null) {
                w0Var.o(f10, mVar.f8134a);
            }
        }
    }

    private void I0(w0 w0Var, long j10) {
        w0Var.l();
        if (w0Var instanceof o5.k) {
            ((o5.k) w0Var).X(j10);
        }
    }

    private void J(m mVar, boolean z10) {
        I(mVar, mVar.f8134a, true, z10);
    }

    private void J0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.M != z10) {
            this.M = z10;
            if (!z10) {
                for (w0 w0Var : this.f6691h) {
                    if (!O(w0Var)) {
                        w0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private s0 K(k.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        x<x4.a> xVar;
        p pVar;
        g5.w wVar;
        g5.w wVar2;
        p pVar2;
        k.a aVar2 = aVar;
        long j13 = j11;
        this.T = this.T || j10 != this.D.f7077s || !aVar.equals(this.D.f7060b);
        q0();
        s0 s0Var = this.D;
        g5.w wVar3 = s0Var.f7066h;
        p pVar3 = s0Var.f7067i;
        List<x4.a> list = s0Var.f7068j;
        if (this.f6709z.s()) {
            l0 p10 = this.f6708y.p();
            if (p10 == null) {
                wVar2 = g5.w.f8923k;
            } else {
                wVar2 = p10.n();
            }
            if (p10 == null) {
                pVar2 = this.f6694k;
            } else {
                pVar2 = p10.o();
            }
            x<x4.a> u10 = u(pVar2.f13100c);
            if (p10 != null) {
                m0 m0Var = p10.f6864f;
                if (m0Var.f6877c != j13) {
                    p10.f6864f = m0Var.a(j13);
                }
            }
            wVar = wVar2;
            pVar = pVar2;
            xVar = u10;
        } else if (!aVar.equals(this.D.f7060b)) {
            wVar = g5.w.f8923k;
            pVar = this.f6694k;
            xVar = x.s();
        } else {
            xVar = list;
            wVar = wVar3;
            pVar = pVar3;
        }
        if (z10) {
            this.E.e(i10);
        }
        return this.D.c(aVar, j10, j11, j12, B(), wVar, pVar, xVar);
    }

    private void K0(b bVar) {
        this.E.b(1);
        if (bVar.f6713c != -1) {
            this.Q = new h(new v0(bVar.f6711a, bVar.f6712b), bVar.f6713c, bVar.f6714d);
        }
        G(this.f6709z.C(bVar.f6711a, bVar.f6712b), false);
    }

    private boolean L(w0 w0Var, l0 l0Var) {
        l0 j10 = l0Var.j();
        return l0Var.f6864f.f6880f && j10.f6862d && ((w0Var instanceof o5.k) || w0Var.t() >= j10.m());
    }

    private boolean M() {
        l0 q10 = this.f6708y.q();
        if (!q10.f6862d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            w0[] w0VarArr = this.f6691h;
            if (i10 >= w0VarArr.length) {
                return true;
            }
            w0 w0Var = w0VarArr[i10];
            t tVar = q10.f6861c[i10];
            if (w0Var.getStream() != tVar || (tVar != null && !w0Var.k() && !L(w0Var, q10))) {
                return false;
            }
            i10++;
        }
        return false;
    }

    private void M0(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            s0 s0Var = this.D;
            int i10 = s0Var.f7063e;
            if (z10 || i10 == 4 || i10 == 1) {
                this.D = s0Var.d(z10);
            } else {
                this.f6697n.f(2);
            }
        }
    }

    private boolean N() {
        l0 j10 = this.f6708y.j();
        if (j10 == null || j10.k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private void N0(boolean z10) {
        this.G = z10;
        q0();
        if (this.H && this.f6708y.q() != this.f6708y.p()) {
            A0(true);
            F(false);
        }
    }

    private static boolean O(w0 w0Var) {
        return w0Var.d() != 0;
    }

    private boolean P() {
        l0 p10 = this.f6708y.p();
        long j10 = p10.f6864f.f6879e;
        return p10.f6862d && (j10 == -9223372036854775807L || this.D.f7077s < j10 || !b1());
    }

    private void P0(boolean z10, int i10, boolean z11, int i11) {
        this.E.b(z11 ? 1 : 0);
        this.E.c(i11);
        this.D = this.D.e(z10, i10);
        this.I = false;
        e0(z10);
        if (!b1()) {
            h1();
            m1();
            return;
        }
        int i12 = this.D.f7063e;
        if (i12 == 3) {
            e1();
            this.f6697n.f(2);
        } else if (i12 == 2) {
            this.f6697n.f(2);
        }
    }

    private static boolean Q(s0 s0Var, a1.b bVar) {
        k.a aVar = s0Var.f7060b;
        a1 a1Var = s0Var.f7059a;
        return a1Var.q() || a1Var.h(aVar.f8900a, bVar).f6239f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean R() {
        return Boolean.valueOf(this.F);
    }

    private void R0(m mVar) {
        this.f6704u.g(mVar);
        J(this.f6704u.i(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(u0 u0Var) {
        try {
            m(u0Var);
        } catch (ExoPlaybackException e10) {
            a6.p.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void T() {
        boolean a12 = a1();
        this.J = a12;
        if (a12) {
            this.f6708y.j().d(this.R);
        }
        i1();
    }

    private void T0(int i10) {
        this.K = i10;
        if (!this.f6708y.G(this.D.f7059a, i10)) {
            A0(true);
        }
        F(false);
    }

    private void U() {
        this.E.d(this.D);
        if (this.E.f6723a) {
            this.f6707x.a(this.E);
            this.E = new e(this.D);
        }
    }

    private void U0(v vVar) {
        this.C = vVar;
    }

    private boolean V(long j10, long j11) {
        if (this.O && this.N) {
            return false;
        }
        y0(j10, j11);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[LOOP:1: B:24:0x0074->B:34:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0062 A[EDGE_INSN: B:65:0x0062->B:20:0x0062 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void W(long r8, long r10) {
        /*
            r7 = this;
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r0 = r7.f6705v
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f7
            com.google.android.exoplayer2.s0 r0 = r7.D
            com.google.android.exoplayer2.source.k$a r0 = r0.f7060b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00f7
        L_0x0014:
            boolean r0 = r7.T
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.T = r0
        L_0x001e:
            com.google.android.exoplayer2.s0 r0 = r7.D
            com.google.android.exoplayer2.a1 r1 = r0.f7059a
            com.google.android.exoplayer2.source.k$a r0 = r0.f7060b
            java.lang.Object r0 = r0.f8900a
            int r0 = r1.b(r0)
            int r1 = r7.S
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r2 = r7.f6705v
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.h0$d r3 = (com.google.android.exoplayer2.h0.d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0062
            int r4 = r3.f6720i
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0062
            long r3 = r3.f6721j
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
        L_0x0053:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.h0$d r3 = (com.google.android.exoplayer2.h0.d) r3
            goto L_0x0045
        L_0x0062:
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.h0$d r3 = (com.google.android.exoplayer2.h0.d) r3
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0099
            java.lang.Object r4 = r3.f6722k
            if (r4 == 0) goto L_0x0099
            int r4 = r3.f6720i
            if (r4 < r0) goto L_0x0086
            if (r4 != r0) goto L_0x0099
            long r4 = r3.f6721j
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0099
        L_0x0086:
            int r1 = r1 + 1
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.h0$d r3 = (com.google.android.exoplayer2.h0.d) r3
            goto L_0x0074
        L_0x0099:
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r4 = r3.f6722k
            if (r4 == 0) goto L_0x00f5
            int r4 = r3.f6720i
            if (r4 != r0) goto L_0x00f5
            long r4 = r3.f6721j
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00f5
            com.google.android.exoplayer2.u0 r4 = r3.f6719h     // Catch:{ all -> 0x00de }
            r7.F0(r4)     // Catch:{ all -> 0x00de }
            com.google.android.exoplayer2.u0 r4 = r3.f6719h
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x00c6
            com.google.android.exoplayer2.u0 r3 = r3.f6719h
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00c6:
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            r3.remove(r1)
        L_0x00cb:
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00dc
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r3 = r7.f6705v
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.h0$d r3 = (com.google.android.exoplayer2.h0.d) r3
            goto L_0x0099
        L_0x00dc:
            r3 = r2
            goto L_0x0099
        L_0x00de:
            r8 = move-exception
            com.google.android.exoplayer2.u0 r9 = r3.f6719h
            boolean r9 = r9.b()
            if (r9 != 0) goto L_0x00ef
            com.google.android.exoplayer2.u0 r9 = r3.f6719h
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x00f4
        L_0x00ef:
            java.util.ArrayList<com.google.android.exoplayer2.h0$d> r9 = r7.f6705v
            r9.remove(r1)
        L_0x00f4:
            throw r8
        L_0x00f5:
            r7.S = r1
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h0.W(long, long):void");
    }

    private void W0(boolean z10) {
        this.L = z10;
        if (!this.f6708y.H(this.D.f7059a, z10)) {
            A0(true);
        }
        F(false);
    }

    private void X() {
        m0 o10;
        this.f6708y.y(this.R);
        if (this.f6708y.D() && (o10 = this.f6708y.o(this.R, this.D)) != null) {
            l0 g10 = this.f6708y.g(this.f6692i, this.f6693j, this.f6695l.h(), this.f6709z, o10, this.f6694k);
            g10.f6859a.q(this, o10.f6876b);
            if (this.f6708y.p() == g10) {
                r0(g10.m());
            }
            F(false);
        }
        if (this.J) {
            this.J = N();
            i1();
            return;
        }
        T();
    }

    private void X0(w wVar) {
        this.E.b(1);
        G(this.f6709z.D(wVar), false);
    }

    private void Y() {
        boolean z10 = false;
        while (Z0()) {
            if (z10) {
                U();
            }
            l0 p10 = this.f6708y.p();
            l0 b10 = this.f6708y.b();
            m0 m0Var = b10.f6864f;
            k.a aVar = m0Var.f6875a;
            long j10 = m0Var.f6876b;
            s0 K2 = K(aVar, j10, m0Var.f6877c, j10, true, 0);
            this.D = K2;
            a1 a1Var = K2.f7059a;
            j1(a1Var, b10.f6864f.f6875a, a1Var, p10.f6864f.f6875a, -9223372036854775807L);
            q0();
            m1();
            z10 = true;
        }
    }

    private void Y0(int i10) {
        s0 s0Var = this.D;
        if (s0Var.f7063e != i10) {
            this.D = s0Var.h(i10);
        }
    }

    private void Z() {
        l0 q10 = this.f6708y.q();
        if (q10 != null) {
            int i10 = 0;
            if (q10.j() == null || this.H) {
                if (q10.f6864f.f6883i || this.H) {
                    while (true) {
                        w0[] w0VarArr = this.f6691h;
                        if (i10 < w0VarArr.length) {
                            w0 w0Var = w0VarArr[i10];
                            t tVar = q10.f6861c[i10];
                            if (tVar != null && w0Var.getStream() == tVar && w0Var.k()) {
                                long j10 = q10.f6864f.f6879e;
                                I0(w0Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f6864f.f6879e);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (M()) {
                if (q10.j().f6862d || this.R >= q10.j().m()) {
                    p o10 = q10.o();
                    l0 c10 = this.f6708y.c();
                    p o11 = c10.o();
                    if (!c10.f6862d || c10.f6859a.p() == -9223372036854775807L) {
                        for (int i11 = 0; i11 < this.f6691h.length; i11++) {
                            boolean c11 = o10.c(i11);
                            boolean c12 = o11.c(i11);
                            if (c11 && !this.f6691h[i11].w()) {
                                boolean z10 = this.f6692i[i11].j() == 7;
                                e4.t tVar2 = o10.f13099b[i11];
                                e4.t tVar3 = o11.f13099b[i11];
                                if (!c12 || !tVar3.equals(tVar2) || z10) {
                                    I0(this.f6691h[i11], c10.m());
                                }
                            }
                        }
                        return;
                    }
                    H0(c10.m());
                }
            }
        }
    }

    private boolean Z0() {
        l0 p10;
        l0 j10;
        if (b1() && !this.H && (p10 = this.f6708y.p()) != null && (j10 = p10.j()) != null && this.R >= j10.m() && j10.f6865g) {
            return true;
        }
        return false;
    }

    private void a0() {
        l0 q10 = this.f6708y.q();
        if (q10 != null && this.f6708y.p() != q10 && !q10.f6865g && n0()) {
            q();
        }
    }

    private boolean a1() {
        long j10;
        if (!N()) {
            return false;
        }
        l0 j11 = this.f6708y.j();
        long C2 = C(j11.k());
        if (j11 == this.f6708y.p()) {
            j10 = j11.y(this.R);
        } else {
            j10 = j11.y(this.R) - j11.f6864f.f6876b;
        }
        return this.f6695l.g(j10, C2, this.f6704u.i().f8134a);
    }

    private void b0() {
        G(this.f6709z.i(), true);
    }

    private boolean b1() {
        s0 s0Var = this.D;
        return s0Var.f7070l && s0Var.f7071m == 0;
    }

    private void c0(c cVar) {
        this.E.b(1);
        G(this.f6709z.v(cVar.f6715a, cVar.f6716b, cVar.f6717c, cVar.f6718d), false);
    }

    private boolean c1(boolean z10) {
        if (this.P == 0) {
            return P();
        }
        if (!z10) {
            return false;
        }
        s0 s0Var = this.D;
        if (!s0Var.f7065g) {
            return true;
        }
        long c10 = d1(s0Var.f7059a, this.f6708y.p().f6864f.f6875a) ? this.A.c() : -9223372036854775807L;
        l0 j10 = this.f6708y.j();
        boolean z11 = j10.q() && j10.f6864f.f6883i;
        boolean z12 = j10.f6864f.f6875a.b() && !j10.f6862d;
        if (z11 || z12 || this.f6695l.f(B(), this.f6704u.i().f8134a, this.I, c10)) {
            return true;
        }
        return false;
    }

    private void d0() {
        for (l0 p10 = this.f6708y.p(); p10 != null; p10 = p10.j()) {
            for (y5.h hVar : p10.o().f13100c) {
                if (hVar != null) {
                    hVar.s();
                }
            }
        }
    }

    private boolean d1(a1 a1Var, k.a aVar) {
        if (aVar.b() || a1Var.q()) {
            return false;
        }
        a1Var.n(a1Var.h(aVar.f8900a, this.f6701r).f6236c, this.f6700q);
        if (!this.f6700q.f()) {
            return false;
        }
        a1.c cVar = this.f6700q;
        if (!cVar.f6253i || cVar.f6250f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    private void e0(boolean z10) {
        for (l0 p10 = this.f6708y.p(); p10 != null; p10 = p10.j()) {
            for (y5.h hVar : p10.o().f13100c) {
                if (hVar != null) {
                    hVar.g(z10);
                }
            }
        }
    }

    private void e1() {
        this.I = false;
        this.f6704u.e();
        for (w0 w0Var : this.f6691h) {
            if (O(w0Var)) {
                w0Var.start();
            }
        }
    }

    private void f0() {
        for (l0 p10 = this.f6708y.p(); p10 != null; p10 = p10.j()) {
            for (y5.h hVar : p10.o().f13100c) {
                if (hVar != null) {
                    hVar.t();
                }
            }
        }
    }

    private void g1(boolean z10, boolean z11) {
        p0(z10 || !this.M, false, true, false);
        this.E.b(z11 ? 1 : 0);
        this.f6695l.a();
        Y0(1);
    }

    private void h(b bVar, int i10) {
        this.E.b(1);
        r0 r0Var = this.f6709z;
        if (i10 == -1) {
            i10 = r0Var.q();
        }
        G(r0Var.f(i10, bVar.f6711a, bVar.f6712b), false);
    }

    private void h1() {
        this.f6704u.f();
        for (w0 w0Var : this.f6691h) {
            if (O(w0Var)) {
                s(w0Var);
            }
        }
    }

    private void i0() {
        this.E.b(1);
        p0(false, false, false, true);
        this.f6695l.onPrepared();
        Y0(this.D.f7059a.q() ? 4 : 2);
        this.f6709z.w(this.f6696m.e());
        this.f6697n.f(2);
    }

    private void i1() {
        l0 j10 = this.f6708y.j();
        boolean z10 = this.J || (j10 != null && j10.f6859a.f());
        s0 s0Var = this.D;
        if (z10 != s0Var.f7065g) {
            this.D = s0Var.a(z10);
        }
    }

    private void j1(a1 a1Var, k.a aVar, a1 a1Var2, k.a aVar2, long j10) {
        if (a1Var.q() || !d1(a1Var, aVar)) {
            float f10 = this.f6704u.i().f8134a;
            m mVar = this.D.f7072n;
            if (f10 != mVar.f8134a) {
                this.f6704u.g(mVar);
                return;
            }
            return;
        }
        a1Var.n(a1Var.h(aVar.f8900a, this.f6701r).f6236c, this.f6700q);
        this.A.a((j0.f) m0.j(this.f6700q.f6255k));
        if (j10 != -9223372036854775807L) {
            this.A.e(x(a1Var, aVar.f8900a, j10));
            return;
        }
        Object obj = this.f6700q.f6245a;
        Object obj2 = null;
        if (!a1Var2.q()) {
            obj2 = a1Var2.n(a1Var2.h(aVar2.f8900a, this.f6701r).f6236c, this.f6700q).f6245a;
        }
        if (!m0.c(obj2, obj)) {
            this.A.e(-9223372036854775807L);
        }
    }

    private void k0() {
        p0(true, false, true, false);
        this.f6695l.e();
        Y0(1);
        this.f6698o.quit();
        synchronized (this) {
            this.F = true;
            notifyAll();
        }
    }

    private void k1(g5.w wVar, p pVar) {
        this.f6695l.d(this.f6691h, wVar, pVar.f13100c);
    }

    private void l() {
        A0(true);
    }

    private void l0(int i10, int i11, w wVar) {
        this.E.b(1);
        G(this.f6709z.A(i10, i11, wVar), false);
    }

    private void l1() {
        if (!this.D.f7059a.q() && this.f6709z.s()) {
            X();
            Z();
            a0();
            Y();
        }
    }

    private void m(u0 u0Var) {
        if (!u0Var.j()) {
            try {
                u0Var.f().r(u0Var.h(), u0Var.d());
            } finally {
                u0Var.k(true);
            }
        }
    }

    private void m1() {
        l0 p10 = this.f6708y.p();
        if (p10 != null) {
            long p11 = p10.f6862d ? p10.f6859a.p() : -9223372036854775807L;
            if (p11 != -9223372036854775807L) {
                r0(p11);
                if (p11 != this.D.f7077s) {
                    s0 s0Var = this.D;
                    this.D = K(s0Var.f7060b, p11, s0Var.f7061c, p11, true, 5);
                }
            } else {
                long h10 = this.f6704u.h(p10 != this.f6708y.q());
                this.R = h10;
                long y10 = p10.y(h10);
                W(this.D.f7077s, y10);
                this.D.f7077s = y10;
            }
            this.D.f7075q = this.f6708y.j().i();
            this.D.f7076r = B();
            s0 s0Var2 = this.D;
            if (s0Var2.f7070l && s0Var2.f7063e == 3 && d1(s0Var2.f7059a, s0Var2.f7060b) && this.D.f7072n.f8134a == 1.0f) {
                float b10 = this.A.b(v(), B());
                if (this.f6704u.i().f8134a != b10) {
                    this.f6704u.g(this.D.f7072n.b(b10));
                    I(this.D.f7072n, this.f6704u.i().f8134a, false, false);
                }
            }
        }
    }

    private void n(w0 w0Var) {
        if (O(w0Var)) {
            this.f6704u.a(w0Var);
            s(w0Var);
            w0Var.h();
            this.P--;
        }
    }

    private boolean n0() {
        l0 q10 = this.f6708y.q();
        p o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            w0[] w0VarArr = this.f6691h;
            if (i10 >= w0VarArr.length) {
                return !z10;
            }
            w0 w0Var = w0VarArr[i10];
            if (O(w0Var)) {
                boolean z11 = w0Var.getStream() != q10.f6861c[i10];
                if (!o10.c(i10) || z11) {
                    if (!w0Var.w()) {
                        w0Var.u(w(o10.f13100c[i10]), q10.f6861c[i10], q10.m(), q10.l());
                    } else if (w0Var.c()) {
                        n(w0Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void n1(float f10) {
        for (l0 p10 = this.f6708y.p(); p10 != null; p10 = p10.j()) {
            for (y5.h hVar : p10.o().f13100c) {
                if (hVar != null) {
                    hVar.q(f10);
                }
            }
        }
    }

    private void o() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        long a10 = this.f6706w.a();
        l1();
        int i11 = this.D.f7063e;
        if (i11 == 1 || i11 == 4) {
            this.f6697n.i(2);
            return;
        }
        l0 p10 = this.f6708y.p();
        if (p10 == null) {
            y0(a10, 10);
            return;
        }
        a6.j0.a("doSomeWork");
        m1();
        if (p10.f6862d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            p10.f6859a.t(this.D.f7077s - this.f6702s, this.f6703t);
            int i12 = 0;
            z11 = true;
            z10 = true;
            while (true) {
                w0[] w0VarArr = this.f6691h;
                if (i12 >= w0VarArr.length) {
                    break;
                }
                w0 w0Var = w0VarArr[i12];
                if (O(w0Var)) {
                    w0Var.q(this.R, elapsedRealtime);
                    z11 = z11 && w0Var.c();
                    boolean z13 = p10.f6861c[i12] != w0Var.getStream();
                    boolean z14 = z13 || (!z13 && w0Var.k()) || w0Var.e() || w0Var.c();
                    z10 = z10 && z14;
                    if (!z14) {
                        w0Var.s();
                    }
                }
                i12++;
            }
        } else {
            p10.f6859a.m();
            z11 = true;
            z10 = true;
        }
        long j10 = p10.f6864f.f6879e;
        boolean z15 = z11 && p10.f6862d && (j10 == -9223372036854775807L || j10 <= this.D.f7077s);
        if (z15 && this.H) {
            this.H = false;
            P0(false, this.D.f7071m, false, 5);
        }
        if (z15 && p10.f6864f.f6883i) {
            Y0(4);
            h1();
        } else if (this.D.f7063e == 2 && c1(z10)) {
            Y0(3);
            this.U = null;
            if (b1()) {
                e1();
            }
        } else if (this.D.f7063e == 3 && (this.P != 0 ? !z10 : !P())) {
            this.I = b1();
            Y0(2);
            if (this.I) {
                f0();
                this.A.d();
            }
            h1();
        }
        if (this.D.f7063e == 2) {
            int i13 = 0;
            while (true) {
                w0[] w0VarArr2 = this.f6691h;
                if (i13 >= w0VarArr2.length) {
                    break;
                }
                if (O(w0VarArr2[i13]) && this.f6691h[i13].getStream() == p10.f6861c[i13]) {
                    this.f6691h[i13].s();
                }
                i13++;
            }
            s0 s0Var = this.D;
            if (!s0Var.f7065g && s0Var.f7076r < 500000 && N()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z16 = this.O;
        s0 s0Var2 = this.D;
        if (z16 != s0Var2.f7073o) {
            this.D = s0Var2.d(z16);
        }
        if ((!b1() || this.D.f7063e != 3) && (i10 = this.D.f7063e) != 2) {
            if (this.P == 0 || i10 == 4) {
                this.f6697n.i(2);
            } else {
                y0(a10, 1000);
            }
            z12 = false;
        } else {
            z12 = !V(a10, 10);
        }
        s0 s0Var3 = this.D;
        if (s0Var3.f7074p != z12) {
            this.D = s0Var3.i(z12);
        }
        this.N = false;
        a6.j0.c();
    }

    private void o0() {
        float f10 = this.f6704u.i().f8134a;
        l0 p10 = this.f6708y.p();
        l0 q10 = this.f6708y.q();
        boolean z10 = true;
        while (p10 != null && p10.f6862d) {
            p v10 = p10.v(f10, this.D.f7059a);
            if (!v10.a(p10.o())) {
                if (z10) {
                    l0 p11 = this.f6708y.p();
                    boolean z11 = this.f6708y.z(p11);
                    boolean[] zArr = new boolean[this.f6691h.length];
                    long b10 = p11.b(v10, this.D.f7077s, z11, zArr);
                    s0 s0Var = this.D;
                    boolean z12 = (s0Var.f7063e == 4 || b10 == s0Var.f7077s) ? false : true;
                    s0 s0Var2 = this.D;
                    l0 l0Var = p11;
                    boolean[] zArr2 = zArr;
                    this.D = K(s0Var2.f7060b, b10, s0Var2.f7061c, s0Var2.f7062d, z12, 5);
                    if (z12) {
                        r0(b10);
                    }
                    boolean[] zArr3 = new boolean[this.f6691h.length];
                    int i10 = 0;
                    while (true) {
                        w0[] w0VarArr = this.f6691h;
                        if (i10 >= w0VarArr.length) {
                            break;
                        }
                        w0 w0Var = w0VarArr[i10];
                        zArr3[i10] = O(w0Var);
                        t tVar = l0Var.f6861c[i10];
                        if (zArr3[i10]) {
                            if (tVar != w0Var.getStream()) {
                                n(w0Var);
                            } else if (zArr2[i10]) {
                                w0Var.v(this.R);
                            }
                        }
                        i10++;
                    }
                    r(zArr3);
                } else {
                    this.f6708y.z(p10);
                    if (p10.f6862d) {
                        p10.a(v10, Math.max(p10.f6864f.f6876b, p10.y(this.R)), false);
                    }
                }
                F(true);
                if (this.D.f7063e != 4) {
                    T();
                    m1();
                    this.f6697n.f(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
            p10 = p10.j();
        }
    }

    private synchronized void o1(u<Boolean> uVar, long j10) {
        long elapsedRealtime = this.f6706w.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!uVar.get().booleanValue() && j10 > 0) {
            try {
                this.f6706w.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - this.f6706w.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void p(int i10, boolean z10) {
        w0 w0Var = this.f6691h[i10];
        if (!O(w0Var)) {
            l0 q10 = this.f6708y.q();
            boolean z11 = q10 == this.f6708y.p();
            p o10 = q10.o();
            e4.t tVar = o10.f13099b[i10];
            e4.j[] w10 = w(o10.f13100c[i10]);
            boolean z12 = b1() && this.D.f7063e == 3;
            boolean z13 = !z10 && z12;
            this.P++;
            w0Var.x(tVar, w10, q10.f6861c[i10], this.R, z13, z11, q10.m(), q10.l());
            w0Var.r(103, new a());
            this.f6704u.b(w0Var);
            if (z12) {
                w0Var.start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p0(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = r29
            a6.k r0 = r1.f6697n
            r2 = 2
            r0.i(r2)
            r2 = 0
            r1.U = r2
            r3 = 0
            r1.I = r3
            com.google.android.exoplayer2.g r0 = r1.f6704u
            r0.f()
            r4 = 0
            r1.R = r4
            com.google.android.exoplayer2.w0[] r4 = r1.f6691h
            int r5 = r4.length
            r6 = 0
        L_0x001b:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0030
            r0 = r4[r6]
            r1.n(r0)     // Catch:{ ExoPlaybackException -> 0x0027, RuntimeException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r0 = move-exception
            goto L_0x0028
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            java.lang.String r8 = "Disable failed."
            a6.p.d(r7, r8, r0)
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0030:
            if (r30 == 0) goto L_0x0048
            com.google.android.exoplayer2.w0[] r4 = r1.f6691h
            int r5 = r4.length
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x0048
            r0 = r4[r6]
            r0.reset()     // Catch:{ RuntimeException -> 0x003e }
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            a6.p.d(r7, r0, r8)
        L_0x0045:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0048:
            r1.P = r3
            com.google.android.exoplayer2.s0 r0 = r1.D
            com.google.android.exoplayer2.source.k$a r4 = r0.f7060b
            long r5 = r0.f7077s
            com.google.android.exoplayer2.s0 r0 = r1.D
            com.google.android.exoplayer2.source.k$a r0 = r0.f7060b
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x006a
            com.google.android.exoplayer2.s0 r0 = r1.D
            com.google.android.exoplayer2.a1$b r7 = r1.f6701r
            boolean r0 = Q(r0, r7)
            if (r0 == 0) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            com.google.android.exoplayer2.s0 r0 = r1.D
            long r7 = r0.f7077s
            goto L_0x006e
        L_0x006a:
            com.google.android.exoplayer2.s0 r0 = r1.D
            long r7 = r0.f7061c
        L_0x006e:
            if (r31 == 0) goto L_0x009b
            r1.Q = r2
            com.google.android.exoplayer2.s0 r0 = r1.D
            com.google.android.exoplayer2.a1 r0 = r0.f7059a
            android.util.Pair r0 = r1.z(r0)
            java.lang.Object r4 = r0.first
            com.google.android.exoplayer2.source.k$a r4 = (com.google.android.exoplayer2.source.k.a) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.exoplayer2.s0 r0 = r1.D
            com.google.android.exoplayer2.source.k$a r0 = r0.f7060b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009b
            r0 = 1
            r17 = r4
            r25 = r5
            goto L_0x00a0
        L_0x009b:
            r17 = r4
            r25 = r5
            r0 = 0
        L_0x00a0:
            com.google.android.exoplayer2.o0 r4 = r1.f6708y
            r4.f()
            r1.J = r3
            com.google.android.exoplayer2.s0 r3 = new com.google.android.exoplayer2.s0
            com.google.android.exoplayer2.s0 r4 = r1.D
            com.google.android.exoplayer2.a1 r5 = r4.f7059a
            int r11 = r4.f7063e
            if (r33 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r4.f7064f
        L_0x00b4:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00bb
            g5.w r2 = g5.w.f8923k
            goto L_0x00bd
        L_0x00bb:
            g5.w r2 = r4.f7066h
        L_0x00bd:
            r14 = r2
            if (r0 == 0) goto L_0x00c3
            y5.p r2 = r1.f6694k
            goto L_0x00c5
        L_0x00c3:
            y5.p r2 = r4.f7067i
        L_0x00c5:
            r15 = r2
            if (r0 == 0) goto L_0x00cd
            com.google.common.collect.x r0 = com.google.common.collect.x.s()
            goto L_0x00cf
        L_0x00cd:
            java.util.List<x4.a> r0 = r4.f7068j
        L_0x00cf:
            r16 = r0
            com.google.android.exoplayer2.s0 r0 = r1.D
            boolean r2 = r0.f7070l
            r18 = r2
            int r2 = r0.f7071m
            r19 = r2
            e4.m r0 = r0.f7072n
            r20 = r0
            r23 = 0
            boolean r0 = r1.O
            r27 = r0
            r28 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)
            r1.D = r3
            if (r32 == 0) goto L_0x00fa
            com.google.android.exoplayer2.r0 r0 = r1.f6709z
            r0.y()
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.h0.p0(boolean, boolean, boolean, boolean):void");
    }

    private void q() {
        r(new boolean[this.f6691h.length]);
    }

    private void q0() {
        l0 p10 = this.f6708y.p();
        this.H = p10 != null && p10.f6864f.f6882h && this.G;
    }

    private void r(boolean[] zArr) {
        l0 q10 = this.f6708y.q();
        p o10 = q10.o();
        for (int i10 = 0; i10 < this.f6691h.length; i10++) {
            if (!o10.c(i10)) {
                this.f6691h[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f6691h.length; i11++) {
            if (o10.c(i11)) {
                p(i11, zArr[i11]);
            }
        }
        q10.f6865g = true;
    }

    private void r0(long j10) {
        l0 p10 = this.f6708y.p();
        if (p10 != null) {
            j10 = p10.z(j10);
        }
        this.R = j10;
        this.f6704u.c(j10);
        for (w0 w0Var : this.f6691h) {
            if (O(w0Var)) {
                w0Var.v(this.R);
            }
        }
        d0();
    }

    private void s(w0 w0Var) {
        if (w0Var.d() == 2) {
            w0Var.stop();
        }
    }

    private static void s0(a1 a1Var, d dVar, a1.c cVar, a1.b bVar) {
        int i10 = a1Var.n(a1Var.h(dVar.f6722k, bVar).f6236c, cVar).f6260p;
        Object obj = a1Var.g(i10, bVar, true).f6235b;
        long j10 = bVar.f6237d;
        dVar.d(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean t0(d dVar, a1 a1Var, a1 a1Var2, int i10, boolean z10, a1.c cVar, a1.b bVar) {
        long j10;
        d dVar2 = dVar;
        a1 a1Var3 = a1Var;
        a1 a1Var4 = a1Var2;
        a1.c cVar2 = cVar;
        a1.b bVar2 = bVar;
        Object obj = dVar2.f6722k;
        if (obj == null) {
            if (dVar2.f6719h.e() == Long.MIN_VALUE) {
                j10 = -9223372036854775807L;
            } else {
                j10 = e4.c.d(dVar2.f6719h.e());
            }
            Pair<Object, Long> w02 = w0(a1Var, new h(dVar2.f6719h.g(), dVar2.f6719h.i(), j10), false, i10, z10, cVar, bVar);
            if (w02 == null) {
                return false;
            }
            dVar.d(a1Var3.b(w02.first), ((Long) w02.second).longValue(), w02.first);
            if (dVar2.f6719h.e() == Long.MIN_VALUE) {
                s0(a1Var3, dVar, cVar2, bVar2);
            }
            return true;
        }
        int b10 = a1Var3.b(obj);
        if (b10 == -1) {
            return false;
        }
        if (dVar2.f6719h.e() == Long.MIN_VALUE) {
            s0(a1Var3, dVar, cVar2, bVar2);
            return true;
        }
        dVar2.f6720i = b10;
        a1Var4.h(dVar2.f6722k, bVar2);
        if (bVar2.f6239f && a1Var4.n(bVar2.f6236c, cVar2).f6259o == a1Var4.b(dVar2.f6722k)) {
            long l10 = dVar2.f6721j + bVar.l();
            Pair<Object, Long> j11 = a1Var.j(cVar, bVar, a1Var3.h(dVar2.f6722k, bVar2).f6236c, l10);
            dVar.d(a1Var3.b(j11.first), ((Long) j11.second).longValue(), j11.first);
        }
        return true;
    }

    private x<x4.a> u(y5.h[] hVarArr) {
        x.a aVar = new x.a();
        boolean z10 = false;
        for (y5.h hVar : hVarArr) {
            if (hVar != null) {
                x4.a aVar2 = hVar.i(0).f8094q;
                if (aVar2 == null) {
                    aVar.f(new x4.a(new a.b[0]));
                } else {
                    aVar.f(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.h() : x.s();
    }

    private void u0(a1 a1Var, a1 a1Var2) {
        if (!a1Var.q() || !a1Var2.q()) {
            for (int size = this.f6705v.size() - 1; size >= 0; size--) {
                if (!t0(this.f6705v.get(size), a1Var, a1Var2, this.K, this.L, this.f6700q, this.f6701r)) {
                    this.f6705v.get(size).f6719h.k(false);
                    this.f6705v.remove(size);
                }
            }
            Collections.sort(this.f6705v);
        }
    }

    private long v() {
        s0 s0Var = this.D;
        return x(s0Var.f7059a, s0Var.f7060b.f8900a, s0Var.f7077s);
    }

    private static g v0(a1 a1Var, s0 s0Var, h hVar, o0 o0Var, int i10, boolean z10, a1.c cVar, a1.b bVar) {
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        k.a aVar;
        int i12;
        long j11;
        long j12;
        o0 o0Var2;
        int i13;
        long j13;
        long j14;
        int i14;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        a1 a1Var2 = a1Var;
        s0 s0Var2 = s0Var;
        h hVar2 = hVar;
        boolean z18 = z10;
        a1.b bVar2 = bVar;
        if (a1Var.q()) {
            return new g(s0.l(), 0, -9223372036854775807L, false, true, false);
        }
        k.a aVar2 = s0Var2.f7060b;
        Object obj = aVar2.f8900a;
        boolean Q2 = Q(s0Var2, bVar2);
        if (s0Var2.f7060b.b() || Q2) {
            j10 = s0Var2.f7061c;
        } else {
            j10 = s0Var2.f7077s;
        }
        long j15 = j10;
        boolean z19 = false;
        if (hVar2 != null) {
            k.a aVar3 = aVar2;
            i11 = -1;
            Pair<Object, Long> w02 = w0(a1Var, hVar, true, i10, z10, cVar, bVar);
            if (w02 == null) {
                i16 = a1Var2.a(z18);
                j11 = j15;
                z17 = false;
                z16 = false;
                z15 = true;
            } else {
                if (hVar2.f6738c == -9223372036854775807L) {
                    i16 = a1Var2.h(w02.first, bVar2).f6236c;
                    j11 = j15;
                    z17 = false;
                } else {
                    obj = w02.first;
                    j11 = ((Long) w02.second).longValue();
                    z17 = true;
                    i16 = -1;
                }
                z16 = s0Var2.f7063e == 4;
                z15 = false;
            }
            a1.c cVar2 = cVar;
            z11 = z17;
            z13 = z16;
            z12 = z15;
            i12 = i16;
            aVar = aVar3;
        } else {
            k.a aVar4 = aVar2;
            i11 = -1;
            if (s0Var2.f7059a.q()) {
                i14 = a1Var2.a(z18);
            } else if (a1Var2.b(obj) == -1) {
                Object x02 = x0(cVar, bVar, i10, z10, obj, s0Var2.f7059a, a1Var);
                if (x02 == null) {
                    i15 = a1Var2.a(z18);
                    z14 = true;
                } else {
                    i15 = a1Var2.h(x02, bVar2).f6236c;
                    z14 = false;
                }
                a1.c cVar3 = cVar;
                i12 = i15;
                z12 = z14;
                j13 = j15;
                aVar = aVar4;
                z13 = false;
                z11 = false;
            } else if (j15 == -9223372036854775807L) {
                i14 = a1Var2.h(obj, bVar2).f6236c;
            } else if (Q2) {
                aVar = aVar4;
                s0Var2.f7059a.h(aVar.f8900a, bVar2);
                if (s0Var2.f7059a.n(bVar2.f6236c, cVar).f6259o == s0Var2.f7059a.b(aVar.f8900a)) {
                    Pair<Object, Long> j16 = a1Var.j(cVar, bVar, a1Var2.h(obj, bVar2).f6236c, j15 + bVar.l());
                    obj = j16.first;
                    j14 = ((Long) j16.second).longValue();
                } else {
                    j14 = j15;
                }
                i12 = -1;
                z13 = false;
                z12 = false;
                z11 = true;
            } else {
                a1.c cVar4 = cVar;
                aVar = aVar4;
                j13 = j15;
                i12 = -1;
                z13 = false;
                z12 = false;
                z11 = false;
            }
            a1.c cVar5 = cVar;
            i12 = i14;
            j13 = j15;
            aVar = aVar4;
            z13 = false;
            z12 = false;
            z11 = false;
        }
        if (i12 != i11) {
            Pair<Object, Long> j17 = a1Var.j(cVar, bVar, i12, -9223372036854775807L);
            obj = j17.first;
            j11 = ((Long) j17.second).longValue();
            o0Var2 = o0Var;
            j12 = -9223372036854775807L;
        } else {
            o0Var2 = o0Var;
            j12 = j11;
        }
        k.a A2 = o0Var2.A(a1Var2, obj, j11);
        boolean z20 = A2.f8904e == i11 || ((i13 = aVar.f8904e) != i11 && A2.f8901b >= i13);
        boolean equals = aVar.f8900a.equals(obj);
        boolean z21 = equals && !aVar.b() && !A2.b() && z20;
        a1Var2.h(obj, bVar2);
        if (equals && !Q2 && j15 == j12 && ((A2.b() && bVar2.m(A2.f8901b)) || (aVar.b() && bVar2.m(aVar.f8901b)))) {
            z19 = true;
        }
        if (z21 || z19) {
            A2 = aVar;
        }
        if (A2.b()) {
            if (A2.equals(aVar)) {
                j11 = s0Var2.f7077s;
            } else {
                a1Var2.h(A2.f8900a, bVar2);
                j11 = A2.f8902c == bVar2.i(A2.f8901b) ? bVar.f() : 0;
            }
        }
        return new g(A2, j11, j12, z13, z12, z11);
    }

    private static e4.j[] w(y5.h hVar) {
        int length = hVar != null ? hVar.length() : 0;
        e4.j[] jVarArr = new e4.j[length];
        for (int i10 = 0; i10 < length; i10++) {
            jVarArr[i10] = hVar.i(i10);
        }
        return jVarArr;
    }

    private static Pair<Object, Long> w0(a1 a1Var, h hVar, boolean z10, int i10, boolean z11, a1.c cVar, a1.b bVar) {
        Object x02;
        a1 a1Var2 = a1Var;
        h hVar2 = hVar;
        a1.b bVar2 = bVar;
        a1 a1Var3 = hVar2.f6736a;
        if (a1Var.q()) {
            return null;
        }
        a1 a1Var4 = a1Var3.q() ? a1Var2 : a1Var3;
        try {
            Pair<Object, Long> j10 = a1Var4.j(cVar, bVar, hVar2.f6737b, hVar2.f6738c);
            if (a1Var.equals(a1Var4)) {
                return j10;
            }
            if (a1Var.b(j10.first) == -1) {
                a1.c cVar2 = cVar;
                if (z10 && (x02 = x0(cVar, bVar, i10, z11, j10.first, a1Var4, a1Var)) != null) {
                    return a1Var.j(cVar, bVar, a1Var.h(x02, bVar2).f6236c, -9223372036854775807L);
                }
                return null;
            } else if (!a1Var4.h(j10.first, bVar2).f6239f || a1Var4.n(bVar2.f6236c, cVar).f6259o != a1Var4.b(j10.first)) {
                return j10;
            } else {
                return a1Var.j(cVar, bVar, a1Var.h(j10.first, bVar2).f6236c, hVar2.f6738c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private long x(a1 a1Var, Object obj, long j10) {
        a1Var.n(a1Var.h(obj, this.f6701r).f6236c, this.f6700q);
        a1.c cVar = this.f6700q;
        if (cVar.f6250f != -9223372036854775807L && cVar.f()) {
            a1.c cVar2 = this.f6700q;
            if (cVar2.f6253i) {
                return e4.c.d(cVar2.a() - this.f6700q.f6250f) - (j10 + this.f6701r.l());
            }
        }
        return -9223372036854775807L;
    }

    static Object x0(a1.c cVar, a1.b bVar, int i10, boolean z10, Object obj, a1 a1Var, a1 a1Var2) {
        int b10 = a1Var.b(obj);
        int i11 = a1Var.i();
        int i12 = b10;
        int i13 = -1;
        for (int i14 = 0; i14 < i11 && i13 == -1; i14++) {
            i12 = a1Var.d(i12, bVar, cVar, i10, z10);
            if (i12 == -1) {
                break;
            }
            i13 = a1Var2.b(a1Var.m(i12));
        }
        if (i13 == -1) {
            return null;
        }
        return a1Var2.m(i13);
    }

    private long y() {
        l0 q10 = this.f6708y.q();
        if (q10 == null) {
            return 0;
        }
        long l10 = q10.l();
        if (!q10.f6862d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            w0[] w0VarArr = this.f6691h;
            if (i10 >= w0VarArr.length) {
                return l10;
            }
            if (O(w0VarArr[i10]) && this.f6691h[i10].getStream() == q10.f6861c[i10]) {
                long t10 = this.f6691h[i10].t();
                if (t10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(t10, l10);
            }
            i10++;
        }
    }

    private void y0(long j10, long j11) {
        this.f6697n.i(2);
        this.f6697n.h(2, j10 + j11);
    }

    private Pair<k.a, Long> z(a1 a1Var) {
        long j10 = 0;
        if (a1Var.q()) {
            return Pair.create(s0.l(), 0L);
        }
        a1 a1Var2 = a1Var;
        Pair<Object, Long> j11 = a1Var2.j(this.f6700q, this.f6701r, a1Var.a(this.L), -9223372036854775807L);
        k.a A2 = this.f6708y.A(a1Var, j11.first, 0);
        long longValue = ((Long) j11.second).longValue();
        if (A2.b()) {
            a1Var.h(A2.f8900a, this.f6701r);
            if (A2.f8902c == this.f6701r.i(A2.f8901b)) {
                j10 = this.f6701r.f();
            }
            longValue = j10;
        }
        return Pair.create(A2, Long.valueOf(longValue));
    }

    public Looper A() {
        return this.f6699p;
    }

    public void L0(List<r0.c> list, int i10, long j10, w wVar) {
        this.f6697n.j(17, new b(list, wVar, i10, j10, (a) null)).a();
    }

    public void O0(boolean z10, int i10) {
        this.f6697n.a(1, z10 ? 1 : 0, i10).a();
    }

    public void Q0(m mVar) {
        this.f6697n.j(4, mVar).a();
    }

    public void S0(int i10) {
        this.f6697n.a(11, i10, 0).a();
    }

    public void V0(boolean z10) {
        this.f6697n.a(12, z10 ? 1 : 0, 0).a();
    }

    public synchronized void a(u0 u0Var) {
        if (!this.F) {
            if (this.f6698o.isAlive()) {
                this.f6697n.j(14, u0Var).a();
                return;
            }
        }
        a6.p.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        u0Var.k(false);
    }

    public void b(m mVar) {
        this.f6697n.j(16, mVar).a();
    }

    public void c() {
        this.f6697n.f(22);
    }

    public void f1() {
        this.f6697n.d(6).a();
    }

    /* renamed from: g0 */
    public void i(j jVar) {
        this.f6697n.j(9, jVar).a();
    }

    public void h0() {
        this.f6697n.d(0).a();
    }

    public boolean handleMessage(Message message) {
        l0 q10;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    i0();
                    break;
                case 1:
                    P0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    o();
                    break;
                case 3:
                    B0((h) message.obj);
                    break;
                case 4:
                    R0((m) message.obj);
                    break;
                case 5:
                    U0((v) message.obj);
                    break;
                case 6:
                    g1(false, true);
                    break;
                case 7:
                    k0();
                    return true;
                case 8:
                    H((j) message.obj);
                    break;
                case 9:
                    D((j) message.obj);
                    break;
                case 10:
                    o0();
                    break;
                case 11:
                    T0(message.arg1);
                    break;
                case 12:
                    W0(message.arg1 != 0);
                    break;
                case 13:
                    J0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    E0((u0) message.obj);
                    break;
                case 15:
                    G0((u0) message.obj);
                    break;
                case 16:
                    J((m) message.obj, false);
                    break;
                case 17:
                    K0((b) message.obj);
                    break;
                case 18:
                    h((b) message.obj, message.arg1);
                    break;
                case 19:
                    c0((c) message.obj);
                    break;
                case 20:
                    l0(message.arg1, message.arg2, (w) message.obj);
                    break;
                case 21:
                    X0((w) message.obj);
                    break;
                case 22:
                    b0();
                    break;
                case 23:
                    N0(message.arg1 != 0);
                    break;
                case 24:
                    M0(message.arg1 == 1);
                    break;
                case 25:
                    l();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.f6211k == 1 && (q10 = this.f6708y.q()) != null) {
                e = e.a(q10.f6864f.f6875a);
            }
            if (!e.f6217q || this.U != null) {
                ExoPlaybackException exoPlaybackException = this.U;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.U;
                }
                a6.p.d("ExoPlayerImplInternal", "Playback error", e);
                g1(true, false);
                this.D = this.D.f(e);
            } else {
                a6.p.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.U = e;
                a6.k kVar = this.f6697n;
                kVar.b(kVar.j(25, e));
            }
        } catch (DrmSession.DrmSessionException e11) {
            E(e11, e11.f6548h);
        } catch (ParserException e12) {
            int i11 = e12.f6223i;
            if (i11 == 1) {
                i10 = e12.f6222h ? 3001 : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else if (i11 == 4) {
                i10 = e12.f6222h ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
            }
            E(e12, i10);
        } catch (DataSourceException e13) {
            E(e13, e13.f7648h);
        } catch (BehindLiveWindowException e14) {
            E(e14, 1002);
        } catch (IOException e15) {
            E(e15, 2000);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            ExoPlaybackException e17 = ExoPlaybackException.e(e16, i10);
            a6.p.d("ExoPlayerImplInternal", "Playback error", e17);
            g1(true, false);
            this.D = this.D.f(e17);
        }
        U();
        return true;
    }

    public synchronized boolean j0() {
        if (!this.F) {
            if (this.f6698o.isAlive()) {
                this.f6697n.f(7);
                o1(new g0(this), this.B);
                return this.F;
            }
        }
        return true;
    }

    public void k(j jVar) {
        this.f6697n.j(8, jVar).a();
    }

    public void m0(int i10, int i11, w wVar) {
        this.f6697n.g(20, i10, i11, wVar).a();
    }

    public void t(long j10) {
        this.V = j10;
    }

    public void z0(a1 a1Var, int i10, long j10) {
        this.f6697n.j(3, new h(a1Var, i10, j10)).a();
    }
}
