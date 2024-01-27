package ea;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.m;

/* compiled from: JvmOkio.kt */
final class n implements z {

    /* renamed from: h  reason: collision with root package name */
    private final InputStream f14382h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f14383i;

    public n(InputStream inputStream, a0 a0Var) {
        m.g(inputStream, "input");
        m.g(a0Var, "timeout");
        this.f14382h = inputStream;
        this.f14383i = a0Var;
    }

    public long S(e eVar, long j10) {
        m.g(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 >= 0) {
            try {
                this.f14383i.f();
                u K0 = eVar.K0(1);
                int read = this.f14382h.read(K0.f14393a, K0.f14395c, (int) Math.min(j10, (long) (8192 - K0.f14395c)));
                if (read != -1) {
                    K0.f14395c += read;
                    long j11 = (long) read;
                    eVar.v0(eVar.w0() + j11);
                    return j11;
                } else if (K0.f14394b != K0.f14395c) {
                    return -1;
                } else {
                    eVar.f14361h = K0.b();
                    v.b(K0);
                    return -1;
                }
            } catch (AssertionError e10) {
                if (o.c(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
    }

    public void close() {
        this.f14382h.close();
    }

    public a0 d() {
        return this.f14383i;
    }

    public String toString() {
        return "source(" + this.f14382h + ')';
    }
}
