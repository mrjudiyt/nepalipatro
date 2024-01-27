package w2;

import w2.e;

/* compiled from: ThumbnailRequestCoordinator */
public class k implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final e f12740a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12741b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f12742c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f12743d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f12744e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f12745f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12746g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f12744e = aVar;
        this.f12745f = aVar;
        this.f12741b = obj;
        this.f12740a = eVar;
    }

    private boolean l() {
        e eVar = this.f12740a;
        return eVar == null || eVar.i(this);
    }

    private boolean m() {
        e eVar = this.f12740a;
        return eVar == null || eVar.e(this);
    }

    private boolean n() {
        e eVar = this.f12740a;
        return eVar == null || eVar.g(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w2.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12741b
            monitor-enter(r0)
            w2.d r1 = r2.f12742c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            w2.e$a r3 = w2.e.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f12745f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            w2.e$a r3 = w2.e.a.FAILED     // Catch:{ all -> 0x001e }
            r2.f12744e = r3     // Catch:{ all -> 0x001e }
            w2.e r3 = r2.f12740a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.a(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.a(w2.d):void");
    }

    public e b() {
        e b10;
        synchronized (this.f12741b) {
            e eVar = this.f12740a;
            b10 = eVar != null ? eVar.b() : this;
        }
        return b10;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f12741b) {
            if (!this.f12743d.c()) {
                if (!this.f12742c.c()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public void clear() {
        synchronized (this.f12741b) {
            this.f12746g = false;
            e.a aVar = e.a.CLEARED;
            this.f12744e = aVar;
            this.f12745f = aVar;
            this.f12743d.clear();
            this.f12742c.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(w2.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof w2.k
            r1 = 0
            if (r0 == 0) goto L_0x002e
            w2.k r4 = (w2.k) r4
            w2.d r0 = r3.f12742c
            if (r0 != 0) goto L_0x0010
            w2.d r0 = r4.f12742c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            w2.d r0 = r3.f12742c
            w2.d r2 = r4.f12742c
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            w2.d r0 = r3.f12743d
            if (r0 != 0) goto L_0x0023
            w2.d r4 = r4.f12743d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            w2.d r0 = r3.f12743d
            w2.d r4 = r4.f12743d
            boolean r4 = r0.d(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.d(w2.d):boolean");
    }

    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f12741b) {
            z10 = m() && dVar.equals(this.f12742c) && !c();
        }
        return z10;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f12741b) {
            z10 = this.f12744e == e.a.CLEARED;
        }
        return z10;
    }

    public boolean g(d dVar) {
        boolean z10;
        synchronized (this.f12741b) {
            z10 = n() && (dVar.equals(this.f12742c) || this.f12744e != e.a.SUCCESS);
        }
        return z10;
    }

    public void h() {
        e.a aVar;
        e.a aVar2;
        synchronized (this.f12741b) {
            this.f12746g = true;
            try {
                if (!(this.f12744e == e.a.SUCCESS || this.f12745f == (aVar2 = e.a.RUNNING))) {
                    this.f12745f = aVar2;
                    this.f12743d.h();
                }
                if (this.f12746g && this.f12744e != (aVar = e.a.RUNNING)) {
                    this.f12744e = aVar;
                    this.f12742c.h();
                }
            } finally {
                this.f12746g = false;
            }
        }
    }

    public boolean i(d dVar) {
        boolean z10;
        synchronized (this.f12741b) {
            z10 = l() && dVar.equals(this.f12742c) && this.f12744e != e.a.PAUSED;
        }
        return z10;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f12741b) {
            z10 = this.f12744e == e.a.RUNNING;
        }
        return z10;
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f12741b) {
            z10 = this.f12744e == e.a.SUCCESS;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(w2.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12741b
            monitor-enter(r0)
            w2.d r1 = r2.f12743d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            w2.e$a r3 = w2.e.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f12745f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            w2.e$a r3 = w2.e.a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f12744e = r3     // Catch:{ all -> 0x002b }
            w2.e r3 = r2.f12740a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.k(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            w2.e$a r3 = r2.f12745f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.a()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            w2.d r3 = r2.f12743d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.k.k(w2.d):void");
    }

    public void o(d dVar, d dVar2) {
        this.f12742c = dVar;
        this.f12743d = dVar2;
    }

    public void pause() {
        synchronized (this.f12741b) {
            if (!this.f12745f.a()) {
                this.f12745f = e.a.PAUSED;
                this.f12743d.pause();
            }
            if (!this.f12744e.a()) {
                this.f12744e = e.a.PAUSED;
                this.f12742c.pause();
            }
        }
    }
}
