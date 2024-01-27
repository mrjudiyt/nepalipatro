package com.google.android.exoplayer2.source;

import a6.m0;
import a6.t;
import a6.y;
import android.os.Looper;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.j;
import e4.j;
import e4.k;
import k4.a0;
import k4.b0;
import z5.g;

/* compiled from: SampleQueue */
public class u implements b0 {
    private boolean A;
    private j B;
    private j C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final s f7556a;

    /* renamed from: b  reason: collision with root package name */
    private final b f7557b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final y<c> f7558c = new y<>(t.f7555a);

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f7559d;

    /* renamed from: e  reason: collision with root package name */
    private final i.a f7560e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f7561f;

    /* renamed from: g  reason: collision with root package name */
    private d f7562g;

    /* renamed from: h  reason: collision with root package name */
    private j f7563h;

    /* renamed from: i  reason: collision with root package name */
    private DrmSession f7564i;

    /* renamed from: j  reason: collision with root package name */
    private int f7565j = 1000;

    /* renamed from: k  reason: collision with root package name */
    private int[] f7566k = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    private long[] f7567l = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f7568m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    private int[] f7569n = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    private long[] f7570o = new long[1000];

    /* renamed from: p  reason: collision with root package name */
    private b0.a[] f7571p = new b0.a[1000];

    /* renamed from: q  reason: collision with root package name */
    private int f7572q;

    /* renamed from: r  reason: collision with root package name */
    private int f7573r;

    /* renamed from: s  reason: collision with root package name */
    private int f7574s;

    /* renamed from: t  reason: collision with root package name */
    private int f7575t;

    /* renamed from: u  reason: collision with root package name */
    private long f7576u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f7577v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private long f7578w = Long.MIN_VALUE;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7579x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f7580y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f7581z = true;

    /* compiled from: SampleQueue */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7582a;

        /* renamed from: b  reason: collision with root package name */
        public long f7583b;

        /* renamed from: c  reason: collision with root package name */
        public b0.a f7584c;

        b() {
        }
    }

    /* compiled from: SampleQueue */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final j f7585a;

        /* renamed from: b  reason: collision with root package name */
        public final j.b f7586b;

        private c(e4.j jVar, j.b bVar) {
            this.f7585a = jVar;
            this.f7586b = bVar;
        }
    }

    /* compiled from: SampleQueue */
    public interface d {
        void a(e4.j jVar);
    }

    protected u(z5.b bVar, Looper looper, com.google.android.exoplayer2.drm.j jVar, i.a aVar) {
        this.f7561f = looper;
        this.f7559d = jVar;
        this.f7560e = aVar;
        this.f7556a = new s(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D2 = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f7570o[D2]);
            if ((this.f7569n[D2] & 1) != 0) {
                break;
            }
            D2--;
            if (D2 == -1) {
                D2 = this.f7565j - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f7574s + i10;
        int i12 = this.f7565j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f7575t != this.f7572q;
    }

    private boolean M(int i10) {
        DrmSession drmSession = this.f7564i;
        return drmSession == null || drmSession.d() == 4 || ((this.f7569n[i10] & 1073741824) == 0 && this.f7564i.e());
    }

    private void O(e4.j jVar, k kVar) {
        h hVar;
        e4.j jVar2 = this.f7563h;
        boolean z10 = jVar2 == null;
        if (z10) {
            hVar = null;
        } else {
            hVar = jVar2.f8099v;
        }
        this.f7563h = jVar;
        h hVar2 = jVar.f8099v;
        com.google.android.exoplayer2.drm.j jVar3 = this.f7559d;
        kVar.f8131b = jVar3 != null ? jVar.c(jVar3.b(jVar)) : jVar;
        kVar.f8130a = this.f7564i;
        if (this.f7559d != null) {
            if (z10 || !m0.c(hVar, hVar2)) {
                DrmSession drmSession = this.f7564i;
                DrmSession d10 = this.f7559d.d((Looper) a6.a.e(this.f7561f), this.f7560e, jVar);
                this.f7564i = d10;
                kVar.f8130a = d10;
                if (drmSession != null) {
                    drmSession.b(this.f7560e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int P(e4.k r5, com.google.android.exoplayer2.decoder.DecoderInputBuffer r6, boolean r7, boolean r8, com.google.android.exoplayer2.source.u.b r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f6470k = r0     // Catch:{ all -> 0x0088 }
            boolean r0 = r4.H()     // Catch:{ all -> 0x0088 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0031
            if (r8 != 0) goto L_0x002b
            boolean r8 = r4.f7579x     // Catch:{ all -> 0x0088 }
            if (r8 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            e4.j r6 = r4.C     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x0029
            if (r7 != 0) goto L_0x001e
            e4.j r7 = r4.f7563h     // Catch:{ all -> 0x0088 }
            if (r6 == r7) goto L_0x0029
        L_0x001e:
            java.lang.Object r6 = a6.a.e(r6)     // Catch:{ all -> 0x0088 }
            e4.j r6 = (e4.j) r6     // Catch:{ all -> 0x0088 }
            r4.O(r6, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r5 = 4
            r6.r(r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0031:
            com.google.android.exoplayer2.source.y<com.google.android.exoplayer2.source.u$c> r8 = r4.f7558c     // Catch:{ all -> 0x0088 }
            int r0 = r4.C()     // Catch:{ all -> 0x0088 }
            java.lang.Object r8 = r8.e(r0)     // Catch:{ all -> 0x0088 }
            com.google.android.exoplayer2.source.u$c r8 = (com.google.android.exoplayer2.source.u.c) r8     // Catch:{ all -> 0x0088 }
            e4.j r8 = r8.f7585a     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0083
            e4.j r7 = r4.f7563h     // Catch:{ all -> 0x0088 }
            if (r8 == r7) goto L_0x0046
            goto L_0x0083
        L_0x0046:
            int r5 = r4.f7575t     // Catch:{ all -> 0x0088 }
            int r5 = r4.D(r5)     // Catch:{ all -> 0x0088 }
            boolean r7 = r4.M(r5)     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0057
            r5 = 1
            r6.f6470k = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r2
        L_0x0057:
            int[] r7 = r4.f7569n     // Catch:{ all -> 0x0088 }
            r7 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.r(r7)     // Catch:{ all -> 0x0088 }
            long[] r7 = r4.f7570o     // Catch:{ all -> 0x0088 }
            r0 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.f6471l = r0     // Catch:{ all -> 0x0088 }
            long r7 = r4.f7576u     // Catch:{ all -> 0x0088 }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x006f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.g(r7)     // Catch:{ all -> 0x0088 }
        L_0x006f:
            int[] r6 = r4.f7568m     // Catch:{ all -> 0x0088 }
            r6 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f7582a = r6     // Catch:{ all -> 0x0088 }
            long[] r6 = r4.f7567l     // Catch:{ all -> 0x0088 }
            r7 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f7583b = r7     // Catch:{ all -> 0x0088 }
            k4.b0$a[] r6 = r4.f7571p     // Catch:{ all -> 0x0088 }
            r5 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f7584c = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0083:
            r4.O(r8, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0088:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.P(e4.k, com.google.android.exoplayer2.decoder.DecoderInputBuffer, boolean, boolean, com.google.android.exoplayer2.source.u$b):int");
    }

    private void U() {
        DrmSession drmSession = this.f7564i;
        if (drmSession != null) {
            drmSession.b(this.f7560e);
            this.f7564i = null;
            this.f7563h = null;
        }
    }

    private synchronized void X() {
        this.f7575t = 0;
        this.f7556a.o();
    }

    private synchronized boolean c0(e4.j jVar) {
        this.f7581z = false;
        if (m0.c(jVar, this.C)) {
            return false;
        }
        if (this.f7558c.g() || !this.f7558c.f().f7585a.equals(jVar)) {
            this.C = jVar;
        } else {
            this.C = this.f7558c.f().f7585a;
        }
        e4.j jVar2 = this.C;
        this.E = t.a(jVar2.f8096s, jVar2.f8093p);
        this.F = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean h(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f7572q     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f7577v     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.A()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.j(r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f7573r     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.t(r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.h(long):boolean");
    }

    private synchronized void i(long j10, int i10, long j11, int i11, b0.a aVar) {
        j.b bVar;
        int i12 = this.f7572q;
        if (i12 > 0) {
            int D2 = D(i12 - 1);
            a6.a.a(this.f7567l[D2] + ((long) this.f7568m[D2]) <= j11);
        }
        this.f7579x = (536870912 & i10) != 0;
        this.f7578w = Math.max(this.f7578w, j10);
        int D3 = D(this.f7572q);
        this.f7570o[D3] = j10;
        this.f7567l[D3] = j11;
        this.f7568m[D3] = i11;
        this.f7569n[D3] = i10;
        this.f7571p[D3] = aVar;
        this.f7566k[D3] = this.D;
        if (this.f7558c.g() || !this.f7558c.f().f7585a.equals(this.C)) {
            com.google.android.exoplayer2.drm.j jVar = this.f7559d;
            if (jVar != null) {
                bVar = jVar.a((Looper) a6.a.e(this.f7561f), this.f7560e, this.C);
            } else {
                bVar = j.b.f6581a;
            }
            this.f7558c.a(G(), new c((e4.j) a6.a.e(this.C), bVar));
        }
        int i13 = this.f7572q + 1;
        this.f7572q = i13;
        int i14 = this.f7565j;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            b0.a[] aVarArr = new b0.a[i15];
            int i16 = this.f7574s;
            int i17 = i14 - i16;
            System.arraycopy(this.f7567l, i16, jArr, 0, i17);
            System.arraycopy(this.f7570o, this.f7574s, jArr2, 0, i17);
            System.arraycopy(this.f7569n, this.f7574s, iArr2, 0, i17);
            System.arraycopy(this.f7568m, this.f7574s, iArr3, 0, i17);
            System.arraycopy(this.f7571p, this.f7574s, aVarArr, 0, i17);
            System.arraycopy(this.f7566k, this.f7574s, iArr, 0, i17);
            int i18 = this.f7574s;
            System.arraycopy(this.f7567l, 0, jArr, i17, i18);
            System.arraycopy(this.f7570o, 0, jArr2, i17, i18);
            System.arraycopy(this.f7569n, 0, iArr2, i17, i18);
            System.arraycopy(this.f7568m, 0, iArr3, i17, i18);
            System.arraycopy(this.f7571p, 0, aVarArr, i17, i18);
            System.arraycopy(this.f7566k, 0, iArr, i17, i18);
            this.f7567l = jArr;
            this.f7570o = jArr2;
            this.f7569n = iArr2;
            this.f7568m = iArr3;
            this.f7571p = aVarArr;
            this.f7566k = iArr;
            this.f7574s = 0;
            this.f7565j = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f7572q;
        int D2 = D(i10 - 1);
        while (i10 > this.f7575t && this.f7570o[D2] >= j10) {
            i10--;
            D2--;
            if (D2 == -1) {
                D2 = this.f7565j - 1;
            }
        }
        return i10;
    }

    public static u k(z5.b bVar, Looper looper, com.google.android.exoplayer2.drm.j jVar, i.a aVar) {
        return new u(bVar, (Looper) a6.a.e(looper), (com.google.android.exoplayer2.drm.j) a6.a.e(jVar), (i.a) a6.a.e(aVar));
    }

    public static u l(z5.b bVar) {
        return new u(bVar, (Looper) null, (com.google.android.exoplayer2.drm.j) null, (i.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f7572q     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f7570o     // Catch:{ all -> 0x002f }
            int r5 = r10.f7574s     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f7575t     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.v(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.p(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.m(long, boolean, boolean):long");
    }

    private synchronized long n() {
        int i10 = this.f7572q;
        if (i10 == 0) {
            return -1;
        }
        return p(i10);
    }

    private long p(int i10) {
        this.f7577v = Math.max(this.f7577v, B(i10));
        this.f7572q -= i10;
        int i11 = this.f7573r + i10;
        this.f7573r = i11;
        int i12 = this.f7574s + i10;
        this.f7574s = i12;
        int i13 = this.f7565j;
        if (i12 >= i13) {
            this.f7574s = i12 - i13;
        }
        int i14 = this.f7575t - i10;
        this.f7575t = i14;
        if (i14 < 0) {
            this.f7575t = 0;
        }
        this.f7558c.d(i11);
        if (this.f7572q != 0) {
            return this.f7567l[this.f7574s];
        }
        int i15 = this.f7574s;
        if (i15 == 0) {
            i15 = this.f7565j;
        }
        int i16 = i15 - 1;
        return this.f7567l[i16] + ((long) this.f7568m[i16]);
    }

    private long t(int i10) {
        int G2 = G() - i10;
        boolean z10 = false;
        a6.a.a(G2 >= 0 && G2 <= this.f7572q - this.f7575t);
        int i11 = this.f7572q - G2;
        this.f7572q = i11;
        this.f7578w = Math.max(this.f7577v, B(i11));
        if (G2 == 0 && this.f7579x) {
            z10 = true;
        }
        this.f7579x = z10;
        this.f7558c.c(i10);
        int i12 = this.f7572q;
        if (i12 == 0) {
            return 0;
        }
        int D2 = D(i12 - 1);
        return this.f7567l[D2] + ((long) this.f7568m[D2]);
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f7570o;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f7569n[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f7565j) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f7577v, B(this.f7575t));
    }

    public final int C() {
        return this.f7573r + this.f7575t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int E(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f7575t     // Catch:{ all -> 0x003c }
            int r2 = r8.D(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.H()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f7570o     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f7578w     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f7572q     // Catch:{ all -> 0x003c }
            int r10 = r8.f7575t     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f7572q     // Catch:{ all -> 0x003c }
            int r0 = r8.f7575t     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.v(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            if (r9 != r10) goto L_0x0038
            monitor-exit(r8)
            return r7
        L_0x0038:
            monitor-exit(r8)
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.E(long, boolean):int");
    }

    public final synchronized e4.j F() {
        return this.f7581z ? null : this.C;
    }

    public final int G() {
        return this.f7573r + this.f7572q;
    }

    /* access modifiers changed from: protected */
    public final void I() {
        this.A = true;
    }

    public final synchronized boolean J() {
        return this.f7579x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean K(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.H()     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r3 != 0) goto L_0x0018
            boolean r3 = r2.f7579x     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0018
            e4.j r3 = r2.C     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0017
            e4.j r0 = r2.f7563h     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r2)
            return r1
        L_0x001a:
            com.google.android.exoplayer2.source.y<com.google.android.exoplayer2.source.u$c> r3 = r2.f7558c     // Catch:{ all -> 0x003a }
            int r0 = r2.C()     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ all -> 0x003a }
            com.google.android.exoplayer2.source.u$c r3 = (com.google.android.exoplayer2.source.u.c) r3     // Catch:{ all -> 0x003a }
            e4.j r3 = r3.f7585a     // Catch:{ all -> 0x003a }
            e4.j r0 = r2.f7563h     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            int r3 = r2.f7575t     // Catch:{ all -> 0x003a }
            int r3 = r2.D(r3)     // Catch:{ all -> 0x003a }
            boolean r3 = r2.M(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.K(boolean):boolean");
    }

    public void N() {
        DrmSession drmSession = this.f7564i;
        if (drmSession != null && drmSession.d() == 1) {
            throw ((DrmSession.DrmSessionException) a6.a.e(this.f7564i.h()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f7566k[D(this.f7575t)] : this.D;
    }

    public void R() {
        r();
        U();
    }

    public int S(k kVar, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        boolean z11 = false;
        int P = P(kVar, decoderInputBuffer, (i10 & 2) != 0, z10, this.f7557b);
        if (P == -4 && !decoderInputBuffer.p()) {
            if ((i10 & 1) != 0) {
                z11 = true;
            }
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f7556a.f(decoderInputBuffer, this.f7557b);
                } else {
                    this.f7556a.m(decoderInputBuffer, this.f7557b);
                }
            }
            if (!z11) {
                this.f7575t++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f7556a.n();
        this.f7572q = 0;
        this.f7573r = 0;
        this.f7574s = 0;
        this.f7575t = 0;
        this.f7580y = true;
        this.f7576u = Long.MIN_VALUE;
        this.f7577v = Long.MIN_VALUE;
        this.f7578w = Long.MIN_VALUE;
        this.f7579x = false;
        this.f7558c.b();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f7581z = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        X();
        int i11 = this.f7573r;
        if (i10 >= i11) {
            if (i10 <= this.f7572q + i11) {
                this.f7576u = Long.MIN_VALUE;
                this.f7575t = i10 - i11;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean Z(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.X()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f7575t     // Catch:{ all -> 0x0040 }
            int r2 = r8.D(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.H()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f7570o     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f7578w     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f7572q     // Catch:{ all -> 0x0040 }
            int r0 = r8.f7575t     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.v(r2, r3, r4, r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f7576u = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f7575t     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f7575t = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.Z(long, boolean):boolean");
    }

    public /* synthetic */ void a(y yVar, int i10) {
        a0.b(this, yVar, i10);
    }

    public final void a0(long j10) {
        if (this.G != j10) {
            this.G = j10;
            I();
        }
    }

    public final int b(g gVar, int i10, boolean z10, int i11) {
        return this.f7556a.p(gVar, i10, z10);
    }

    public final void b0(long j10) {
        this.f7576u = j10;
    }

    public /* synthetic */ int c(g gVar, int i10, boolean z10) {
        return a0.a(this, gVar, i10, z10);
    }

    public final void d(e4.j jVar) {
        e4.j w10 = w(jVar);
        this.A = false;
        this.B = jVar;
        boolean c02 = c0(w10);
        d dVar = this.f7562g;
        if (dVar != null && c02) {
            dVar.a(w10);
        }
    }

    public final void d0(d dVar) {
        this.f7562g = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(long r12, int r14, int r15, int r16, k4.b0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L_0x0010
            e4.j r0 = r8.B
            java.lang.Object r0 = a6.a.h(r0)
            e4.j r0 = (e4.j) r0
            r11.d(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            boolean r4 = r8.f7580y
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f7580y = r1
        L_0x0022:
            long r4 = r8.G
            long r4 = r4 + r12
            boolean r6 = r8.E
            if (r6 == 0) goto L_0x005e
            long r6 = r8.f7576u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x005e
            boolean r0 = r8.F
            if (r0 != 0) goto L_0x005a
            e4.j r0 = r8.C
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            int r6 = r6 + 50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = "SampleQueue"
            a6.p.h(r6, r0)
            r8.F = r2
        L_0x005a:
            r0 = r14 | 1
            r6 = r0
            goto L_0x005f
        L_0x005e:
            r6 = r14
        L_0x005f:
            boolean r0 = r8.H
            if (r0 == 0) goto L_0x0070
            if (r3 == 0) goto L_0x006f
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r8.H = r1
            goto L_0x0070
        L_0x006f:
            return
        L_0x0070:
            com.google.android.exoplayer2.source.s r0 = r8.f7556a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.u.e(long, int, int, int, k4.b0$a):void");
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f7575t + i10 <= this.f7572q) {
                    z10 = true;
                    a6.a.a(z10);
                    this.f7575t += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        a6.a.a(z10);
        this.f7575t += i10;
    }

    public final void f(y yVar, int i10, int i11) {
        this.f7556a.q(yVar, i10);
    }

    public final void f0(int i10) {
        this.D = i10;
    }

    public final void g0() {
        this.H = true;
    }

    public synchronized long o() {
        int i10 = this.f7575t;
        if (i10 == 0) {
            return -1;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f7556a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f7556a.b(n());
    }

    public final void s() {
        this.f7556a.b(o());
    }

    public final void u(int i10) {
        this.f7556a.c(t(i10));
    }

    /* access modifiers changed from: protected */
    public e4.j w(e4.j jVar) {
        return (this.G == 0 || jVar.f8100w == Long.MAX_VALUE) ? jVar : jVar.b().i0(jVar.f8100w + this.G).E();
    }

    public final int x() {
        return this.f7573r;
    }

    public final synchronized long y() {
        return this.f7572q == 0 ? Long.MIN_VALUE : this.f7570o[this.f7574s];
    }

    public final synchronized long z() {
        return this.f7578w;
    }
}
