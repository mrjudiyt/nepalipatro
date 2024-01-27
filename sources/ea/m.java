package ea;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
public final class m implements z {

    /* renamed from: h  reason: collision with root package name */
    private int f14378h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14379i;

    /* renamed from: j  reason: collision with root package name */
    private final g f14380j;

    /* renamed from: k  reason: collision with root package name */
    private final Inflater f14381k;

    public m(g gVar, Inflater inflater) {
        kotlin.jvm.internal.m.g(gVar, "source");
        kotlin.jvm.internal.m.g(inflater, "inflater");
        this.f14380j = gVar;
        this.f14381k = inflater;
    }

    private final void j() {
        int i10 = this.f14378h;
        if (i10 != 0) {
            int remaining = i10 - this.f14381k.getRemaining();
            this.f14378h -= remaining;
            this.f14380j.skip((long) remaining);
        }
    }

    public long S(e eVar, long j10) {
        kotlin.jvm.internal.m.g(eVar, "sink");
        do {
            long a10 = a(eVar, j10);
            if (a10 > 0) {
                return a10;
            }
            if (this.f14381k.finished() || this.f14381k.needsDictionary()) {
                return -1;
            }
        } while (!this.f14380j.F());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(e eVar, long j10) {
        kotlin.jvm.internal.m.g(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!(!this.f14379i)) {
            throw new IllegalStateException("closed".toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            try {
                u K0 = eVar.K0(1);
                int min = (int) Math.min(j10, (long) (8192 - K0.f14395c));
                h();
                int inflate = this.f14381k.inflate(K0.f14393a, K0.f14395c, min);
                j();
                if (inflate > 0) {
                    K0.f14395c += inflate;
                    long j11 = (long) inflate;
                    eVar.v0(eVar.w0() + j11);
                    return j11;
                }
                if (K0.f14394b == K0.f14395c) {
                    eVar.f14361h = K0.b();
                    v.b(K0);
                }
                return 0;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
    }

    public void close() {
        if (!this.f14379i) {
            this.f14381k.end();
            this.f14379i = true;
            this.f14380j.close();
        }
    }

    public a0 d() {
        return this.f14380j.d();
    }

    public final boolean h() {
        if (!this.f14381k.needsInput()) {
            return false;
        }
        if (this.f14380j.F()) {
            return true;
        }
        u uVar = this.f14380j.c().f14361h;
        if (uVar == null) {
            kotlin.jvm.internal.m.r();
        }
        int i10 = uVar.f14395c;
        int i11 = uVar.f14394b;
        int i12 = i10 - i11;
        this.f14378h = i12;
        this.f14381k.setInput(uVar.f14393a, i11, i12);
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m(z zVar, Inflater inflater) {
        this(o.b(zVar), inflater);
        kotlin.jvm.internal.m.g(zVar, "source");
        kotlin.jvm.internal.m.g(inflater, "inflater");
    }
}
