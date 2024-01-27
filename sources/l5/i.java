package l5;

import a6.i0;
import a6.k0;
import a6.m0;
import a6.y;
import android.net.Uri;
import c5.l;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.x;
import e4.j;
import i5.n;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l5.f;
import l6.c;
import x4.a;

/* compiled from: HlsMediaChunk */
final class i extends n {
    private static final AtomicInteger L = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private j C;
    private p D;
    private int E;
    private boolean F;
    private volatile boolean G;
    private boolean H;
    private x<Integer> I;
    private boolean J;
    private boolean K;

    /* renamed from: k  reason: collision with root package name */
    public final int f10027k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10028l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f10029m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f10030n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10031o;

    /* renamed from: p  reason: collision with root package name */
    private final a f10032p;

    /* renamed from: q  reason: collision with root package name */
    private final b f10033q;

    /* renamed from: r  reason: collision with root package name */
    private final j f10034r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f10035s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f10036t;

    /* renamed from: u  reason: collision with root package name */
    private final i0 f10037u;

    /* renamed from: v  reason: collision with root package name */
    private final h f10038v;

    /* renamed from: w  reason: collision with root package name */
    private final List<j> f10039w;

    /* renamed from: x  reason: collision with root package name */
    private final h f10040x;

    /* renamed from: y  reason: collision with root package name */
    private final c5.h f10041y;

    /* renamed from: z  reason: collision with root package name */
    private final y f10042z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private i(h hVar, a aVar, b bVar, j jVar, boolean z10, a aVar2, b bVar2, boolean z11, Uri uri, List<j> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, i0 i0Var, h hVar2, j jVar2, c5.h hVar3, y yVar, boolean z15) {
        super(aVar, bVar, jVar, i10, obj, j10, j11, j12);
        b bVar3 = bVar2;
        this.A = z10;
        this.f10031o = i11;
        this.K = z12;
        this.f10028l = i12;
        this.f10033q = bVar3;
        this.f10032p = aVar2;
        this.F = bVar3 != null;
        this.B = z11;
        this.f10029m = uri;
        this.f10035s = z14;
        this.f10037u = i0Var;
        this.f10036t = z13;
        this.f10038v = hVar;
        this.f10039w = list;
        this.f10040x = hVar2;
        this.f10034r = jVar2;
        this.f10041y = hVar3;
        this.f10042z = yVar;
        this.f10030n = z15;
        this.I = x.s();
        this.f10027k = L.getAndIncrement();
    }

    private static a i(a aVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return aVar;
        }
        a6.a.e(bArr2);
        return new a(aVar, bArr, bArr2);
    }

    public static i j(h hVar, a aVar, j jVar, long j10, d dVar, f.e eVar, Uri uri, List<j> list, int i10, Object obj, boolean z10, r rVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11) {
        boolean z12;
        boolean z13;
        b bVar;
        a aVar2;
        y yVar;
        c5.h hVar2;
        j jVar2;
        a aVar3 = aVar;
        d dVar2 = dVar;
        f.e eVar2 = eVar;
        i iVar2 = iVar;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        d.e eVar3 = eVar2.f10022a;
        b a10 = new b.C0120b().i(k0.e(dVar2.f10237a, eVar3.f7436h)).h(eVar3.f7444p).g(eVar3.f7445q).b(eVar2.f10025d ? 8 : 0).a();
        boolean z14 = bArr3 != null;
        a i11 = i(aVar3, bArr3, z14 ? l((String) a6.a.e(eVar3.f7443o)) : null);
        d.C0117d dVar3 = eVar3.f7437i;
        if (dVar3 != null) {
            boolean z15 = bArr4 != null;
            byte[] l10 = z15 ? l((String) a6.a.e(dVar3.f7443o)) : null;
            z12 = z14;
            bVar = new b(k0.e(dVar2.f10237a, dVar3.f7436h), dVar3.f7444p, dVar3.f7445q);
            aVar2 = i(aVar3, bArr4, l10);
            z13 = z15;
        } else {
            z12 = z14;
            aVar2 = null;
            bVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar3.f7440l;
        long j12 = j11 + eVar3.f7438j;
        int i12 = dVar2.f7416j + eVar3.f7439k;
        if (iVar2 != null) {
            b bVar2 = iVar2.f10033q;
            boolean z16 = bVar == bVar2 || (bVar != null && bVar2 != null && bVar.f7699a.equals(bVar2.f7699a) && bVar.f7705g == iVar2.f10033q.f7705g);
            boolean z17 = uri.equals(iVar2.f10029m) && iVar2.H;
            c5.h hVar3 = iVar2.f10041y;
            hVar2 = hVar3;
            yVar = iVar2.f10042z;
            jVar2 = (!z16 || !z17 || iVar2.J || iVar2.f10028l != i12) ? null : iVar2.C;
        } else {
            Uri uri2 = uri;
            hVar2 = new c5.h();
            yVar = new y(10);
            jVar2 = null;
        }
        return new i(hVar, i11, a10, jVar, z12, aVar2, bVar, z13, uri, list, i10, obj, j11, j12, eVar2.f10023b, eVar2.f10024c, !eVar2.f10025d, i12, eVar3.f7446r, z10, rVar.a(i12), eVar3.f7441m, jVar2, hVar2, yVar, z11);
    }

    private void k(a aVar, b bVar, boolean z10) {
        b bVar2;
        k4.f u10;
        long position;
        long j10;
        boolean z11 = false;
        if (z10) {
            if (this.E != 0) {
                z11 = true;
            }
            bVar2 = bVar;
        } else {
            bVar2 = bVar.e((long) this.E);
        }
        try {
            u10 = u(aVar, bVar2);
            if (z11) {
                u10.l(this.E);
            }
            do {
                if (this.G || !this.C.a(u10)) {
                    break;
                }
                break;
                break;
            } while (!this.C.a(u10));
            break;
            position = u10.getPosition();
            j10 = bVar.f7705g;
        } catch (EOFException e10) {
            if ((this.f9310d.f8089l & 16384) != 0) {
                this.C.b();
                position = u10.getPosition();
                j10 = bVar.f7705g;
            } else {
                throw e10;
            }
        } catch (Throwable th) {
            m0.n(aVar);
            throw th;
        }
        this.E = (int) (position - j10);
        m0.n(aVar);
    }

    private static byte[] l(String str) {
        if (c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, d dVar) {
        d.e eVar2 = eVar.f10022a;
        if (eVar2 instanceof d.b) {
            return ((d.b) eVar2).f7429s || (eVar.f10024c == 0 && dVar.f10239c);
        }
        return dVar.f10239c;
    }

    private void r() {
        try {
            this.f10037u.h(this.f10035s, this.f9313g);
            k(this.f9315i, this.f9308b, this.A);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    private void s() {
        if (this.F) {
            a6.a.e(this.f10032p);
            a6.a.e(this.f10033q);
            k(this.f10032p, this.f10033q, this.B);
            this.E = 0;
            this.F = false;
        }
    }

    private long t(k4.j jVar) {
        jVar.k();
        try {
            this.f10042z.K(10);
            jVar.o(this.f10042z.d(), 0, 10);
            if (this.f10042z.F() != 4801587) {
                return -9223372036854775807L;
            }
            this.f10042z.P(3);
            int B2 = this.f10042z.B();
            int i10 = B2 + 10;
            if (i10 > this.f10042z.b()) {
                byte[] d10 = this.f10042z.d();
                this.f10042z.K(i10);
                System.arraycopy(d10, 0, this.f10042z.d(), 0, 10);
            }
            jVar.o(this.f10042z.d(), 10, B2);
            x4.a e10 = this.f10041y.e(this.f10042z.d(), B2);
            if (e10 == null) {
                return -9223372036854775807L;
            }
            int e11 = e10.e();
            for (int i11 = 0; i11 < e11; i11++) {
                a.b d11 = e10.d(i11);
                if (d11 instanceof l) {
                    l lVar = (l) d11;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f5263i)) {
                        System.arraycopy(lVar.f5264j, 0, this.f10042z.d(), 0, 8);
                        this.f10042z.O(0);
                        this.f10042z.N(8);
                        return this.f10042z.v() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    private k4.f u(com.google.android.exoplayer2.upstream.a aVar, b bVar) {
        j jVar;
        long j10;
        b bVar2 = bVar;
        com.google.android.exoplayer2.upstream.a aVar2 = aVar;
        k4.f fVar = new k4.f(aVar2, bVar2.f7705g, aVar.h(bVar));
        if (this.C == null) {
            long t10 = t(fVar);
            fVar.k();
            j jVar2 = this.f10034r;
            if (jVar2 != null) {
                jVar = jVar2.f();
            } else {
                jVar = this.f10038v.a(bVar2.f7699a, this.f9310d, this.f10039w, this.f10037u, aVar.j(), fVar);
            }
            this.C = jVar;
            if (jVar.d()) {
                p pVar = this.D;
                if (t10 != -9223372036854775807L) {
                    j10 = this.f10037u.b(t10);
                } else {
                    j10 = this.f9313g;
                }
                pVar.m0(j10);
            } else {
                this.D.m0(0);
            }
            this.D.Y();
            this.C.c(this.D);
        }
        this.D.j0(this.f10040x);
        return fVar;
    }

    public static boolean w(i iVar, Uri uri, d dVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f10029m) && iVar.H) {
            return false;
        }
        long j11 = j10 + eVar.f10022a.f7440l;
        if (!p(eVar, dVar) || j11 < iVar.f9314h) {
            return true;
        }
        return false;
    }

    public void b() {
        j jVar;
        a6.a.e(this.D);
        if (this.C == null && (jVar = this.f10034r) != null && jVar.e()) {
            this.C = this.f10034r;
            this.F = false;
        }
        s();
        if (!this.G) {
            if (!this.f10036t) {
                r();
            }
            this.H = !this.G;
        }
    }

    public void c() {
        this.G = true;
    }

    public boolean h() {
        return this.H;
    }

    public int m(int i10) {
        a6.a.f(!this.f10030n);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return this.I.get(i10).intValue();
    }

    public void n(p pVar, x<Integer> xVar) {
        this.D = pVar;
        this.I = xVar;
    }

    public void o() {
        this.J = true;
    }

    public boolean q() {
        return this.K;
    }

    public void v() {
        this.K = true;
    }
}
