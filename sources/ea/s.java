package ea;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.m;

/* compiled from: RealBufferedSink.kt */
public final class s implements f {

    /* renamed from: h  reason: collision with root package name */
    public final e f14386h = new e();

    /* renamed from: i  reason: collision with root package name */
    public boolean f14387i;

    /* renamed from: j  reason: collision with root package name */
    public final x f14388j;

    public s(x xVar) {
        m.g(xVar, "sink");
        this.f14388j = xVar;
    }

    public f B(int i10) {
        if (!this.f14387i) {
            this.f14386h.B(i10);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void F0(e eVar, long j10) {
        m.g(eVar, "source");
        if (!this.f14387i) {
            this.f14386h.F0(eVar, j10);
            K();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f G(int i10) {
        if (!this.f14387i) {
            this.f14386h.G(i10);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f K() {
        if (!this.f14387i) {
            long u10 = this.f14386h.u();
            if (u10 > 0) {
                this.f14388j.F0(this.f14386h, u10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f U(String str) {
        m.g(str, "string");
        if (!this.f14387i) {
            this.f14386h.U(str);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f Z(byte[] bArr, int i10, int i11) {
        m.g(bArr, "source");
        if (!this.f14387i) {
            this.f14386h.Z(bArr, i10, i11);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public e b() {
        return this.f14386h;
    }

    public f b0(long j10) {
        if (!this.f14387i) {
            this.f14386h.b0(j10);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public e c() {
        return this.f14386h;
    }

    public void close() {
        if (!this.f14387i) {
            Throwable th = null;
            try {
                if (this.f14386h.w0() > 0) {
                    x xVar = this.f14388j;
                    e eVar = this.f14386h;
                    xVar.F0(eVar, eVar.w0());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f14388j.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f14387i = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public a0 d() {
        return this.f14388j.d();
    }

    public void flush() {
        if (!this.f14387i) {
            if (this.f14386h.w0() > 0) {
                x xVar = this.f14388j;
                e eVar = this.f14386h;
                xVar.F0(eVar, eVar.w0());
            }
            this.f14388j.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f14387i;
    }

    public long o(z zVar) {
        m.g(zVar, "source");
        long j10 = 0;
        while (true) {
            long S = zVar.S(this.f14386h, (long) 8192);
            if (S == -1) {
                return j10;
            }
            j10 += S;
            K();
        }
    }

    public f q0(byte[] bArr) {
        m.g(bArr, "source");
        if (!this.f14387i) {
            this.f14386h.q0(bArr);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f14388j + ')';
    }

    public f u0(h hVar) {
        m.g(hVar, "byteString");
        if (!this.f14387i) {
            this.f14386h.u0(hVar);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        m.g(byteBuffer, "source");
        if (!this.f14387i) {
            int write = this.f14386h.write(byteBuffer);
            K();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f x() {
        if (!this.f14387i) {
            long w02 = this.f14386h.w0();
            if (w02 > 0) {
                this.f14388j.F0(this.f14386h, w02);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f y(int i10) {
        if (!this.f14387i) {
            this.f14386h.y(i10);
            return K();
        }
        throw new IllegalStateException("closed".toString());
    }
}
