package ea;

import java.io.OutputStream;
import kotlin.jvm.internal.m;

/* compiled from: JvmOkio.kt */
final class r implements x {

    /* renamed from: h  reason: collision with root package name */
    private final OutputStream f14384h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f14385i;

    public r(OutputStream outputStream, a0 a0Var) {
        m.g(outputStream, "out");
        m.g(a0Var, "timeout");
        this.f14384h = outputStream;
        this.f14385i = a0Var;
    }

    public void F0(e eVar, long j10) {
        m.g(eVar, "source");
        c.b(eVar.w0(), 0, j10);
        while (j10 > 0) {
            this.f14385i.f();
            u uVar = eVar.f14361h;
            if (uVar == null) {
                m.r();
            }
            int min = (int) Math.min(j10, (long) (uVar.f14395c - uVar.f14394b));
            this.f14384h.write(uVar.f14393a, uVar.f14394b, min);
            uVar.f14394b += min;
            long j11 = (long) min;
            j10 -= j11;
            eVar.v0(eVar.w0() - j11);
            if (uVar.f14394b == uVar.f14395c) {
                eVar.f14361h = uVar.b();
                v.b(uVar);
            }
        }
    }

    public void close() {
        this.f14384h.close();
    }

    public a0 d() {
        return this.f14385i;
    }

    public void flush() {
        this.f14384h.flush();
    }

    public String toString() {
        return "sink(" + this.f14384h + ')';
    }
}
