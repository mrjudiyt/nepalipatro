package com.google.android.exoplayer2.source;

import a6.m0;
import android.os.Handler;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import g5.h;
import j4.e;
import java.io.IOException;
import java.util.HashMap;
import z5.r;

/* compiled from: CompositeMediaSource */
public abstract class c<T> extends a {

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<T, b<T>> f7111g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private Handler f7112h;

    /* renamed from: i  reason: collision with root package name */
    private r f7113i;

    /* compiled from: CompositeMediaSource */
    private final class a implements l, i {

        /* renamed from: h  reason: collision with root package name */
        private final T f7114h;

        /* renamed from: i  reason: collision with root package name */
        private l.a f7115i;

        /* renamed from: j  reason: collision with root package name */
        private i.a f7116j;

        public a(T t10) {
            this.f7115i = c.this.t((k.a) null);
            this.f7116j = c.this.r((k.a) null);
            this.f7114h = t10;
        }

        private boolean a(int i10, k.a aVar) {
            k.a aVar2;
            if (aVar != null) {
                aVar2 = c.this.E(this.f7114h, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int G = c.this.G(this.f7114h, i10);
            l.a aVar3 = this.f7115i;
            if (aVar3.f7465a != G || !m0.c(aVar3.f7466b, aVar2)) {
                this.f7115i = c.this.s(G, aVar2, 0);
            }
            i.a aVar4 = this.f7116j;
            if (aVar4.f6574a == G && m0.c(aVar4.f6575b, aVar2)) {
                return true;
            }
            this.f7116j = c.this.q(G, aVar2);
            return true;
        }

        private g5.i b(g5.i iVar) {
            long F = c.this.F(this.f7114h, iVar.f8898f);
            long F2 = c.this.F(this.f7114h, iVar.f8899g);
            if (F == iVar.f8898f && F2 == iVar.f8899g) {
                return iVar;
            }
            return new g5.i(iVar.f8893a, iVar.f8894b, iVar.f8895c, iVar.f8896d, iVar.f8897e, F, F2);
        }

        public void P(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7116j.i();
            }
        }

        public /* synthetic */ void W(int i10, k.a aVar) {
            e.a(this, i10, aVar);
        }

        public void Z(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7116j.h();
            }
        }

        public void d0(int i10, k.a aVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7115i.E(b(iVar));
            }
        }

        public void g0(int i10, k.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f7116j.k(i11);
            }
        }

        public void h0(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7116j.m();
            }
        }

        public void k0(int i10, k.a aVar, h hVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7115i.v(hVar, b(iVar));
            }
        }

        public void l(int i10, k.a aVar, h hVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7115i.s(hVar, b(iVar));
            }
        }

        public void l0(int i10, k.a aVar, h hVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7115i.B(hVar, b(iVar));
            }
        }

        public void n(int i10, k.a aVar, h hVar, g5.i iVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f7115i.y(hVar, b(iVar), iOException, z10);
            }
        }

        public void n0(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7116j.j();
            }
        }

        public void u(int i10, k.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f7116j.l(exc);
            }
        }

        public void z(int i10, k.a aVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7115i.j(b(iVar));
            }
        }
    }

    /* compiled from: CompositeMediaSource */
    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final k f7118a;

        /* renamed from: b  reason: collision with root package name */
        public final k.b f7119b;

        /* renamed from: c  reason: collision with root package name */
        public final c<T>.a f7120c;

        public b(k kVar, k.b bVar, c<T>.a aVar) {
            this.f7118a = kVar;
            this.f7119b = bVar;
            this.f7120c = aVar;
        }
    }

    protected c() {
    }

    /* access modifiers changed from: protected */
    public void A() {
        for (b next : this.f7111g.values()) {
            next.f7118a.a(next.f7119b);
            next.f7118a.d(next.f7120c);
            next.f7118a.k(next.f7120c);
        }
        this.f7111g.clear();
    }

    /* access modifiers changed from: protected */
    public final void C(T t10) {
        b bVar = (b) a6.a.e(this.f7111g.get(t10));
        bVar.f7118a.e(bVar.f7119b);
    }

    /* access modifiers changed from: protected */
    public final void D(T t10) {
        b bVar = (b) a6.a.e(this.f7111g.get(t10));
        bVar.f7118a.p(bVar.f7119b);
    }

    /* access modifiers changed from: protected */
    public k.a E(T t10, k.a aVar) {
        return aVar;
    }

    /* access modifiers changed from: protected */
    public long F(T t10, long j10) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public int G(T t10, int i10) {
        return i10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void H(T t10, k kVar, a1 a1Var);

    /* access modifiers changed from: protected */
    public final void J(T t10, k kVar) {
        a6.a.a(!this.f7111g.containsKey(t10));
        g5.b bVar = new g5.b(this, t10);
        a aVar = new a(t10);
        this.f7111g.put(t10, new b(kVar, bVar, aVar));
        kVar.c((Handler) a6.a.e(this.f7112h), aVar);
        kVar.j((Handler) a6.a.e(this.f7112h), aVar);
        kVar.i(bVar, this.f7113i);
        if (!x()) {
            kVar.e(bVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void K(T t10) {
        b bVar = (b) a6.a.e(this.f7111g.remove(t10));
        bVar.f7118a.a(bVar.f7119b);
        bVar.f7118a.d(bVar.f7120c);
        bVar.f7118a.k(bVar.f7120c);
    }

    public void l() {
        for (b<T> bVar : this.f7111g.values()) {
            bVar.f7118a.l();
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        for (b next : this.f7111g.values()) {
            next.f7118a.e(next.f7119b);
        }
    }

    /* access modifiers changed from: protected */
    public void w() {
        for (b next : this.f7111g.values()) {
            next.f7118a.p(next.f7119b);
        }
    }

    /* access modifiers changed from: protected */
    public void y(r rVar) {
        this.f7113i = rVar;
        this.f7112h = m0.x();
    }
}
