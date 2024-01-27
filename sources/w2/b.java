package w2;

import w2.e;

/* compiled from: ErrorRequestCoordinator */
public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f12683a;

    /* renamed from: b  reason: collision with root package name */
    private final e f12684b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f12685c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f12686d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f12687e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f12688f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f12687e = aVar;
        this.f12688f = aVar;
        this.f12683a = obj;
        this.f12684b = eVar;
    }

    private boolean l(d dVar) {
        return dVar.equals(this.f12685c) || (this.f12687e == e.a.FAILED && dVar.equals(this.f12686d));
    }

    private boolean m() {
        e eVar = this.f12684b;
        return eVar == null || eVar.i(this);
    }

    private boolean n() {
        e eVar = this.f12684b;
        return eVar == null || eVar.e(this);
    }

    private boolean o() {
        e eVar = this.f12684b;
        return eVar == null || eVar.g(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w2.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12683a
            monitor-enter(r0)
            w2.d r1 = r2.f12686d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            w2.e$a r3 = w2.e.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f12687e = r3     // Catch:{ all -> 0x002b }
            w2.e$a r3 = r2.f12688f     // Catch:{ all -> 0x002b }
            w2.e$a r1 = w2.e.a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f12688f = r1     // Catch:{ all -> 0x002b }
            w2.d r3 = r2.f12686d     // Catch:{ all -> 0x002b }
            r3.h()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            w2.e$a r3 = w2.e.a.FAILED     // Catch:{ all -> 0x002b }
            r2.f12688f = r3     // Catch:{ all -> 0x002b }
            w2.e r3 = r2.f12684b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.a(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.b.a(w2.d):void");
    }

    public e b() {
        e b10;
        synchronized (this.f12683a) {
            e eVar = this.f12684b;
            b10 = eVar != null ? eVar.b() : this;
        }
        return b10;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f12683a) {
            if (!this.f12685c.c()) {
                if (!this.f12686d.c()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public void clear() {
        synchronized (this.f12683a) {
            e.a aVar = e.a.CLEARED;
            this.f12687e = aVar;
            this.f12685c.clear();
            if (this.f12688f != aVar) {
                this.f12688f = aVar;
                this.f12686d.clear();
            }
        }
    }

    public boolean d(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        if (!this.f12685c.d(bVar.f12685c) || !this.f12686d.d(bVar.f12686d)) {
            return false;
        }
        return true;
    }

    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f12683a) {
            z10 = n() && l(dVar);
        }
        return z10;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f12683a) {
            e.a aVar = this.f12687e;
            e.a aVar2 = e.a.CLEARED;
            z10 = aVar == aVar2 && this.f12688f == aVar2;
        }
        return z10;
    }

    public boolean g(d dVar) {
        boolean z10;
        synchronized (this.f12683a) {
            z10 = o() && l(dVar);
        }
        return z10;
    }

    public void h() {
        synchronized (this.f12683a) {
            e.a aVar = this.f12687e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.f12687e = aVar2;
                this.f12685c.h();
            }
        }
    }

    public boolean i(d dVar) {
        boolean z10;
        synchronized (this.f12683a) {
            z10 = m() && l(dVar);
        }
        return z10;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f12683a) {
            e.a aVar = this.f12687e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                if (this.f12688f != aVar2) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f12683a) {
            e.a aVar = this.f12687e;
            e.a aVar2 = e.a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f12688f != aVar2) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public void k(d dVar) {
        synchronized (this.f12683a) {
            if (dVar.equals(this.f12685c)) {
                this.f12687e = e.a.SUCCESS;
            } else if (dVar.equals(this.f12686d)) {
                this.f12688f = e.a.SUCCESS;
            }
            e eVar = this.f12684b;
            if (eVar != null) {
                eVar.k(this);
            }
        }
    }

    public void p(d dVar, d dVar2) {
        this.f12685c = dVar;
        this.f12686d = dVar2;
    }

    public void pause() {
        synchronized (this.f12683a) {
            e.a aVar = this.f12687e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar == aVar2) {
                this.f12687e = e.a.PAUSED;
                this.f12685c.pause();
            }
            if (this.f12688f == aVar2) {
                this.f12688f = e.a.PAUSED;
                this.f12686d.pause();
            }
        }
    }
}
