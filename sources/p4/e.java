package p4;

import a6.m0;
import a6.p;
import a6.q;
import a6.u;
import a6.y;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.firebase.FirebaseError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k4.b0;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.x;
import k4.y;

/* compiled from: MatroskaExtractor */
public class e implements i {

    /* renamed from: b0  reason: collision with root package name */
    public static final o f10495b0 = d.f16190b;

    /* renamed from: c0  reason: collision with root package name */
    private static final byte[] f10496c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f10497d0 = m0.g0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0  reason: collision with root package name */
    private static final byte[] f10498e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public static final UUID f10499f0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public static final Map<String, Integer> f10500g0;
    private long A;
    private long B;
    private q C;
    private q D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final c f10501a;

    /* renamed from: a0  reason: collision with root package name */
    private k f10502a0;

    /* renamed from: b  reason: collision with root package name */
    private final g f10503b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<c> f10504c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f10505d;

    /* renamed from: e  reason: collision with root package name */
    private final y f10506e;

    /* renamed from: f  reason: collision with root package name */
    private final y f10507f;

    /* renamed from: g  reason: collision with root package name */
    private final y f10508g;

    /* renamed from: h  reason: collision with root package name */
    private final y f10509h;

    /* renamed from: i  reason: collision with root package name */
    private final y f10510i;

    /* renamed from: j  reason: collision with root package name */
    private final y f10511j;

    /* renamed from: k  reason: collision with root package name */
    private final y f10512k;

    /* renamed from: l  reason: collision with root package name */
    private final y f10513l;

    /* renamed from: m  reason: collision with root package name */
    private final y f10514m;

    /* renamed from: n  reason: collision with root package name */
    private final y f10515n;

    /* renamed from: o  reason: collision with root package name */
    private ByteBuffer f10516o;

    /* renamed from: p  reason: collision with root package name */
    private long f10517p;

    /* renamed from: q  reason: collision with root package name */
    private long f10518q;

    /* renamed from: r  reason: collision with root package name */
    private long f10519r;

    /* renamed from: s  reason: collision with root package name */
    private long f10520s;

    /* renamed from: t  reason: collision with root package name */
    private long f10521t;

    /* renamed from: u  reason: collision with root package name */
    private c f10522u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10523v;

    /* renamed from: w  reason: collision with root package name */
    private int f10524w;

    /* renamed from: x  reason: collision with root package name */
    private long f10525x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10526y;

    /* renamed from: z  reason: collision with root package name */
    private long f10527z;

    /* compiled from: MatroskaExtractor */
    private final class b implements b {
        private b() {
        }

        public void a(int i10) {
            e.this.o(i10);
        }

        public int b(int i10) {
            return e.this.u(i10);
        }

        public void c(int i10, int i11, j jVar) {
            e.this.l(i10, i11, jVar);
        }

        public boolean d(int i10) {
            return e.this.z(i10);
        }

        public void e(int i10, String str) {
            e.this.H(i10, str);
        }

        public void f(int i10, double d10) {
            e.this.r(i10, d10);
        }

        public void g(int i10, long j10, long j11) {
            e.this.G(i10, j10, j11);
        }

        public void h(int i10, long j10) {
            e.this.x(i10, j10);
        }
    }

    /* compiled from: MatroskaExtractor */
    private static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public d T;
        public boolean U;
        public boolean V;
        /* access modifiers changed from: private */
        public String W;
        public b0 X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f10529a;

        /* renamed from: b  reason: collision with root package name */
        public String f10530b;

        /* renamed from: c  reason: collision with root package name */
        public int f10531c;

        /* renamed from: d  reason: collision with root package name */
        public int f10532d;

        /* renamed from: e  reason: collision with root package name */
        public int f10533e;

        /* renamed from: f  reason: collision with root package name */
        public int f10534f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f10535g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10536h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f10537i;

        /* renamed from: j  reason: collision with root package name */
        public b0.a f10538j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f10539k;

        /* renamed from: l  reason: collision with root package name */
        public h f10540l;

        /* renamed from: m  reason: collision with root package name */
        public int f10541m;

        /* renamed from: n  reason: collision with root package name */
        public int f10542n;

        /* renamed from: o  reason: collision with root package name */
        public int f10543o;

        /* renamed from: p  reason: collision with root package name */
        public int f10544p;

        /* renamed from: q  reason: collision with root package name */
        public int f10545q;

        /* renamed from: r  reason: collision with root package name */
        public int f10546r;

        /* renamed from: s  reason: collision with root package name */
        public float f10547s;

        /* renamed from: t  reason: collision with root package name */
        public float f10548t;

        /* renamed from: u  reason: collision with root package name */
        public float f10549u;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f10550v;

        /* renamed from: w  reason: collision with root package name */
        public int f10551w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f10552x;

        /* renamed from: y  reason: collision with root package name */
        public int f10553y;

        /* renamed from: z  reason: collision with root package name */
        public int f10554z;

        private c() {
            this.f10541m = -1;
            this.f10542n = -1;
            this.f10543o = -1;
            this.f10544p = -1;
            this.f10545q = 0;
            this.f10546r = -1;
            this.f10547s = 0.0f;
            this.f10548t = 0.0f;
            this.f10549u = 0.0f;
            this.f10550v = null;
            this.f10551w = -1;
            this.f10552x = false;
            this.f10553y = -1;
            this.f10554z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0;
            this.S = 0;
            this.V = true;
            this.W = "eng";
        }

        /* access modifiers changed from: private */
        public void e() {
            a6.a.e(this.X);
        }

        private byte[] f(String str) {
            byte[] bArr = this.f10539k;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            throw ParserException.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), (Throwable) null);
        }

        private byte[] g() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.L + 0.5f)));
            order.putShort((short) ((int) (this.M + 0.5f)));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> j(y yVar) {
            try {
                yVar.P(16);
                long s10 = yVar.s();
                if (s10 == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (s10 == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (s10 == 826496599) {
                    byte[] d10 = yVar.d();
                    for (int e10 = yVar.e() + 20; e10 < d10.length - 4; e10++) {
                        if (d10[e10] == 0 && d10[e10 + 1] == 0 && d10[e10 + 2] == 1 && d10[e10 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d10, e10, d10.length)));
                        }
                    }
                    throw ParserException.a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                p.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static boolean k(y yVar) {
            try {
                int u10 = yVar.u();
                if (u10 == 1) {
                    return true;
                }
                if (u10 != 65534) {
                    return false;
                }
                yVar.O(24);
                if (yVar.v() == e.f10499f0.getMostSignificantBits() && yVar.v() == e.f10499f0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        private static List<byte[]> l(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i10 = 1;
                    int i11 = 0;
                    while ((bArr[i10] & 255) == 255) {
                        i11 += 255;
                        i10++;
                    }
                    int i12 = i10 + 1;
                    int i13 = i11 + (bArr[i10] & 255);
                    int i14 = 0;
                    while ((bArr[i12] & 255) == 255) {
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (bArr[i12] & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i18)];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw ParserException.a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw ParserException.a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw ParserException.a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw ParserException.a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x029c, code lost:
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a0, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0311, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x0312, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0313, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0314, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0374, code lost:
            r7 = -1;
            r15 = -1;
            r18 = r3;
            r3 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x03b7, code lost:
            r1 = null;
            r3 = null;
            r7 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x03ce, code lost:
            r3 = null;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0446, code lost:
            r4 = r0.N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0448, code lost:
            if (r4 == null) goto L_0x0459;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x044a, code lost:
            r4 = b6.c.a(new a6.y(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0453, code lost:
            if (r4 == null) goto L_0x0459;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0455, code lost:
            r3 = r4.f5021c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0459, code lost:
            r4 = r16;
            r5 = r0.V | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0460, code lost:
            if (r0.U == false) goto L_0x0464;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0462, code lost:
            r6 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0464, code lost:
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0465, code lost:
            r5 = r5 | r6;
            r6 = new e4.j.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x046f, code lost:
            if (a6.t.p(r4) == false) goto L_0x0483;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0471, code lost:
            r6.H(r0.O).f0(r0.Q).Y(r7);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0487, code lost:
            if (a6.t.s(r4) == false) goto L_0x0560;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x048b, code lost:
            if (r0.f10545q != 0) goto L_0x049f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x048d, code lost:
            r2 = r0.f10543o;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0490, code lost:
            if (r2 != -1) goto L_0x0494;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0492, code lost:
            r2 = r0.f10541m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0494, code lost:
            r0.f10543o = r2;
            r2 = r0.f10544p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0498, code lost:
            if (r2 != -1) goto L_0x049c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x049a, code lost:
            r2 = r0.f10542n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x049c, code lost:
            r0.f10544p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x049f, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a0, code lost:
            r2 = -1.0f;
            r8 = r0.f10543o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x04a4, code lost:
            if (r8 == r7) goto L_0x04b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x04a6, code lost:
            r10 = r0.f10544p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x04a8, code lost:
            if (r10 == r7) goto L_0x04b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x04aa, code lost:
            r2 = ((float) (r0.f10542n * r8)) / ((float) (r0.f10541m * r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x04b7, code lost:
            if (r0.f10552x == false) goto L_0x04c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b9, code lost:
            r10 = new b6.b(r0.f10553y, r0.A, r0.f10554z, g());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x04c9, code lost:
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x04cc, code lost:
            if (r0.f10529a == null) goto L_0x04ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x04d8, code lost:
            if (p4.e.f().containsKey(r0.f10529a) == false) goto L_0x04ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x04da, code lost:
            r7 = ((java.lang.Integer) p4.e.f().get(r0.f10529a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x04ec, code lost:
            if (r0.f10546r != 0) goto L_0x053a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x04f5, code lost:
            if (java.lang.Float.compare(r0.f10547s, 0.0f) != 0) goto L_0x053a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x04fd, code lost:
            if (java.lang.Float.compare(r0.f10548t, 0.0f) != 0) goto L_0x053a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0505, code lost:
            if (java.lang.Float.compare(r0.f10549u, 0.0f) != 0) goto L_0x0508;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0510, code lost:
            if (java.lang.Float.compare(r0.f10548t, 90.0f) != 0) goto L_0x0515;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0512, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x051d, code lost:
            if (java.lang.Float.compare(r0.f10548t, -180.0f) == 0) goto L_0x0537;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0527, code lost:
            if (java.lang.Float.compare(r0.f10548t, 180.0f) != 0) goto L_0x052a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0532, code lost:
            if (java.lang.Float.compare(r0.f10548t, -90.0f) != 0) goto L_0x053a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0534, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0537, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x053a, code lost:
            r9 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x053b, code lost:
            r6.j0(r0.f10541m).Q(r0.f10542n).a0(r2).d0(r9).b0(r0.f10550v).h0(r0.f10551w).J(r10);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0564, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x0589;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x056a, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x0589;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x0570, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x0589;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0578, code lost:
            if (r17.equals(r4) != false) goto L_0x0589;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x057e, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x0581;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x0588, code lost:
            throw com.google.android.exoplayer2.ParserException.a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x058b, code lost:
            if (r0.f10529a == null) goto L_0x059e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x0597, code lost:
            if (p4.e.f().containsKey(r0.f10529a) != false) goto L_0x059e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x0599, code lost:
            r6.U(r0.f10529a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x059e, code lost:
            r1 = r6.R(r21).e0(r4).W(r15).V(r0.W).g0(r5).T(r1).I(r3).L(r0.f10540l).E();
            r2 = r20.e(r0.f10531c, r8);
            r0.X = r2;
            r2.d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x05d5, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(k4.k r20, int r21) {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = r0.f10530b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 16
                r6 = 8
                r7 = 4
                r8 = 3
                r9 = 0
                switch(r2) {
                    case -2095576542: goto L_0x01b3;
                    case -2095575984: goto L_0x01a7;
                    case -1985379776: goto L_0x019b;
                    case -1784763192: goto L_0x018f;
                    case -1730367663: goto L_0x0183;
                    case -1482641358: goto L_0x0177;
                    case -1482641357: goto L_0x016b;
                    case -1373388978: goto L_0x015f;
                    case -933872740: goto L_0x0151;
                    case -538363189: goto L_0x0143;
                    case -538363109: goto L_0x0135;
                    case -425012669: goto L_0x0127;
                    case -356037306: goto L_0x0119;
                    case 62923557: goto L_0x010b;
                    case 62923603: goto L_0x00fd;
                    case 62927045: goto L_0x00ef;
                    case 82318131: goto L_0x00e1;
                    case 82338133: goto L_0x00d3;
                    case 82338134: goto L_0x00c5;
                    case 99146302: goto L_0x00b7;
                    case 444813526: goto L_0x00a9;
                    case 542569478: goto L_0x009b;
                    case 635596514: goto L_0x008d;
                    case 725948237: goto L_0x0080;
                    case 725957860: goto L_0x0073;
                    case 738597099: goto L_0x0066;
                    case 855502857: goto L_0x0059;
                    case 1422270023: goto L_0x004c;
                    case 1809237540: goto L_0x003f;
                    case 1950749482: goto L_0x0032;
                    case 1950789798: goto L_0x0025;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01be
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = 31
                goto L_0x01be
            L_0x0025:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                goto L_0x0015
            L_0x002e:
                r1 = 30
                goto L_0x01be
            L_0x0032:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003b
                goto L_0x0015
            L_0x003b:
                r1 = 29
                goto L_0x01be
            L_0x003f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0048
                goto L_0x0015
            L_0x0048:
                r1 = 28
                goto L_0x01be
            L_0x004c:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                goto L_0x0015
            L_0x0055:
                r1 = 27
                goto L_0x01be
            L_0x0059:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0062
                goto L_0x0015
            L_0x0062:
                r1 = 26
                goto L_0x01be
            L_0x0066:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006f
                goto L_0x0015
            L_0x006f:
                r1 = 25
                goto L_0x01be
            L_0x0073:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007c
                goto L_0x0015
            L_0x007c:
                r1 = 24
                goto L_0x01be
            L_0x0080:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0089
                goto L_0x0015
            L_0x0089:
                r1 = 23
                goto L_0x01be
            L_0x008d:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0097
                goto L_0x0015
            L_0x0097:
                r1 = 22
                goto L_0x01be
            L_0x009b:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a5
                goto L_0x0015
            L_0x00a5:
                r1 = 21
                goto L_0x01be
            L_0x00a9:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b3
                goto L_0x0015
            L_0x00b3:
                r1 = 20
                goto L_0x01be
            L_0x00b7:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x0015
            L_0x00c1:
                r1 = 19
                goto L_0x01be
            L_0x00c5:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cf
                goto L_0x0015
            L_0x00cf:
                r1 = 18
                goto L_0x01be
            L_0x00d3:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dd
                goto L_0x0015
            L_0x00dd:
                r1 = 17
                goto L_0x01be
            L_0x00e1:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00eb
                goto L_0x0015
            L_0x00eb:
                r1 = 16
                goto L_0x01be
            L_0x00ef:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f9
                goto L_0x0015
            L_0x00f9:
                r1 = 15
                goto L_0x01be
            L_0x00fd:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0107
                goto L_0x0015
            L_0x0107:
                r1 = 14
                goto L_0x01be
            L_0x010b:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0115
                goto L_0x0015
            L_0x0115:
                r1 = 13
                goto L_0x01be
            L_0x0119:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0123
                goto L_0x0015
            L_0x0123:
                r1 = 12
                goto L_0x01be
            L_0x0127:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0131
                goto L_0x0015
            L_0x0131:
                r1 = 11
                goto L_0x01be
            L_0x0135:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013f
                goto L_0x0015
            L_0x013f:
                r1 = 10
                goto L_0x01be
            L_0x0143:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014d
                goto L_0x0015
            L_0x014d:
                r1 = 9
                goto L_0x01be
            L_0x0151:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                goto L_0x0015
            L_0x015b:
                r1 = 8
                goto L_0x01be
            L_0x015f:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0169
                goto L_0x0015
            L_0x0169:
                r1 = 7
                goto L_0x01be
            L_0x016b:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0175
                goto L_0x0015
            L_0x0175:
                r1 = 6
                goto L_0x01be
            L_0x0177:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0181
                goto L_0x0015
            L_0x0181:
                r1 = 5
                goto L_0x01be
            L_0x0183:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018d
                goto L_0x0015
            L_0x018d:
                r1 = 4
                goto L_0x01be
            L_0x018f:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0199
                goto L_0x0015
            L_0x0199:
                r1 = 3
                goto L_0x01be
            L_0x019b:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a5
                goto L_0x0015
            L_0x01a5:
                r1 = 2
                goto L_0x01be
            L_0x01a7:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01b1
                goto L_0x0015
            L_0x01b1:
                r1 = 1
                goto L_0x01be
            L_0x01b3:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bd
                goto L_0x0015
            L_0x01bd:
                r1 = 0
            L_0x01be:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r11 = "application/pgs"
                java.lang.String r12 = "application/vobsub"
                java.lang.String r13 = "text/x-ssa"
                java.lang.String r14 = "application/x-subrip"
                java.lang.String r4 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                r10 = 0
                switch(r1) {
                    case 0: goto L_0x0436;
                    case 1: goto L_0x0436;
                    case 2: goto L_0x03df;
                    case 3: goto L_0x03d2;
                    case 4: goto L_0x03be;
                    case 5: goto L_0x03b3;
                    case 6: goto L_0x03ae;
                    case 7: goto L_0x0391;
                    case 8: goto L_0x037d;
                    case 9: goto L_0x0436;
                    case 10: goto L_0x0359;
                    case 11: goto L_0x034a;
                    case 12: goto L_0x0345;
                    case 13: goto L_0x0326;
                    case 14: goto L_0x0321;
                    case 15: goto L_0x031c;
                    case 16: goto L_0x0317;
                    case 17: goto L_0x030d;
                    case 18: goto L_0x0308;
                    case 19: goto L_0x0303;
                    case 20: goto L_0x02fe;
                    case 21: goto L_0x031c;
                    case 22: goto L_0x02d4;
                    case 23: goto L_0x02a4;
                    case 24: goto L_0x0270;
                    case 25: goto L_0x025c;
                    case 26: goto L_0x023f;
                    case 27: goto L_0x0239;
                    case 28: goto L_0x0233;
                    case 29: goto L_0x022d;
                    case 30: goto L_0x021d;
                    case 31: goto L_0x01db;
                    default: goto L_0x01d4;
                }
            L_0x01d4:
                java.lang.String r1 = "Unrecognized codec identifier."
                com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r1, r10)
                throw r1
            L_0x01db:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                r17 = r11
                long r10 = r0.R
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.S
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r16 = "audio/opus"
                goto L_0x03ce
            L_0x021d:
                r17 = r11
                java.lang.String r1 = r0.f10530b
                byte[] r1 = r0.f(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x0312
            L_0x022d:
                r17 = r11
                java.lang.String r16 = "audio/eac3"
                goto L_0x0311
            L_0x0233:
                r17 = r11
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0311
            L_0x0239:
                r17 = r11
                r16 = r14
                goto L_0x0311
            L_0x023f:
                r17 = r11
                a6.y r1 = new a6.y
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                r1.<init>((byte[]) r3)
                b6.f r1 = b6.f.a(r1)
                java.util.List<byte[]> r3 = r1.f5046a
                int r4 = r1.f5047b
                r0.Y = r4
                java.lang.String r1 = r1.f5048c
                java.lang.String r16 = "video/hevc"
                goto L_0x0374
            L_0x025c:
                r17 = r11
                byte[] r1 = p4.e.f10497d0
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                com.google.common.collect.x r1 = com.google.common.collect.x.u(r1, r3)
                r16 = r13
                goto L_0x0312
            L_0x0270:
                r17 = r11
                int r1 = r0.P
                int r7 = a6.m0.W(r1)
                if (r7 != 0) goto L_0x02a0
                int r1 = r0.P
                int r3 = r15.length()
                int r3 = r3 + 74
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                a6.p.h(r5, r1)
            L_0x029c:
                r16 = r15
                goto L_0x0311
            L_0x02a0:
                r1 = 0
                r3 = 0
                goto L_0x0314
            L_0x02a4:
                r17 = r11
                int r1 = r0.P
                if (r1 != r6) goto L_0x02ae
                r1 = 0
                r3 = 0
                r7 = 3
                goto L_0x0314
            L_0x02ae:
                if (r1 != r3) goto L_0x02b3
                r7 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x02a0
            L_0x02b3:
                int r3 = r15.length()
                int r3 = r3 + 71
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                a6.p.h(r5, r1)
                goto L_0x029c
            L_0x02d4:
                r17 = r11
                int r1 = r0.P
                r3 = 32
                if (r1 != r3) goto L_0x02dd
                goto L_0x02a0
            L_0x02dd:
                int r3 = r15.length()
                int r3 = r3 + 75
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                a6.p.h(r5, r1)
                goto L_0x029c
            L_0x02fe:
                r17 = r11
                java.lang.String r16 = "video/x-unknown"
                goto L_0x0311
            L_0x0303:
                r17 = r11
                r16 = r17
                goto L_0x0311
            L_0x0308:
                r17 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0311
            L_0x030d:
                r17 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0311:
                r1 = 0
            L_0x0312:
                r3 = 0
            L_0x0313:
                r7 = -1
            L_0x0314:
                r15 = -1
                goto L_0x0446
            L_0x0317:
                r17 = r11
                java.lang.String r16 = "video/av01"
                goto L_0x0311
            L_0x031c:
                r17 = r11
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0311
            L_0x0321:
                r17 = r11
                java.lang.String r16 = "audio/ac3"
                goto L_0x0311
            L_0x0326:
                r17 = r11
                java.lang.String r1 = r0.f10530b
                byte[] r1 = r0.f(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f10539k
                g4.a$b r3 = g4.a.f(r3)
                int r4 = r3.f8825a
                r0.Q = r4
                int r4 = r3.f8826b
                r0.O = r4
                java.lang.String r3 = r3.f8827c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0313
            L_0x0345:
                r17 = r11
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0311
            L_0x034a:
                r17 = r11
                java.lang.String r1 = r0.f10530b
                byte[] r1 = r0.f(r1)
                com.google.common.collect.x r1 = com.google.common.collect.x.t(r1)
                r16 = r12
                goto L_0x0312
            L_0x0359:
                r17 = r11
                a6.y r1 = new a6.y
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                r1.<init>((byte[]) r3)
                b6.a r1 = b6.a.b(r1)
                java.util.List<byte[]> r3 = r1.f5008a
                int r4 = r1.f5009b
                r0.Y = r4
                java.lang.String r1 = r1.f5013f
                java.lang.String r16 = "video/avc"
            L_0x0374:
                r7 = -1
                r15 = -1
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x0446
            L_0x037d:
                r17 = r11
                byte[] r1 = new byte[r7]
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r7)
                com.google.common.collect.x r1 = com.google.common.collect.x.t(r1)
                r16 = r2
                goto L_0x0312
            L_0x0391:
                r17 = r11
                a6.y r1 = new a6.y
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = j(r1)
                java.lang.Object r3 = r1.first
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x0312
            L_0x03ae:
                r17 = r11
                java.lang.String r16 = "audio/mpeg"
                goto L_0x03b7
            L_0x03b3:
                r17 = r11
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x03b7:
                r1 = 0
                r3 = 0
                r7 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x0446
            L_0x03be:
                r17 = r11
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f10530b
                byte[] r1 = r0.f(r1)
                java.util.List r1 = l(r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x03ce:
                r3 = 0
                r7 = -1
                goto L_0x0446
            L_0x03d2:
                r17 = r11
                p4.e$d r1 = new p4.e$d
                r1.<init>()
                r0.T = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0311
            L_0x03df:
                r17 = r11
                a6.y r1 = new a6.y
                java.lang.String r3 = r0.f10530b
                byte[] r3 = r0.f(r3)
                r1.<init>((byte[]) r3)
                boolean r1 = k(r1)
                if (r1 == 0) goto L_0x041e
                int r1 = r0.P
                int r7 = a6.m0.W(r1)
                if (r7 != 0) goto L_0x02a0
                int r1 = r0.P
                int r3 = r15.length()
                int r3 = r3 + 60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r3)
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r6.append(r3)
                r6.append(r1)
                r6.append(r4)
                r6.append(r15)
                java.lang.String r1 = r6.toString()
                a6.p.h(r5, r1)
                goto L_0x029c
            L_0x041e:
                java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                int r3 = r15.length()
                if (r3 == 0) goto L_0x042b
                java.lang.String r1 = r1.concat(r15)
                goto L_0x0431
            L_0x042b:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
                r1 = r3
            L_0x0431:
                a6.p.h(r5, r1)
                goto L_0x029c
            L_0x0436:
                r17 = r11
                byte[] r1 = r0.f10539k
                if (r1 != 0) goto L_0x043e
                r1 = 0
                goto L_0x0442
            L_0x043e:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0442:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x0312
            L_0x0446:
                byte[] r4 = r0.N
                if (r4 == 0) goto L_0x0459
                a6.y r5 = new a6.y
                r5.<init>((byte[]) r4)
                b6.c r4 = b6.c.a(r5)
                if (r4 == 0) goto L_0x0459
                java.lang.String r3 = r4.f5021c
                java.lang.String r16 = "video/dolby-vision"
            L_0x0459:
                r4 = r16
                boolean r5 = r0.V
                r5 = r5 | r9
                boolean r6 = r0.U
                if (r6 == 0) goto L_0x0464
                r6 = 2
                goto L_0x0465
            L_0x0464:
                r6 = 0
            L_0x0465:
                r5 = r5 | r6
                e4.j$b r6 = new e4.j$b
                r6.<init>()
                boolean r10 = a6.t.p(r4)
                if (r10 == 0) goto L_0x0483
                int r2 = r0.O
                e4.j$b r2 = r6.H(r2)
                int r8 = r0.Q
                e4.j$b r2 = r2.f0(r8)
                r2.Y(r7)
                r8 = 1
                goto L_0x0589
            L_0x0483:
                boolean r7 = a6.t.s(r4)
                if (r7 == 0) goto L_0x0560
                int r2 = r0.f10545q
                if (r2 != 0) goto L_0x049f
                int r2 = r0.f10543o
                r7 = -1
                if (r2 != r7) goto L_0x0494
                int r2 = r0.f10541m
            L_0x0494:
                r0.f10543o = r2
                int r2 = r0.f10544p
                if (r2 != r7) goto L_0x049c
                int r2 = r0.f10542n
            L_0x049c:
                r0.f10544p = r2
                goto L_0x04a0
            L_0x049f:
                r7 = -1
            L_0x04a0:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r0.f10543o
                if (r8 == r7) goto L_0x04b5
                int r10 = r0.f10544p
                if (r10 == r7) goto L_0x04b5
                int r2 = r0.f10542n
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r0.f10541m
                int r8 = r8 * r10
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x04b5:
                boolean r8 = r0.f10552x
                if (r8 == 0) goto L_0x04c9
                byte[] r8 = r19.g()
                b6.b r10 = new b6.b
                int r11 = r0.f10553y
                int r12 = r0.A
                int r13 = r0.f10554z
                r10.<init>(r11, r12, r13, r8)
                goto L_0x04ca
            L_0x04c9:
                r10 = 0
            L_0x04ca:
                java.lang.String r8 = r0.f10529a
                if (r8 == 0) goto L_0x04ea
                java.util.Map r8 = p4.e.f10500g0
                java.lang.String r11 = r0.f10529a
                boolean r8 = r8.containsKey(r11)
                if (r8 == 0) goto L_0x04ea
                java.util.Map r7 = p4.e.f10500g0
                java.lang.String r8 = r0.f10529a
                java.lang.Object r7 = r7.get(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
            L_0x04ea:
                int r8 = r0.f10546r
                if (r8 != 0) goto L_0x053a
                float r8 = r0.f10547s
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x053a
                float r8 = r0.f10548t
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x053a
                float r8 = r0.f10549u
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0508
                goto L_0x053b
            L_0x0508:
                float r8 = r0.f10548t
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0515
                r9 = 90
                goto L_0x053b
            L_0x0515:
                float r8 = r0.f10548t
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x0537
                float r8 = r0.f10548t
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x052a
                goto L_0x0537
            L_0x052a:
                float r8 = r0.f10548t
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x053a
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x053b
            L_0x0537:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x053b
            L_0x053a:
                r9 = r7
            L_0x053b:
                int r7 = r0.f10541m
                e4.j$b r7 = r6.j0(r7)
                int r8 = r0.f10542n
                e4.j$b r7 = r7.Q(r8)
                e4.j$b r2 = r7.a0(r2)
                e4.j$b r2 = r2.d0(r9)
                byte[] r7 = r0.f10550v
                e4.j$b r2 = r2.b0(r7)
                int r7 = r0.f10551w
                e4.j$b r2 = r2.h0(r7)
                r2.J(r10)
                r8 = 2
                goto L_0x0589
            L_0x0560:
                boolean r7 = r14.equals(r4)
                if (r7 != 0) goto L_0x0589
                boolean r7 = r13.equals(r4)
                if (r7 != 0) goto L_0x0589
                boolean r7 = r12.equals(r4)
                if (r7 != 0) goto L_0x0589
                r7 = r17
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x0589
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0581
                goto L_0x0589
            L_0x0581:
                java.lang.String r1 = "Unexpected MIME type."
                r2 = 0
                com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r1, r2)
                throw r1
            L_0x0589:
                java.lang.String r2 = r0.f10529a
                if (r2 == 0) goto L_0x059e
                java.util.Map r2 = p4.e.f10500g0
                java.lang.String r7 = r0.f10529a
                boolean r2 = r2.containsKey(r7)
                if (r2 != 0) goto L_0x059e
                java.lang.String r2 = r0.f10529a
                r6.U(r2)
            L_0x059e:
                r2 = r21
                e4.j$b r2 = r6.R(r2)
                e4.j$b r2 = r2.e0(r4)
                e4.j$b r2 = r2.W(r15)
                java.lang.String r4 = r0.W
                e4.j$b r2 = r2.V(r4)
                e4.j$b r2 = r2.g0(r5)
                e4.j$b r1 = r2.T(r1)
                e4.j$b r1 = r1.I(r3)
                com.google.android.exoplayer2.drm.h r2 = r0.f10540l
                e4.j$b r1 = r1.L(r2)
                e4.j r1 = r1.E()
                int r2 = r0.f10531c
                r3 = r20
                k4.b0 r2 = r3.e(r2, r8)
                r0.X = r2
                r2.d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.e.c.h(k4.k, int):void");
        }

        public void i() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void m() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* compiled from: MatroskaExtractor */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f10555a = new byte[10];

        /* renamed from: b  reason: collision with root package name */
        private boolean f10556b;

        /* renamed from: c  reason: collision with root package name */
        private int f10557c;

        /* renamed from: d  reason: collision with root package name */
        private long f10558d;

        /* renamed from: e  reason: collision with root package name */
        private int f10559e;

        /* renamed from: f  reason: collision with root package name */
        private int f10560f;

        /* renamed from: g  reason: collision with root package name */
        private int f10561g;

        public void a(c cVar) {
            if (this.f10557c > 0) {
                cVar.X.e(this.f10558d, this.f10559e, this.f10560f, this.f10561g, cVar.f10538j);
                this.f10557c = 0;
            }
        }

        public void b() {
            this.f10556b = false;
            this.f10557c = 0;
        }

        public void c(c cVar, long j10, int i10, int i11, int i12) {
            if (this.f10556b) {
                int i13 = this.f10557c;
                int i14 = i13 + 1;
                this.f10557c = i14;
                if (i13 == 0) {
                    this.f10558d = j10;
                    this.f10559e = i10;
                    this.f10560f = 0;
                }
                this.f10560f += i11;
                this.f10561g = i12;
                if (i14 >= 16) {
                    a(cVar);
                }
            }
        }

        public void d(j jVar) {
            if (!this.f10556b) {
                jVar.o(this.f10555a, 0, 10);
                jVar.k();
                if (g4.b.i(this.f10555a) != 0) {
                    this.f10556b = true;
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f10500g0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] A() {
        return new i[]{new e()};
    }

    private boolean B(x xVar, long j10) {
        if (this.f10526y) {
            this.A = j10;
            xVar.f9627a = this.f10527z;
            this.f10526y = false;
            return true;
        }
        if (this.f10523v) {
            long j11 = this.A;
            if (j11 != -1) {
                xVar.f9627a = j11;
                this.A = -1;
                return true;
            }
        }
        return false;
    }

    private void C(j jVar, int i10) {
        if (this.f10508g.f() < i10) {
            if (this.f10508g.b() < i10) {
                y yVar = this.f10508g;
                yVar.c(Math.max(yVar.b() * 2, i10));
            }
            jVar.readFully(this.f10508g.d(), this.f10508g.f(), i10 - this.f10508g.f());
            this.f10508g.N(i10);
        }
    }

    private void D() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.f10511j.K(0);
    }

    private long E(long j10) {
        long j11 = this.f10519r;
        if (j11 != -9223372036854775807L) {
            return m0.C0(j10, j11, 1000);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private static void F(String str, long j10, byte[] bArr) {
        int i10;
        byte[] bArr2;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArr2 = s(j10, "%01d:%02d:%02d:%02d", 10000);
            i10 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArr2 = s(j10, "%02d:%02d:%02d,%03d", 1000);
            i10 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    private int I(j jVar, c cVar, int i10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f10530b)) {
            J(jVar, f10496c0, i10);
            return q();
        } else if ("S_TEXT/ASS".equals(cVar.f10530b)) {
            J(jVar, f10498e0, i10);
            return q();
        } else {
            b0 b0Var = cVar.X;
            boolean z10 = true;
            if (!this.U) {
                if (cVar.f10536h) {
                    this.O &= -1073741825;
                    int i12 = 128;
                    if (!this.V) {
                        jVar.readFully(this.f10508g.d(), 0, 1);
                        this.R++;
                        if ((this.f10508g.d()[0] & 128) != 128) {
                            this.Y = this.f10508g.d()[0];
                            this.V = true;
                        } else {
                            throw ParserException.a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b10 = this.Y;
                    if ((b10 & 1) == 1) {
                        boolean z11 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            jVar.readFully(this.f10513l.d(), 0, 8);
                            this.R += 8;
                            this.Z = true;
                            byte[] d10 = this.f10508g.d();
                            if (!z11) {
                                i12 = 0;
                            }
                            d10[0] = (byte) (i12 | 8);
                            this.f10508g.O(0);
                            b0Var.f(this.f10508g, 1, 1);
                            this.S++;
                            this.f10513l.O(0);
                            b0Var.f(this.f10513l, 8, 1);
                            this.S += 8;
                        }
                        if (z11) {
                            if (!this.W) {
                                jVar.readFully(this.f10508g.d(), 0, 1);
                                this.R++;
                                this.f10508g.O(0);
                                this.X = this.f10508g.C();
                                this.W = true;
                            }
                            int i13 = this.X * 4;
                            this.f10508g.K(i13);
                            jVar.readFully(this.f10508g.d(), 0, i13);
                            this.R += i13;
                            short s10 = (short) ((this.X / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f10516o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f10516o = ByteBuffer.allocate(i14);
                            }
                            this.f10516o.position(0);
                            this.f10516o.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.X;
                                if (i15 >= i11) {
                                    break;
                                }
                                int G2 = this.f10508g.G();
                                if (i15 % 2 == 0) {
                                    this.f10516o.putShort((short) (G2 - i16));
                                } else {
                                    this.f10516o.putInt(G2 - i16);
                                }
                                i15++;
                                i16 = G2;
                            }
                            int i17 = (i10 - this.R) - i16;
                            if (i11 % 2 == 1) {
                                this.f10516o.putInt(i17);
                            } else {
                                this.f10516o.putShort((short) i17);
                                this.f10516o.putInt(0);
                            }
                            this.f10514m.M(this.f10516o.array(), i14);
                            b0Var.f(this.f10514m, i14, 1);
                            this.S += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f10537i;
                    if (bArr != null) {
                        this.f10511j.M(bArr, bArr.length);
                    }
                }
                if (cVar.f10534f > 0) {
                    this.O |= 268435456;
                    this.f10515n.K(0);
                    this.f10508g.K(4);
                    this.f10508g.d()[0] = (byte) ((i10 >> 24) & 255);
                    this.f10508g.d()[1] = (byte) ((i10 >> 16) & 255);
                    this.f10508g.d()[2] = (byte) ((i10 >> 8) & 255);
                    this.f10508g.d()[3] = (byte) (i10 & 255);
                    b0Var.f(this.f10508g, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int f10 = i10 + this.f10511j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f10530b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f10530b)) {
                if (cVar.T != null) {
                    if (this.f10511j.f() != 0) {
                        z10 = false;
                    }
                    a6.a.f(z10);
                    cVar.T.d(jVar);
                }
                while (true) {
                    int i18 = this.R;
                    if (i18 >= f10) {
                        break;
                    }
                    int K2 = K(jVar, b0Var, f10 - i18);
                    this.R += K2;
                    this.S += K2;
                }
            } else {
                byte[] d11 = this.f10507f.d();
                d11[0] = 0;
                d11[1] = 0;
                d11[2] = 0;
                int i19 = cVar.Y;
                int i20 = 4 - i19;
                while (this.R < f10) {
                    int i21 = this.T;
                    if (i21 == 0) {
                        L(jVar, d11, i20, i19);
                        this.R += i19;
                        this.f10507f.O(0);
                        this.T = this.f10507f.G();
                        this.f10506e.O(0);
                        b0Var.a(this.f10506e, 4);
                        this.S += 4;
                    } else {
                        int K3 = K(jVar, b0Var, i21);
                        this.R += K3;
                        this.S += K3;
                        this.T -= K3;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f10530b)) {
                this.f10509h.O(0);
                b0Var.a(this.f10509h, 4);
                this.S += 4;
            }
            return q();
        }
    }

    private void J(j jVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f10512k.b() < length) {
            this.f10512k.L(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f10512k.d(), 0, bArr.length);
        }
        jVar.readFully(this.f10512k.d(), bArr.length, i10);
        this.f10512k.O(0);
        this.f10512k.N(length);
    }

    private int K(j jVar, b0 b0Var, int i10) {
        int a10 = this.f10511j.a();
        if (a10 <= 0) {
            return b0Var.c(jVar, i10, false);
        }
        int min = Math.min(i10, a10);
        b0Var.a(this.f10511j, min);
        return min;
    }

    private void L(j jVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f10511j.a());
        jVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f10511j.j(bArr, i10, min);
        }
    }

    private void i(int i10) {
        if (this.C == null || this.D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i10);
            sb.append(" must be in a Cues");
            throw ParserException.a(sb.toString(), (Throwable) null);
        }
    }

    private void j(int i10) {
        if (this.f10522u == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i10);
            sb.append(" must be in a TrackEntry");
            throw ParserException.a(sb.toString(), (Throwable) null);
        }
    }

    private void k() {
        a6.a.h(this.f10502a0);
    }

    private k4.y m(q qVar, q qVar2) {
        int i10;
        if (this.f10518q == -1 || this.f10521t == -9223372036854775807L || qVar == null || qVar.c() == 0 || qVar2 == null || qVar2.c() != qVar.c()) {
            return new y.b(this.f10521t);
        }
        int c10 = qVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = qVar.b(i12);
            jArr[i12] = this.f10518q + qVar2.b(i12);
        }
        while (true) {
            i10 = c10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f10518q + this.f10517p) - jArr[i10]);
        jArr2[i10] = this.f10521t - jArr3[i10];
        long j10 = jArr2[i10];
        if (j10 <= 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j10);
            p.h("MatroskaExtractor", sb.toString());
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new k4.d(iArr, jArr, jArr2, jArr3);
    }

    private void n(c cVar, long j10, int i10, int i11, int i12) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.c(cVar, j10, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f10530b) || "S_TEXT/ASS".equals(cVar.f10530b)) {
                if (this.K > 1) {
                    p.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        p.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f10530b, j11, this.f10512k.d());
                        int e10 = this.f10512k.e();
                        while (true) {
                            if (e10 >= this.f10512k.f()) {
                                break;
                            } else if (this.f10512k.d()[e10] == 0) {
                                this.f10512k.N(e10);
                                break;
                            } else {
                                e10++;
                            }
                        }
                        b0 b0Var = cVar.X;
                        a6.y yVar = this.f10512k;
                        b0Var.a(yVar, yVar.f());
                        i11 += this.f10512k.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int f10 = this.f10515n.f();
                    cVar.X.f(this.f10515n, f10, 2);
                    i11 += f10;
                }
            }
            cVar.X.e(j10, i10, i11, i12, cVar.f10538j);
        }
        this.F = true;
    }

    private static int[] p(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    private int q() {
        int i10 = this.S;
        D();
        return i10;
    }

    private static byte[] s(long j10, String str, long j11) {
        a6.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * 3600)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return m0.g0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    private c t(int i10) {
        j(i10);
        return this.f10522u;
    }

    private static boolean y(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = 31;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public void G(int i10, long j10, long j11) {
        k();
        if (i10 == 160) {
            this.Q = false;
        } else if (i10 == 174) {
            this.f10522u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f10524w = -1;
            this.f10525x = -1;
        } else if (i10 == 20533) {
            t(i10).f10536h = true;
        } else if (i10 == 21968) {
            t(i10).f10552x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f10518q;
            if (j12 == -1 || j12 == j10) {
                this.f10518q = j10;
                this.f10517p = j11;
                return;
            }
            throw ParserException.a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.C = new q();
            this.D = new q();
        } else if (i10 != 524531317 || this.f10523v) {
        } else {
            if (!this.f10505d || this.f10527z == -1) {
                this.f10502a0.i(new y.b(this.f10521t));
                this.f10523v = true;
                return;
            }
            this.f10526y = true;
        }
    }

    /* access modifiers changed from: protected */
    public void H(int i10, String str) {
        if (i10 == 134) {
            t(i10).f10530b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                t(i10).f10529a = str;
            } else if (i10 == 2274716) {
                String unused = t(i10).W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw ParserException.a(sb.toString(), (Throwable) null);
        }
    }

    public void b(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f10501a.reset();
        this.f10503b.e();
        D();
        for (int i10 = 0; i10 < this.f10504c.size(); i10++) {
            this.f10504c.valueAt(i10).m();
        }
    }

    public final void c(k kVar) {
        this.f10502a0 = kVar;
    }

    public final boolean d(j jVar) {
        return new f().b(jVar);
    }

    public final int g(j jVar, x xVar) {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f10501a.a(jVar);
            if (z10 && B(xVar, jVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f10504c.size(); i10++) {
            c valueAt = this.f10504c.valueAt(i10);
            valueAt.e();
            valueAt.i();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void l(int i10, int i11, j jVar) {
        c cVar;
        c cVar2;
        c cVar3;
        long j10;
        long j11;
        int i12;
        byte b10;
        int[] iArr;
        int i13 = i10;
        int i14 = i11;
        j jVar2 = jVar;
        int i15 = 0;
        int i16 = 1;
        if (i13 == 161 || i13 == 163) {
            if (this.G == 0) {
                this.M = (int) this.f10503b.d(jVar2, false, true, 8);
                this.N = this.f10503b.b();
                this.I = -9223372036854775807L;
                this.G = 1;
                this.f10508g.K(0);
            }
            c cVar4 = this.f10504c.get(this.M);
            if (cVar4 == null) {
                jVar2.l(i14 - this.N);
                this.G = 0;
                return;
            }
            cVar4.e();
            if (this.G == 1) {
                C(jVar2, 3);
                int i17 = (this.f10508g.d()[2] & 6) >> 1;
                byte b11 = 255;
                if (i17 == 0) {
                    this.K = 1;
                    int[] p10 = p(this.L, 1);
                    this.L = p10;
                    p10[0] = (i14 - this.N) - 3;
                } else {
                    int i18 = 4;
                    C(jVar2, 4);
                    int i19 = (this.f10508g.d()[3] & 255) + 1;
                    this.K = i19;
                    int[] p11 = p(this.L, i19);
                    this.L = p11;
                    if (i17 == 2) {
                        int i20 = this.K;
                        Arrays.fill(p11, 0, i20, ((i14 - this.N) - 4) / i20);
                    } else if (i17 == 1) {
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            i12 = this.K;
                            if (i21 >= i12 - 1) {
                                break;
                            }
                            this.L[i21] = 0;
                            do {
                                i18++;
                                C(jVar2, i18);
                                b10 = this.f10508g.d()[i18 - 1] & 255;
                                iArr = this.L;
                                iArr[i21] = iArr[i21] + b10;
                            } while (b10 == 255);
                            i22 += iArr[i21];
                            i21++;
                        }
                        this.L[i12 - 1] = ((i14 - this.N) - i18) - i22;
                    } else if (i17 == 3) {
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            int i25 = this.K;
                            if (i23 >= i25 - 1) {
                                cVar2 = cVar4;
                                this.L[i25 - 1] = ((i14 - this.N) - i18) - i24;
                                break;
                            }
                            this.L[i23] = i15;
                            i18++;
                            C(jVar2, i18);
                            int i26 = i18 - 1;
                            if (this.f10508g.d()[i26] != 0) {
                                int i27 = 0;
                                while (true) {
                                    if (i27 >= 8) {
                                        cVar3 = cVar4;
                                        j10 = 0;
                                        break;
                                    }
                                    int i28 = i16 << (7 - i27);
                                    if ((this.f10508g.d()[i26] & i28) != 0) {
                                        int i29 = i18 + i27;
                                        C(jVar2, i29);
                                        cVar3 = cVar4;
                                        long j12 = (long) ((~i28) & this.f10508g.d()[i26] & b11);
                                        int i30 = i26 + 1;
                                        while (true) {
                                            j11 = j12;
                                            if (i30 >= i29) {
                                                break;
                                            }
                                            j12 = (j11 << 8) | ((long) (this.f10508g.d()[i30] & b11));
                                            i30++;
                                            i29 = i29;
                                            b11 = 255;
                                        }
                                        int i31 = i29;
                                        if (i23 > 0) {
                                            j11 -= (1 << ((i27 * 7) + 6)) - 1;
                                        }
                                        j10 = j11;
                                        i18 = i31;
                                    } else {
                                        c cVar5 = cVar4;
                                        i27++;
                                        i16 = 1;
                                        b11 = 255;
                                    }
                                }
                                if (j10 >= -2147483648L && j10 <= 2147483647L) {
                                    int i32 = (int) j10;
                                    int[] iArr2 = this.L;
                                    if (i23 != 0) {
                                        i32 += iArr2[i23 - 1];
                                    }
                                    iArr2[i23] = i32;
                                    i24 += iArr2[i23];
                                    i23++;
                                    cVar4 = cVar3;
                                    i15 = 0;
                                    i16 = 1;
                                    b11 = 255;
                                }
                            } else {
                                throw ParserException.a("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw ParserException.a("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i17);
                        throw ParserException.a(sb.toString(), (Throwable) null);
                    }
                }
                cVar2 = cVar4;
                this.H = this.B + E((long) ((this.f10508g.d()[0] << 8) | (this.f10508g.d()[1] & 255)));
                cVar = cVar2;
                this.O = (cVar.f10532d == 2 || (i13 == 163 && (this.f10508g.d()[2] & 128) == 128)) ? 1 : 0;
                this.G = 2;
                this.J = 0;
            } else {
                cVar = cVar4;
            }
            if (i13 == 163) {
                while (true) {
                    int i33 = this.J;
                    if (i33 < this.K) {
                        n(cVar, ((long) ((this.J * cVar.f10533e) / 1000)) + this.H, this.O, I(jVar2, cVar, this.L[i33]), 0);
                        this.J++;
                    } else {
                        this.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i34 = this.J;
                    if (i34 < this.K) {
                        int[] iArr3 = this.L;
                        iArr3[i34] = I(jVar2, cVar, iArr3[i34]);
                        this.J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i13 != 165) {
            if (i13 == 16877) {
                v(t(i10), jVar2, i14);
            } else if (i13 == 16981) {
                j(i10);
                byte[] bArr = new byte[i14];
                this.f10522u.f10537i = bArr;
                jVar2.readFully(bArr, 0, i14);
            } else if (i13 == 18402) {
                byte[] bArr2 = new byte[i14];
                jVar2.readFully(bArr2, 0, i14);
                t(i10).f10538j = new b0.a(1, bArr2, 0, 0);
            } else if (i13 == 21419) {
                Arrays.fill(this.f10510i.d(), (byte) 0);
                jVar2.readFully(this.f10510i.d(), 4 - i14, i14);
                this.f10510i.O(0);
                this.f10524w = (int) this.f10510i.E();
            } else if (i13 == 25506) {
                j(i10);
                byte[] bArr3 = new byte[i14];
                this.f10522u.f10539k = bArr3;
                jVar2.readFully(bArr3, 0, i14);
            } else if (i13 == 30322) {
                j(i10);
                byte[] bArr4 = new byte[i14];
                this.f10522u.f10550v = bArr4;
                jVar2.readFully(bArr4, 0, i14);
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i13);
                throw ParserException.a(sb2.toString(), (Throwable) null);
            }
        } else if (this.G == 2) {
            w(this.f10504c.get(this.M), this.P, jVar2, i14);
        }
    }

    /* access modifiers changed from: protected */
    public void o(int i10) {
        k();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) a6.a.h(this.f10522u);
                String str = cVar.f10530b;
                if (str != null) {
                    if (y(str)) {
                        cVar.h(this.f10502a0, cVar.f10531c);
                        this.f10504c.put(cVar.f10531c, cVar);
                    }
                    this.f10522u = null;
                    return;
                }
                throw ParserException.a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i10 == 19899) {
                int i11 = this.f10524w;
                if (i11 != -1) {
                    long j10 = this.f10525x;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f10527z = j10;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i10 == 25152) {
                j(i10);
                c cVar2 = this.f10522u;
                if (!cVar2.f10536h) {
                    return;
                }
                if (cVar2.f10538j != null) {
                    cVar2.f10540l = new h(new h.b(e4.c.f8045a, "video/webm", this.f10522u.f10538j.f9536b));
                    return;
                }
                throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i10 == 28032) {
                j(i10);
                c cVar3 = this.f10522u;
                if (cVar3.f10536h && cVar3.f10537i != null) {
                    throw ParserException.a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i10 == 357149030) {
                if (this.f10519r == -9223372036854775807L) {
                    this.f10519r = 1000000;
                }
                long j11 = this.f10520s;
                if (j11 != -9223372036854775807L) {
                    this.f10521t = E(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f10523v) {
                        this.f10502a0.i(m(this.C, this.D));
                        this.f10523v = true;
                    }
                    this.C = null;
                    this.D = null;
                }
            } else if (this.f10504c.size() != 0) {
                this.f10502a0.o();
            } else {
                throw ParserException.a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.G == 2) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            c cVar4 = this.f10504c.get(this.M);
            cVar4.e();
            for (int i14 = 0; i14 < this.K; i14++) {
                long j12 = ((long) ((cVar4.f10533e * i14) / 1000)) + this.H;
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                i12 -= i16;
                n(cVar4, j12, i15, i16, i12);
            }
            this.G = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void r(int i10, double d10) {
        if (i10 == 181) {
            t(i10).Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    t(i10).D = (float) d10;
                    return;
                case 21970:
                    t(i10).E = (float) d10;
                    return;
                case 21971:
                    t(i10).F = (float) d10;
                    return;
                case 21972:
                    t(i10).G = (float) d10;
                    return;
                case 21973:
                    t(i10).H = (float) d10;
                    return;
                case 21974:
                    t(i10).I = (float) d10;
                    return;
                case 21975:
                    t(i10).J = (float) d10;
                    return;
                case 21976:
                    t(i10).K = (float) d10;
                    return;
                case 21977:
                    t(i10).L = (float) d10;
                    return;
                case 21978:
                    t(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            t(i10).f10547s = (float) d10;
                            return;
                        case 30324:
                            t(i10).f10548t = (float) d10;
                            return;
                        case 30325:
                            t(i10).f10549u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f10520s = (long) d10;
        }
    }

    public final void release() {
    }

    /* access modifiers changed from: protected */
    public int u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /*17026*/:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void v(c cVar, j jVar, int i10) {
        if (cVar.f10535g == 1685485123 || cVar.f10535g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.N = bArr;
            jVar.readFully(bArr, 0, i10);
            return;
        }
        jVar.l(i10);
    }

    /* access modifiers changed from: protected */
    public void w(c cVar, int i10, j jVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f10530b)) {
            jVar.l(i11);
            return;
        }
        this.f10515n.K(i11);
        jVar.readFully(this.f10515n.d(), 0, i11);
    }

    /* access modifiers changed from: protected */
    public void x(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        t(i10).f10532d = (int) j10;
                        return;
                    case 136:
                        c t10 = t(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        t10.V = z10;
                        return;
                    case 155:
                        this.I = E(j10);
                        return;
                    case 159:
                        t(i10).O = (int) j10;
                        return;
                    case 176:
                        t(i10).f10541m = (int) j10;
                        return;
                    case 179:
                        i(i10);
                        this.C.a(E(j10));
                        return;
                    case 186:
                        t(i10).f10542n = (int) j10;
                        return;
                    case 215:
                        t(i10).f10531c = (int) j10;
                        return;
                    case 231:
                        this.B = E(j10);
                        return;
                    case 238:
                        this.P = (int) j10;
                        return;
                    case 241:
                        if (!this.E) {
                            i(i10);
                            this.D.a(j10);
                            this.E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.Q = true;
                        return;
                    case 16871:
                        int unused = t(i10).f10535g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j10);
                            sb.append(" not supported");
                            throw ParserException.a(sb.toString(), (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j10);
                            sb2.append(" not supported");
                            throw ParserException.a(sb2.toString(), (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j10);
                            sb3.append(" not supported");
                            throw ParserException.a(sb3.toString(), (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j10);
                            sb4.append(" not supported");
                            throw ParserException.a(sb4.toString(), (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j10);
                            sb5.append(" not supported");
                            throw ParserException.a(sb5.toString(), (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f10525x = j10 + this.f10518q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        j(i10);
                        if (i11 == 0) {
                            this.f10522u.f10551w = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f10522u.f10551w = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f10522u.f10551w = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f10522u.f10551w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        t(i10).f10543o = (int) j10;
                        return;
                    case 21682:
                        t(i10).f10545q = (int) j10;
                        return;
                    case 21690:
                        t(i10).f10544p = (int) j10;
                        return;
                    case 21930:
                        c t11 = t(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        t11.U = z10;
                        return;
                    case 21998:
                        t(i10).f10534f = (int) j10;
                        return;
                    case 22186:
                        t(i10).R = j10;
                        return;
                    case 22203:
                        t(i10).S = j10;
                        return;
                    case 25188:
                        t(i10).P = (int) j10;
                        return;
                    case 30321:
                        j(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f10522u.f10546r = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f10522u.f10546r = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f10522u.f10546r = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f10522u.f10546r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        t(i10).f10533e = (int) j10;
                        return;
                    case 2807729:
                        this.f10519r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                j(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f10522u.A = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f10522u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                j(i10);
                                int c10 = b6.b.c((int) j10);
                                if (c10 != -1) {
                                    this.f10522u.f10554z = c10;
                                    return;
                                }
                                return;
                            case 21947:
                                j(i10);
                                this.f10522u.f10552x = true;
                                int b10 = b6.b.b((int) j10);
                                if (b10 != -1) {
                                    this.f10522u.f10553y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                t(i10).B = (int) j10;
                                return;
                            case 21949:
                                t(i10).C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw ParserException.a(sb6.toString(), (Throwable) null);
            }
        } else if (j10 != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j10);
            sb7.append(" not supported");
            throw ParserException.a(sb7.toString(), (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public e(int i10) {
        this(new a(), i10);
    }

    e(c cVar, int i10) {
        this.f10518q = -1;
        this.f10519r = -9223372036854775807L;
        this.f10520s = -9223372036854775807L;
        this.f10521t = -9223372036854775807L;
        this.f10527z = -1;
        this.A = -1;
        this.B = -9223372036854775807L;
        this.f10501a = cVar;
        cVar.b(new b());
        this.f10505d = (i10 & 1) == 0;
        this.f10503b = new g();
        this.f10504c = new SparseArray<>();
        this.f10508g = new a6.y(4);
        this.f10509h = new a6.y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10510i = new a6.y(4);
        this.f10506e = new a6.y(u.f244a);
        this.f10507f = new a6.y(4);
        this.f10511j = new a6.y();
        this.f10512k = new a6.y();
        this.f10513l = new a6.y(8);
        this.f10514m = new a6.y();
        this.f10515n = new a6.y();
        this.L = new int[1];
    }
}
