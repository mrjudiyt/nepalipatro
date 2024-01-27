package com.bumptech.glide.load.engine;

import a3.j;
import b3.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import w2.i;

/* compiled from: EngineJob */
class k<R> implements h.b<R>, a.f {
    private static final c F = new c();
    GlideException A;
    private boolean B;
    o<?> C;
    private h<R> D;
    private volatile boolean E;

    /* renamed from: h  reason: collision with root package name */
    final e f5769h;

    /* renamed from: i  reason: collision with root package name */
    private final b3.c f5770i;

    /* renamed from: j  reason: collision with root package name */
    private final o.a f5771j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.core.util.e<k<?>> f5772k;

    /* renamed from: l  reason: collision with root package name */
    private final c f5773l;

    /* renamed from: m  reason: collision with root package name */
    private final l f5774m;

    /* renamed from: n  reason: collision with root package name */
    private final k2.a f5775n;

    /* renamed from: o  reason: collision with root package name */
    private final k2.a f5776o;

    /* renamed from: p  reason: collision with root package name */
    private final k2.a f5777p;

    /* renamed from: q  reason: collision with root package name */
    private final k2.a f5778q;

    /* renamed from: r  reason: collision with root package name */
    private final AtomicInteger f5779r;

    /* renamed from: s  reason: collision with root package name */
    private e2.e f5780s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5781t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f5782u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5783v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5784w;

    /* renamed from: x  reason: collision with root package name */
    private h2.c<?> f5785x;

    /* renamed from: y  reason: collision with root package name */
    e2.a f5786y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f5787z;

    /* compiled from: EngineJob */
    private class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final i f5788h;

        a(i iVar) {
            this.f5788h = iVar;
        }

        public void run() {
            synchronized (this.f5788h.g()) {
                synchronized (k.this) {
                    if (k.this.f5769h.b(this.f5788h)) {
                        k.this.e(this.f5788h);
                    }
                    k.this.i();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    private class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final i f5790h;

        b(i iVar) {
            this.f5790h = iVar;
        }

        public void run() {
            synchronized (this.f5790h.g()) {
                synchronized (k.this) {
                    if (k.this.f5769h.b(this.f5790h)) {
                        k.this.C.d();
                        k.this.g(this.f5790h);
                        k.this.r(this.f5790h);
                    }
                    k.this.i();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    static class c {
        c() {
        }

        public <R> o<R> a(h2.c<R> cVar, boolean z10, e2.e eVar, o.a aVar) {
            return new o(cVar, z10, true, eVar, aVar);
        }
    }

    /* compiled from: EngineJob */
    static final class d {

        /* renamed from: a  reason: collision with root package name */
        final i f5792a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f5793b;

        d(i iVar, Executor executor) {
            this.f5792a = iVar;
            this.f5793b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f5792a.equals(((d) obj).f5792a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5792a.hashCode();
        }
    }

    /* compiled from: EngineJob */
    static final class e implements Iterable<d> {

        /* renamed from: h  reason: collision with root package name */
        private final List<d> f5794h;

        e() {
            this(new ArrayList(2));
        }

        private static d d(i iVar) {
            return new d(iVar, a3.e.a());
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar, Executor executor) {
            this.f5794h.add(new d(iVar, executor));
        }

        /* access modifiers changed from: package-private */
        public boolean b(i iVar) {
            return this.f5794h.contains(d(iVar));
        }

        /* access modifiers changed from: package-private */
        public e c() {
            return new e(new ArrayList(this.f5794h));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f5794h.clear();
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar) {
            this.f5794h.remove(d(iVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f5794h.isEmpty();
        }

        public Iterator<d> iterator() {
            return this.f5794h.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f5794h.size();
        }

        e(List<d> list) {
            this.f5794h = list;
        }
    }

    k(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, l lVar, o.a aVar5, androidx.core.util.e<k<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, eVar, F);
    }

    private k2.a j() {
        if (this.f5782u) {
            return this.f5777p;
        }
        return this.f5783v ? this.f5778q : this.f5776o;
    }

    private boolean m() {
        return this.B || this.f5787z || this.E;
    }

    private synchronized void q() {
        if (this.f5780s != null) {
            this.f5769h.clear();
            this.f5780s = null;
            this.C = null;
            this.f5785x = null;
            this.B = false;
            this.E = false;
            this.f5787z = false;
            this.D.B(false);
            this.D = null;
            this.A = null;
            this.f5786y = null;
            this.f5772k.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(GlideException glideException) {
        synchronized (this) {
            this.A = glideException;
        }
        n();
    }

    public void b(h2.c<R> cVar, e2.a aVar) {
        synchronized (this) {
            this.f5785x = cVar;
            this.f5786y = aVar;
        }
        o();
    }

    public void c(h<?> hVar) {
        j().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(i iVar, Executor executor) {
        this.f5770i.c();
        this.f5769h.a(iVar, executor);
        boolean z10 = true;
        if (this.f5787z) {
            k(1);
            executor.execute(new b(iVar));
        } else if (this.B) {
            k(1);
            executor.execute(new a(iVar));
        } else {
            if (this.E) {
                z10 = false;
            }
            j.a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    public void e(i iVar) {
        try {
            iVar.a(this.A);
        } catch (Throwable th) {
            throw new b(th);
        }
    }

    public b3.c f() {
        return this.f5770i;
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        try {
            iVar.b(this.C, this.f5786y);
        } catch (Throwable th) {
            throw new b(th);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (!m()) {
            this.E = true;
            this.D.g();
            this.f5774m.c(this, this.f5780s);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        o<?> oVar;
        synchronized (this) {
            this.f5770i.c();
            j.a(m(), "Not yet complete!");
            int decrementAndGet = this.f5779r.decrementAndGet();
            j.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                oVar = this.C;
                q();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            oVar.g();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(int i10) {
        o<?> oVar;
        j.a(m(), "Not yet complete!");
        if (this.f5779r.getAndAdd(i10) == 0 && (oVar = this.C) != null) {
            oVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized k<R> l(e2.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f5780s = eVar;
        this.f5781t = z10;
        this.f5782u = z11;
        this.f5783v = z12;
        this.f5784w = z13;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f5774m.a(r4, r1, (com.bumptech.glide.load.engine.o<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f5793b.execute(new com.bumptech.glide.load.engine.k.a(r4, r1.f5792a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r4 = this;
            monitor-enter(r4)
            b3.c r0 = r4.f5770i     // Catch:{ all -> 0x0066 }
            r0.c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.E     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.k$e r0 = r4.f5769h     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.B     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.B = r0     // Catch:{ all -> 0x0066 }
            e2.e r1 = r4.f5780s     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r4.f5769h     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r2.c()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l r0 = r4.f5774m
            r3 = 0
            r0.a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.k.d) r1
            java.util.concurrent.Executor r2 = r1.f5793b
            com.bumptech.glide.load.engine.k$a r3 = new com.bumptech.glide.load.engine.k$a
            w2.i r1 = r1.f5792a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.k.n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f5774m.a(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f5793b.execute(new com.bumptech.glide.load.engine.k.b(r5, r1.f5792a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r5 = this;
            monitor-enter(r5)
            b3.c r0 = r5.f5770i     // Catch:{ all -> 0x007c }
            r0.c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.E     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            h2.c<?> r0 = r5.f5785x     // Catch:{ all -> 0x007c }
            r0.a()     // Catch:{ all -> 0x007c }
            r5.q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.k$e r0 = r5.f5769h     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f5787z     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.engine.k$c r0 = r5.f5773l     // Catch:{ all -> 0x007c }
            h2.c<?> r1 = r5.f5785x     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f5781t     // Catch:{ all -> 0x007c }
            e2.e r3 = r5.f5780s     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o$a r4 = r5.f5771j     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o r0 = r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.C = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f5787z = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r5.f5769h     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r1.c()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.k(r2)     // Catch:{ all -> 0x007c }
            e2.e r0 = r5.f5780s     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o<?> r2 = r5.C     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.l r3 = r5.f5774m
            r3.a(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.k.d) r1
            java.util.concurrent.Executor r2 = r1.f5793b
            com.bumptech.glide.load.engine.k$b r3 = new com.bumptech.glide.load.engine.k$b
            w2.i r1 = r1.f5792a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.k.o():void");
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f5784w;
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(i iVar) {
        boolean z10;
        this.f5770i.c();
        this.f5769h.e(iVar);
        if (this.f5769h.isEmpty()) {
            h();
            if (!this.f5787z) {
                if (!this.B) {
                    z10 = false;
                    if (z10 && this.f5779r.get() == 0) {
                        q();
                    }
                }
            }
            z10 = true;
            q();
        }
    }

    public synchronized void s(h<R> hVar) {
        this.D = hVar;
        (hVar.H() ? this.f5775n : j()).execute(hVar);
    }

    k(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, l lVar, o.a aVar5, androidx.core.util.e<k<?>> eVar, c cVar) {
        this.f5769h = new e();
        this.f5770i = b3.c.a();
        this.f5779r = new AtomicInteger();
        this.f5775n = aVar;
        this.f5776o = aVar2;
        this.f5777p = aVar3;
        this.f5778q = aVar4;
        this.f5774m = lVar;
        this.f5771j = aVar5;
        this.f5772k = eVar;
        this.f5773l = cVar;
    }
}
