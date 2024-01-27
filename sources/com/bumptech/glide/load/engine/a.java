package com.bumptech.glide.load.engine;

import a3.j;
import android.os.Process;
import com.bumptech.glide.load.engine.o;
import e2.e;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5652a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5653b;

    /* renamed from: c  reason: collision with root package name */
    final Map<e, d> f5654c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<o<?>> f5655d;

    /* renamed from: e  reason: collision with root package name */
    private o.a f5656e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f5657f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f5658g;

    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    /* compiled from: ActiveResources */
    class C0105a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a  reason: collision with other inner class name */
        /* compiled from: ActiveResources */
        class C0106a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Runnable f5659h;

            C0106a(Runnable runnable) {
                this.f5659h = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f5659h.run();
            }
        }

        C0105a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0106a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources */
    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.b();
        }
    }

    /* compiled from: ActiveResources */
    interface c {
        void a();
    }

    /* compiled from: ActiveResources */
    static final class d extends WeakReference<o<?>> {

        /* renamed from: a  reason: collision with root package name */
        final e f5662a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f5663b;

        /* renamed from: c  reason: collision with root package name */
        h2.c<?> f5664c;

        d(e eVar, o<?> oVar, ReferenceQueue<? super o<?>> referenceQueue, boolean z10) {
            super(oVar, referenceQueue);
            this.f5662a = (e) j.d(eVar);
            this.f5664c = (!oVar.f() || !z10) ? null : (h2.c) j.d(oVar.e());
            this.f5663b = oVar.f();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f5664c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new C0105a()));
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(e eVar, o<?> oVar) {
        d put = this.f5654c.put(eVar, new d(eVar, oVar, this.f5655d, this.f5652a));
        if (put != null) {
            put.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        while (!this.f5657f) {
            try {
                c((d) this.f5655d.remove());
                c cVar = this.f5658g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(d dVar) {
        synchronized (this) {
            this.f5654c.remove(dVar.f5662a);
            if (dVar.f5663b) {
                h2.c<?> cVar = dVar.f5664c;
                if (cVar != null) {
                    this.f5656e.b(dVar.f5662a, new o(cVar, true, false, dVar.f5662a, this.f5656e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(e eVar) {
        d remove = this.f5654c.remove(eVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.o<?> e(e2.e r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<e2.e, com.bumptech.glide.load.engine.a$d> r0 = r1.f5654c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.a.d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.o) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.a.e(e2.e):com.bumptech.glide.load.engine.o");
    }

    /* access modifiers changed from: package-private */
    public void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f5656e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f5654c = new HashMap();
        this.f5655d = new ReferenceQueue<>();
        this.f5652a = z10;
        this.f5653b = executor;
        executor.execute(new b());
    }
}
