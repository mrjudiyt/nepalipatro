package ea;

import java.util.zip.Deflater;
import kotlin.jvm.internal.m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
public final class i implements x {

    /* renamed from: h  reason: collision with root package name */
    private boolean f14368h;

    /* renamed from: i  reason: collision with root package name */
    private final f f14369i;

    /* renamed from: j  reason: collision with root package name */
    private final Deflater f14370j;

    public i(f fVar, Deflater deflater) {
        m.g(fVar, "sink");
        m.g(deflater, "deflater");
        this.f14369i = fVar;
        this.f14370j = deflater;
    }

    @IgnoreJRERequirement
    private final void a(boolean z10) {
        u K0;
        int i10;
        e c10 = this.f14369i.c();
        while (true) {
            K0 = c10.K0(1);
            if (z10) {
                Deflater deflater = this.f14370j;
                byte[] bArr = K0.f14393a;
                int i11 = K0.f14395c;
                i10 = deflater.deflate(bArr, i11, 8192 - i11, 2);
            } else {
                Deflater deflater2 = this.f14370j;
                byte[] bArr2 = K0.f14393a;
                int i12 = K0.f14395c;
                i10 = deflater2.deflate(bArr2, i12, 8192 - i12);
            }
            if (i10 > 0) {
                K0.f14395c += i10;
                c10.v0(c10.w0() + ((long) i10));
                this.f14369i.K();
            } else if (this.f14370j.needsInput()) {
                break;
            }
        }
        if (K0.f14394b == K0.f14395c) {
            c10.f14361h = K0.b();
            v.b(K0);
        }
    }

    public void F0(e eVar, long j10) {
        m.g(eVar, "source");
        c.b(eVar.w0(), 0, j10);
        while (j10 > 0) {
            u uVar = eVar.f14361h;
            if (uVar == null) {
                m.r();
            }
            int min = (int) Math.min(j10, (long) (uVar.f14395c - uVar.f14394b));
            this.f14370j.setInput(uVar.f14393a, uVar.f14394b, min);
            a(false);
            long j11 = (long) min;
            eVar.v0(eVar.w0() - j11);
            int i10 = uVar.f14394b + min;
            uVar.f14394b = i10;
            if (i10 == uVar.f14395c) {
                eVar.f14361h = uVar.b();
                v.b(uVar);
            }
            j10 -= j11;
        }
    }

    public void close() {
        if (!this.f14368h) {
            Throwable th = null;
            try {
                h();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f14370j.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f14369i.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f14368h = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public a0 d() {
        return this.f14369i.d();
    }

    public void flush() {
        a(true);
        this.f14369i.flush();
    }

    public final void h() {
        this.f14370j.finish();
        a(false);
    }

    public String toString() {
        return "DeflaterSink(" + this.f14369i + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(x xVar, Deflater deflater) {
        this(o.a(xVar), deflater);
        m.g(xVar, "sink");
        m.g(deflater, "deflater");
    }
}
