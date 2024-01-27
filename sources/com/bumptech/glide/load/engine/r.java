package com.bumptech.glide.load.engine;

import a3.j;
import androidx.core.util.e;
import b3.a;
import h2.c;

/* compiled from: LockedResource */
final class r<Z> implements c<Z>, a.f {

    /* renamed from: l  reason: collision with root package name */
    private static final e<r<?>> f5817l = b3.a.d(20, new a());

    /* renamed from: h  reason: collision with root package name */
    private final b3.c f5818h = b3.c.a();

    /* renamed from: i  reason: collision with root package name */
    private c<Z> f5819i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5820j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5821k;

    /* compiled from: LockedResource */
    class a implements a.d<r<?>> {
        a() {
        }

        /* renamed from: b */
        public r<?> a() {
            return new r<>();
        }
    }

    r() {
    }

    private void d(c<Z> cVar) {
        this.f5821k = false;
        this.f5820j = true;
        this.f5819i = cVar;
    }

    static <Z> r<Z> e(c<Z> cVar) {
        r<Z> rVar = (r) j.d(f5817l.b());
        rVar.d(cVar);
        return rVar;
    }

    private void g() {
        this.f5819i = null;
        f5817l.a(this);
    }

    public synchronized void a() {
        this.f5818h.c();
        this.f5821k = true;
        if (!this.f5820j) {
            this.f5819i.a();
            g();
        }
    }

    public int b() {
        return this.f5819i.b();
    }

    public Class<Z> c() {
        return this.f5819i.c();
    }

    public b3.c f() {
        return this.f5818h;
    }

    public Z get() {
        return this.f5819i.get();
    }

    /* access modifiers changed from: package-private */
    public synchronized void h() {
        this.f5818h.c();
        if (this.f5820j) {
            this.f5820j = false;
            if (this.f5821k) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
