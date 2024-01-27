package com.google.android.exoplayer2.source.hls.playlist;

import a6.m0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.f0;
import g5.i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l5.g;
import m5.d;
import m5.e;

/* compiled from: DefaultHlsPlaylistTracker */
public final class a implements HlsPlaylistTracker, Loader.b<h<d>> {

    /* renamed from: w  reason: collision with root package name */
    public static final HlsPlaylistTracker.a f7359w = m5.b.f15722a;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final g f7360h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final e f7361i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.g f7362j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<Uri, c> f7363k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.b> f7364l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final double f7365m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public l.a f7366n;

    /* renamed from: o  reason: collision with root package name */
    private Loader f7367o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public Handler f7368p;

    /* renamed from: q  reason: collision with root package name */
    private HlsPlaylistTracker.c f7369q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public c f7370r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public Uri f7371s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public d f7372t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7373u;

    /* renamed from: v  reason: collision with root package name */
    private long f7374v;

    /* compiled from: DefaultHlsPlaylistTracker */
    private class b implements HlsPlaylistTracker.b {
        private b() {
        }

        public void a() {
            a.this.f7364l.remove(this);
        }

        public boolean e(Uri uri, g.c cVar, boolean z10) {
            c cVar2;
            if (a.this.f7372t == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<c.b> list = ((c) m0.j(a.this.f7370r)).f7391e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    c cVar3 = (c) a.this.f7363k.get(list.get(i11).f7404a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f7383o) {
                        i10++;
                    }
                }
                g.b b10 = a.this.f7362j.b(new g.a(1, 0, a.this.f7370r.f7391e.size(), i10), cVar);
                if (!(b10 == null || b10.f7762a != 2 || (cVar2 = (c) a.this.f7363k.get(uri)) == null)) {
                    boolean unused = cVar2.h(b10.f7763b);
                }
            }
            return false;
        }
    }

    /* compiled from: DefaultHlsPlaylistTracker */
    private final class c implements Loader.b<h<d>> {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final Uri f7376h;

        /* renamed from: i  reason: collision with root package name */
        private final Loader f7377i = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: j  reason: collision with root package name */
        private final com.google.android.exoplayer2.upstream.a f7378j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public d f7379k;

        /* renamed from: l  reason: collision with root package name */
        private long f7380l;

        /* renamed from: m  reason: collision with root package name */
        private long f7381m;

        /* renamed from: n  reason: collision with root package name */
        private long f7382n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public long f7383o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f7384p;

        /* renamed from: q  reason: collision with root package name */
        private IOException f7385q;

        public c(Uri uri) {
            this.f7376h = uri;
            this.f7378j = a.this.f7360h.a(4);
        }

        /* access modifiers changed from: private */
        public boolean h(long j10) {
            this.f7383o = SystemClock.elapsedRealtime() + j10;
            return this.f7376h.equals(a.this.f7371s) && !a.this.L();
        }

        private Uri i() {
            d dVar = this.f7379k;
            if (dVar != null) {
                d.f fVar = dVar.f7428v;
                if (fVar.f7447a != -9223372036854775807L || fVar.f7451e) {
                    Uri.Builder buildUpon = this.f7376h.buildUpon();
                    d dVar2 = this.f7379k;
                    if (dVar2.f7428v.f7451e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar2.f7417k + ((long) dVar2.f7424r.size())));
                        d dVar3 = this.f7379k;
                        if (dVar3.f7420n != -9223372036854775807L) {
                            List<d.b> list = dVar3.f7425s;
                            int size = list.size();
                            if (!list.isEmpty() && ((d.b) f0.c(list)).f7430t) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    d.f fVar2 = this.f7379k.f7428v;
                    if (fVar2.f7447a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f7448b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f7376h;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(Uri uri) {
            this.f7384p = false;
            p(uri);
        }

        private void p(Uri uri) {
            h hVar = new h(this.f7378j, uri, 4, a.this.f7361i.a(a.this.f7370r, this.f7379k));
            a.this.f7366n.z(new g5.h(hVar.f7768a, hVar.f7769b, this.f7377i.n(hVar, this, a.this.f7362j.d(hVar.f7770c))), hVar.f7770c);
        }

        /* access modifiers changed from: private */
        public void q(Uri uri) {
            this.f7383o = 0;
            if (!this.f7384p && !this.f7377i.j() && !this.f7377i.i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f7382n) {
                    this.f7384p = true;
                    a.this.f7368p.postDelayed(new b(this, uri), this.f7382n - elapsedRealtime);
                    return;
                }
                p(uri);
            }
        }

        /* access modifiers changed from: private */
        public void w(d dVar, g5.h hVar) {
            boolean z10;
            d dVar2 = this.f7379k;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f7380l = elapsedRealtime;
            d t10 = a.this.G(dVar2, dVar);
            this.f7379k = t10;
            boolean z11 = false;
            IOException iOException = null;
            if (t10 != dVar2) {
                this.f7385q = null;
                this.f7381m = elapsedRealtime;
                a.this.R(this.f7376h, t10);
            } else if (!t10.f7421o) {
                d dVar3 = this.f7379k;
                if (dVar.f7417k + ((long) dVar.f7424r.size()) < dVar3.f7417k) {
                    iOException = new HlsPlaylistTracker.PlaylistResetException(this.f7376h);
                    z10 = true;
                } else {
                    if (((double) (elapsedRealtime - this.f7381m)) > ((double) e4.c.e(dVar3.f7419m)) * a.this.f7365m) {
                        iOException = new HlsPlaylistTracker.PlaylistStuckException(this.f7376h);
                    }
                    z10 = false;
                }
                if (iOException != null) {
                    this.f7385q = iOException;
                    boolean unused = a.this.N(this.f7376h, new g.c(hVar, new i(4), iOException, 1), z10);
                }
            }
            long j10 = 0;
            d dVar4 = this.f7379k;
            if (!dVar4.f7428v.f7451e) {
                if (dVar4 != dVar2) {
                    j10 = dVar4.f7419m;
                } else {
                    j10 = dVar4.f7419m / 2;
                }
            }
            this.f7382n = elapsedRealtime + e4.c.e(j10);
            if (this.f7379k.f7420n != -9223372036854775807L || this.f7376h.equals(a.this.f7371s)) {
                z11 = true;
            }
            if (z11 && !this.f7379k.f7421o) {
                q(i());
            }
        }

        public d j() {
            return this.f7379k;
        }

        public boolean m() {
            int i10;
            if (this.f7379k == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, e4.c.e(this.f7379k.f7427u));
            d dVar = this.f7379k;
            if (dVar.f7421o || (i10 = dVar.f7410d) == 2 || i10 == 1 || this.f7380l + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        public void o() {
            q(this.f7376h);
        }

        public void r() {
            this.f7377i.a();
            IOException iOException = this.f7385q;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: t */
        public void k(h<m5.d> hVar, long j10, long j11, boolean z10) {
            h<m5.d> hVar2 = hVar;
            g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
            a.this.f7362j.c(hVar2.f7768a);
            a.this.f7366n.q(hVar3, 4);
        }

        /* renamed from: u */
        public void l(h<m5.d> hVar, long j10, long j11) {
            h<m5.d> hVar2 = hVar;
            m5.d e10 = hVar.e();
            g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
            if (e10 instanceof d) {
                w((d) e10, hVar3);
                a.this.f7366n.t(hVar3, 4);
            } else {
                this.f7385q = ParserException.c("Loaded playlist has unexpected type.", (Throwable) null);
                a.this.f7366n.x(hVar3, 4, this.f7385q, true);
            }
            a.this.f7362j.c(hVar2.f7768a);
        }

        /* renamed from: v */
        public Loader.c s(h<m5.d> hVar, long j10, long j11, IOException iOException, int i10) {
            Loader.c cVar;
            h<m5.d> hVar2 = hVar;
            IOException iOException2 = iOException;
            g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
            boolean z10 = iOException2 instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((hVar.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (iOException2 instanceof HttpDataSource.InvalidResponseCodeException) {
                    i11 = ((HttpDataSource.InvalidResponseCodeException) iOException2).f7656k;
                }
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f7382n = SystemClock.elapsedRealtime();
                    o();
                    ((l.a) m0.j(a.this.f7366n)).x(hVar3, hVar2.f7770c, iOException2, true);
                    return Loader.f7664f;
                }
            }
            g.c cVar2 = new g.c(hVar3, new i(hVar2.f7770c), iOException2, i10);
            if (a.this.N(this.f7376h, cVar2, false)) {
                long a10 = a.this.f7362j.a(cVar2);
                if (a10 != -9223372036854775807L) {
                    cVar = Loader.h(false, a10);
                } else {
                    cVar = Loader.f7665g;
                }
            } else {
                cVar = Loader.f7664f;
            }
            boolean c10 = true ^ cVar.c();
            a.this.f7366n.x(hVar3, hVar2.f7770c, iOException2, c10);
            if (c10) {
                a.this.f7362j.c(hVar2.f7768a);
            }
            return cVar;
        }

        public void x() {
            this.f7377i.l();
        }
    }

    public a(l5.g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar) {
        this(gVar, gVar2, eVar, 3.5d);
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f7363k.put(uri, new c(uri));
        }
    }

    private static d.C0117d F(d dVar, d dVar2) {
        int i10 = (int) (dVar2.f7417k - dVar.f7417k);
        List<d.C0117d> list = dVar.f7424r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public d G(d dVar, d dVar2) {
        if (!dVar2.f(dVar)) {
            return dVar2.f7421o ? dVar.d() : dVar;
        }
        return dVar2.c(I(dVar, dVar2), H(dVar, dVar2));
    }

    private int H(d dVar, d dVar2) {
        d.C0117d F;
        if (dVar2.f7415i) {
            return dVar2.f7416j;
        }
        d dVar3 = this.f7372t;
        int i10 = dVar3 != null ? dVar3.f7416j : 0;
        return (dVar == null || (F = F(dVar, dVar2)) == null) ? i10 : (dVar.f7416j + F.f7439k) - dVar2.f7424r.get(0).f7439k;
    }

    private long I(d dVar, d dVar2) {
        if (dVar2.f7422p) {
            return dVar2.f7414h;
        }
        d dVar3 = this.f7372t;
        long j10 = dVar3 != null ? dVar3.f7414h : 0;
        if (dVar == null) {
            return j10;
        }
        int size = dVar.f7424r.size();
        d.C0117d F = F(dVar, dVar2);
        if (F != null) {
            return dVar.f7414h + F.f7440l;
        }
        return ((long) size) == dVar2.f7417k - dVar.f7417k ? dVar.e() : j10;
    }

    private Uri J(Uri uri) {
        d.c cVar;
        d dVar = this.f7372t;
        if (dVar == null || !dVar.f7428v.f7451e || (cVar = dVar.f7426t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f7432b));
        int i10 = cVar.f7433c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<c.b> list = this.f7370r.f7391e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f7404a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean L() {
        List<c.b> list = this.f7370r.f7391e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) a6.a.e(this.f7363k.get(list.get(i10).f7404a));
            if (elapsedRealtime > cVar.f7383o) {
                Uri e10 = cVar.f7376h;
                this.f7371s = e10;
                cVar.q(J(e10));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (!uri.equals(this.f7371s) && K(uri)) {
            d dVar = this.f7372t;
            if (dVar == null || !dVar.f7421o) {
                this.f7371s = uri;
                c cVar = this.f7363k.get(uri);
                d g10 = cVar.f7379k;
                if (g10 == null || !g10.f7421o) {
                    cVar.q(J(uri));
                    return;
                }
                this.f7372t = g10;
                this.f7369q.b(g10);
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean N(Uri uri, g.c cVar, boolean z10) {
        Iterator<HlsPlaylistTracker.b> it = this.f7364l.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().e(uri, cVar, z10);
        }
        return z11;
    }

    /* access modifiers changed from: private */
    public void R(Uri uri, d dVar) {
        if (uri.equals(this.f7371s)) {
            if (this.f7372t == null) {
                this.f7373u = !dVar.f7421o;
                this.f7374v = dVar.f7414h;
            }
            this.f7372t = dVar;
            this.f7369q.b(dVar);
        }
        Iterator<HlsPlaylistTracker.b> it = this.f7364l.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* renamed from: O */
    public void k(h<m5.d> hVar, long j10, long j11, boolean z10) {
        h<m5.d> hVar2 = hVar;
        g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        this.f7362j.c(hVar2.f7768a);
        this.f7366n.q(hVar3, 4);
    }

    /* renamed from: P */
    public void l(h<m5.d> hVar, long j10, long j11) {
        c cVar;
        h<m5.d> hVar2 = hVar;
        m5.d e10 = hVar.e();
        boolean z10 = e10 instanceof d;
        if (z10) {
            cVar = c.e(e10.f10237a);
        } else {
            cVar = (c) e10;
        }
        this.f7370r = cVar;
        this.f7371s = cVar.f7391e.get(0).f7404a;
        this.f7364l.add(new b());
        E(cVar.f7390d);
        g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        c cVar2 = this.f7363k.get(this.f7371s);
        if (z10) {
            cVar2.w((d) e10, hVar3);
        } else {
            cVar2.o();
        }
        this.f7362j.c(hVar2.f7768a);
        this.f7366n.t(hVar3, 4);
    }

    /* renamed from: Q */
    public Loader.c s(h<m5.d> hVar, long j10, long j11, IOException iOException, int i10) {
        h<m5.d> hVar2 = hVar;
        IOException iOException2 = iOException;
        g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        long a10 = this.f7362j.a(new g.c(hVar3, new i(hVar2.f7770c), iOException2, i10));
        boolean z10 = a10 == -9223372036854775807L;
        this.f7366n.x(hVar3, hVar2.f7770c, iOException2, z10);
        if (z10) {
            this.f7362j.c(hVar2.f7768a);
        }
        if (z10) {
            return Loader.f7665g;
        }
        return Loader.h(false, a10);
    }

    public boolean a(Uri uri) {
        return this.f7363k.get(uri).m();
    }

    public void b(HlsPlaylistTracker.b bVar) {
        this.f7364l.remove(bVar);
    }

    public void c(Uri uri) {
        this.f7363k.get(uri).r();
    }

    public long d() {
        return this.f7374v;
    }

    public boolean e() {
        return this.f7373u;
    }

    public boolean f(Uri uri, long j10) {
        c cVar = this.f7363k.get(uri);
        if (cVar != null) {
            return !cVar.h(j10);
        }
        return false;
    }

    public c g() {
        return this.f7370r;
    }

    public void h(Uri uri, l.a aVar, HlsPlaylistTracker.c cVar) {
        this.f7368p = m0.x();
        this.f7366n = aVar;
        this.f7369q = cVar;
        h hVar = new h(this.f7360h.a(4), uri, 4, this.f7361i.b());
        a6.a.f(this.f7367o == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f7367o = loader;
        aVar.z(new g5.h(hVar.f7768a, hVar.f7769b, loader.n(hVar, this, this.f7362j.d(hVar.f7770c))), hVar.f7770c);
    }

    public void i() {
        Loader loader = this.f7367o;
        if (loader != null) {
            loader.a();
        }
        Uri uri = this.f7371s;
        if (uri != null) {
            c(uri);
        }
    }

    public void j(Uri uri) {
        this.f7363k.get(uri).o();
    }

    public void m(HlsPlaylistTracker.b bVar) {
        a6.a.e(bVar);
        this.f7364l.add(bVar);
    }

    public d n(Uri uri, boolean z10) {
        d j10 = this.f7363k.get(uri).j();
        if (j10 != null && z10) {
            M(uri);
        }
        return j10;
    }

    public void stop() {
        this.f7371s = null;
        this.f7372t = null;
        this.f7370r = null;
        this.f7374v = -9223372036854775807L;
        this.f7367o.l();
        this.f7367o = null;
        for (c x10 : this.f7363k.values()) {
            x10.x();
        }
        this.f7368p.removeCallbacksAndMessages((Object) null);
        this.f7368p = null;
        this.f7363k.clear();
    }

    public a(l5.g gVar, com.google.android.exoplayer2.upstream.g gVar2, e eVar, double d10) {
        this.f7360h = gVar;
        this.f7361i = eVar;
        this.f7362j = gVar2;
        this.f7365m = d10;
        this.f7364l = new CopyOnWriteArrayList<>();
        this.f7363k = new HashMap<>();
        this.f7374v = -9223372036854775807L;
    }
}
