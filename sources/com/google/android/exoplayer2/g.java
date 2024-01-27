package com.google.android.exoplayer2;

import a6.b;
import a6.e0;
import a6.r;
import e4.m;

/* compiled from: DefaultMediaClock */
final class g implements r {

    /* renamed from: h  reason: collision with root package name */
    private final e0 f6683h;

    /* renamed from: i  reason: collision with root package name */
    private final a f6684i;

    /* renamed from: j  reason: collision with root package name */
    private w0 f6685j;

    /* renamed from: k  reason: collision with root package name */
    private r f6686k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6687l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6688m;

    /* compiled from: DefaultMediaClock */
    public interface a {
        void b(m mVar);
    }

    public g(a aVar, b bVar) {
        this.f6684i = aVar;
        this.f6683h = new e0(bVar);
    }

    private boolean d(boolean z10) {
        w0 w0Var = this.f6685j;
        return w0Var == null || w0Var.c() || (!this.f6685j.e() && (z10 || this.f6685j.k()));
    }

    private void j(boolean z10) {
        if (d(z10)) {
            this.f6687l = true;
            if (this.f6688m) {
                this.f6683h.b();
                return;
            }
            return;
        }
        r rVar = (r) a6.a.e(this.f6686k);
        long n10 = rVar.n();
        if (this.f6687l) {
            if (n10 < this.f6683h.n()) {
                this.f6683h.c();
                return;
            }
            this.f6687l = false;
            if (this.f6688m) {
                this.f6683h.b();
            }
        }
        this.f6683h.a(n10);
        m i10 = rVar.i();
        if (!i10.equals(this.f6683h.i())) {
            this.f6683h.g(i10);
            this.f6684i.b(i10);
        }
    }

    public void a(w0 w0Var) {
        if (w0Var == this.f6685j) {
            this.f6686k = null;
            this.f6685j = null;
            this.f6687l = true;
        }
    }

    public void b(w0 w0Var) {
        r rVar;
        r y10 = w0Var.y();
        if (y10 != null && y10 != (rVar = this.f6686k)) {
            if (rVar == null) {
                this.f6686k = y10;
                this.f6685j = w0Var;
                y10.g(this.f6683h.i());
                return;
            }
            throw ExoPlaybackException.d(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c(long j10) {
        this.f6683h.a(j10);
    }

    public void e() {
        this.f6688m = true;
        this.f6683h.b();
    }

    public void f() {
        this.f6688m = false;
        this.f6683h.c();
    }

    public void g(m mVar) {
        r rVar = this.f6686k;
        if (rVar != null) {
            rVar.g(mVar);
            mVar = this.f6686k.i();
        }
        this.f6683h.g(mVar);
    }

    public long h(boolean z10) {
        j(z10);
        return n();
    }

    public m i() {
        r rVar = this.f6686k;
        if (rVar != null) {
            return rVar.i();
        }
        return this.f6683h.i();
    }

    public long n() {
        if (this.f6687l) {
            return this.f6683h.n();
        }
        return ((r) a6.a.e(this.f6686k)).n();
    }
}
