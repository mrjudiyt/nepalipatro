package x7;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ea.a0;
import ea.e;
import ea.f;
import ea.g;
import ea.h;
import ea.z;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import x7.b;
import x7.h;

/* compiled from: Http2 */
public final class i implements p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f17234a = Logger.getLogger(b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final h f17235b = h.e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* compiled from: Http2 */
    static final class a implements z {

        /* renamed from: h  reason: collision with root package name */
        private final g f17236h;

        /* renamed from: i  reason: collision with root package name */
        int f17237i;

        /* renamed from: j  reason: collision with root package name */
        byte f17238j;

        /* renamed from: k  reason: collision with root package name */
        int f17239k;

        /* renamed from: l  reason: collision with root package name */
        int f17240l;

        /* renamed from: m  reason: collision with root package name */
        short f17241m;

        public a(g gVar) {
            this.f17236h = gVar;
        }

        private void a() {
            int i10 = this.f17239k;
            int f10 = i.m(this.f17236h);
            this.f17240l = f10;
            this.f17237i = f10;
            byte readByte = (byte) (this.f17236h.readByte() & 255);
            this.f17238j = (byte) (this.f17236h.readByte() & 255);
            if (i.f17234a.isLoggable(Level.FINE)) {
                i.f17234a.fine(b.b(true, this.f17239k, this.f17237i, readByte, this.f17238j));
            }
            int readInt = this.f17236h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f17239k = readInt;
            if (readByte != 9) {
                throw i.k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i10) {
                throw i.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public long S(e eVar, long j10) {
            while (true) {
                int i10 = this.f17240l;
                if (i10 == 0) {
                    this.f17236h.skip((long) this.f17241m);
                    this.f17241m = 0;
                    if ((this.f17238j & 4) != 0) {
                        return -1;
                    }
                    a();
                } else {
                    long S = this.f17236h.S(eVar, Math.min(j10, (long) i10));
                    if (S == -1) {
                        return -1;
                    }
                    this.f17240l = (int) (((long) this.f17240l) - S);
                    return S;
                }
            }
        }

        public void close() {
        }

        public a0 d() {
            return this.f17236h.d();
        }
    }

    /* compiled from: Http2 */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f17242a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f17243b = new String[64];

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f17244c = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f17244c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", new Object[]{Integer.toBinaryString(i11)}).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f17243b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i12 = 0; i12 < 1; i12++) {
                int i13 = iArr[i12];
                String[] strArr3 = f17243b;
                strArr3[i13 | 8] = strArr3[i13] + "|PADDED";
            }
            String[] strArr4 = f17243b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr2[i14];
                for (int i16 = 0; i16 < 1; i16++) {
                    int i17 = iArr[i16];
                    String[] strArr5 = f17243b;
                    int i18 = i17 | i15;
                    strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                    strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f17243b;
                if (i10 < strArr6.length) {
                    if (strArr6[i10] == null) {
                        strArr6[i10] = f17244c[i10];
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        b() {
        }

        static String a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (!(b10 == 2 || b10 == 3)) {
                if (b10 == 4 || b10 == 6) {
                    if (b11 == 1) {
                        return "ACK";
                    }
                    return f17244c[b11];
                } else if (!(b10 == 7 || b10 == 8)) {
                    String[] strArr = f17243b;
                    String str = b11 < strArr.length ? strArr[b11] : f17244c[b11];
                    if (b10 != 5 || (b11 & 4) == 0) {
                        return (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f17244c[b11];
        }

        static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f17242a;
            String format = b10 < strArr.length ? strArr[b10] : String.format("0x%02x", new Object[]{Byte.valueOf(b10)});
            String a10 = a(b10, b11);
            Object[] objArr = new Object[5];
            objArr[0] = z10 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = format;
            objArr[4] = a10;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* compiled from: Http2 */
    static final class c implements b {

        /* renamed from: h  reason: collision with root package name */
        private final g f17245h;

        /* renamed from: i  reason: collision with root package name */
        private final a f17246i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f17247j;

        /* renamed from: k  reason: collision with root package name */
        final h.a f17248k;

        c(g gVar, int i10, boolean z10) {
            this.f17245h = gVar;
            this.f17247j = z10;
            a aVar = new a(gVar);
            this.f17246i = aVar;
            this.f17248k = new h.a(i10, aVar);
        }

        private void E(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 5) {
                throw i.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            } else if (i11 != 0) {
                w(aVar, i11);
            } else {
                throw i.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        private void J(b.a aVar, int i10, byte b10, int i11) {
            short s10 = 0;
            if (i11 != 0) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f17245h.readByte() & 255);
                }
                aVar.i(i11, this.f17245h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, j(i.l(i10 - 4, b10, s10), s10, b10, i11));
                return;
            }
            throw i.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        private void L(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw i.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            } else if (i11 != 0) {
                int readInt = this.f17245h.readInt();
                a a10 = a.a(readInt);
                if (a10 != null) {
                    aVar.g(i11, a10);
                } else {
                    throw i.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw i.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        private void W(b.a aVar, int i10, byte b10, int i11) {
            if (i11 != 0) {
                throw i.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b10 & 1) != 0) {
                if (i10 == 0) {
                    aVar.j();
                    return;
                }
                throw i.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i10 % 6 == 0) {
                n nVar = new n();
                for (int i12 = 0; i12 < i10; i12 += 6) {
                    short readShort = this.f17245h.readShort();
                    int readInt = this.f17245h.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw i.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt >= 0) {
                                break;
                            } else {
                                throw i.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        case 5:
                            if (readInt >= 16384 && readInt <= 16777215) {
                                break;
                            } else {
                                throw i.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                            break;
                        default:
                            throw i.k("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(readShort));
                    }
                    nVar.l(readShort, 0, readInt);
                }
                aVar.l(false, nVar);
                if (nVar.d() >= 0) {
                    this.f17248k.g(nVar.d());
                }
            } else {
                throw i.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
        }

        private void Y(b.a aVar, int i10, byte b10, int i11) {
            if (i10 == 4) {
                long readInt = ((long) this.f17245h.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.e(i11, readInt);
                } else {
                    throw i.k("windowSizeIncrement was 0", Long.valueOf(readInt));
                }
            } else {
                throw i.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
        }

        private void a(b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = true;
            short s10 = 0;
            boolean z11 = (b10 & 1) != 0;
            if ((b10 & 32) == 0) {
                z10 = false;
            }
            if (!z10) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f17245h.readByte() & 255);
                }
                aVar.n(z11, i11, this.f17245h, i.l(i10, b10, s10));
                this.f17245h.skip((long) s10);
                return;
            }
            throw i.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        private void h(b.a aVar, int i10, byte b10, int i11) {
            if (i10 < 8) {
                throw i.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            } else if (i11 == 0) {
                int readInt = this.f17245h.readInt();
                int readInt2 = this.f17245h.readInt();
                int i12 = i10 - 8;
                a a10 = a.a(readInt2);
                if (a10 != null) {
                    ea.h hVar = ea.h.f14363k;
                    if (i12 > 0) {
                        hVar = this.f17245h.s((long) i12);
                    }
                    aVar.m(readInt, a10, hVar);
                    return;
                }
                throw i.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw i.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        private List<f> j(int i10, short s10, byte b10, int i11) {
            a aVar = this.f17246i;
            aVar.f17240l = i10;
            aVar.f17237i = i10;
            aVar.f17241m = s10;
            aVar.f17238j = b10;
            aVar.f17239k = i11;
            this.f17248k.l();
            return this.f17248k.e();
        }

        private void q(b.a aVar, int i10, byte b10, int i11) {
            short s10 = 0;
            if (i11 != 0) {
                boolean z10 = (b10 & 1) != 0;
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f17245h.readByte() & 255);
                }
                if ((b10 & 32) != 0) {
                    w(aVar, i11);
                    i10 -= 5;
                }
                aVar.k(false, z10, i11, -1, j(i.l(i10, b10, s10), s10, b10, i11), g.HTTP_20_HEADERS);
                return;
            }
            throw i.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        private void u(b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = false;
            if (i10 != 8) {
                throw i.k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            } else if (i11 == 0) {
                int readInt = this.f17245h.readInt();
                int readInt2 = this.f17245h.readInt();
                if ((b10 & 1) != 0) {
                    z10 = true;
                }
                aVar.f(z10, readInt, readInt2);
            } else {
                throw i.k("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        private void w(b.a aVar, int i10) {
            int readInt = this.f17245h.readInt();
            aVar.o(i10, readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER, (this.f17245h.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        public boolean T(b.a aVar) {
            try {
                this.f17245h.C0(9);
                int f10 = i.m(this.f17245h);
                if (f10 < 0 || f10 > 16384) {
                    throw i.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(f10));
                }
                byte readByte = (byte) (this.f17245h.readByte() & 255);
                byte readByte2 = (byte) (this.f17245h.readByte() & 255);
                int readInt = this.f17245h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i.f17234a.isLoggable(Level.FINE)) {
                    i.f17234a.fine(b.b(true, readInt, f10, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(aVar, f10, readByte2, readInt);
                        break;
                    case 1:
                        q(aVar, f10, readByte2, readInt);
                        break;
                    case 2:
                        E(aVar, f10, readByte2, readInt);
                        break;
                    case 3:
                        L(aVar, f10, readByte2, readInt);
                        break;
                    case 4:
                        W(aVar, f10, readByte2, readInt);
                        break;
                    case 5:
                        J(aVar, f10, readByte2, readInt);
                        break;
                    case 6:
                        u(aVar, f10, readByte2, readInt);
                        break;
                    case 7:
                        h(aVar, f10, readByte2, readInt);
                        break;
                    case 8:
                        Y(aVar, f10, readByte2, readInt);
                        break;
                    default:
                        this.f17245h.skip((long) f10);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f17245h.close();
        }

        public void f0() {
            if (!this.f17247j) {
                ea.h s10 = this.f17245h.s((long) i.f17235b.u());
                if (i.f17234a.isLoggable(Level.FINE)) {
                    i.f17234a.fine(String.format("<< CONNECTION %s", new Object[]{s10.n()}));
                }
                if (!i.f17235b.equals(s10)) {
                    throw i.k("Expected a connection header but was %s", s10.x());
                }
            }
        }
    }

    /* compiled from: Http2 */
    static final class d implements c {

        /* renamed from: h  reason: collision with root package name */
        private final f f17249h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f17250i;

        /* renamed from: j  reason: collision with root package name */
        private final e f17251j;

        /* renamed from: k  reason: collision with root package name */
        private final h.b f17252k;

        /* renamed from: l  reason: collision with root package name */
        private int f17253l = 16384;

        /* renamed from: m  reason: collision with root package name */
        private boolean f17254m;

        d(f fVar, boolean z10) {
            this.f17249h = fVar;
            this.f17250i = z10;
            e eVar = new e();
            this.f17251j = eVar;
            this.f17252k = new h.b(eVar);
        }

        private void q(int i10, long j10) {
            while (j10 > 0) {
                int min = (int) Math.min((long) this.f17253l, j10);
                long j11 = (long) min;
                j10 -= j11;
                h(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : 0);
                this.f17249h.F0(this.f17251j, j11);
            }
        }

        public int A0() {
            return this.f17253l;
        }

        public synchronized void B0(boolean z10, boolean z11, int i10, int i11, List<f> list) {
            if (!z11) {
                try {
                    if (!this.f17254m) {
                        j(z10, i10, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public synchronized void H() {
            if (this.f17254m) {
                throw new IOException("closed");
            } else if (this.f17250i) {
                if (i.f17234a.isLoggable(Level.FINE)) {
                    i.f17234a.fine(String.format(">> CONNECTION %s", new Object[]{i.f17235b.n()}));
                }
                this.f17249h.q0(i.f17235b.w());
                this.f17249h.flush();
            }
        }

        public synchronized void P(n nVar) {
            if (!this.f17254m) {
                this.f17253l = nVar.g(this.f17253l);
                h(0, 0, (byte) 4, (byte) 1);
                this.f17249h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, byte b10, e eVar, int i11) {
            h(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f17249h.F0(eVar, (long) i11);
            }
        }

        public synchronized void close() {
            this.f17254m = true;
            this.f17249h.close();
        }

        public synchronized void e(int i10, long j10) {
            if (this.f17254m) {
                throw new IOException("closed");
            } else if (j10 == 0 || j10 > 2147483647L) {
                throw i.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            } else {
                h(i10, 4, (byte) 8, (byte) 0);
                this.f17249h.B((int) j10);
                this.f17249h.flush();
            }
        }

        public synchronized void f(boolean z10, int i10, int i11) {
            if (!this.f17254m) {
                h(0, 8, (byte) 6, z10 ? (byte) 1 : 0);
                this.f17249h.B(i10);
                this.f17249h.B(i11);
                this.f17249h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f17254m) {
                this.f17249h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void g(int i10, a aVar) {
            if (this.f17254m) {
                throw new IOException("closed");
            } else if (aVar.f17122h != -1) {
                h(i10, 4, (byte) 3, (byte) 0);
                this.f17249h.B(aVar.f17122h);
                this.f17249h.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, int i11, byte b10, byte b11) {
            if (i.f17234a.isLoggable(Level.FINE)) {
                i.f17234a.fine(b.b(false, i10, i11, b10, b11));
            }
            int i12 = this.f17253l;
            if (i11 > i12) {
                throw i.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            } else if ((Integer.MIN_VALUE & i10) == 0) {
                i.n(this.f17249h, i11);
                this.f17249h.G(b10 & 255);
                this.f17249h.G(b11 & 255);
                this.f17249h.B(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                throw i.j("reserved bit set: %s", Integer.valueOf(i10));
            }
        }

        public synchronized void i(int i10, int i11, List<f> list) {
            if (!this.f17254m) {
                this.f17252k.b(list);
                long w02 = this.f17251j.w0();
                int min = (int) Math.min((long) (this.f17253l - 4), w02);
                long j10 = (long) min;
                int i12 = (w02 > j10 ? 1 : (w02 == j10 ? 0 : -1));
                h(i10, min + 4, (byte) 5, i12 == 0 ? (byte) 4 : 0);
                this.f17249h.B(i11 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f17249h.F0(this.f17251j, j10);
                if (i12 > 0) {
                    q(i10, w02 - j10);
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        public void j(boolean z10, int i10, List<f> list) {
            if (!this.f17254m) {
                this.f17252k.b(list);
                long w02 = this.f17251j.w0();
                int min = (int) Math.min((long) this.f17253l, w02);
                long j10 = (long) min;
                int i11 = (w02 > j10 ? 1 : (w02 == j10 ? 0 : -1));
                byte b10 = i11 == 0 ? (byte) 4 : 0;
                if (z10) {
                    b10 = (byte) (b10 | 1);
                }
                h(i10, min, (byte) 1, b10);
                this.f17249h.F0(this.f17251j, j10);
                if (i11 > 0) {
                    q(i10, w02 - j10);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public synchronized void p(int i10, a aVar, byte[] bArr) {
            if (this.f17254m) {
                throw new IOException("closed");
            } else if (aVar.f17122h != -1) {
                h(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f17249h.B(i10);
                this.f17249h.B(aVar.f17122h);
                if (bArr.length > 0) {
                    this.f17249h.q0(bArr);
                }
                this.f17249h.flush();
            } else {
                throw i.j("errorCode.httpCode == -1", new Object[0]);
            }
        }

        public synchronized void t0(boolean z10, int i10, e eVar, int i11) {
            if (!this.f17254m) {
                byte b10 = 0;
                if (z10) {
                    b10 = (byte) 1;
                }
                a(i10, b10, eVar, i11);
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void x0(n nVar) {
            if (!this.f17254m) {
                int i10 = 0;
                h(0, nVar.m() * 6, (byte) 4, (byte) 0);
                while (i10 < 10) {
                    if (nVar.i(i10)) {
                        this.f17249h.y(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        this.f17249h.B(nVar.c(i10));
                    }
                    i10++;
                }
                this.f17249h.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    public static int l(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public static int m(g gVar) {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    public static void n(f fVar, int i10) {
        fVar.G((i10 >>> 16) & 255);
        fVar.G((i10 >>> 8) & 255);
        fVar.G(i10 & 255);
    }

    public c a(f fVar, boolean z10) {
        return new d(fVar, z10);
    }

    public b b(g gVar, boolean z10) {
        return new c(gVar, 4096, z10);
    }
}
