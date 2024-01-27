package com.google.android.exoplayer2.source;

import a6.m0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.j;
import e4.k;
import e4.v;
import g5.t;
import g5.w;
import y5.h;

/* compiled from: ClippingMediaPeriod */
public final class b implements j, j.a {

    /* renamed from: h  reason: collision with root package name */
    public final j f7102h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f7103i;

    /* renamed from: j  reason: collision with root package name */
    private a[] f7104j = new a[0];

    /* renamed from: k  reason: collision with root package name */
    private long f7105k;

    /* renamed from: l  reason: collision with root package name */
    long f7106l;

    /* renamed from: m  reason: collision with root package name */
    long f7107m;

    /* compiled from: ClippingMediaPeriod */
    private final class a implements t {

        /* renamed from: h  reason: collision with root package name */
        public final t f7108h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f7109i;

        public a(t tVar) {
            this.f7108h = tVar;
        }

        public void a() {
            this.f7108h.a();
        }

        public void b() {
            this.f7109i = false;
        }

        public boolean e() {
            return !b.this.e() && this.f7108h.e();
        }

        public int i(k kVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (b.this.e()) {
                return -3;
            }
            if (this.f7109i) {
                decoderInputBuffer.r(4);
                return -4;
            }
            int i11 = this.f7108h.i(kVar, decoderInputBuffer, i10);
            if (i11 == -5) {
                e4.j jVar = (e4.j) a6.a.e(kVar.f8131b);
                int i12 = jVar.I;
                if (!(i12 == 0 && jVar.J == 0)) {
                    b bVar = b.this;
                    int i13 = 0;
                    if (bVar.f7106l != 0) {
                        i12 = 0;
                    }
                    if (bVar.f7107m == Long.MIN_VALUE) {
                        i13 = jVar.J;
                    }
                    kVar.f8131b = jVar.b().M(i12).N(i13).E();
                }
                return -5;
            }
            b bVar2 = b.this;
            long j10 = bVar2.f7107m;
            if (j10 == Long.MIN_VALUE || ((i11 != -4 || decoderInputBuffer.f6471l < j10) && (i11 != -3 || bVar2.g() != Long.MIN_VALUE || decoderInputBuffer.f6470k))) {
                return i11;
            }
            decoderInputBuffer.k();
            decoderInputBuffer.r(4);
            this.f7109i = true;
            return -4;
        }

        public int o(long j10) {
            if (b.this.e()) {
                return -3;
            }
            return this.f7108h.o(j10);
        }
    }

    public b(j jVar, boolean z10, long j10, long j11) {
        this.f7102h = jVar;
        this.f7105k = z10 ? j10 : -9223372036854775807L;
        this.f7106l = j10;
        this.f7107m = j11;
    }

    private v a(long j10, v vVar) {
        long s10 = m0.s(vVar.f8144a, 0, j10 - this.f7106l);
        long j11 = vVar.f8145b;
        long j12 = this.f7107m;
        long s11 = m0.s(j11, 0, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        if (s10 == vVar.f8144a && s11 == vVar.f8145b) {
            return vVar;
        }
        return new v(s10, s11);
    }

    private static boolean o(long j10, h[] hVarArr) {
        if (j10 != 0) {
            for (h hVar : hVarArr) {
                if (hVar != null) {
                    e4.j o10 = hVar.o();
                    if (!a6.t.a(o10.f8096s, o10.f8093p)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long b() {
        long b10 = this.f7102h.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.f7107m;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    public long c(long j10, v vVar) {
        long j11 = this.f7106l;
        if (j10 == j11) {
            return j11;
        }
        return this.f7102h.c(j10, a(j10, vVar));
    }

    public boolean d(long j10) {
        return this.f7102h.d(j10);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f7105k != -9223372036854775807L;
    }

    public boolean f() {
        return this.f7102h.f();
    }

    public long g() {
        long g10 = this.f7102h.g();
        if (g10 != Long.MIN_VALUE) {
            long j10 = this.f7107m;
            if (j10 == Long.MIN_VALUE || g10 < j10) {
                return g10;
            }
        }
        return Long.MIN_VALUE;
    }

    public void h(long j10) {
        this.f7102h.h(j10);
    }

    public void k(j jVar) {
        ((j.a) a6.a.e(this.f7103i)).k(this);
    }

    /* renamed from: l */
    public void i(j jVar) {
        ((j.a) a6.a.e(this.f7103i)).i(this);
    }

    public void m() {
        this.f7102h.m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long n(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f7105k = r0
            com.google.android.exoplayer2.source.b$a[] r0 = r6.f7104j
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.exoplayer2.source.j r0 = r6.f7102h
            long r0 = r0.n(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f7106l
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f7107m
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            a6.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.n(long):long");
    }

    public long p() {
        if (e()) {
            long j10 = this.f7105k;
            this.f7105k = -9223372036854775807L;
            long p10 = p();
            return p10 != -9223372036854775807L ? p10 : j10;
        }
        long p11 = this.f7102h.p();
        if (p11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        a6.a.f(p11 >= this.f7106l);
        long j11 = this.f7107m;
        if (j11 != Long.MIN_VALUE && p11 > j11) {
            z10 = false;
        }
        a6.a.f(z10);
        return p11;
    }

    public void q(j.a aVar, long j10) {
        this.f7103i = aVar;
        this.f7102h.q(this, j10);
    }

    public w r() {
        return this.f7102h.r();
    }

    public void s(long j10, long j11) {
        this.f7106l = j10;
        this.f7107m = j11;
    }

    public void t(long j10, boolean z10) {
        this.f7102h.t(j10, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long u(y5.h[] r13, boolean[] r14, g5.t[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.exoplayer2.source.b$a[] r2 = new com.google.android.exoplayer2.source.b.a[r2]
            r0.f7104j = r2
            int r2 = r1.length
            g5.t[] r9 = new g5.t[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            com.google.android.exoplayer2.source.b$a[] r3 = r0.f7104j
            r4 = r1[r2]
            com.google.android.exoplayer2.source.b$a r4 = (com.google.android.exoplayer2.source.b.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            g5.t r11 = r3.f7108h
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            com.google.android.exoplayer2.source.j r2 = r0.f7102h
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.u(r3, r4, r5, r6, r7)
            boolean r4 = r12.e()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f7106l
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = o(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f7105k = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f7106l
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f7107m
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            a6.a.f(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0097
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            com.google.android.exoplayer2.source.b$a[] r4 = r0.f7104j
            r4[r10] = r11
            goto L_0x008e
        L_0x0077:
            com.google.android.exoplayer2.source.b$a[] r4 = r0.f7104j
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r5 = r4[r10]
            g5.t r5 = r5.f7108h
            r6 = r9[r10]
            if (r5 == r6) goto L_0x008e
        L_0x0085:
            com.google.android.exoplayer2.source.b$a r5 = new com.google.android.exoplayer2.source.b$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x008e:
            com.google.android.exoplayer2.source.b$a[] r4 = r0.f7104j
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.u(y5.h[], boolean[], g5.t[], boolean[], long):long");
    }
}
