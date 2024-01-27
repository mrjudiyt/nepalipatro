package ea;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.api.Api;
import fa.a;
import g9.d;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m;

/* compiled from: Buffer.kt */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: h  reason: collision with root package name */
    public u f14361h;

    /* renamed from: i  reason: collision with root package name */
    private long f14362i;

    public void C0(long j10) {
        if (this.f14362i < j10) {
            throw new EOFException();
        }
    }

    public byte[] D() {
        return n0(w0());
    }

    public final e E(e eVar, long j10, long j11) {
        m.g(eVar, "out");
        c.b(w0(), j10, j11);
        if (j11 != 0) {
            eVar.v0(eVar.w0() + j11);
            u uVar = this.f14361h;
            while (true) {
                if (uVar == null) {
                    m.r();
                }
                int i10 = uVar.f14395c;
                int i11 = uVar.f14394b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                uVar = uVar.f14398f;
            }
            while (j11 > 0) {
                if (uVar == null) {
                    m.r();
                }
                u d10 = uVar.d();
                int i12 = d10.f14394b + ((int) j10);
                d10.f14394b = i12;
                d10.f14395c = Math.min(i12 + ((int) j11), d10.f14395c);
                u uVar2 = eVar.f14361h;
                if (uVar2 == null) {
                    d10.f14399g = d10;
                    d10.f14398f = d10;
                    eVar.f14361h = d10;
                } else {
                    if (uVar2 == null) {
                        m.r();
                    }
                    u uVar3 = uVar2.f14399g;
                    if (uVar3 == null) {
                        m.r();
                    }
                    uVar3.c(d10);
                }
                j11 -= (long) (d10.f14395c - d10.f14394b);
                uVar = uVar.f14398f;
                j10 = 0;
            }
        }
        return this;
    }

    public boolean F() {
        return this.f14362i == 0;
    }

    public void F0(e eVar, long j10) {
        u uVar;
        m.g(eVar, "source");
        if (eVar != this) {
            c.b(eVar.w0(), 0, j10);
            while (j10 > 0) {
                u uVar2 = eVar.f14361h;
                if (uVar2 == null) {
                    m.r();
                }
                int i10 = uVar2.f14395c;
                u uVar3 = eVar.f14361h;
                if (uVar3 == null) {
                    m.r();
                }
                if (j10 < ((long) (i10 - uVar3.f14394b))) {
                    u uVar4 = this.f14361h;
                    if (uVar4 != null) {
                        if (uVar4 == null) {
                            m.r();
                        }
                        uVar = uVar4.f14399g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f14397e) {
                        if ((((long) uVar.f14395c) + j10) - ((long) (uVar.f14396d ? 0 : uVar.f14394b)) <= ((long) 8192)) {
                            u uVar5 = eVar.f14361h;
                            if (uVar5 == null) {
                                m.r();
                            }
                            uVar5.f(uVar, (int) j10);
                            eVar.v0(eVar.w0() - j10);
                            v0(w0() + j10);
                            return;
                        }
                    }
                    u uVar6 = eVar.f14361h;
                    if (uVar6 == null) {
                        m.r();
                    }
                    eVar.f14361h = uVar6.e((int) j10);
                }
                u uVar7 = eVar.f14361h;
                if (uVar7 == null) {
                    m.r();
                }
                long j11 = (long) (uVar7.f14395c - uVar7.f14394b);
                eVar.f14361h = uVar7.b();
                u uVar8 = this.f14361h;
                if (uVar8 == null) {
                    this.f14361h = uVar7;
                    uVar7.f14399g = uVar7;
                    uVar7.f14398f = uVar7;
                } else {
                    if (uVar8 == null) {
                        m.r();
                    }
                    u uVar9 = uVar8.f14399g;
                    if (uVar9 == null) {
                        m.r();
                    }
                    uVar9.c(uVar7).a();
                }
                eVar.v0(eVar.w0() - j11);
                v0(w0() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r8 != r9) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r15.f14361h = r6.b();
        ea.v.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r6.f14394b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (r1 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long H0() {
        /*
            r15 = this;
            long r0 = r15.w0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ba
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            ea.u r6 = r15.f14361h
            if (r6 != 0) goto L_0x0014
            kotlin.jvm.internal.m.r()
        L_0x0014:
            byte[] r7 = r6.f14393a
            int r8 = r6.f14394b
            int r9 = r6.f14395c
        L_0x001a:
            if (r8 >= r9) goto L_0x009c
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x002b
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x002b
            int r11 = r10 - r11
            goto L_0x0045
        L_0x002b:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x003a
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x003a
        L_0x0035:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0045
        L_0x003a:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007d
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007d
            goto L_0x0035
        L_0x0045:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0055
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x001a
        L_0x0055:
            ea.e r0 = new ea.e
            r0.<init>()
            ea.e r0 = r0.b0(r4)
            ea.e r0 = r0.G(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.o0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007d:
            if (r0 == 0) goto L_0x0081
            r1 = 1
            goto L_0x009c
        L_0x0081:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = ea.c.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009c:
            if (r8 != r9) goto L_0x00a8
            ea.u r7 = r6.b()
            r15.f14361h = r7
            ea.v.b(r6)
            goto L_0x00aa
        L_0x00a8:
            r6.f14394b = r8
        L_0x00aa:
            if (r1 != 0) goto L_0x00b0
            ea.u r6 = r15.f14361h
            if (r6 != 0) goto L_0x000d
        L_0x00b0:
            long r1 = r15.w0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.v0(r1)
            return r4
        L_0x00ba:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.e.H0():long");
    }

    public final h I0(int i10) {
        if (i10 == 0) {
            return h.f14363k;
        }
        c.b(w0(), 0, (long) i10);
        u uVar = this.f14361h;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            if (uVar == null) {
                m.r();
            }
            int i14 = uVar.f14395c;
            int i15 = uVar.f14394b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                uVar = uVar.f14398f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[(i13 * 2)];
        u uVar2 = this.f14361h;
        int i16 = 0;
        while (i11 < i10) {
            if (uVar2 == null) {
                m.r();
            }
            bArr[i16] = uVar2.f14393a;
            i11 += uVar2.f14395c - uVar2.f14394b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = uVar2.f14394b;
            uVar2.f14396d = true;
            i16++;
            uVar2 = uVar2.f14398f;
        }
        return new w(bArr, iArr);
    }

    /* renamed from: J */
    public e x() {
        return this;
    }

    public final u K0(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            u uVar = this.f14361h;
            if (uVar == null) {
                u c10 = v.c();
                this.f14361h = c10;
                c10.f14399g = c10;
                c10.f14398f = c10;
                return c10;
            }
            if (uVar == null) {
                m.r();
            }
            u uVar2 = uVar.f14399g;
            if (uVar2 == null) {
                m.r();
            }
            if (uVar2.f14395c + i10 > 8192 || !uVar2.f14397e) {
                return uVar2.c(v.c());
            }
            return uVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: L */
    public e K() {
        return this;
    }

    /* renamed from: L0 */
    public e u0(h hVar) {
        m.g(hVar, "byteString");
        hVar.y(this, 0, hVar.u());
        return this;
    }

    /* renamed from: M0 */
    public e q0(byte[] bArr) {
        m.g(bArr, "source");
        return Z(bArr, 0, bArr.length);
    }

    /* renamed from: N0 */
    public e Z(byte[] bArr, int i10, int i11) {
        m.g(bArr, "source");
        long j10 = (long) i11;
        c.b((long) bArr.length, (long) i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            u K0 = K0(1);
            int min = Math.min(i12 - i10, 8192 - K0.f14395c);
            int i13 = i10 + min;
            byte[] unused = j.d(bArr, K0.f14393a, K0.f14395c, i10, i13);
            K0.f14395c += min;
            i10 = i13;
        }
        v0(w0() + j10);
        return this;
    }

    /* renamed from: O0 */
    public e G(int i10) {
        u K0 = K0(1);
        byte[] bArr = K0.f14393a;
        int i11 = K0.f14395c;
        K0.f14395c = i11 + 1;
        bArr[i11] = (byte) i10;
        v0(w0() + 1);
        return this;
    }

    /* renamed from: P0 */
    public e b0(long j10) {
        if (j10 == 0) {
            return G(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        u K0 = K0(i10);
        byte[] bArr = K0.f14393a;
        int i11 = K0.f14395c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        K0.f14395c += i10;
        v0(w0() + ((long) i10));
        return this;
    }

    /* renamed from: Q0 */
    public e B(int i10) {
        u K0 = K0(4);
        byte[] bArr = K0.f14393a;
        int i11 = K0.f14395c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        K0.f14395c = i14 + 1;
        v0(w0() + 4);
        return this;
    }

    /* renamed from: R0 */
    public e y(int i10) {
        u K0 = K0(2);
        byte[] bArr = K0.f14393a;
        int i11 = K0.f14395c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        K0.f14395c = i12 + 1;
        v0(w0() + 2);
        return this;
    }

    public long S(e eVar, long j10) {
        m.g(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        } else if (w0() == 0) {
            return -1;
        } else {
            if (j10 > w0()) {
                j10 = w0();
            }
            eVar.F0(this, j10);
            return j10;
        }
    }

    /* renamed from: S0 */
    public e U(String str) {
        m.g(str, "string");
        return T0(str, 0, str.length());
    }

    public e T0(String str, int i10, int i11) {
        m.g(str, "string");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    while (i10 < i11) {
                        char charAt = str.charAt(i10);
                        if (charAt < 128) {
                            u K0 = K0(1);
                            byte[] bArr = K0.f14393a;
                            int i12 = K0.f14395c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                            while (i13 < min) {
                                char charAt2 = str.charAt(i13);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i13 + i12] = (byte) charAt2;
                                i13++;
                            }
                            int i14 = K0.f14395c;
                            int i15 = (i12 + i13) - i14;
                            K0.f14395c = i14 + i15;
                            v0(w0() + ((long) i15));
                            i10 = i13;
                        } else {
                            if (charAt < 2048) {
                                u K02 = K0(2);
                                byte[] bArr2 = K02.f14393a;
                                int i16 = K02.f14395c;
                                bArr2[i16] = (byte) ((charAt >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt & '?') | 128);
                                K02.f14395c = i16 + 2;
                                v0(w0() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                u K03 = K0(3);
                                byte[] bArr3 = K03.f14393a;
                                int i17 = K03.f14395c;
                                bArr3[i17] = (byte) ((charAt >> 12) | 224);
                                bArr3[i17 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i17 + 2] = (byte) ((charAt & '?') | 128);
                                K03.f14395c = i17 + 3;
                                v0(w0() + 3);
                            } else {
                                int i18 = i10 + 1;
                                char charAt3 = i18 < i11 ? str.charAt(i18) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    G(63);
                                    i10 = i18;
                                } else {
                                    int i19 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                                    u K04 = K0(4);
                                    byte[] bArr4 = K04.f14393a;
                                    int i20 = K04.f14395c;
                                    bArr4[i20] = (byte) ((i19 >> 18) | 240);
                                    bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                                    bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                                    bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                                    K04.f14395c = i20 + 4;
                                    v0(w0() + 4);
                                    i10 += 2;
                                }
                            }
                            i10++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
    }

    public e U0(int i10) {
        if (i10 < 128) {
            G(i10);
        } else if (i10 < 2048) {
            u K0 = K0(2);
            byte[] bArr = K0.f14393a;
            int i11 = K0.f14395c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            K0.f14395c = i11 + 2;
            v0(w0() + 2);
        } else if (55296 <= i10 && 57343 >= i10) {
            G(63);
        } else if (i10 < 65536) {
            u K02 = K0(3);
            byte[] bArr2 = K02.f14393a;
            int i12 = K02.f14395c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            K02.f14395c = i12 + 3;
            v0(w0() + 3);
        } else if (i10 <= 1114111) {
            u K03 = K0(4);
            byte[] bArr3 = K03.f14393a;
            int i13 = K03.f14395c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            K03.f14395c = i13 + 4;
            v0(w0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + c.f(i10));
        }
        return this;
    }

    public final byte W(long j10) {
        c.b(w0(), j10, 1);
        u uVar = this.f14361h;
        if (uVar == null) {
            m.r();
            throw null;
        } else if (w0() - j10 < j10) {
            long w02 = w0();
            while (w02 > j10) {
                uVar = uVar.f14399g;
                if (uVar == null) {
                    m.r();
                }
                w02 -= (long) (uVar.f14395c - uVar.f14394b);
            }
            return uVar.f14393a[(int) ((((long) uVar.f14394b) + j10) - w02)];
        } else {
            long j11 = 0;
            while (true) {
                int i10 = uVar.f14395c;
                int i11 = uVar.f14394b;
                long j12 = ((long) (i10 - i11)) + j11;
                if (j12 > j10) {
                    return uVar.f14393a[(int) ((((long) i11) + j10) - j11)];
                }
                uVar = uVar.f14398f;
                if (uVar == null) {
                    m.r();
                }
                j11 = j12;
            }
        }
    }

    public long Y(byte b10, long j10, long j11) {
        u uVar;
        long j12;
        int i10;
        long j13 = 0;
        if (0 <= j10 && j11 >= j10) {
            if (j11 > w0()) {
                j11 = w0();
            }
            if (j10 == j11 || (uVar = this.f14361h) == null) {
                return -1;
            }
            if (w0() - j10 < j10) {
                j12 = w0();
                while (j12 > j10) {
                    uVar = uVar.f14399g;
                    if (uVar == null) {
                        m.r();
                    }
                    j12 -= (long) (uVar.f14395c - uVar.f14394b);
                }
                while (j12 < j11) {
                    byte[] bArr = uVar.f14393a;
                    int min = (int) Math.min((long) uVar.f14395c, (((long) uVar.f14394b) + j11) - j12);
                    i10 = (int) ((((long) uVar.f14394b) + j10) - j12);
                    while (i10 < min) {
                        if (bArr[i10] != b10) {
                            i10++;
                        }
                    }
                    j12 += (long) (uVar.f14395c - uVar.f14394b);
                    uVar = uVar.f14398f;
                    if (uVar == null) {
                        m.r();
                    }
                    j10 = j12;
                }
                return -1;
            }
            while (true) {
                long j14 = ((long) (uVar.f14395c - uVar.f14394b)) + j13;
                if (j14 > j10) {
                    break;
                }
                uVar = uVar.f14398f;
                if (uVar == null) {
                    m.r();
                }
                j13 = j14;
            }
            while (j12 < j11) {
                byte[] bArr2 = uVar.f14393a;
                int min2 = (int) Math.min((long) uVar.f14395c, (((long) uVar.f14394b) + j11) - j12);
                int i11 = (int) ((((long) uVar.f14394b) + j10) - j12);
                while (i10 < min2) {
                    if (bArr2[i10] != b10) {
                        i11 = i10 + 1;
                    }
                }
                j13 = j12 + ((long) (uVar.f14395c - uVar.f14394b));
                uVar = uVar.f14398f;
                if (uVar == null) {
                    m.r();
                }
                j10 = j13;
            }
            return -1;
            return ((long) (i10 - uVar.f14394b)) + j12;
        }
        throw new IllegalArgumentException(("size=" + w0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    public final void a() {
        skip(w0());
    }

    public e b() {
        return this;
    }

    public e c() {
        return this;
    }

    public h c0() {
        return s(w0());
    }

    public void close() {
    }

    public a0 d() {
        return a0.f14345d;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x008b
        L_0x000b:
            boolean r4 = r1 instanceof ea.e
            if (r4 != 0) goto L_0x0011
            goto L_0x008b
        L_0x0011:
            long r4 = r20.w0()
            ea.e r1 = (ea.e) r1
            long r6 = r1.w0()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0021
            goto L_0x008b
        L_0x0021:
            long r4 = r20.w0()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            goto L_0x0008
        L_0x002c:
            ea.u r4 = r0.f14361h
            if (r4 != 0) goto L_0x0033
            kotlin.jvm.internal.m.r()
        L_0x0033:
            ea.u r1 = r1.f14361h
            if (r1 != 0) goto L_0x003a
            kotlin.jvm.internal.m.r()
        L_0x003a:
            int r5 = r4.f14394b
            int r8 = r1.f14394b
            r9 = r6
        L_0x003f:
            long r11 = r20.w0()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f14395c
            int r11 = r11 - r5
            int r12 = r1.f14395c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0053:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006f
            byte[] r15 = r4.f14393a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f14393a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0066
            goto L_0x008b
        L_0x0066:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0053
        L_0x006f:
            int r13 = r4.f14395c
            if (r5 != r13) goto L_0x007c
            ea.u r4 = r4.f14398f
            if (r4 != 0) goto L_0x007a
            kotlin.jvm.internal.m.r()
        L_0x007a:
            int r5 = r4.f14394b
        L_0x007c:
            int r13 = r1.f14395c
            if (r8 != r13) goto L_0x0089
            ea.u r1 = r1.f14398f
            if (r1 != 0) goto L_0x0087
            kotlin.jvm.internal.m.r()
        L_0x0087:
            int r8 = r1.f14394b
        L_0x0089:
            long r9 = r9 + r11
            goto L_0x003f
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.e.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    public void g0(byte[] bArr) {
        m.g(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int h0() {
        return c.c(readInt());
    }

    public int hashCode() {
        u uVar = this.f14361h;
        if (uVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = uVar.f14395c;
            for (int i12 = uVar.f14394b; i12 < i11; i12++) {
                i10 = (i10 * 31) + uVar.f14393a[i12];
            }
            uVar = uVar.f14398f;
            if (uVar == null) {
                m.r();
            }
        } while (uVar != this.f14361h);
        return i10;
    }

    public boolean isOpen() {
        return true;
    }

    public String j0() {
        return s0(Long.MAX_VALUE);
    }

    public short k0() {
        return c.d(readShort());
    }

    public String l0(long j10, Charset charset) {
        m.g(charset, "charset");
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (this.f14362i < j10) {
            throw new EOFException();
        } else if (i10 == 0) {
            return "";
        } else {
            u uVar = this.f14361h;
            if (uVar == null) {
                m.r();
            }
            int i11 = uVar.f14394b;
            if (((long) i11) + j10 > ((long) uVar.f14395c)) {
                return new String(n0(j10), charset);
            }
            int i12 = (int) j10;
            String str = new String(uVar.f14393a, i11, i12, charset);
            int i13 = uVar.f14394b + i12;
            uVar.f14394b = i13;
            this.f14362i -= j10;
            if (i13 == uVar.f14395c) {
                this.f14361h = uVar.b();
                v.b(uVar);
            }
            return str;
        }
    }

    public byte[] n0(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (w0() >= j10) {
            byte[] bArr = new byte[((int) j10)];
            g0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public long o(z zVar) {
        m.g(zVar, "source");
        long j10 = 0;
        while (true) {
            long S = zVar.S(this, (long) 8192);
            if (S == -1) {
                return j10;
            }
            j10 += S;
        }
    }

    public String o0() {
        return l0(this.f14362i, d.f14759b);
    }

    /* renamed from: q */
    public e clone() {
        return w();
    }

    public String r0(long j10) {
        return l0(j10, d.f14759b);
    }

    public int read(ByteBuffer byteBuffer) {
        m.g(byteBuffer, "sink");
        u uVar = this.f14361h;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f14395c - uVar.f14394b);
        byteBuffer.put(uVar.f14393a, uVar.f14394b, min);
        int i10 = uVar.f14394b + min;
        uVar.f14394b = i10;
        this.f14362i -= (long) min;
        if (i10 == uVar.f14395c) {
            this.f14361h = uVar.b();
            v.b(uVar);
        }
        return min;
    }

    public byte readByte() {
        if (w0() != 0) {
            u uVar = this.f14361h;
            if (uVar == null) {
                m.r();
            }
            int i10 = uVar.f14394b;
            int i11 = uVar.f14395c;
            int i12 = i10 + 1;
            byte b10 = uVar.f14393a[i10];
            v0(w0() - 1);
            if (i12 == i11) {
                this.f14361h = uVar.b();
                v.b(uVar);
            } else {
                uVar.f14394b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (w0() >= 4) {
            u uVar = this.f14361h;
            if (uVar == null) {
                m.r();
            }
            int i10 = uVar.f14394b;
            int i11 = uVar.f14395c;
            if (((long) (i11 - i10)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f14393a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            v0(w0() - 4);
            if (i15 == i11) {
                this.f14361h = uVar.b();
                v.b(uVar);
            } else {
                uVar.f14394b = i15;
            }
            return b12;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (w0() >= 2) {
            u uVar = this.f14361h;
            if (uVar == null) {
                m.r();
            }
            int i10 = uVar.f14394b;
            int i11 = uVar.f14395c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.f14393a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            v0(w0() - 2);
            if (i13 == i11) {
                this.f14361h = uVar.b();
                v.b(uVar);
            } else {
                uVar.f14394b = i13;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public h s(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        } else if (w0() < j10) {
            throw new EOFException();
        } else if (j10 < ((long) 4096)) {
            return new h(n0(j10));
        } else {
            h I0 = I0((int) j10);
            skip(j10);
            return I0;
        }
    }

    public String s0(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long Y = Y(b10, 0, j11);
            if (Y != -1) {
                return a.b(this, Y);
            }
            if (j11 < w0() && W(j11 - 1) == ((byte) 13) && W(j11) == b10) {
                return a.b(this, j11);
            }
            e eVar = new e();
            E(eVar, 0, Math.min((long) 32, w0()));
            throw new EOFException("\\n not found: limit=" + Math.min(w0(), j10) + " content=" + eVar.c0().n() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public void skip(long j10) {
        while (j10 > 0) {
            u uVar = this.f14361h;
            if (uVar != null) {
                int min = (int) Math.min(j10, (long) (uVar.f14395c - uVar.f14394b));
                long j11 = (long) min;
                v0(w0() - j11);
                j10 -= j11;
                int i10 = uVar.f14394b + min;
                uVar.f14394b = i10;
                if (i10 == uVar.f14395c) {
                    this.f14361h = uVar.b();
                    v.b(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return y0().toString();
    }

    public final long u() {
        long w02 = w0();
        if (w02 == 0) {
            return 0;
        }
        u uVar = this.f14361h;
        if (uVar == null) {
            m.r();
        }
        u uVar2 = uVar.f14399g;
        if (uVar2 == null) {
            m.r();
        }
        int i10 = uVar2.f14395c;
        if (i10 < 8192 && uVar2.f14397e) {
            w02 -= (long) (i10 - uVar2.f14394b);
        }
        return w02;
    }

    public final void v0(long j10) {
        this.f14362i = j10;
    }

    public final e w() {
        e eVar = new e();
        if (w0() != 0) {
            u uVar = this.f14361h;
            if (uVar == null) {
                m.r();
            }
            u d10 = uVar.d();
            eVar.f14361h = d10;
            d10.f14399g = d10;
            d10.f14398f = d10;
            for (u uVar2 = uVar.f14398f; uVar2 != uVar; uVar2 = uVar2.f14398f) {
                u uVar3 = d10.f14399g;
                if (uVar3 == null) {
                    m.r();
                }
                if (uVar2 == null) {
                    m.r();
                }
                uVar3.c(uVar2.d());
            }
            eVar.v0(w0());
        }
        return eVar;
    }

    public final long w0() {
        return this.f14362i;
    }

    public int write(ByteBuffer byteBuffer) {
        m.g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            u K0 = K0(1);
            int min = Math.min(i10, 8192 - K0.f14395c);
            byteBuffer.get(K0.f14393a, K0.f14395c, min);
            i10 -= min;
            K0.f14395c += min;
        }
        this.f14362i += (long) remaining;
        return remaining;
    }

    public final h y0() {
        if (w0() <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return I0((int) w0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + w0()).toString());
    }

    public int read(byte[] bArr, int i10, int i11) {
        m.g(bArr, "sink");
        c.b((long) bArr.length, (long) i10, (long) i11);
        u uVar = this.f14361h;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i11, uVar.f14395c - uVar.f14394b);
        byte[] bArr2 = uVar.f14393a;
        int i12 = uVar.f14394b;
        byte[] unused = j.d(bArr2, bArr, i10, i12, i12 + min);
        uVar.f14394b += min;
        v0(w0() - ((long) min));
        if (uVar.f14394b != uVar.f14395c) {
            return min;
        }
        this.f14361h = uVar.b();
        v.b(uVar);
        return min;
    }
}
