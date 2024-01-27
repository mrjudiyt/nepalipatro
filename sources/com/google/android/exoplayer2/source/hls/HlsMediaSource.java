package com.google.android.exoplayer2.source.hls;

import a6.m0;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.f;
import e4.i;
import f5.c;
import g5.d;
import g5.u;
import j4.o;
import java.util.Collections;
import java.util.List;
import l5.g;
import l5.h;
import m5.e;
import z5.b;
import z5.r;

public final class HlsMediaSource extends com.google.android.exoplayer2.source.a implements HlsPlaylistTracker.c {

    /* renamed from: g  reason: collision with root package name */
    private final h f7297g;

    /* renamed from: h  reason: collision with root package name */
    private final j0.g f7298h;

    /* renamed from: i  reason: collision with root package name */
    private final g f7299i;

    /* renamed from: j  reason: collision with root package name */
    private final d f7300j;

    /* renamed from: k  reason: collision with root package name */
    private final j f7301k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f7302l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f7303m;

    /* renamed from: n  reason: collision with root package name */
    private final int f7304n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f7305o;

    /* renamed from: p  reason: collision with root package name */
    private final HlsPlaylistTracker f7306p;

    /* renamed from: q  reason: collision with root package name */
    private final long f7307q;

    /* renamed from: r  reason: collision with root package name */
    private final j0 f7308r;

    /* renamed from: s  reason: collision with root package name */
    private j0.f f7309s;

    /* renamed from: t  reason: collision with root package name */
    private r f7310t;

    public static final class Factory implements g5.r {

        /* renamed from: a  reason: collision with root package name */
        private final g f7311a;

        /* renamed from: b  reason: collision with root package name */
        private h f7312b;

        /* renamed from: c  reason: collision with root package name */
        private e f7313c;

        /* renamed from: d  reason: collision with root package name */
        private HlsPlaylistTracker.a f7314d;

        /* renamed from: e  reason: collision with root package name */
        private d f7315e;

        /* renamed from: f  reason: collision with root package name */
        private o f7316f;

        /* renamed from: g  reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g f7317g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f7318h;

        /* renamed from: i  reason: collision with root package name */
        private int f7319i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f7320j;

        /* renamed from: k  reason: collision with root package name */
        private List<c> f7321k;

        /* renamed from: l  reason: collision with root package name */
        private Object f7322l;

        /* renamed from: m  reason: collision with root package name */
        private long f7323m;

        public Factory(a.C0119a aVar) {
            this((g) new l5.c(aVar));
        }

        public HlsMediaSource a(j0 j0Var) {
            List<c> list;
            j0 j0Var2 = j0Var;
            a6.a.e(j0Var2.f6744b);
            e eVar = this.f7313c;
            if (j0Var2.f6744b.f6801e.isEmpty()) {
                list = this.f7321k;
            } else {
                list = j0Var2.f6744b.f6801e;
            }
            if (!list.isEmpty()) {
                eVar = new m5.c(eVar, list);
            }
            j0.g gVar = j0Var2.f6744b;
            boolean z10 = true;
            boolean z11 = gVar.f6804h == null && this.f7322l != null;
            if (!gVar.f6801e.isEmpty() || list.isEmpty()) {
                z10 = false;
            }
            if (z11 && z10) {
                j0Var2 = j0Var.a().g(this.f7322l).f(list).a();
            } else if (z11) {
                j0Var2 = j0Var.a().g(this.f7322l).a();
            } else if (z10) {
                j0Var2 = j0Var.a().f(list).a();
            }
            j0 j0Var3 = j0Var2;
            g gVar2 = this.f7311a;
            h hVar = this.f7312b;
            d dVar = this.f7315e;
            j a10 = this.f7316f.a(j0Var3);
            com.google.android.exoplayer2.upstream.g gVar3 = this.f7317g;
            return new HlsMediaSource(j0Var3, gVar2, hVar, dVar, a10, gVar3, this.f7314d.a(this.f7311a, gVar3, eVar), this.f7323m, this.f7318h, this.f7319i, this.f7320j);
        }

        public Factory(g gVar) {
            this.f7311a = (g) a6.a.e(gVar);
            this.f7316f = new com.google.android.exoplayer2.drm.g();
            this.f7313c = new m5.a();
            this.f7314d = com.google.android.exoplayer2.source.hls.playlist.a.f7359w;
            this.f7312b = h.f10026a;
            this.f7317g = new f();
            this.f7315e = new g5.f();
            this.f7319i = 1;
            this.f7321k = Collections.emptyList();
            this.f7323m = -9223372036854775807L;
        }
    }

    static {
        i.a("goog.exo.hls");
    }

    private u B(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10, long j11, a aVar) {
        long j12;
        com.google.android.exoplayer2.source.hls.playlist.d dVar2 = dVar;
        long d10 = dVar2.f7414h - this.f7306p.d();
        long j13 = dVar2.f7421o ? d10 + dVar2.f7427u : -9223372036854775807L;
        long F = F(dVar);
        long j14 = this.f7309s.f6792a;
        if (j14 != -9223372036854775807L) {
            j12 = e4.c.d(j14);
        } else {
            j12 = H(dVar2, F);
        }
        I(m0.s(j12, F, dVar2.f7427u + F));
        return new u(j10, j11, -9223372036854775807L, j13, dVar2.f7427u, d10, G(dVar2, F), true, !dVar2.f7421o, dVar2.f7410d == 2 && dVar2.f7412f, aVar, this.f7308r, this.f7309s);
    }

    private u C(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10, long j11, a aVar) {
        long j12;
        com.google.android.exoplayer2.source.hls.playlist.d dVar2 = dVar;
        if (dVar2.f7411e == -9223372036854775807L || dVar2.f7424r.isEmpty()) {
            j12 = 0;
        } else {
            if (!dVar2.f7413g) {
                long j13 = dVar2.f7411e;
                if (j13 != dVar2.f7427u) {
                    j12 = E(dVar2.f7424r, j13).f7440l;
                }
            }
            j12 = dVar2.f7411e;
        }
        long j14 = dVar2.f7427u;
        return new u(j10, j11, -9223372036854775807L, j14, j14, 0, j12, true, false, true, aVar, this.f7308r, (j0.f) null);
    }

    private static d.b D(List<d.b> list, long j10) {
        d.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d.b bVar2 = list.get(i10);
            long j11 = bVar2.f7440l;
            if (j11 <= j10 && bVar2.f7429s) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static d.C0117d E(List<d.C0117d> list, long j10) {
        return list.get(m0.g(list, Long.valueOf(j10), true, true));
    }

    private long F(com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        if (dVar.f7422p) {
            return e4.c.d(m0.V(this.f7307q)) - dVar.e();
        }
        return 0;
    }

    private long G(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10) {
        long j11 = dVar.f7411e;
        if (j11 == -9223372036854775807L) {
            j11 = (dVar.f7427u + j10) - e4.c.d(this.f7309s.f6792a);
        }
        if (dVar.f7413g) {
            return j11;
        }
        d.b D = D(dVar.f7425s, j11);
        if (D != null) {
            return D.f7440l;
        }
        if (dVar.f7424r.isEmpty()) {
            return 0;
        }
        d.C0117d E = E(dVar.f7424r, j11);
        d.b D2 = D(E.f7435t, j11);
        if (D2 != null) {
            return D2.f7440l;
        }
        return E.f7440l;
    }

    private static long H(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10) {
        long j11;
        d.f fVar = dVar.f7428v;
        long j12 = dVar.f7411e;
        if (j12 != -9223372036854775807L) {
            j11 = dVar.f7427u - j12;
        } else {
            long j13 = fVar.f7450d;
            if (j13 == -9223372036854775807L || dVar.f7420n == -9223372036854775807L) {
                long j14 = fVar.f7449c;
                if (j14 != -9223372036854775807L) {
                    j11 = j14;
                } else {
                    j11 = dVar.f7419m * 3;
                }
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    private void I(long j10) {
        long e10 = e4.c.e(j10);
        if (e10 != this.f7309s.f6792a) {
            this.f7309s = this.f7308r.a().c(e10).a().f6745c;
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        this.f7306p.stop();
        this.f7301k.release();
    }

    public void b(com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        u uVar;
        long e10 = dVar.f7422p ? e4.c.e(dVar.f7414h) : -9223372036854775807L;
        int i10 = dVar.f7410d;
        long j10 = (i10 == 2 || i10 == 1) ? e10 : -9223372036854775807L;
        a aVar = new a((com.google.android.exoplayer2.source.hls.playlist.c) a6.a.e(this.f7306p.g()), dVar);
        if (this.f7306p.e()) {
            uVar = B(dVar, j10, e10, aVar);
        } else {
            uVar = C(dVar, j10, e10, aVar);
        }
        z(uVar);
    }

    public j0 g() {
        return this.f7308r;
    }

    public com.google.android.exoplayer2.source.j h(k.a aVar, b bVar, long j10) {
        l.a t10 = t(aVar);
        return new l5.k(this.f7297g, this.f7306p, this.f7299i, this.f7310t, this.f7301k, r(aVar), this.f7302l, t10, bVar, this.f7300j, this.f7303m, this.f7304n, this.f7305o);
    }

    public void l() {
        this.f7306p.i();
    }

    public void n(com.google.android.exoplayer2.source.j jVar) {
        ((l5.k) jVar).A();
    }

    /* access modifiers changed from: protected */
    public void y(r rVar) {
        this.f7310t = rVar;
        this.f7301k.c();
        this.f7306p.h(this.f7298h.f6797a, t((k.a) null), this);
    }

    private HlsMediaSource(j0 j0Var, g gVar, h hVar, g5.d dVar, j jVar, com.google.android.exoplayer2.upstream.g gVar2, HlsPlaylistTracker hlsPlaylistTracker, long j10, boolean z10, int i10, boolean z11) {
        this.f7298h = (j0.g) a6.a.e(j0Var.f6744b);
        this.f7308r = j0Var;
        this.f7309s = j0Var.f6745c;
        this.f7299i = gVar;
        this.f7297g = hVar;
        this.f7300j = dVar;
        this.f7301k = jVar;
        this.f7302l = gVar2;
        this.f7306p = hlsPlaylistTracker;
        this.f7307q = j10;
        this.f7303m = z10;
        this.f7304n = i10;
        this.f7305o = z11;
    }
}
