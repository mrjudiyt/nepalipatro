package y7;

import ea.a0;
import ea.e;
import ea.x;
import java.net.ProtocolException;
import w7.h;

/* compiled from: RetryableSink */
public final class n implements x {

    /* renamed from: h  reason: collision with root package name */
    private boolean f17428h;

    /* renamed from: i  reason: collision with root package name */
    private final int f17429i;

    /* renamed from: j  reason: collision with root package name */
    private final e f17430j;

    public n(int i10) {
        this.f17430j = new e();
        this.f17429i = i10;
    }

    public void F0(e eVar, long j10) {
        if (!this.f17428h) {
            h.a(eVar.w0(), 0, j10);
            if (this.f17429i == -1 || this.f17430j.w0() <= ((long) this.f17429i) - j10) {
                this.f17430j.F0(eVar, j10);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.f17429i + " bytes");
        }
        throw new IllegalStateException("closed");
    }

    public long a() {
        return this.f17430j.w0();
    }

    public void close() {
        if (!this.f17428h) {
            this.f17428h = true;
            if (this.f17430j.w0() < ((long) this.f17429i)) {
                throw new ProtocolException("content-length promised " + this.f17429i + " bytes, but received " + this.f17430j.w0());
            }
        }
    }

    public a0 d() {
        return a0.f14345d;
    }

    public void flush() {
    }

    public void h(x xVar) {
        e eVar = new e();
        e eVar2 = this.f17430j;
        eVar2.E(eVar, 0, eVar2.w0());
        xVar.F0(eVar, eVar.w0());
    }

    public n() {
        this(-1);
    }
}
