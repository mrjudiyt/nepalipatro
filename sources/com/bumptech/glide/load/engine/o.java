package com.bumptech.glide.load.engine;

import a3.j;
import e2.e;
import h2.c;

/* compiled from: EngineResource */
class o<Z> implements c<Z> {

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5804h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f5805i;

    /* renamed from: j  reason: collision with root package name */
    private final c<Z> f5806j;

    /* renamed from: k  reason: collision with root package name */
    private final a f5807k;

    /* renamed from: l  reason: collision with root package name */
    private final e f5808l;

    /* renamed from: m  reason: collision with root package name */
    private int f5809m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5810n;

    /* compiled from: EngineResource */
    interface a {
        void b(e eVar, o<?> oVar);
    }

    o(c<Z> cVar, boolean z10, boolean z11, e eVar, a aVar) {
        this.f5806j = (c) j.d(cVar);
        this.f5804h = z10;
        this.f5805i = z11;
        this.f5808l = eVar;
        this.f5807k = (a) j.d(aVar);
    }

    public synchronized void a() {
        if (this.f5809m > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f5810n) {
            this.f5810n = true;
            if (this.f5805i) {
                this.f5806j.a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public int b() {
        return this.f5806j.b();
    }

    public Class<Z> c() {
        return this.f5806j.c();
    }

    /* access modifiers changed from: package-private */
    public synchronized void d() {
        if (!this.f5810n) {
            this.f5809m++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: package-private */
    public c<Z> e() {
        return this.f5806j;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f5804h;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f5809m;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f5809m = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f5807k.b(this.f5808l, this);
        }
    }

    public Z get() {
        return this.f5806j.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f5804h + ", listener=" + this.f5807k + ", key=" + this.f5808l + ", acquired=" + this.f5809m + ", isRecycled=" + this.f5810n + ", resource=" + this.f5806j + '}';
    }
}
