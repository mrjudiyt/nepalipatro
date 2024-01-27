package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.g;
import g5.s;
import j4.o;

/* compiled from: ProgressiveMediaSource */
public final class r extends a implements q.b {

    /* renamed from: g  reason: collision with root package name */
    private final j0 f7517g;

    /* renamed from: h  reason: collision with root package name */
    private final j0.g f7518h;

    /* renamed from: i  reason: collision with root package name */
    private final a.C0119a f7519i;

    /* renamed from: j  reason: collision with root package name */
    private final m.a f7520j;

    /* renamed from: k  reason: collision with root package name */
    private final j f7521k;

    /* renamed from: l  reason: collision with root package name */
    private final g f7522l;

    /* renamed from: m  reason: collision with root package name */
    private final int f7523m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7524n;

    /* renamed from: o  reason: collision with root package name */
    private long f7525o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7526p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7527q;

    /* renamed from: r  reason: collision with root package name */
    private z5.r f7528r;

    /* compiled from: ProgressiveMediaSource */
    class a extends f {
        a(r rVar, a1 a1Var) {
            super(a1Var);
        }

        public a1.b g(int i10, a1.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f6239f = true;
            return bVar;
        }

        public a1.c o(int i10, a1.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f6256l = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource */
    public static final class b implements g5.r {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0119a f7529a;

        /* renamed from: b  reason: collision with root package name */
        private m.a f7530b;

        /* renamed from: c  reason: collision with root package name */
        private o f7531c;

        /* renamed from: d  reason: collision with root package name */
        private g f7532d;

        /* renamed from: e  reason: collision with root package name */
        private int f7533e;

        /* renamed from: f  reason: collision with root package name */
        private String f7534f;

        /* renamed from: g  reason: collision with root package name */
        private Object f7535g;

        public b(a.C0119a aVar) {
            this(aVar, (k4.o) new k4.g());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ m c(k4.o oVar) {
            return new g5.a(oVar);
        }

        public r b(j0 j0Var) {
            a6.a.e(j0Var.f6744b);
            j0.g gVar = j0Var.f6744b;
            boolean z10 = true;
            boolean z11 = gVar.f6804h == null && this.f7535g != null;
            if (gVar.f6802f != null || this.f7534f == null) {
                z10 = false;
            }
            if (z11 && z10) {
                j0Var = j0Var.a().g(this.f7535g).b(this.f7534f).a();
            } else if (z11) {
                j0Var = j0Var.a().g(this.f7535g).a();
            } else if (z10) {
                j0Var = j0Var.a().b(this.f7534f).a();
            }
            j0 j0Var2 = j0Var;
            return new r(j0Var2, this.f7529a, this.f7530b, this.f7531c.a(j0Var2), this.f7532d, this.f7533e, (a) null);
        }

        public b(a.C0119a aVar, k4.o oVar) {
            this(aVar, (m.a) new s(oVar));
        }

        public b(a.C0119a aVar, m.a aVar2) {
            this.f7529a = aVar;
            this.f7530b = aVar2;
            this.f7531c = new com.google.android.exoplayer2.drm.g();
            this.f7532d = new f();
            this.f7533e = 1048576;
        }
    }

    /* synthetic */ r(j0 j0Var, a.C0119a aVar, m.a aVar2, j jVar, g gVar, int i10, a aVar3) {
        this(j0Var, aVar, aVar2, jVar, gVar, i10);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.exoplayer2.source.r$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B() {
        /*
            r9 = this;
            g5.u r8 = new g5.u
            long r1 = r9.f7525o
            boolean r3 = r9.f7526p
            boolean r5 = r9.f7527q
            com.google.android.exoplayer2.j0 r7 = r9.f7517g
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f7524n
            if (r0 == 0) goto L_0x001a
            com.google.android.exoplayer2.source.r$a r0 = new com.google.android.exoplayer2.source.r$a
            r0.<init>(r9, r8)
            r8 = r0
        L_0x001a:
            r9.z(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.r.B():void");
    }

    /* access modifiers changed from: protected */
    public void A() {
        this.f7521k.release();
    }

    public void f(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f7525o;
        }
        if (this.f7524n || this.f7525o != j10 || this.f7526p != z10 || this.f7527q != z11) {
            this.f7525o = j10;
            this.f7526p = z10;
            this.f7527q = z11;
            this.f7524n = false;
            B();
        }
    }

    public j0 g() {
        return this.f7517g;
    }

    public j h(k.a aVar, z5.b bVar, long j10) {
        com.google.android.exoplayer2.upstream.a a10 = this.f7519i.a();
        z5.r rVar = this.f7528r;
        if (rVar != null) {
            a10.c(rVar);
        }
        return new q(this.f7518h.f6797a, a10, this.f7520j.a(), this.f7521k, r(aVar), this.f7522l, t(aVar), this, bVar, this.f7518h.f6802f, this.f7523m);
    }

    public void l() {
    }

    public void n(j jVar) {
        ((q) jVar).c0();
    }

    /* access modifiers changed from: protected */
    public void y(z5.r rVar) {
        this.f7528r = rVar;
        this.f7521k.c();
        B();
    }

    private r(j0 j0Var, a.C0119a aVar, m.a aVar2, j jVar, g gVar, int i10) {
        this.f7518h = (j0.g) a6.a.e(j0Var.f6744b);
        this.f7517g = j0Var;
        this.f7519i = aVar;
        this.f7520j = aVar2;
        this.f7521k = jVar;
        this.f7522l = gVar;
        this.f7523m = i10;
        this.f7524n = true;
        this.f7525o = -9223372036854775807L;
    }
}
