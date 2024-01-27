package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.e;
import b3.a;
import com.bumptech.glide.f;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import e2.g;
import e2.k;
import j2.a;
import j2.h;
import java.util.Map;
import java.util.concurrent.Executor;
import w2.i;

/* compiled from: Engine */
public class j implements l, h.a, o.a {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f5743i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    private final p f5744a;

    /* renamed from: b  reason: collision with root package name */
    private final n f5745b;

    /* renamed from: c  reason: collision with root package name */
    private final h f5746c;

    /* renamed from: d  reason: collision with root package name */
    private final b f5747d;

    /* renamed from: e  reason: collision with root package name */
    private final u f5748e;

    /* renamed from: f  reason: collision with root package name */
    private final c f5749f;

    /* renamed from: g  reason: collision with root package name */
    private final a f5750g;

    /* renamed from: h  reason: collision with root package name */
    private final a f5751h;

    /* compiled from: Engine */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final h.e f5752a;

        /* renamed from: b  reason: collision with root package name */
        final e<h<?>> f5753b = b3.a.d(150, new C0108a());

        /* renamed from: c  reason: collision with root package name */
        private int f5754c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a  reason: collision with other inner class name */
        /* compiled from: Engine */
        class C0108a implements a.d<h<?>> {
            C0108a() {
            }

            /* renamed from: b */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f5752a, aVar.f5753b);
            }
        }

        a(h.e eVar) {
            this.f5752a = eVar;
        }

        /* access modifiers changed from: package-private */
        public <R> h<R> a(com.bumptech.glide.d dVar, Object obj, m mVar, e2.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, f fVar, h2.a aVar, Map<Class<?>, k<?>> map, boolean z10, boolean z11, boolean z12, g gVar, h.b<R> bVar) {
            h hVar = (h) a3.j.d(this.f5753b.b());
            int i12 = this.f5754c;
            int i13 = i12;
            this.f5754c = i12 + 1;
            return hVar.s(dVar, obj, mVar, eVar, i10, i11, cls, cls2, fVar, aVar, map, z10, z11, z12, gVar, bVar, i13);
        }
    }

    /* compiled from: Engine */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final k2.a f5756a;

        /* renamed from: b  reason: collision with root package name */
        final k2.a f5757b;

        /* renamed from: c  reason: collision with root package name */
        final k2.a f5758c;

        /* renamed from: d  reason: collision with root package name */
        final k2.a f5759d;

        /* renamed from: e  reason: collision with root package name */
        final l f5760e;

        /* renamed from: f  reason: collision with root package name */
        final o.a f5761f;

        /* renamed from: g  reason: collision with root package name */
        final e<k<?>> f5762g = b3.a.d(150, new a());

        /* compiled from: Engine */
        class a implements a.d<k<?>> {
            a() {
            }

            /* renamed from: b */
            public k<?> a() {
                b bVar = b.this;
                return new k(bVar.f5756a, bVar.f5757b, bVar.f5758c, bVar.f5759d, bVar.f5760e, bVar.f5761f, bVar.f5762g);
            }
        }

        b(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, l lVar, o.a aVar5) {
            this.f5756a = aVar;
            this.f5757b = aVar2;
            this.f5758c = aVar3;
            this.f5759d = aVar4;
            this.f5760e = lVar;
            this.f5761f = aVar5;
        }

        /* access modifiers changed from: package-private */
        public <R> k<R> a(e2.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((k) a3.j.d(this.f5762g.b())).l(eVar, z10, z11, z12, z13);
        }
    }

    /* compiled from: Engine */
    private static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0154a f5764a;

        /* renamed from: b  reason: collision with root package name */
        private volatile j2.a f5765b;

        c(a.C0154a aVar) {
            this.f5764a = aVar;
        }

        public j2.a a() {
            if (this.f5765b == null) {
                synchronized (this) {
                    if (this.f5765b == null) {
                        this.f5765b = this.f5764a.build();
                    }
                    if (this.f5765b == null) {
                        this.f5765b = new j2.b();
                    }
                }
            }
            return this.f5765b;
        }
    }

    /* compiled from: Engine */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final k<?> f5766a;

        /* renamed from: b  reason: collision with root package name */
        private final i f5767b;

        d(i iVar, k<?> kVar) {
            this.f5767b = iVar;
            this.f5766a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f5766a.r(this.f5767b);
            }
        }
    }

    public j(j2.h hVar, a.C0154a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, k2.a aVar5, boolean z10) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (p) null, (n) null, (a) null, (b) null, (a) null, (u) null, z10);
    }

    private o<?> e(e2.e eVar) {
        h2.c<?> d10 = this.f5746c.d(eVar);
        if (d10 == null) {
            return null;
        }
        if (d10 instanceof o) {
            return (o) d10;
        }
        return new o<>(d10, true, true, eVar, this);
    }

    private o<?> g(e2.e eVar) {
        o<?> e10 = this.f5751h.e(eVar);
        if (e10 != null) {
            e10.d();
        }
        return e10;
    }

    private o<?> h(e2.e eVar) {
        o<?> e10 = e(eVar);
        if (e10 != null) {
            e10.d();
            this.f5751h.a(eVar, e10);
        }
        return e10;
    }

    private o<?> i(m mVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        o<?> g10 = g(mVar);
        if (g10 != null) {
            if (f5743i) {
                j("Loaded resource from active resources", j10, mVar);
            }
            return g10;
        }
        o<?> h10 = h(mVar);
        if (h10 == null) {
            return null;
        }
        if (f5743i) {
            j("Loaded resource from cache", j10, mVar);
        }
        return h10;
    }

    private static void j(String str, long j10, e2.e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(a3.f.a(j10));
        sb.append("ms, key: ");
        sb.append(eVar);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, e2.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, f fVar, h2.a aVar, Map<Class<?>, k<?>> map, boolean z10, boolean z11, g gVar, boolean z12, boolean z13, boolean z14, boolean z15, i iVar, Executor executor, m mVar, long j10) {
        i iVar2 = iVar;
        Executor executor2 = executor;
        m mVar2 = mVar;
        long j11 = j10;
        k<?> a10 = this.f5744a.a(mVar2, z15);
        if (a10 != null) {
            a10.d(iVar2, executor2);
            if (f5743i) {
                j("Added to existing load", j11, mVar2);
            }
            return new d(iVar2, a10);
        }
        k a11 = this.f5747d.a(mVar, z12, z13, z14, z15);
        k kVar = a11;
        m mVar3 = mVar2;
        h<R> a12 = this.f5750g.a(dVar, obj, mVar, eVar, i10, i11, cls, cls2, fVar, aVar, map, z10, z11, z15, gVar, a11);
        this.f5744a.c(mVar3, kVar);
        k kVar2 = kVar;
        m mVar4 = mVar3;
        i iVar3 = iVar;
        kVar2.d(iVar3, executor);
        kVar2.s(a12);
        if (f5743i) {
            j("Started new load", j10, mVar4);
        }
        return new d(iVar3, kVar2);
    }

    public synchronized void a(k<?> kVar, e2.e eVar, o<?> oVar) {
        if (oVar != null) {
            if (oVar.f()) {
                this.f5751h.a(eVar, oVar);
            }
        }
        this.f5744a.d(eVar, kVar);
    }

    public void b(e2.e eVar, o<?> oVar) {
        this.f5751h.d(eVar);
        if (oVar.f()) {
            this.f5746c.e(eVar, oVar);
        } else {
            this.f5748e.a(oVar, false);
        }
    }

    public synchronized void c(k<?> kVar, e2.e eVar) {
        this.f5744a.d(eVar, kVar);
    }

    public void d(h2.c<?> cVar) {
        this.f5748e.a(cVar, true);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, e2.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, f fVar, h2.a aVar, Map<Class<?>, k<?>> map, boolean z10, boolean z11, g gVar, boolean z12, boolean z13, boolean z14, boolean z15, i iVar, Executor executor) {
        long b10 = f5743i ? a3.f.b() : 0;
        m a10 = this.f5745b.a(obj, eVar, i10, i11, map, cls, cls2, gVar);
        synchronized (this) {
            o<?> i12 = i(a10, z12, b10);
            if (i12 == null) {
                d l10 = l(dVar, obj, eVar, i10, i11, cls, cls2, fVar, aVar, map, z10, z11, gVar, z12, z13, z14, z15, iVar, executor, a10, b10);
                return l10;
            }
            iVar.b(i12, e2.a.MEMORY_CACHE);
            return null;
        }
    }

    public void k(h2.c<?> cVar) {
        if (cVar instanceof o) {
            ((o) cVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    j(j2.h hVar, a.C0154a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, k2.a aVar5, p pVar, n nVar, a aVar6, b bVar, a aVar7, u uVar, boolean z10) {
        this.f5746c = hVar;
        a.C0154a aVar8 = aVar;
        c cVar = new c(aVar);
        this.f5749f = cVar;
        a aVar9 = aVar6 == null ? new a(z10) : aVar6;
        this.f5751h = aVar9;
        aVar9.f(this);
        this.f5745b = nVar == null ? new n() : nVar;
        this.f5744a = pVar == null ? new p() : pVar;
        this.f5747d = bVar == null ? new b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f5750g = aVar7 == null ? new a(cVar) : aVar7;
        this.f5748e = uVar == null ? new u() : uVar;
        hVar.c(this);
    }
}
