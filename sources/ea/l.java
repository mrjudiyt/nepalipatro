package ea;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.m;

/* compiled from: GzipSource.kt */
public final class l implements z {

    /* renamed from: h  reason: collision with root package name */
    private byte f14373h;

    /* renamed from: i  reason: collision with root package name */
    private final t f14374i;

    /* renamed from: j  reason: collision with root package name */
    private final Inflater f14375j;

    /* renamed from: k  reason: collision with root package name */
    private final m f14376k;

    /* renamed from: l  reason: collision with root package name */
    private final CRC32 f14377l = new CRC32();

    public l(z zVar) {
        m.g(zVar, "source");
        t tVar = new t(zVar);
        this.f14374i = tVar;
        Inflater inflater = new Inflater(true);
        this.f14375j = inflater;
        this.f14376k = new m((g) tVar, inflater);
    }

    private final void a(String str, int i10, int i11) {
        if (i11 != i10) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
            m.b(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    private final void h() {
        this.f14374i.C0(10);
        byte W = this.f14374i.f14389h.W(3);
        boolean z10 = true;
        boolean z11 = ((W >> 1) & 1) == 1;
        if (z11) {
            q(this.f14374i.f14389h, 0, 10);
        }
        a("ID1ID2", 8075, this.f14374i.readShort());
        this.f14374i.skip(8);
        if (((W >> 2) & 1) == 1) {
            this.f14374i.C0(2);
            if (z11) {
                q(this.f14374i.f14389h, 0, 2);
            }
            long k02 = (long) this.f14374i.f14389h.k0();
            this.f14374i.C0(k02);
            if (z11) {
                q(this.f14374i.f14389h, 0, k02);
            }
            this.f14374i.skip(k02);
        }
        if (((W >> 3) & 1) == 1) {
            long a10 = this.f14374i.a((byte) 0);
            if (a10 != -1) {
                if (z11) {
                    q(this.f14374i.f14389h, 0, a10 + 1);
                }
                this.f14374i.skip(a10 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((W >> 4) & 1) != 1) {
            z10 = false;
        }
        if (z10) {
            long a11 = this.f14374i.a((byte) 0);
            if (a11 != -1) {
                if (z11) {
                    q(this.f14374i.f14389h, 0, a11 + 1);
                }
                this.f14374i.skip(a11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z11) {
            a("FHCRC", this.f14374i.q(), (short) ((int) this.f14377l.getValue()));
            this.f14377l.reset();
        }
    }

    private final void j() {
        a("CRC", this.f14374i.j(), (int) this.f14377l.getValue());
        a("ISIZE", this.f14374i.j(), (int) this.f14375j.getBytesWritten());
    }

    private final void q(e eVar, long j10, long j11) {
        u uVar = eVar.f14361h;
        if (uVar == null) {
            m.r();
        }
        while (true) {
            int i10 = uVar.f14395c;
            int i11 = uVar.f14394b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            uVar = uVar.f14398f;
            if (uVar == null) {
                m.r();
            }
        }
        while (j11 > 0) {
            int i12 = (int) (((long) uVar.f14394b) + j10);
            int min = (int) Math.min((long) (uVar.f14395c - i12), j11);
            this.f14377l.update(uVar.f14393a, i12, min);
            j11 -= (long) min;
            uVar = uVar.f14398f;
            if (uVar == null) {
                m.r();
            }
            j10 = 0;
        }
    }

    public long S(e eVar, long j10) {
        m.g(eVar, "sink");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (i10 == 0) {
            return 0;
        } else {
            if (this.f14373h == 0) {
                h();
                this.f14373h = 1;
            }
            if (this.f14373h == 1) {
                long w02 = eVar.w0();
                long S = this.f14376k.S(eVar, j10);
                if (S != -1) {
                    q(eVar, w02, S);
                    return S;
                }
                this.f14373h = 2;
            }
            if (this.f14373h == 2) {
                j();
                this.f14373h = 3;
                if (!this.f14374i.F()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f14376k.close();
    }

    public a0 d() {
        return this.f14374i.d();
    }
}
