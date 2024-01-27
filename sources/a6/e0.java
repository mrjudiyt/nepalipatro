package a6;

import e4.c;
import e4.m;

/* compiled from: StandaloneMediaClock */
public final class e0 implements r {

    /* renamed from: h  reason: collision with root package name */
    private final b f174h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f175i;

    /* renamed from: j  reason: collision with root package name */
    private long f176j;

    /* renamed from: k  reason: collision with root package name */
    private long f177k;

    /* renamed from: l  reason: collision with root package name */
    private m f178l = m.f8132d;

    public e0(b bVar) {
        this.f174h = bVar;
    }

    public void a(long j10) {
        this.f176j = j10;
        if (this.f175i) {
            this.f177k = this.f174h.elapsedRealtime();
        }
    }

    public void b() {
        if (!this.f175i) {
            this.f177k = this.f174h.elapsedRealtime();
            this.f175i = true;
        }
    }

    public void c() {
        if (this.f175i) {
            a(n());
            this.f175i = false;
        }
    }

    public void g(m mVar) {
        if (this.f175i) {
            a(n());
        }
        this.f178l = mVar;
    }

    public m i() {
        return this.f178l;
    }

    public long n() {
        long j10;
        long j11 = this.f176j;
        if (!this.f175i) {
            return j11;
        }
        long elapsedRealtime = this.f174h.elapsedRealtime() - this.f177k;
        m mVar = this.f178l;
        if (mVar.f8134a == 1.0f) {
            j10 = c.d(elapsedRealtime);
        } else {
            j10 = mVar.a(elapsedRealtime);
        }
        return j11 + j10;
    }
}
