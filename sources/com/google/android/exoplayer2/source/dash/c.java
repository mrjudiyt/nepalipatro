package com.google.android.exoplayer2.source.dash;

import a6.m0;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.g;
import e4.j;
import e4.v;
import i5.f;
import i5.g;
import i5.k;
import i5.m;
import i5.n;
import i5.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k4.d;
import k5.i;
import y5.h;
import z5.p;
import z5.r;

/* compiled from: DefaultDashChunkSource */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final p f7224a;

    /* renamed from: b  reason: collision with root package name */
    private final j5.b f7225b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f7226c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7227d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f7228e;

    /* renamed from: f  reason: collision with root package name */
    private final long f7229f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7230g;

    /* renamed from: h  reason: collision with root package name */
    private final e.c f7231h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f7232i;

    /* renamed from: j  reason: collision with root package name */
    private h f7233j;

    /* renamed from: k  reason: collision with root package name */
    private k5.c f7234k;

    /* renamed from: l  reason: collision with root package name */
    private int f7235l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f7236m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7237n;

    /* compiled from: DefaultDashChunkSource */
    public static final class a implements a.C0114a {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0119a f7238a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7239b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f7240c;

        public a(a.C0119a aVar) {
            this(aVar, 1);
        }

        public a a(p pVar, k5.c cVar, j5.b bVar, int i10, int[] iArr, h hVar, int i11, long j10, boolean z10, List<j> list, e.c cVar2, r rVar) {
            r rVar2 = rVar;
            com.google.android.exoplayer2.upstream.a a10 = this.f7238a.a();
            if (rVar2 != null) {
                a10.c(rVar2);
            }
            return new c(this.f7240c, pVar, cVar, bVar, i10, iArr, hVar, i11, a10, j10, this.f7239b, z10, list, cVar2);
        }

        public a(a.C0119a aVar, int i10) {
            this(i5.e.f9289q, aVar, i10);
        }

        public a(g.a aVar, a.C0119a aVar2, int i10) {
            this.f7240c = aVar;
            this.f7238a = aVar2;
            this.f7239b = i10;
        }
    }

    /* compiled from: DefaultDashChunkSource */
    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f7241a;

        /* renamed from: b  reason: collision with root package name */
        public final k5.j f7242b;

        /* renamed from: c  reason: collision with root package name */
        public final k5.b f7243c;

        /* renamed from: d  reason: collision with root package name */
        public final j5.e f7244d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f7245e;

        /* renamed from: f  reason: collision with root package name */
        private final long f7246f;

        b(long j10, k5.j jVar, k5.b bVar, g gVar, long j11, j5.e eVar) {
            this.f7245e = j10;
            this.f7242b = jVar;
            this.f7243c = bVar;
            this.f7246f = j11;
            this.f7241a = gVar;
            this.f7244d = eVar;
        }

        /* access modifiers changed from: package-private */
        public b b(long j10, k5.j jVar) {
            long f10;
            long f11;
            long j11 = j10;
            j5.e l10 = this.f7242b.l();
            j5.e l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f7243c, this.f7241a, this.f7246f, l10);
            } else if (!l10.g()) {
                return new b(j10, jVar, this.f7243c, this.f7241a, this.f7246f, l11);
            } else {
                long i10 = l10.i(j11);
                if (i10 == 0) {
                    return new b(j10, jVar, this.f7243c, this.f7241a, this.f7246f, l11);
                }
                long h10 = l10.h();
                long a10 = l10.a(h10);
                long j12 = (i10 + h10) - 1;
                long h11 = l11.h();
                j5.e eVar = l10;
                long a11 = l11.a(h11);
                long j13 = h10;
                long j14 = this.f7246f;
                int i11 = ((l10.a(j12) + l10.b(j12, j11)) > a11 ? 1 : ((l10.a(j12) + l10.b(j12, j11)) == a11 ? 0 : -1));
                if (i11 == 0) {
                    f10 = j12 + 1;
                } else if (i11 < 0) {
                    throw new BehindLiveWindowException();
                } else if (a11 < a10) {
                    f11 = j14 - (l11.f(a10, j11) - j13);
                    return new b(j10, jVar, this.f7243c, this.f7241a, f11, l11);
                } else {
                    f10 = eVar.f(a11, j11);
                }
                f11 = j14 + (f10 - h11);
                return new b(j10, jVar, this.f7243c, this.f7241a, f11, l11);
            }
        }

        /* access modifiers changed from: package-private */
        public b c(j5.e eVar) {
            return new b(this.f7245e, this.f7242b, this.f7243c, this.f7241a, this.f7246f, eVar);
        }

        /* access modifiers changed from: package-private */
        public b d(k5.b bVar) {
            return new b(this.f7245e, this.f7242b, bVar, this.f7241a, this.f7246f, this.f7244d);
        }

        public long e(long j10) {
            return this.f7244d.c(this.f7245e, j10) + this.f7246f;
        }

        public long f() {
            return this.f7244d.h() + this.f7246f;
        }

        public long g(long j10) {
            return (e(j10) + this.f7244d.j(this.f7245e, j10)) - 1;
        }

        public long h() {
            return this.f7244d.i(this.f7245e);
        }

        public long i(long j10) {
            return k(j10) + this.f7244d.b(j10 - this.f7246f, this.f7245e);
        }

        public long j(long j10) {
            return this.f7244d.f(j10, this.f7245e) + this.f7246f;
        }

        public long k(long j10) {
            return this.f7244d.a(j10 - this.f7246f);
        }

        public i l(long j10) {
            return this.f7244d.e(j10 - this.f7246f);
        }

        public boolean m(long j10, long j11) {
            if (!this.f7244d.g() && j11 != -9223372036854775807L && i(j10) > j11) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultDashChunkSource */
    protected static final class C0115c extends i5.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f7247e;

        /* renamed from: f  reason: collision with root package name */
        private final long f7248f;

        public C0115c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f7247e = bVar;
            this.f7248f = j12;
        }

        public long a() {
            c();
            return this.f7247e.k(d());
        }

        public long b() {
            c();
            return this.f7247e.i(d());
        }
    }

    public c(g.a aVar, p pVar, k5.c cVar, j5.b bVar, int i10, int[] iArr, h hVar, int i11, com.google.android.exoplayer2.upstream.a aVar2, long j10, int i12, boolean z10, List<j> list, e.c cVar2) {
        k5.c cVar3 = cVar;
        j5.b bVar2 = bVar;
        int i13 = i10;
        h hVar2 = hVar;
        this.f7224a = pVar;
        this.f7234k = cVar3;
        this.f7225b = bVar2;
        this.f7226c = iArr;
        this.f7233j = hVar2;
        this.f7227d = i11;
        this.f7228e = aVar2;
        this.f7235l = i13;
        this.f7229f = j10;
        this.f7230g = i12;
        this.f7231h = cVar2;
        long g10 = cVar3.g(i13);
        ArrayList<k5.j> m10 = m();
        this.f7232i = new b[hVar.length()];
        int i14 = 0;
        while (i14 < this.f7232i.length) {
            k5.j jVar = m10.get(hVar2.k(i14));
            k5.b j11 = bVar2.j(jVar.f9694c);
            b[] bVarArr = this.f7232i;
            if (j11 == null) {
                j11 = jVar.f9694c.get(0);
            }
            int i15 = i14;
            long j12 = g10;
            k5.j jVar2 = jVar;
            bVarArr[i15] = new b(j12, jVar2, j11, i5.e.f9289q.a(i11, jVar.f9693b, z10, list, cVar2), 0, jVar.l());
            i14 = i15 + 1;
        }
    }

    private g.a j(h hVar, List<k5.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = hVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (hVar.f(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = j5.b.f(list);
        return new g.a(f10, f10 - this.f7225b.g(list), length, i10);
    }

    private long k(long j10, long j11) {
        if (!this.f7234k.f9648d) {
            return -9223372036854775807L;
        }
        return Math.max(0, Math.min(l(j10), this.f7232i[0].i(this.f7232i[0].g(j10))) - j11);
    }

    private long l(long j10) {
        k5.c cVar = this.f7234k;
        long j11 = cVar.f9645a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - e4.c.d(j11 + cVar.d(this.f7235l).f9679b);
    }

    private ArrayList<k5.j> m() {
        List<k5.a> list = this.f7234k.d(this.f7235l).f9680c;
        ArrayList<k5.j> arrayList = new ArrayList<>();
        for (int i10 : this.f7226c) {
            arrayList.addAll(list.get(i10).f9637c);
        }
        return arrayList;
    }

    private long n(b bVar, n nVar, long j10, long j11, long j12) {
        if (nVar != null) {
            return nVar.g();
        }
        return m0.s(bVar.j(j10), j11, j12);
    }

    public void a() {
        IOException iOException = this.f7236m;
        if (iOException == null) {
            this.f7224a.a();
            return;
        }
        throw iOException;
    }

    public boolean b(f fVar, boolean z10, g.c cVar, com.google.android.exoplayer2.upstream.g gVar) {
        g.b b10;
        int i10 = 0;
        if (!z10) {
            return false;
        }
        e.c cVar2 = this.f7231h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f7234k.f9648d && (fVar instanceof n)) {
            IOException iOException = cVar.f7766c;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).f7656k == 404) {
                b bVar = this.f7232i[this.f7233j.a(fVar.f9310d)];
                long h10 = bVar.h();
                if (!(h10 == -1 || h10 == 0)) {
                    if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                        this.f7237n = true;
                        return true;
                    }
                }
            }
        }
        int a10 = this.f7233j.a(fVar.f9310d);
        b bVar2 = this.f7232i[a10];
        g.a j10 = j(this.f7233j, bVar2.f7242b.f9694c);
        if ((!j10.a(2) && !j10.a(1)) || (b10 = gVar.b(j10, cVar)) == null) {
            return false;
        }
        int i11 = b10.f7762a;
        if (i11 == 2) {
            h hVar = this.f7233j;
            return hVar.e(hVar.a(fVar.f9310d), b10.f7763b);
        } else if (i11 != 1) {
            return false;
        } else {
            this.f7225b.e(bVar2.f7243c, b10.f7763b);
            boolean z11 = false;
            while (true) {
                b[] bVarArr = this.f7232i;
                if (i10 >= bVarArr.length) {
                    return z11;
                }
                k5.b j11 = this.f7225b.j(bVarArr[i10].f7242b.f9694c);
                if (j11 != null) {
                    if (i10 == a10) {
                        z11 = true;
                    }
                    b[] bVarArr2 = this.f7232i;
                    bVarArr2[i10] = bVarArr2[i10].d(j11);
                }
                i10++;
            }
        }
    }

    public long c(long j10, v vVar) {
        long j11 = j10;
        for (b bVar : this.f7232i) {
            if (bVar.f7244d != null) {
                long j12 = bVar.j(j11);
                long k10 = bVar.k(j12);
                long h10 = bVar.h();
                return vVar.a(j10, k10, (k10 >= j11 || (h10 != -1 && j12 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j12 + 1));
            }
        }
        return j11;
    }

    public boolean d(long j10, f fVar, List<? extends n> list) {
        if (this.f7236m != null) {
            return false;
        }
        return this.f7233j.l(j10, fVar, list);
    }

    public void e(k5.c cVar, int i10) {
        try {
            this.f7234k = cVar;
            this.f7235l = i10;
            long g10 = cVar.g(i10);
            ArrayList<k5.j> m10 = m();
            for (int i11 = 0; i11 < this.f7232i.length; i11++) {
                b[] bVarArr = this.f7232i;
                bVarArr[i11] = bVarArr[i11].b(g10, m10.get(this.f7233j.k(i11)));
            }
        } catch (BehindLiveWindowException e10) {
            this.f7236m = e10;
        }
    }

    public int f(long j10, List<? extends n> list) {
        if (this.f7236m != null || this.f7233j.length() < 2) {
            return list.size();
        }
        return this.f7233j.m(j10, list);
    }

    public void g(f fVar) {
        d d10;
        if (fVar instanceof m) {
            int a10 = this.f7233j.a(((m) fVar).f9310d);
            b bVar = this.f7232i[a10];
            if (bVar.f7244d == null && (d10 = bVar.f7241a.d()) != null) {
                this.f7232i[a10] = bVar.c(new j5.g(d10, bVar.f7242b.f9695d));
            }
        }
        e.c cVar = this.f7231h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    public void h(h hVar) {
        this.f7233j = hVar;
    }

    public void i(long j10, long j11, List<? extends n> list, i5.h hVar) {
        n nVar;
        int i10;
        o[] oVarArr;
        int i11;
        long j12;
        c cVar = this;
        long j13 = j10;
        i5.h hVar2 = hVar;
        if (cVar.f7236m == null) {
            long j14 = j11 - j13;
            long d10 = e4.c.d(cVar.f7234k.f9645a) + e4.c.d(cVar.f7234k.d(cVar.f7235l).f9679b) + j11;
            e.c cVar2 = cVar.f7231h;
            if (cVar2 == null || !cVar2.h(d10)) {
                long d11 = e4.c.d(m0.V(cVar.f7229f));
                long l10 = cVar.l(d11);
                if (list.isEmpty()) {
                    List<? extends n> list2 = list;
                    nVar = null;
                } else {
                    nVar = (n) list.get(list.size() - 1);
                }
                int length = cVar.f7233j.length();
                o[] oVarArr2 = new o[length];
                int i12 = 0;
                while (i12 < length) {
                    b bVar = cVar.f7232i[i12];
                    if (bVar.f7244d == null) {
                        oVarArr2[i12] = o.f9355a;
                        i11 = i12;
                        i10 = length;
                        oVarArr = oVarArr2;
                        j12 = d11;
                    } else {
                        long e10 = bVar.e(d11);
                        long g10 = bVar.g(d11);
                        b bVar2 = bVar;
                        i11 = i12;
                        i10 = length;
                        oVarArr = oVarArr2;
                        j12 = d11;
                        long n10 = n(bVar, nVar, j11, e10, g10);
                        if (n10 < e10) {
                            oVarArr[i11] = o.f9355a;
                        } else {
                            oVarArr[i11] = new C0115c(bVar2, n10, g10, l10);
                        }
                    }
                    i12 = i11 + 1;
                    List<? extends n> list3 = list;
                    d11 = j12;
                    oVarArr2 = oVarArr;
                    length = i10;
                    cVar = this;
                }
                long k10 = cVar.k(d11, j13);
                long j15 = d11;
                cVar.f7233j.d(j10, j14, k10, list, oVarArr2);
                b bVar3 = cVar.f7232i[cVar.f7233j.c()];
                i5.g gVar = bVar3.f7241a;
                if (gVar != null) {
                    k5.j jVar = bVar3.f7242b;
                    i n11 = gVar.c() == null ? jVar.n() : null;
                    i m10 = bVar3.f7244d == null ? jVar.m() : null;
                    if (!(n11 == null && m10 == null)) {
                        hVar2.f9316a = o(bVar3, cVar.f7228e, cVar.f7233j.o(), cVar.f7233j.p(), cVar.f7233j.r(), n11, m10);
                        return;
                    }
                }
                long a10 = bVar3.f7245e;
                long j16 = -9223372036854775807L;
                int i13 = (a10 > -9223372036854775807L ? 1 : (a10 == -9223372036854775807L ? 0 : -1));
                boolean z10 = i13 != 0;
                if (bVar3.h() == 0) {
                    hVar2.f9317b = z10;
                    return;
                }
                long e11 = bVar3.e(j15);
                long g11 = bVar3.g(j15);
                boolean z11 = z10;
                long n12 = n(bVar3, nVar, j11, e11, g11);
                if (n12 < e11) {
                    cVar.f7236m = new BehindLiveWindowException();
                    return;
                }
                int i14 = (n12 > g11 ? 1 : (n12 == g11 ? 0 : -1));
                if (i14 > 0 || (cVar.f7237n && i14 >= 0)) {
                    hVar.f9317b = z11;
                } else if (!z11 || bVar3.k(n12) < a10) {
                    i5.h hVar3 = hVar;
                    int min = (int) Math.min((long) cVar.f7230g, (g11 - n12) + 1);
                    if (i13 != 0) {
                        while (min > 1 && bVar3.k((((long) min) + n12) - 1) >= a10) {
                            min--;
                        }
                    }
                    int i15 = min;
                    if (list.isEmpty()) {
                        j16 = j11;
                    }
                    hVar3.f9316a = p(bVar3, cVar.f7228e, cVar.f7227d, cVar.f7233j.o(), cVar.f7233j.p(), cVar.f7233j.r(), n12, i15, j16, l10);
                } else {
                    hVar.f9317b = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public f o(b bVar, com.google.android.exoplayer2.upstream.a aVar, j jVar, int i10, Object obj, i iVar, i iVar2) {
        b bVar2 = bVar;
        i iVar3 = iVar;
        k5.j jVar2 = bVar2.f7242b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar2.f7243c.f9641a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(aVar, j5.f.a(bVar2.f7243c.f9641a, iVar3, jVar2.k(), 0), jVar, i10, obj, bVar2.f7241a);
    }

    /* access modifiers changed from: protected */
    public f p(b bVar, com.google.android.exoplayer2.upstream.a aVar, int i10, j jVar, int i11, Object obj, long j10, int i12, long j11, long j12) {
        b bVar2 = bVar;
        long j13 = j10;
        long j14 = j12;
        k5.j jVar2 = bVar2.f7242b;
        long k10 = bVar2.k(j13);
        i l10 = bVar2.l(j13);
        int i13 = 0;
        if (bVar2.f7241a == null) {
            long i14 = bVar2.i(j13);
            if (!bVar2.m(j13, j14)) {
                i13 = 8;
            }
            return new i5.p(aVar, j5.f.a(bVar2.f7243c.f9641a, l10, jVar2.k(), i13), jVar, i11, obj, k10, i14, j10, i10, jVar);
        }
        int i15 = 1;
        int i16 = i12;
        int i17 = 1;
        while (i15 < i16) {
            i a10 = l10.a(bVar2.l(((long) i15) + j13), bVar2.f7243c.f9641a);
            if (a10 == null) {
                break;
            }
            i17++;
            i15++;
            l10 = a10;
        }
        long j15 = (((long) i17) + j13) - 1;
        long i18 = bVar2.i(j15);
        long a11 = bVar.f7245e;
        long j16 = (a11 == -9223372036854775807L || a11 > i18) ? -9223372036854775807L : a11;
        if (!bVar2.m(j15, j14)) {
            i13 = 8;
        }
        i5.g gVar = bVar2.f7241a;
        return new k(aVar, j5.f.a(bVar2.f7243c.f9641a, l10, jVar2.k(), i13), jVar, i11, obj, k10, i18, j11, j16, j10, i17, -jVar2.f9695d, gVar);
    }

    public void release() {
        for (b bVar : this.f7232i) {
            i5.g gVar = bVar.f7241a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
