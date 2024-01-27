package x7;

import com.google.android.gms.common.api.Api;
import ea.e;
import ea.f;
import ea.g;
import ea.h;
import ea.i;
import ea.x;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import x7.b;

/* compiled from: Spdy3 */
public final class o implements p {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f17275a;

    /* compiled from: Spdy3 */
    static final class a implements b {

        /* renamed from: h  reason: collision with root package name */
        private final g f17276h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f17277i;

        /* renamed from: j  reason: collision with root package name */
        private final k f17278j;

        a(g gVar, boolean z10) {
            this.f17276h = gVar;
            this.f17278j = new k(gVar);
            this.f17277i = z10;
        }

        private void E(b.a aVar, int i10, int i11) {
            aVar.k(false, (i10 & 1) != 0, this.f17276h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, this.f17278j.f(i11 - 4), g.SPDY_REPLY);
        }

        private void J(b.a aVar, int i10, int i11) {
            int readInt = this.f17276h.readInt();
            int readInt2 = this.f17276h.readInt();
            int i12 = readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i13 = readInt2 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f17276h.readShort();
            List<f> f10 = this.f17278j.f(i11 - 10);
            aVar.k((i10 & 2) != 0, (i10 & 1) != 0, i12, i13, f10, g.SPDY_SYN_STREAM);
        }

        private void L(b.a aVar, int i10, int i11) {
            if (i11 == 8) {
                int readInt = this.f17276h.readInt();
                int readInt2 = this.f17276h.readInt();
                int i12 = readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                long j10 = (long) (readInt2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                if (j10 != 0) {
                    aVar.e(i12, j10);
                } else {
                    throw a("windowSizeIncrement was 0", Long.valueOf(j10));
                }
            } else {
                throw a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i11));
            }
        }

        private static IOException a(String str, Object... objArr) {
            throw new IOException(String.format(str, objArr));
        }

        private void h(b.a aVar, int i10, int i11) {
            if (i11 == 8) {
                int readInt = this.f17276h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int readInt2 = this.f17276h.readInt();
                a e10 = a.e(readInt2);
                if (e10 != null) {
                    aVar.m(readInt, e10, h.f14363k);
                } else {
                    throw a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                }
            } else {
                throw a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i11));
            }
        }

        private void j(b.a aVar, int i10, int i11) {
            aVar.k(false, false, this.f17276h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, this.f17278j.f(i11 - 4), g.SPDY_HEADERS);
        }

        private void q(b.a aVar, int i10, int i11) {
            boolean z10 = true;
            if (i11 == 4) {
                int readInt = this.f17276h.readInt();
                if (this.f17277i != ((readInt & 1) == 1)) {
                    z10 = false;
                }
                aVar.f(z10, readInt, 0);
                return;
            }
            throw a("TYPE_PING length: %d != 4", Integer.valueOf(i11));
        }

        private void u(b.a aVar, int i10, int i11) {
            if (i11 == 8) {
                int readInt = this.f17276h.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int readInt2 = this.f17276h.readInt();
                a d10 = a.d(readInt2);
                if (d10 != null) {
                    aVar.g(readInt, d10);
                } else {
                    throw a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                }
            } else {
                throw a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i11));
            }
        }

        private void w(b.a aVar, int i10, int i11) {
            int readInt = this.f17276h.readInt();
            boolean z10 = false;
            if (i11 == (readInt * 8) + 4) {
                n nVar = new n();
                for (int i12 = 0; i12 < readInt; i12++) {
                    int readInt2 = this.f17276h.readInt();
                    int i13 = (-16777216 & readInt2) >>> 24;
                    nVar.l(readInt2 & 16777215, i13, this.f17276h.readInt());
                }
                if ((i10 & 1) != 0) {
                    z10 = true;
                }
                aVar.l(z10, nVar);
                return;
            }
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i11), Integer.valueOf(readInt));
        }

        public boolean T(b.a aVar) {
            boolean z10 = false;
            try {
                int readInt = this.f17276h.readInt();
                int readInt2 = this.f17276h.readInt();
                int i10 = (-16777216 & readInt2) >>> 24;
                int i11 = readInt2 & 16777215;
                if ((Integer.MIN_VALUE & readInt) != 0) {
                    int i12 = (2147418112 & readInt) >>> 16;
                    int i13 = readInt & 65535;
                    if (i12 == 3) {
                        switch (i13) {
                            case 1:
                                J(aVar, i10, i11);
                                return true;
                            case 2:
                                E(aVar, i10, i11);
                                return true;
                            case 3:
                                u(aVar, i10, i11);
                                return true;
                            case 4:
                                w(aVar, i10, i11);
                                return true;
                            case 6:
                                q(aVar, i10, i11);
                                return true;
                            case 7:
                                h(aVar, i10, i11);
                                return true;
                            case 8:
                                j(aVar, i10, i11);
                                return true;
                            case 9:
                                L(aVar, i10, i11);
                                return true;
                            default:
                                this.f17276h.skip((long) i11);
                                return true;
                        }
                    } else {
                        throw new ProtocolException("version != 3: " + i12);
                    }
                } else {
                    int i14 = readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    if ((i10 & 1) != 0) {
                        z10 = true;
                    }
                    aVar.n(z10, i14, this.f17276h, i11);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f17278j.c();
        }

        public void f0() {
        }
    }

    /* compiled from: Spdy3 */
    static final class b implements c {

        /* renamed from: h  reason: collision with root package name */
        private final f f17279h;

        /* renamed from: i  reason: collision with root package name */
        private final e f17280i;

        /* renamed from: j  reason: collision with root package name */
        private final f f17281j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f17282k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f17283l;

        b(f fVar, boolean z10) {
            this.f17279h = fVar;
            this.f17282k = z10;
            Deflater deflater = new Deflater();
            deflater.setDictionary(o.f17275a);
            e eVar = new e();
            this.f17280i = eVar;
            this.f17281j = ea.o.a(new i((x) eVar, deflater));
        }

        private void h(List<f> list) {
            this.f17281j.B(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = list.get(i10).f17215a;
                this.f17281j.B(hVar.u());
                this.f17281j.u0(hVar);
                h hVar2 = list.get(i10).f17216b;
                this.f17281j.B(hVar2.u());
                this.f17281j.u0(hVar2);
            }
            this.f17281j.flush();
        }

        public int A0() {
            return 16383;
        }

        public synchronized void B0(boolean z10, boolean z11, int i10, int i11, List<f> list) {
            if (!this.f17283l) {
                h(list);
                int w02 = (int) (this.f17280i.w0() + 10);
                boolean z12 = z10 | (z11 ? (char) 2 : 0);
                this.f17279h.B(-2147287039);
                this.f17279h.B(((z12 & true ? 1 : 0) << true) | (w02 & 16777215));
                this.f17279h.B(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f17279h.B(Integer.MAX_VALUE & i11);
                this.f17279h.y(0);
                this.f17279h.o(this.f17280i);
                this.f17279h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void H() {
        }

        public void P(n nVar) {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, int i11, e eVar, int i12) {
            if (!this.f17283l) {
                long j10 = (long) i12;
                if (j10 <= 16777215) {
                    this.f17279h.B(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    this.f17279h.B(((i11 & 255) << 24) | (16777215 & i12));
                    if (i12 > 0) {
                        this.f17279h.F0(eVar, j10);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i12);
            }
            throw new IOException("closed");
        }

        public synchronized void close() {
            this.f17283l = true;
            w7.h.b(this.f17279h, this.f17281j);
        }

        public synchronized void e(int i10, long j10) {
            if (this.f17283l) {
                throw new IOException("closed");
            } else if (j10 == 0 || j10 > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j10);
            } else {
                this.f17279h.B(-2147287031);
                this.f17279h.B(8);
                this.f17279h.B(i10);
                this.f17279h.B((int) j10);
                this.f17279h.flush();
            }
        }

        public synchronized void f(boolean z10, int i10, int i11) {
            if (!this.f17283l) {
                boolean z11 = false;
                if (this.f17282k != ((i10 & 1) == 1)) {
                    z11 = true;
                }
                if (z10 == z11) {
                    this.f17279h.B(-2147287034);
                    this.f17279h.B(4);
                    this.f17279h.B(i10);
                    this.f17279h.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f17283l) {
                this.f17279h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void g(int i10, a aVar) {
            if (this.f17283l) {
                throw new IOException("closed");
            } else if (aVar.f17123i != -1) {
                this.f17279h.B(-2147287037);
                this.f17279h.B(8);
                this.f17279h.B(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f17279h.B(aVar.f17123i);
                this.f17279h.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void i(int i10, int i11, List<f> list) {
        }

        public synchronized void p(int i10, a aVar, byte[] bArr) {
            if (this.f17283l) {
                throw new IOException("closed");
            } else if (aVar.f17124j != -1) {
                this.f17279h.B(-2147287033);
                this.f17279h.B(8);
                this.f17279h.B(i10);
                this.f17279h.B(aVar.f17124j);
                this.f17279h.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }

        public synchronized void t0(boolean z10, int i10, e eVar, int i11) {
            a(i10, z10 ? 1 : 0, eVar, i11);
        }

        public synchronized void x0(n nVar) {
            if (!this.f17283l) {
                int m10 = nVar.m();
                this.f17279h.B(-2147287036);
                this.f17279h.B((((m10 * 8) + 4) & 16777215) | 0);
                this.f17279h.B(m10);
                for (int i10 = 0; i10 <= 10; i10++) {
                    if (nVar.i(i10)) {
                        this.f17279h.B(((nVar.b(i10) & 255) << 24) | (i10 & 16777215));
                        this.f17279h.B(nVar.c(i10));
                    }
                }
                this.f17279h.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    static {
        try {
            f17275a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(w7.h.f17016c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public c a(f fVar, boolean z10) {
        return new b(fVar, z10);
    }

    public b b(g gVar, boolean z10) {
        return new a(gVar, z10);
    }
}
