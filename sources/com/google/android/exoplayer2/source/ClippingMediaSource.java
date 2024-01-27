package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.k;
import e4.c;
import java.io.IOException;
import java.util.ArrayList;
import z5.b;
import z5.r;

public final class ClippingMediaSource extends c<Void> {

    /* renamed from: j  reason: collision with root package name */
    private final k f7078j;

    /* renamed from: k  reason: collision with root package name */
    private final long f7079k;

    /* renamed from: l  reason: collision with root package name */
    private final long f7080l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f7081m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f7082n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f7083o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<b> f7084p;

    /* renamed from: q  reason: collision with root package name */
    private final a1.c f7085q;

    /* renamed from: r  reason: collision with root package name */
    private a f7086r;

    /* renamed from: s  reason: collision with root package name */
    private IllegalClippingException f7087s;

    /* renamed from: t  reason: collision with root package name */
    private long f7088t;

    /* renamed from: u  reason: collision with root package name */
    private long f7089u;

    public static final class IllegalClippingException extends IOException {

        /* renamed from: h  reason: collision with root package name */
        public final int f7090h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IllegalClippingException(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = a(r4)
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r1 = r0.length()
                java.lang.String r2 = "Illegal clipping: "
                if (r1 == 0) goto L_0x0015
                java.lang.String r0 = r2.concat(r0)
                goto L_0x001a
            L_0x0015:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r2)
            L_0x001a:
                r3.<init>(r0)
                r3.f7090h = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException.<init>(int):void");
        }

        private static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private static final class a extends f {

        /* renamed from: d  reason: collision with root package name */
        private final long f7091d;

        /* renamed from: e  reason: collision with root package name */
        private final long f7092e;

        /* renamed from: f  reason: collision with root package name */
        private final long f7093f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f7094g;

        public a(a1 a1Var, long j10, long j11) {
            super(a1Var);
            boolean z10 = false;
            if (a1Var.i() == 1) {
                a1.c n10 = a1Var.n(0, new a1.c());
                long max = Math.max(0, j10);
                if (n10.f6256l || max == 0 || n10.f6252h) {
                    long max2 = j11 == Long.MIN_VALUE ? n10.f6258n : Math.max(0, j11);
                    long j12 = n10.f6258n;
                    if (j12 != -9223372036854775807L) {
                        max2 = max2 > j12 ? j12 : max2;
                        if (max > max2) {
                            throw new IllegalClippingException(2);
                        }
                    }
                    this.f7091d = max;
                    this.f7092e = max2;
                    int i10 = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                    this.f7093f = i10 == 0 ? -9223372036854775807L : max2 - max;
                    if (n10.f6253i && (i10 == 0 || (j12 != -9223372036854775807L && max2 == j12))) {
                        z10 = true;
                    }
                    this.f7094g = z10;
                    return;
                }
                throw new IllegalClippingException(1);
            }
            throw new IllegalClippingException(0);
        }

        public a1.b g(int i10, a1.b bVar, boolean z10) {
            this.f7282c.g(0, bVar, z10);
            long l10 = bVar.l() - this.f7091d;
            long j10 = this.f7093f;
            return bVar.n(bVar.f6234a, bVar.f6235b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - l10, l10);
        }

        public a1.c o(int i10, a1.c cVar, long j10) {
            this.f7282c.o(0, cVar, 0);
            long j11 = cVar.f6261q;
            long j12 = this.f7091d;
            cVar.f6261q = j11 + j12;
            cVar.f6258n = this.f7093f;
            cVar.f6253i = this.f7094g;
            long j13 = cVar.f6257m;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f6257m = max;
                long j14 = this.f7092e;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f6257m = max;
                cVar.f6257m = max - this.f7091d;
            }
            long e10 = c.e(this.f7091d);
            long j15 = cVar.f6249e;
            if (j15 != -9223372036854775807L) {
                cVar.f6249e = j15 + e10;
            }
            long j16 = cVar.f6250f;
            if (j16 != -9223372036854775807L) {
                cVar.f6250f = j16 + e10;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(k kVar, long j10, long j11) {
        this(kVar, j10, j11, true, false, false);
    }

    private void M(a1 a1Var) {
        long j10;
        a1Var.n(0, this.f7085q);
        long e10 = this.f7085q.e();
        long j11 = Long.MIN_VALUE;
        if (this.f7086r == null || this.f7084p.isEmpty() || this.f7082n) {
            long j12 = this.f7079k;
            long j13 = this.f7080l;
            if (this.f7083o) {
                long c10 = this.f7085q.c();
                j12 += c10;
                j13 += c10;
            }
            this.f7088t = e10 + j12;
            if (this.f7080l != Long.MIN_VALUE) {
                j11 = e10 + j13;
            }
            this.f7089u = j11;
            int size = this.f7084p.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f7084p.get(i10).s(this.f7088t, this.f7089u);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f7088t - e10;
            if (this.f7080l != Long.MIN_VALUE) {
                j11 = this.f7089u - e10;
            }
            j10 = j14;
        }
        try {
            a aVar = new a(a1Var, j10, j11);
            this.f7086r = aVar;
            z(aVar);
        } catch (IllegalClippingException e11) {
            this.f7087s = e11;
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        super.A();
        this.f7087s = null;
        this.f7086r = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void I(Void voidR, k kVar, a1 a1Var) {
        if (this.f7087s == null) {
            M(a1Var);
        }
    }

    public j0 g() {
        return this.f7078j.g();
    }

    public j h(k.a aVar, b bVar, long j10) {
        b bVar2 = new b(this.f7078j.h(aVar, bVar, j10), this.f7081m, this.f7088t, this.f7089u);
        this.f7084p.add(bVar2);
        return bVar2;
    }

    public void l() {
        IllegalClippingException illegalClippingException = this.f7087s;
        if (illegalClippingException == null) {
            super.l();
            return;
        }
        throw illegalClippingException;
    }

    public void n(j jVar) {
        a6.a.f(this.f7084p.remove(jVar));
        this.f7078j.n(((b) jVar).f7102h);
        if (this.f7084p.isEmpty() && !this.f7082n) {
            M(((a) a6.a.e(this.f7086r)).f7282c);
        }
    }

    /* access modifiers changed from: protected */
    public void y(r rVar) {
        super.y(rVar);
        J(null, this.f7078j);
    }

    public ClippingMediaSource(k kVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        a6.a.a(j10 >= 0);
        this.f7078j = (k) a6.a.e(kVar);
        this.f7079k = j10;
        this.f7080l = j11;
        this.f7081m = z10;
        this.f7082n = z11;
        this.f7083o = z12;
        this.f7084p = new ArrayList<>();
        this.f7085q = new a1.c();
    }
}
