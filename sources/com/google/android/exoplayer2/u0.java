package com.google.android.exoplayer2;

import android.os.Looper;

/* compiled from: PlayerMessage */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f7623a;

    /* renamed from: b  reason: collision with root package name */
    private final a f7624b;

    /* renamed from: c  reason: collision with root package name */
    private final a6.b f7625c;

    /* renamed from: d  reason: collision with root package name */
    private final a1 f7626d;

    /* renamed from: e  reason: collision with root package name */
    private int f7627e;

    /* renamed from: f  reason: collision with root package name */
    private Object f7628f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f7629g;

    /* renamed from: h  reason: collision with root package name */
    private int f7630h;

    /* renamed from: i  reason: collision with root package name */
    private long f7631i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7632j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7633k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7634l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7635m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7636n;

    /* compiled from: PlayerMessage */
    public interface a {
        void a(u0 u0Var);
    }

    /* compiled from: PlayerMessage */
    public interface b {
        void r(int i10, Object obj);
    }

    public u0(a aVar, b bVar, a1 a1Var, int i10, a6.b bVar2, Looper looper) {
        this.f7624b = aVar;
        this.f7623a = bVar;
        this.f7626d = a1Var;
        this.f7629g = looper;
        this.f7625c = bVar2;
        this.f7630h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC, Splitter:B:16:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f7633k     // Catch:{ all -> 0x0048 }
            a6.a.f(r0)     // Catch:{ all -> 0x0048 }
            android.os.Looper r0 = r6.f7629g     // Catch:{ all -> 0x0048 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0048 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            a6.a.f(r0)     // Catch:{ all -> 0x0048 }
            a6.b r0 = r6.f7625c     // Catch:{ all -> 0x0048 }
            long r0 = r0.elapsedRealtime()     // Catch:{ all -> 0x0048 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f7635m     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003a
            a6.b r2 = r6.f7625c     // Catch:{ all -> 0x0048 }
            r2.c()     // Catch:{ all -> 0x0048 }
            r6.wait(r7)     // Catch:{ all -> 0x0048 }
            a6.b r7 = r6.f7625c     // Catch:{ all -> 0x0048 }
            long r7 = r7.elapsedRealtime()     // Catch:{ all -> 0x0048 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x0040
            boolean r7 = r6.f7634l     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return r7
        L_0x0040:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0048 }
            throw r7     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.u0.a(long):boolean");
    }

    public boolean b() {
        return this.f7632j;
    }

    public Looper c() {
        return this.f7629g;
    }

    public Object d() {
        return this.f7628f;
    }

    public long e() {
        return this.f7631i;
    }

    public b f() {
        return this.f7623a;
    }

    public a1 g() {
        return this.f7626d;
    }

    public int h() {
        return this.f7627e;
    }

    public int i() {
        return this.f7630h;
    }

    public synchronized boolean j() {
        return this.f7636n;
    }

    public synchronized void k(boolean z10) {
        this.f7634l = z10 | this.f7634l;
        this.f7635m = true;
        notifyAll();
    }

    public u0 l() {
        a6.a.f(!this.f7633k);
        if (this.f7631i == -9223372036854775807L) {
            a6.a.a(this.f7632j);
        }
        this.f7633k = true;
        this.f7624b.a(this);
        return this;
    }

    public u0 m(Object obj) {
        a6.a.f(!this.f7633k);
        this.f7628f = obj;
        return this;
    }

    public u0 n(int i10) {
        a6.a.f(!this.f7633k);
        this.f7627e = i10;
        return this;
    }
}
