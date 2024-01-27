package ea;

import fa.a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.m;

/* compiled from: RealBufferedSource.kt */
public final class t implements g {

    /* renamed from: h  reason: collision with root package name */
    public final e f14389h = new e();

    /* renamed from: i  reason: collision with root package name */
    public boolean f14390i;

    /* renamed from: j  reason: collision with root package name */
    public final z f14391j;

    public t(z zVar) {
        m.g(zVar, "source");
        this.f14391j = zVar;
    }

    public void C0(long j10) {
        if (!w(j10)) {
            throw new EOFException();
        }
    }

    public byte[] D() {
        this.f14389h.o(this.f14391j);
        return this.f14389h.D();
    }

    public boolean F() {
        if (!(!this.f14390i)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f14389h.F() || this.f14391j.S(this.f14389h, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long H0() {
        /*
            r5 = this;
            r0 = 1
            r5.C0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.w(r2)
            if (r2 == 0) goto L_0x0064
            ea.e r2 = r5.f14389h
            long r3 = (long) r0
            byte r2 = r2.W(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = g9.b.a(r1)
            int r1 = g9.b.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.m.b(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L_0x0064:
            ea.e r0 = r5.f14389h
            long r0 = r0.H0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.t.H0():long");
    }

    public long S(e eVar, long j10) {
        m.g(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!(true ^ this.f14390i)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f14389h.w0() == 0 && this.f14391j.S(this.f14389h, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f14389h.S(eVar, Math.min(j10, this.f14389h.w0()));
        }
    }

    public long a(byte b10) {
        return h(b10, 0, Long.MAX_VALUE);
    }

    public e b() {
        return this.f14389h;
    }

    public e c() {
        return this.f14389h;
    }

    public void close() {
        if (!this.f14390i) {
            this.f14390i = true;
            this.f14391j.close();
            this.f14389h.a();
        }
    }

    public a0 d() {
        return this.f14391j.d();
    }

    public long h(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f14390i) {
            if (0 > j10 || j11 < j10) {
                z10 = false;
            }
            if (z10) {
                while (j10 < j11) {
                    long Y = this.f14389h.Y(b10, j10, j11);
                    if (Y != -1) {
                        return Y;
                    }
                    long w02 = this.f14389h.w0();
                    if (w02 >= j11 || this.f14391j.S(this.f14389h, (long) 8192) == -1) {
                        return -1;
                    }
                    j10 = Math.max(j10, w02);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f14390i;
    }

    public int j() {
        C0(4);
        return this.f14389h.h0();
    }

    public String j0() {
        return u(Long.MAX_VALUE);
    }

    public byte[] n0(long j10) {
        C0(j10);
        return this.f14389h.n0(j10);
    }

    public short q() {
        C0(2);
        return this.f14389h.k0();
    }

    public int read(ByteBuffer byteBuffer) {
        m.g(byteBuffer, "sink");
        if (this.f14389h.w0() == 0 && this.f14391j.S(this.f14389h, (long) 8192) == -1) {
            return -1;
        }
        return this.f14389h.read(byteBuffer);
    }

    public byte readByte() {
        C0(1);
        return this.f14389h.readByte();
    }

    public int readInt() {
        C0(4);
        return this.f14389h.readInt();
    }

    public short readShort() {
        C0(2);
        return this.f14389h.readShort();
    }

    public h s(long j10) {
        C0(j10);
        return this.f14389h.s(j10);
    }

    public void skip(long j10) {
        if (!this.f14390i) {
            while (j10 > 0) {
                if (this.f14389h.w0() == 0 && this.f14391j.S(this.f14389h, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f14389h.w0());
                this.f14389h.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f14391j + ')';
    }

    public String u(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long h10 = h(b10, 0, j11);
            if (h10 != -1) {
                return a.b(this.f14389h, h10);
            }
            if (j11 < Long.MAX_VALUE && w(j11) && this.f14389h.W(j11 - 1) == ((byte) 13) && w(1 + j11) && this.f14389h.W(j11) == b10) {
                return a.b(this.f14389h, j11);
            }
            e eVar = new e();
            e eVar2 = this.f14389h;
            eVar2.E(eVar, 0, Math.min((long) 32, eVar2.w0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f14389h.w0(), j10) + " content=" + eVar.c0().n() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public boolean w(long j10) {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (!this.f14390i) {
            while (this.f14389h.w0() < j10) {
                if (this.f14391j.S(this.f14389h, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
