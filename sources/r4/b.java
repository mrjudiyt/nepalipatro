package r4;

import a6.m0;
import a6.p;
import a6.t;
import a6.y;
import android.util.Pair;
import com.google.android.exoplayer2.drm.h;
import com.google.common.collect.x;
import e4.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.l;
import k4.u;
import r4.a;
import x4.a;

/* compiled from: AtomParsers */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f11023a = m0.g0("OpusHead");

    /* compiled from: AtomParsers */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11024a;

        /* renamed from: b  reason: collision with root package name */
        public int f11025b;

        /* renamed from: c  reason: collision with root package name */
        public int f11026c;

        /* renamed from: d  reason: collision with root package name */
        public long f11027d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f11028e;

        /* renamed from: f  reason: collision with root package name */
        private final y f11029f;

        /* renamed from: g  reason: collision with root package name */
        private final y f11030g;

        /* renamed from: h  reason: collision with root package name */
        private int f11031h;

        /* renamed from: i  reason: collision with root package name */
        private int f11032i;

        public a(y yVar, y yVar2, boolean z10) {
            this.f11030g = yVar;
            this.f11029f = yVar2;
            this.f11028e = z10;
            yVar2.O(12);
            this.f11024a = yVar2.G();
            yVar.O(12);
            this.f11032i = yVar.G();
            l.a(yVar.m() != 1 ? false : true, "first_chunk must be 1");
            this.f11025b = -1;
        }

        public boolean a() {
            long j10;
            int i10 = this.f11025b + 1;
            this.f11025b = i10;
            if (i10 == this.f11024a) {
                return false;
            }
            if (this.f11028e) {
                j10 = this.f11029f.H();
            } else {
                j10 = this.f11029f.E();
            }
            this.f11027d = j10;
            if (this.f11025b == this.f11031h) {
                this.f11026c = this.f11030g.G();
                this.f11030g.P(4);
                int i11 = this.f11032i - 1;
                this.f11032i = i11;
                this.f11031h = i11 > 0 ? this.f11030g.G() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: r4.b$b  reason: collision with other inner class name */
    /* compiled from: AtomParsers */
    private interface C0192b {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f11033a;

        /* renamed from: b  reason: collision with root package name */
        public j f11034b;

        /* renamed from: c  reason: collision with root package name */
        public int f11035c;

        /* renamed from: d  reason: collision with root package name */
        public int f11036d = 0;

        public c(int i10) {
            this.f11033a = new p[i10];
        }
    }

    /* compiled from: AtomParsers */
    static final class d implements C0192b {

        /* renamed from: a  reason: collision with root package name */
        private final int f11037a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11038b;

        /* renamed from: c  reason: collision with root package name */
        private final y f11039c;

        public d(a.b bVar, j jVar) {
            y yVar = bVar.f11022b;
            this.f11039c = yVar;
            yVar.O(12);
            int G = yVar.G();
            if ("audio/raw".equals(jVar.f8096s)) {
                int Y = m0.Y(jVar.H, jVar.F);
                if (G == 0 || G % Y != 0) {
                    StringBuilder sb = new StringBuilder(88);
                    sb.append("Audio sample size mismatch. stsd sample size: ");
                    sb.append(Y);
                    sb.append(", stsz sample size: ");
                    sb.append(G);
                    p.h("AtomParsers", sb.toString());
                    G = Y;
                }
            }
            this.f11037a = G == 0 ? -1 : G;
            this.f11038b = yVar.G();
        }

        public int a() {
            return this.f11037a;
        }

        public int b() {
            return this.f11038b;
        }

        public int c() {
            int i10 = this.f11037a;
            return i10 == -1 ? this.f11039c.G() : i10;
        }
    }

    /* compiled from: AtomParsers */
    static final class e implements C0192b {

        /* renamed from: a  reason: collision with root package name */
        private final y f11040a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11041b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11042c;

        /* renamed from: d  reason: collision with root package name */
        private int f11043d;

        /* renamed from: e  reason: collision with root package name */
        private int f11044e;

        public e(a.b bVar) {
            y yVar = bVar.f11022b;
            this.f11040a = yVar;
            yVar.O(12);
            this.f11042c = yVar.G() & 255;
            this.f11041b = yVar.G();
        }

        public int a() {
            return -1;
        }

        public int b() {
            return this.f11041b;
        }

        public int c() {
            int i10 = this.f11042c;
            if (i10 == 8) {
                return this.f11040a.C();
            }
            if (i10 == 16) {
                return this.f11040a.I();
            }
            int i11 = this.f11043d;
            this.f11043d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f11044e & 15;
            }
            int C = this.f11040a.C();
            this.f11044e = C;
            return (C & 240) >> 4;
        }
    }

    /* compiled from: AtomParsers */
    private static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f11045a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f11046b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f11047c;

        public f(int i10, long j10, int i11) {
            this.f11045a = i10;
            this.f11046b = j10;
            this.f11047c = i11;
        }
    }

    public static Pair<x4.a, x4.a> A(a.b bVar) {
        y yVar = bVar.f11022b;
        yVar.O(8);
        x4.a aVar = null;
        x4.a aVar2 = null;
        while (yVar.a() >= 8) {
            int e10 = yVar.e();
            int m10 = yVar.m();
            int m11 = yVar.m();
            if (m11 == 1835365473) {
                yVar.O(e10);
                aVar = B(yVar, e10 + m10);
            } else if (m11 == 1936553057) {
                yVar.O(e10);
                aVar2 = t(yVar, e10 + m10);
            }
            yVar.O(e10 + m10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static x4.a B(y yVar, int i10) {
        yVar.P(8);
        d(yVar);
        while (yVar.e() < i10) {
            int e10 = yVar.e();
            int m10 = yVar.m();
            if (yVar.m() == 1768715124) {
                yVar.O(e10);
                return k(yVar, e10 + m10);
            }
            yVar.O(e10 + m10);
        }
        return null;
    }

    private static void C(y yVar, int i10, int i11, int i12, int i13, int i14, h hVar, c cVar, int i15) {
        h hVar2;
        String str;
        y yVar2 = yVar;
        int i16 = i11;
        int i17 = i12;
        h hVar3 = hVar;
        c cVar2 = cVar;
        yVar2.O(i16 + 8 + 8);
        yVar2.P(16);
        int I = yVar.I();
        int I2 = yVar.I();
        yVar2.P(50);
        int e10 = yVar.e();
        int i18 = i10;
        if (i18 == 1701733238) {
            Pair<Integer, p> r10 = r(yVar2, i16, i17);
            if (r10 != null) {
                i18 = ((Integer) r10.first).intValue();
                if (hVar3 == null) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar3.d(((p) r10.second).f11152b);
                }
                cVar2.f11033a[i15] = (p) r10.second;
            }
            yVar2.O(e10);
        }
        String str2 = "video/3gpp";
        String str3 = i18 == 1831958048 ? "video/mpeg" : i18 == 1211250227 ? str2 : null;
        int i19 = -1;
        float f10 = 1.0f;
        String str4 = null;
        List list = null;
        byte[] bArr = null;
        b6.b bVar = null;
        boolean z10 = false;
        while (true) {
            if (e10 - i16 >= i17) {
                hVar2 = hVar3;
                break;
            }
            yVar2.O(e10);
            int e11 = yVar.e();
            String str5 = str2;
            int m10 = yVar.m();
            if (m10 == 0) {
                hVar2 = hVar3;
                if (yVar.e() - i16 == i17) {
                    break;
                }
            } else {
                hVar2 = hVar3;
            }
            l.a(m10 > 0, "childAtomSize must be positive");
            int m11 = yVar.m();
            if (m11 == 1635148611) {
                l.a(str3 == null, (String) null);
                yVar2.O(e11 + 8);
                b6.a b10 = b6.a.b(yVar);
                list = b10.f5008a;
                cVar2.f11035c = b10.f5009b;
                if (!z10) {
                    f10 = b10.f5012e;
                }
                str4 = b10.f5013f;
                str = "video/avc";
            } else if (m11 == 1752589123) {
                l.a(str3 == null, (String) null);
                yVar2.O(e11 + 8);
                b6.f a10 = b6.f.a(yVar);
                list = a10.f5046a;
                cVar2.f11035c = a10.f5047b;
                str4 = a10.f5048c;
                str = "video/hevc";
            } else if (m11 == 1685480259 || m11 == 1685485123) {
                b6.c a11 = b6.c.a(yVar);
                if (a11 != null) {
                    str4 = a11.f5021c;
                    str3 = "video/dolby-vision";
                }
                e10 += m10;
                yVar2 = yVar;
                i16 = i11;
                i17 = i12;
                str2 = str5;
                hVar3 = hVar2;
            } else if (m11 == 1987076931) {
                l.a(str3 == null, (String) null);
                str = i18 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else {
                if (m11 == 1635135811) {
                    l.a(str3 == null, (String) null);
                    str3 = "video/av01";
                } else if (m11 == 1681012275) {
                    l.a(str3 == null, (String) null);
                    str3 = str5;
                } else if (m11 == 1702061171) {
                    l.a(str3 == null, (String) null);
                    Pair<String, byte[]> h10 = h(yVar2, e11);
                    String str6 = (String) h10.first;
                    byte[] bArr2 = (byte[]) h10.second;
                    if (bArr2 != null) {
                        list = x.t(bArr2);
                    }
                    str3 = str6;
                } else if (m11 == 1885434736) {
                    f10 = p(yVar2, e11);
                    z10 = true;
                } else if (m11 == 1937126244) {
                    bArr = q(yVar2, e11, m10);
                } else if (m11 == 1936995172) {
                    int C = yVar.C();
                    yVar2.P(3);
                    if (C == 0) {
                        int C2 = yVar.C();
                        if (C2 == 0) {
                            i19 = 0;
                        } else if (C2 == 1) {
                            i19 = 1;
                        } else if (C2 == 2) {
                            i19 = 2;
                        } else if (C2 == 3) {
                            i19 = 3;
                        }
                    }
                } else if (m11 == 1668246642) {
                    int m12 = yVar.m();
                    boolean z11 = m12 == 1852009592;
                    if (z11 || m12 == 1852009571) {
                        int I3 = yVar.I();
                        int I4 = yVar.I();
                        yVar2.P(2);
                        bVar = new b6.b(b6.b.b(I3), z11 && (yVar.C() & 128) != 0 ? 1 : 2, b6.b.c(I4), (byte[]) null);
                    } else {
                        String valueOf = String.valueOf(a.a(m12));
                        p.h("AtomParsers", valueOf.length() != 0 ? "Unsupported color type: ".concat(valueOf) : new String("Unsupported color type: "));
                    }
                }
                e10 += m10;
                yVar2 = yVar;
                i16 = i11;
                i17 = i12;
                str2 = str5;
                hVar3 = hVar2;
            }
            str3 = str;
            e10 += m10;
            yVar2 = yVar;
            i16 = i11;
            i17 = i12;
            str2 = str5;
            hVar3 = hVar2;
        }
        if (str3 != null) {
            cVar2.f11034b = new j.b().R(i13).e0(str3).I(str4).j0(I).Q(I2).a0(f10).d0(i14).b0(bArr).h0(i19).T(list).L(hVar2).J(bVar).E();
        }
    }

    private static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int r10 = m0.r(4, 0, length);
        int r11 = m0.r(jArr.length - 4, 0, length);
        if (jArr[0] > j11 || j11 >= jArr[r10] || jArr[r11] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }

    private static int b(y yVar, int i10, int i11) {
        int e10 = yVar.e();
        while (e10 - i10 < i11) {
            yVar.O(e10);
            int m10 = yVar.m();
            l.a(m10 > 0, "childAtomSize must be positive");
            if (yVar.m() == 1702061171) {
                return e10;
            }
            e10 += m10;
        }
        return -1;
    }

    private static int c(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void d(y yVar) {
        int e10 = yVar.e();
        yVar.P(4);
        if (yVar.m() != 1751411826) {
            e10 += 4;
        }
        yVar.O(e10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void e(a6.y r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.google.android.exoplayer2.drm.h r27, r4.b.c r28, int r29) {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r6 = r28
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.O(r7)
            r7 = 6
            if (r26 == 0) goto L_0x0021
            int r8 = r20.I()
            r0.P(r7)
            goto L_0x0025
        L_0x0021:
            r0.P(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x0047
            if (r8 != r12) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            if (r8 != r11) goto L_0x0046
            r0.P(r10)
            double r7 = r20.l()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r20.G()
            r10 = 20
            r0.P(r10)
            goto L_0x0059
        L_0x0046:
            return
        L_0x0047:
            int r13 = r20.I()
            r0.P(r7)
            int r7 = r20.D()
            if (r8 != r12) goto L_0x0057
            r0.P(r10)
        L_0x0057:
            r8 = r7
            r7 = r13
        L_0x0059:
            int r10 = r20.e()
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r21
            if (r15 != r13) goto L_0x008f
            android.util.Pair r13 = r(r0, r1, r2)
            if (r13 == 0) goto L_0x008a
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto L_0x0076
            r14 = 0
            goto L_0x0081
        L_0x0076:
            java.lang.Object r14 = r13.second
            r4.p r14 = (r4.p) r14
            java.lang.String r14 = r14.f11152b
            com.google.android.exoplayer2.drm.h r5 = r5.d(r14)
            r14 = r5
        L_0x0081:
            r4.p[] r5 = r6.f11033a
            java.lang.Object r13 = r13.second
            r4.p r13 = (r4.p) r13
            r5[r29] = r13
            goto L_0x008b
        L_0x008a:
            r14 = r5
        L_0x008b:
            r0.O(r10)
            goto L_0x0090
        L_0x008f:
            r14 = r5
        L_0x0090:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            if (r15 != r5) goto L_0x009f
            java.lang.String r17 = "audio/ac3"
        L_0x009c:
            r5 = -1
            goto L_0x0148
        L_0x009f:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r15 != r5) goto L_0x00a7
            java.lang.String r17 = "audio/eac3"
            goto L_0x009c
        L_0x00a7:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r15 != r5) goto L_0x00af
            java.lang.String r17 = "audio/ac4"
            goto L_0x009c
        L_0x00af:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r15 != r5) goto L_0x00b7
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x009c
        L_0x00b7:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r15 == r5) goto L_0x0144
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r15 != r5) goto L_0x00c3
            goto L_0x0144
        L_0x00c3:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r15 != r5) goto L_0x00cb
            java.lang.String r17 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009c
        L_0x00cb:
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r15 != r5) goto L_0x00d3
            java.lang.String r17 = "audio/vnd.dts.uhd"
            goto L_0x009c
        L_0x00d3:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r15 != r5) goto L_0x00db
            java.lang.String r17 = "audio/3gpp"
            goto L_0x009c
        L_0x00db:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r15 != r5) goto L_0x00e3
            java.lang.String r17 = "audio/amr-wb"
            goto L_0x009c
        L_0x00e3:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r15 == r5) goto L_0x0142
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r15 != r5) goto L_0x00ee
            goto L_0x0142
        L_0x00ee:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r15 != r5) goto L_0x00f6
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0148
        L_0x00f6:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r15 == r5) goto L_0x013e
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r15 != r5) goto L_0x0101
            goto L_0x013e
        L_0x0101:
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r15 != r5) goto L_0x0109
            java.lang.String r17 = "audio/mha1"
            goto L_0x009c
        L_0x0109:
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r15 != r5) goto L_0x0111
            java.lang.String r17 = "audio/mhm1"
            goto L_0x009c
        L_0x0111:
            if (r15 != r13) goto L_0x0116
            java.lang.String r17 = "audio/alac"
            goto L_0x009c
        L_0x0116:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r15 != r5) goto L_0x011f
            java.lang.String r17 = "audio/g711-alaw"
            goto L_0x009c
        L_0x011f:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r15 != r5) goto L_0x0128
            java.lang.String r17 = "audio/g711-mlaw"
            goto L_0x009c
        L_0x0128:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r15 != r5) goto L_0x0131
            java.lang.String r17 = "audio/opus"
            goto L_0x009c
        L_0x0131:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r15 != r5) goto L_0x013a
            java.lang.String r17 = "audio/flac"
            goto L_0x009c
        L_0x013a:
            r5 = -1
            r17 = 0
            goto L_0x0148
        L_0x013e:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x009c
        L_0x0142:
            r5 = 2
            goto L_0x0148
        L_0x0144:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x009c
        L_0x0148:
            r11 = r17
            r15 = 0
            r19 = 0
        L_0x014d:
            int r13 = r10 - r1
            if (r13 >= r2) goto L_0x02c7
            r0.O(r10)
            int r13 = r20.m()
            if (r13 <= 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r12 = 0
        L_0x015c:
            java.lang.String r9 = "childAtomSize must be positive"
            k4.l.a(r12, r9)
            int r9 = r20.m()
            r12 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r12) goto L_0x0185
            int r9 = r13 + -13
            byte[] r12 = new byte[r9]
            int r1 = r10 + 13
            r0.O(r1)
            r1 = 0
            r0.j(r12, r1, r9)
            com.google.common.collect.x r1 = com.google.common.collect.x.t(r12)
        L_0x017b:
            r19 = r1
            r9 = -1
            r12 = 1
            r16 = 2
        L_0x0181:
            r17 = 0
            goto L_0x02c0
        L_0x0185:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L_0x0289
            if (r26 == 0) goto L_0x0193
            r12 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r12) goto L_0x0193
            goto L_0x0289
        L_0x0193:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L_0x01b0
            int r1 = r10 + 8
            r0.O(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            e4.j r1 = g4.b.c(r0, r1, r4, r14)
            r6.f11034b = r1
        L_0x01a7:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r12 = 1
            r16 = 2
            goto L_0x0286
        L_0x01b0:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L_0x01c5
            int r1 = r10 + 8
            r0.O(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            e4.j r1 = g4.b.g(r0, r1, r4, r14)
            r6.f11034b = r1
            goto L_0x01a7
        L_0x01c5:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L_0x01da
            int r1 = r10 + 8
            r0.O(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            e4.j r1 = g4.c.b(r0, r1, r4, r14)
            r6.f11034b = r1
            goto L_0x01a7
        L_0x01da:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r1) goto L_0x0203
            e4.j$b r1 = new e4.j$b
            r1.<init>()
            e4.j$b r1 = r1.R(r3)
            e4.j$b r1 = r1.e0(r11)
            e4.j$b r1 = r1.H(r7)
            e4.j$b r1 = r1.f0(r8)
            e4.j$b r1 = r1.L(r14)
            e4.j$b r1 = r1.V(r4)
            e4.j r1 = r1.E()
            r6.f11034b = r1
            goto L_0x01a7
        L_0x0203:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L_0x0221
            int r1 = r13 + -8
            byte[] r9 = f11023a
            int r12 = r9.length
            int r12 = r12 + r1
            byte[] r12 = java.util.Arrays.copyOf(r9, r12)
            int r2 = r10 + 8
            r0.O(r2)
            int r2 = r9.length
            r0.j(r12, r2, r1)
            java.util.List r1 = g4.v.a(r12)
            goto L_0x017b
        L_0x0221:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x0251
            int r1 = r13 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r9 = 102(0x66, float:1.43E-43)
            r12 = 0
            r2[r12] = r9
            r9 = 76
            r12 = 1
            r2[r12] = r9
            r9 = 97
            r16 = 2
            r2[r16] = r9
            r9 = 3
            r18 = 67
            r2[r9] = r18
            int r9 = r10 + 12
            r0.O(r9)
            r9 = 4
            r0.j(r2, r9, r1)
            com.google.common.collect.x r1 = com.google.common.collect.x.t(r2)
            r19 = r1
            goto L_0x0286
        L_0x0251:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 1
            r16 = 2
            if (r9 != r2) goto L_0x0285
            int r1 = r13 + -12
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.O(r8)
            r9 = 0
            r0.j(r7, r9, r1)
            android.util.Pair r1 = a6.c.e(r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.collect.x r7 = com.google.common.collect.x.t(r7)
            r19 = r7
            r9 = -1
            r17 = 0
            r7 = r1
            goto L_0x02c0
        L_0x0285:
            r9 = 0
        L_0x0286:
            r9 = -1
            goto L_0x0181
        L_0x0289:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 1
            r16 = 2
            r17 = 0
            if (r9 != r1) goto L_0x0295
            r1 = r10
            goto L_0x0299
        L_0x0295:
            int r1 = b(r0, r10, r13)
        L_0x0299:
            r9 = -1
            if (r1 == r9) goto L_0x02c0
            android.util.Pair r1 = h(r0, r1)
            java.lang.Object r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x02c0
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x02bc
            g4.a$b r2 = g4.a.f(r1)
            int r8 = r2.f8825a
            int r7 = r2.f8826b
            java.lang.String r15 = r2.f8827c
        L_0x02bc:
            com.google.common.collect.x r19 = com.google.common.collect.x.t(r1)
        L_0x02c0:
            int r10 = r10 + r13
            r1 = r22
            r2 = r23
            goto L_0x014d
        L_0x02c7:
            e4.j r0 = r6.f11034b
            if (r0 != 0) goto L_0x02fe
            if (r11 == 0) goto L_0x02fe
            e4.j$b r0 = new e4.j$b
            r0.<init>()
            e4.j$b r0 = r0.R(r3)
            e4.j$b r0 = r0.e0(r11)
            e4.j$b r0 = r0.I(r15)
            e4.j$b r0 = r0.H(r7)
            e4.j$b r0 = r0.f0(r8)
            e4.j$b r0 = r0.Y(r5)
            r1 = r19
            e4.j$b r0 = r0.T(r1)
            e4.j$b r0 = r0.L(r14)
            e4.j$b r0 = r0.V(r4)
            e4.j r0 = r0.E()
            r6.f11034b = r0
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.b.e(a6.y, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.h, r4.b$c, int):void");
    }

    static Pair<Integer, p> f(y yVar, int i10, int i11) {
        int i12 = i10 + 8;
        boolean z10 = false;
        String str = null;
        Integer num = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            yVar.O(i12);
            int m10 = yVar.m();
            int m11 = yVar.m();
            if (m11 == 1718775137) {
                num = Integer.valueOf(yVar.m());
            } else if (m11 == 1935894637) {
                yVar.P(4);
                str = yVar.z(4);
            } else if (m11 == 1935894633) {
                i13 = i12;
                i14 = m10;
            }
            i12 += m10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        l.a(num != null, "frma atom is mandatory");
        l.a(i13 != -1, "schi atom is mandatory");
        p s10 = s(yVar, i13, i14, str);
        if (s10 != null) {
            z10 = true;
        }
        l.a(z10, "tenc atom is mandatory");
        return Pair.create(num, (p) m0.j(s10));
    }

    private static Pair<long[], long[]> g(a.C0191a aVar) {
        a.b g10 = aVar.g(1701606260);
        if (g10 == null) {
            return null;
        }
        y yVar = g10.f11022b;
        yVar.O(8);
        int c10 = a.c(yVar.m());
        int G = yVar.G();
        long[] jArr = new long[G];
        long[] jArr2 = new long[G];
        int i10 = 0;
        while (i10 < G) {
            jArr[i10] = c10 == 1 ? yVar.H() : yVar.E();
            jArr2[i10] = c10 == 1 ? yVar.v() : (long) yVar.m();
            if (yVar.y() == 1) {
                yVar.P(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> h(y yVar, int i10) {
        yVar.O(i10 + 8 + 4);
        yVar.P(1);
        i(yVar);
        yVar.P(2);
        int C = yVar.C();
        if ((C & 128) != 0) {
            yVar.P(2);
        }
        if ((C & 64) != 0) {
            yVar.P(yVar.I());
        }
        if ((C & 32) != 0) {
            yVar.P(2);
        }
        yVar.P(1);
        i(yVar);
        String h10 = t.h(yVar.C());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return Pair.create(h10, (Object) null);
        }
        yVar.P(12);
        yVar.P(1);
        int i11 = i(yVar);
        byte[] bArr = new byte[i11];
        yVar.j(bArr, 0, i11);
        return Pair.create(h10, bArr);
    }

    private static int i(y yVar) {
        int C = yVar.C();
        int i10 = C & 127;
        while ((C & 128) == 128) {
            C = yVar.C();
            i10 = (i10 << 7) | (C & 127);
        }
        return i10;
    }

    private static int j(y yVar) {
        yVar.O(16);
        return yVar.m();
    }

    private static x4.a k(y yVar, int i10) {
        yVar.P(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.e() < i10) {
            a.b c10 = h.c(yVar);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x4.a((List<? extends a.b>) arrayList);
    }

    private static Pair<Long, String> l(y yVar) {
        int i10 = 8;
        yVar.O(8);
        int c10 = a.c(yVar.m());
        yVar.P(c10 == 0 ? 8 : 16);
        long E = yVar.E();
        if (c10 == 0) {
            i10 = 4;
        }
        yVar.P(i10);
        int I = yVar.I();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((I >> 10) & 31) + 96));
        sb.append((char) (((I >> 5) & 31) + 96));
        sb.append((char) ((I & 31) + 96));
        return Pair.create(Long.valueOf(E), sb.toString());
    }

    public static x4.a m(a.C0191a aVar) {
        a.b g10 = aVar.g(1751411826);
        a.b g11 = aVar.g(1801812339);
        a.b g12 = aVar.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || j(g10.f11022b) != 1835299937) {
            return null;
        }
        y yVar = g11.f11022b;
        yVar.O(12);
        int m10 = yVar.m();
        String[] strArr = new String[m10];
        for (int i10 = 0; i10 < m10; i10++) {
            int m11 = yVar.m();
            yVar.P(4);
            strArr[i10] = yVar.z(m11 - 8);
        }
        y yVar2 = g12.f11022b;
        yVar2.O(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() > 8) {
            int e10 = yVar2.e();
            int m12 = yVar2.m();
            int m13 = yVar2.m() - 1;
            if (m13 < 0 || m13 >= m10) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(m13);
                p.h("AtomParsers", sb.toString());
            } else {
                d5.a f10 = h.f(yVar2, e10 + m12, strArr[m13]);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            }
            yVar2.O(e10 + m12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x4.a((List<? extends a.b>) arrayList);
    }

    private static void n(y yVar, int i10, int i11, int i12, c cVar) {
        yVar.O(i11 + 8 + 8);
        if (i10 == 1835365492) {
            yVar.w();
            String w10 = yVar.w();
            if (w10 != null) {
                cVar.f11034b = new j.b().R(i12).e0(w10).E();
            }
        }
    }

    private static long o(y yVar) {
        int i10 = 8;
        yVar.O(8);
        if (a.c(yVar.m()) != 0) {
            i10 = 16;
        }
        yVar.P(i10);
        return yVar.E();
    }

    private static float p(y yVar, int i10) {
        yVar.O(i10 + 8);
        return ((float) yVar.G()) / ((float) yVar.G());
    }

    private static byte[] q(y yVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            yVar.O(i12);
            int m10 = yVar.m();
            if (yVar.m() == 1886547818) {
                return Arrays.copyOfRange(yVar.d(), i12, m10 + i12);
            }
            i12 += m10;
        }
        return null;
    }

    private static Pair<Integer, p> r(y yVar, int i10, int i11) {
        Pair<Integer, p> f10;
        int e10 = yVar.e();
        while (e10 - i10 < i11) {
            yVar.O(e10);
            int m10 = yVar.m();
            l.a(m10 > 0, "childAtomSize must be positive");
            if (yVar.m() == 1936289382 && (f10 = f(yVar, e10, m10)) != null) {
                return f10;
            }
            e10 += m10;
        }
        return null;
    }

    private static p s(y yVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            yVar.O(i14);
            int m10 = yVar.m();
            if (yVar.m() == 1952804451) {
                int c10 = a.c(yVar.m());
                yVar.P(1);
                if (c10 == 0) {
                    yVar.P(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int C = yVar.C();
                    i12 = C & 15;
                    i13 = (C & 240) >> 4;
                }
                boolean z10 = yVar.C() == 1;
                int C2 = yVar.C();
                byte[] bArr2 = new byte[16];
                yVar.j(bArr2, 0, 16);
                if (z10 && C2 == 0) {
                    int C3 = yVar.C();
                    bArr = new byte[C3];
                    yVar.j(bArr, 0, C3);
                }
                return new p(z10, str, C2, bArr2, i13, i12, bArr);
            }
            i14 += m10;
        }
    }

    private static x4.a t(y yVar, int i10) {
        yVar.P(12);
        while (yVar.e() < i10) {
            int e10 = yVar.e();
            int m10 = yVar.m();
            if (yVar.m() != 1935766900) {
                yVar.O(e10 + m10);
            } else if (m10 < 14) {
                return null;
            } else {
                yVar.P(5);
                int C = yVar.C();
                if (C != 12 && C != 13) {
                    return null;
                }
                float f10 = C == 12 ? 240.0f : 120.0f;
                yVar.P(1);
                return new x4.a(new d5.e(f10, yVar.C()));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static r4.r u(r4.o r37, r4.a.C0191a r38, k4.u r39) {
        /*
            r1 = r37
            r0 = r38
            r2 = r39
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            r4.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0017
            r4.b$d r5 = new r4.b$d
            e4.j r6 = r1.f11145f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            r4.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x051e
            r4.b$e r5 = new r4.b$e
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.b()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            r4.r r9 = new r4.r
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            r4 = 0
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r0 = r9
            r1 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            r4.a$b r7 = r0.g(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            r4.a$b r7 = r0.g(r7)
            java.lang.Object r7 = a6.a.e(r7)
            r4.a$b r7 = (r4.a.b) r7
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            a6.y r7 = r7.f11022b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            r4.a$b r10 = r0.g(r10)
            java.lang.Object r10 = a6.a.e(r10)
            r4.a$b r10 = (r4.a.b) r10
            a6.y r10 = r10.f11022b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            r4.a$b r11 = r0.g(r11)
            java.lang.Object r11 = a6.a.e(r11)
            r4.a$b r11 = (r4.a.b) r11
            a6.y r11 = r11.f11022b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            r4.a$b r12 = r0.g(r12)
            if (r12 == 0) goto L_0x0086
            a6.y r12 = r12.f11022b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            r4.a$b r0 = r0.g(r13)
            if (r0 == 0) goto L_0x0093
            a6.y r0 = r0.f11022b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            r4.b$a r13 = new r4.b$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.O(r7)
            int r9 = r11.G()
            int r9 = r9 - r8
            int r10 = r11.G()
            int r14 = r11.G()
            if (r0 == 0) goto L_0x00b5
            r0.O(r7)
            int r15 = r0.G()
            goto L_0x00b6
        L_0x00b5:
            r15 = 0
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cb
            r12.O(r7)
            int r7 = r12.G()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.G()
            int r16 = r16 + -1
            goto L_0x00ce
        L_0x00c9:
            r12 = 0
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r16 = -1
        L_0x00ce:
            int r6 = r5.a()
            e4.j r8 = r1.f11145f
            java.lang.String r8 = r8.f8096s
            if (r6 == r4) goto L_0x00fa
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fa
        L_0x00f0:
            if (r9 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00fa
            if (r7 != 0) goto L_0x00fa
            r38 = r7
            r4 = 1
            goto L_0x00fd
        L_0x00fa:
            r38 = r7
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x0131
            int r0 = r13.f11024a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0105:
            boolean r5 = r13.a()
            if (r5 == 0) goto L_0x0116
            int r5 = r13.f11025b
            long r9 = r13.f11027d
            r4[r5] = r9
            int r9 = r13.f11026c
            r0[r5] = r9
            goto L_0x0105
        L_0x0116:
            long r9 = (long) r14
            r4.d$b r0 = r4.d.a(r6, r4, r0, r9)
            long[] r4 = r0.f11052a
            int[] r5 = r0.f11053b
            int r6 = r0.f11054c
            long[] r9 = r0.f11055d
            int[] r10 = r0.f11056e
            long r11 = r0.f11057f
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r9
            r14 = r10
            r15 = r11
            r5 = r1
            goto L_0x02ab
        L_0x0131:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r23 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r36 = r9
            r9 = r38
        L_0x0151:
            r38 = r36
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x0219
            r27 = r26
            r26 = r21
            r21 = 1
        L_0x015d:
            if (r26 != 0) goto L_0x017a
            boolean r21 = r13.a()
            if (r21 == 0) goto L_0x017a
            r29 = r14
            r30 = r15
            long r14 = r13.f11027d
            r31 = r3
            int r3 = r13.f11026c
            r26 = r3
            r27 = r14
            r14 = r29
            r15 = r30
            r3 = r31
            goto L_0x015d
        L_0x017a:
            r31 = r3
            r29 = r14
            r30 = r15
            if (r21 != 0) goto L_0x019e
            java.lang.String r2 = "Unexpected end of chunk data"
            a6.p.h(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r20
            r1 = r26
            goto L_0x0221
        L_0x019e:
            if (r0 == 0) goto L_0x01b1
        L_0x01a0:
            if (r22 != 0) goto L_0x01af
            if (r16 <= 0) goto L_0x01af
            int r22 = r0.G()
            int r20 = r0.m()
            int r16 = r16 + -1
            goto L_0x01a0
        L_0x01af:
            int r22 = r22 + -1
        L_0x01b1:
            r3 = r20
            r4[r1] = r27
            int r10 = r5.c()
            r6[r1] = r10
            r10 = r6[r1]
            if (r10 <= r11) goto L_0x01c2
            r10 = r6[r1]
            r11 = r10
        L_0x01c2:
            long r14 = (long) r3
            long r14 = r24 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01cb
            r10 = 1
            goto L_0x01cc
        L_0x01cb:
            r10 = 0
        L_0x01cc:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e2
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e2
            java.lang.Object r2 = a6.a.e(r12)
            a6.y r2 = (a6.y) r2
            int r2 = r2.G()
            int r2 = r2 - r10
        L_0x01e2:
            r15 = r2
            r10 = r3
            r14 = r30
            long r2 = (long) r14
            long r24 = r24 + r2
            int r2 = r29 + -1
            if (r2 != 0) goto L_0x01fa
            if (r38 <= 0) goto L_0x01fa
            int r2 = r23.G()
            int r3 = r23.m()
            int r14 = r38 + -1
            goto L_0x01fd
        L_0x01fa:
            r3 = r14
            r14 = r38
        L_0x01fd:
            r38 = r2
            r2 = r6[r1]
            r20 = r3
            long r2 = (long) r2
            long r2 = r27 + r2
            int r21 = r26 + -1
            int r1 = r1 + 1
            r26 = r2
            r2 = r15
            r15 = r20
            r3 = r31
            r20 = r10
            r36 = r14
            r14 = r38
            goto L_0x0151
        L_0x0219:
            r31 = r3
            r29 = r14
            r2 = r20
            r1 = r21
        L_0x0221:
            long r12 = (long) r2
            long r12 = r24 + r12
            if (r0 == 0) goto L_0x0236
        L_0x0226:
            if (r16 <= 0) goto L_0x0236
            int r2 = r0.G()
            if (r2 == 0) goto L_0x0230
            r0 = 0
            goto L_0x0237
        L_0x0230:
            r0.m()
            int r16 = r16 + -1
            goto L_0x0226
        L_0x0236:
            r0 = 1
        L_0x0237:
            if (r9 != 0) goto L_0x024b
            if (r29 != 0) goto L_0x024b
            if (r1 != 0) goto L_0x024b
            if (r38 != 0) goto L_0x024b
            r2 = r22
            if (r2 != 0) goto L_0x024d
            if (r0 != 0) goto L_0x0246
            goto L_0x024d
        L_0x0246:
            r5 = r37
            r16 = r3
            goto L_0x02a3
        L_0x024b:
            r2 = r22
        L_0x024d:
            r5 = r37
            int r14 = r5.f11140a
            if (r0 != 0) goto L_0x0256
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0258
        L_0x0256:
            java.lang.String r0 = ""
        L_0x0258:
            int r15 = r0.length()
            int r15 = r15 + 262
            r16 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            java.lang.String r15 = "Inconsistent stbl box for track "
            r3.append(r15)
            r3.append(r14)
            java.lang.String r14 = ": remainingSynchronizationSamples "
            r3.append(r14)
            r3.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r3.append(r9)
            r9 = r29
            r3.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r3.append(r9)
            r3.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r3.append(r1)
            r14 = r38
            r3.append(r14)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            a6.p.h(r10, r0)
        L_0x02a3:
            r2 = r4
            r3 = r6
            r14 = r8
            r4 = r11
            r0 = r16
            r15 = r12
            r13 = r7
        L_0x02ab:
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r5.f11142c
            r6 = r15
            long r7 = a6.m0.C0(r6, r8, r10)
            long[] r1 = r5.f11147h
            r11 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02cc
            long r0 = r5.f11142c
            a6.m0.D0(r13, r11, r0)
            r4.r r9 = new r4.r
            r0 = r9
            r1 = r37
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02cc:
            int r1 = r1.length
            r6 = 1
            if (r1 != r6) goto L_0x036a
            int r1 = r5.f11141b
            if (r1 != r6) goto L_0x036a
            int r1 = r13.length
            r6 = 2
            if (r1 < r6) goto L_0x036a
            long[] r1 = r5.f11148i
            java.lang.Object r1 = a6.a.e(r1)
            long[] r1 = (long[]) r1
            r6 = 0
            r20 = r1[r6]
            long[] r1 = r5.f11147h
            r22 = r1[r6]
            long r6 = r5.f11142c
            long r8 = r5.f11143d
            r24 = r6
            r26 = r8
            long r6 = a6.m0.C0(r22, r24, r26)
            long r22 = r20 + r6
            r6 = r13
            r7 = r15
            r9 = r20
            r24 = r0
            r0 = r11
            r11 = r22
            boolean r6 = a(r6, r7, r9, r11)
            if (r6 == 0) goto L_0x036c
            long r7 = r15 - r22
            r6 = 0
            r9 = r13[r6]
            long r25 = r20 - r9
            e4.j r6 = r5.f11145f
            int r6 = r6.G
            long r9 = (long) r6
            long r11 = r5.f11142c
            r27 = r9
            r29 = r11
            long r11 = a6.m0.C0(r25, r27, r29)
            e4.j r6 = r5.f11145f
            int r6 = r6.G
            long r9 = (long) r6
            long r0 = r5.f11142c
            r38 = r14
            r22 = r15
            r14 = r11
            r11 = r0
            long r0 = a6.m0.C0(r7, r9, r11)
            r6 = 0
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0335
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0370
        L_0x0335:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0370
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0370
            int r6 = (int) r14
            r7 = r39
            r7.f9620a = r6
            int r1 = (int) r0
            r7.f9621b = r1
            long r0 = r5.f11142c
            r6 = 1000000(0xf4240, double:4.940656E-318)
            a6.m0.D0(r13, r6, r0)
            long[] r0 = r5.f11147h
            r1 = 0
            r6 = r0[r1]
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r5.f11143d
            long r7 = a6.m0.C0(r6, r8, r10)
            r4.r r9 = new r4.r
            r0 = r9
            r1 = r37
            r5 = r13
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x036a:
            r24 = r0
        L_0x036c:
            r38 = r14
            r22 = r15
        L_0x0370:
            long[] r0 = r5.f11147h
            int r1 = r0.length
            r6 = 1
            if (r1 != r6) goto L_0x03ba
            r1 = 0
            r6 = r0[r1]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x03ba
            long[] r0 = r5.f11148i
            java.lang.Object r0 = a6.a.e(r0)
            long[] r0 = (long[]) r0
            r6 = r0[r1]
            r0 = 0
        L_0x038a:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x03a1
            r8 = r13[r0]
            long r14 = r8 - r6
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r5.f11142c
            r18 = r8
            long r8 = a6.m0.C0(r14, r16, r18)
            r13[r0] = r8
            int r0 = r0 + 1
            goto L_0x038a
        L_0x03a1:
            long r14 = r22 - r6
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r5.f11142c
            r18 = r0
            long r7 = a6.m0.C0(r14, r16, r18)
            r4.r r9 = new r4.r
            r0 = r9
            r1 = r37
            r5 = r13
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03ba:
            int r1 = r5.f11141b
            r6 = 1
            if (r1 != r6) goto L_0x03c1
            r10 = 1
            goto L_0x03c2
        L_0x03c1:
            r10 = 0
        L_0x03c2:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r6 = r5.f11148i
            java.lang.Object r6 = a6.a.e(r6)
            long[] r6 = (long[]) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
        L_0x03d4:
            long[] r12 = r5.f11147h
            int r14 = r12.length
            if (r7 >= r14) goto L_0x043c
            r14 = r6[r7]
            r20 = -1
            int r16 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r16 == 0) goto L_0x042d
            r25 = r12[r7]
            r12 = r3
            r16 = r4
            long r3 = r5.f11142c
            r20 = r11
            r21 = r12
            long r11 = r5.f11143d
            r27 = r3
            r29 = r11
            long r3 = a6.m0.C0(r25, r27, r29)
            r11 = 1
            int r12 = a6.m0.i(r13, r14, r11, r11)
            r1[r7] = r12
            long r14 = r14 + r3
            r3 = 0
            int r4 = a6.m0.e(r13, r14, r10, r3)
            r0[r7] = r4
        L_0x0405:
            r4 = r1[r7]
            r12 = r0[r7]
            if (r4 >= r12) goto L_0x0418
            r4 = r1[r7]
            r4 = r38[r4]
            r4 = r4 & r11
            if (r4 != 0) goto L_0x0418
            r4 = r1[r7]
            int r4 = r4 + r11
            r1[r7] = r4
            goto L_0x0405
        L_0x0418:
            r4 = r0[r7]
            r12 = r1[r7]
            int r4 = r4 - r12
            int r9 = r9 + r4
            r4 = r1[r7]
            r12 = r20
            if (r12 == r4) goto L_0x0426
            r4 = 1
            goto L_0x0427
        L_0x0426:
            r4 = 0
        L_0x0427:
            r4 = r4 | r8
            r8 = r0[r7]
            r12 = r8
            r8 = r4
            goto L_0x0434
        L_0x042d:
            r21 = r3
            r16 = r4
            r12 = r11
            r3 = 0
            r11 = 1
        L_0x0434:
            int r7 = r7 + 1
            r11 = r12
            r4 = r16
            r3 = r21
            goto L_0x03d4
        L_0x043c:
            r21 = r3
            r16 = r4
            r4 = r24
            r3 = 0
            r11 = 1
            if (r9 == r4) goto L_0x0447
            goto L_0x0448
        L_0x0447:
            r11 = 0
        L_0x0448:
            r4 = r8 | r11
            if (r4 == 0) goto L_0x044f
            long[] r6 = new long[r9]
            goto L_0x0450
        L_0x044f:
            r6 = r2
        L_0x0450:
            if (r4 == 0) goto L_0x0455
            int[] r7 = new int[r9]
            goto L_0x0457
        L_0x0455:
            r7 = r21
        L_0x0457:
            if (r4 == 0) goto L_0x045b
            r16 = 0
        L_0x045b:
            if (r4 == 0) goto L_0x0460
            int[] r8 = new int[r9]
            goto L_0x0462
        L_0x0460:
            r8 = r38
        L_0x0462:
            long[] r9 = new long[r9]
            r10 = 0
            r12 = 0
        L_0x0467:
            long[] r14 = r5.f11147h
            int r14 = r14.length
            if (r3 >= r14) goto L_0x04fd
            long[] r14 = r5.f11148i
            r17 = r14[r3]
            r14 = r1[r3]
            r15 = r0[r3]
            r20 = r0
            if (r4 == 0) goto L_0x048c
            int r0 = r15 - r14
            java.lang.System.arraycopy(r2, r14, r6, r12, r0)
            r28 = r1
            r1 = r21
            java.lang.System.arraycopy(r1, r14, r7, r12, r0)
            r21 = r2
            r2 = r38
            java.lang.System.arraycopy(r2, r14, r8, r12, r0)
            goto L_0x0494
        L_0x048c:
            r28 = r1
            r1 = r21
            r21 = r2
            r2 = r38
        L_0x0494:
            r0 = r16
        L_0x0496:
            if (r14 >= r15) goto L_0x04dd
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r2
            r29 = r3
            long r2 = r5.f11143d
            r22 = r10
            r26 = r2
            long r2 = a6.m0.C0(r22, r24, r26)
            r22 = r13[r14]
            r24 = r10
            long r10 = r22 - r17
            r22 = r13
            r16 = r14
            r13 = 0
            long r30 = java.lang.Math.max(r13, r10)
            r32 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r5.f11142c
            r34 = r10
            long r10 = a6.m0.C0(r30, r32, r34)
            long r2 = r2 + r10
            r9[r12] = r2
            if (r4 == 0) goto L_0x04cf
            r2 = r7[r12]
            if (r2 <= r0) goto L_0x04cf
            r0 = r1[r16]
        L_0x04cf:
            int r12 = r12 + 1
            int r2 = r16 + 1
            r14 = r2
            r13 = r22
            r10 = r24
            r3 = r29
            r2 = r38
            goto L_0x0496
        L_0x04dd:
            r38 = r2
            r29 = r3
            r24 = r10
            r22 = r13
            r13 = 0
            long[] r2 = r5.f11147h
            r10 = r2[r29]
            long r10 = r24 + r10
            int r3 = r29 + 1
            r16 = r0
            r0 = r20
            r2 = r21
            r13 = r22
            r21 = r1
            r1 = r28
            goto L_0x0467
        L_0x04fd:
            r24 = r10
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r5.f11143d
            r22 = r24
            r24 = r0
            r26 = r2
            long r10 = a6.m0.C0(r22, r24, r26)
            r4.r r12 = new r4.r
            r0 = r12
            r1 = r37
            r2 = r6
            r3 = r7
            r4 = r16
            r5 = r9
            r6 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
        L_0x051e:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.b.u(r4.o, r4.a$a, k4.u):r4.r");
    }

    private static c v(y yVar, int i10, int i11, String str, h hVar, boolean z10) {
        int i12;
        y yVar2 = yVar;
        int i13 = i10;
        yVar2.O(12);
        int m10 = yVar.m();
        c cVar = new c(m10);
        for (int i14 = 0; i14 < m10; i14++) {
            int e10 = yVar.e();
            int m11 = yVar.m();
            l.a(m11 > 0, "childAtomSize must be positive");
            int m12 = yVar.m();
            if (m12 == 1635148593 || m12 == 1635148595 || m12 == 1701733238 || m12 == 1831958048 || m12 == 1836070006 || m12 == 1752589105 || m12 == 1751479857 || m12 == 1932670515 || m12 == 1211250227 || m12 == 1987063864 || m12 == 1987063865 || m12 == 1635135537 || m12 == 1685479798 || m12 == 1685479729 || m12 == 1685481573 || m12 == 1685481521) {
                i12 = e10;
                C(yVar, m12, i12, m11, i10, i11, hVar, cVar, i14);
            } else if (m12 == 1836069985 || m12 == 1701733217 || m12 == 1633889587 || m12 == 1700998451 || m12 == 1633889588 || m12 == 1685353315 || m12 == 1685353317 || m12 == 1685353320 || m12 == 1685353324 || m12 == 1685353336 || m12 == 1935764850 || m12 == 1935767394 || m12 == 1819304813 || m12 == 1936684916 || m12 == 1953984371 || m12 == 778924082 || m12 == 778924083 || m12 == 1835557169 || m12 == 1835560241 || m12 == 1634492771 || m12 == 1634492791 || m12 == 1970037111 || m12 == 1332770163 || m12 == 1716281667) {
                i12 = e10;
                e(yVar, m12, e10, m11, i10, str, z10, hVar, cVar, i14);
            } else {
                if (m12 == 1414810956 || m12 == 1954034535 || m12 == 2004251764 || m12 == 1937010800 || m12 == 1664495672) {
                    w(yVar, m12, e10, m11, i10, str, cVar);
                } else if (m12 == 1835365492) {
                    n(yVar2, m12, e10, i13, cVar);
                } else if (m12 == 1667329389) {
                    cVar.f11034b = new j.b().R(i13).e0("application/x-camera-motion").E();
                }
                i12 = e10;
            }
            yVar2.O(i12 + m11);
        }
        return cVar;
    }

    private static void w(y yVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        yVar.O(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        x xVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                yVar.j(bArr, 0, i14);
                xVar = x.t(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                cVar.f11036d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f11034b = new j.b().R(i13).e0(str2).V(str).i0(j10).T(xVar).E();
    }

    private static f x(y yVar) {
        boolean z10;
        int i10 = 8;
        yVar.O(8);
        int c10 = a.c(yVar.m());
        yVar.P(c10 == 0 ? 8 : 16);
        int m10 = yVar.m();
        yVar.P(4);
        int e10 = yVar.e();
        if (c10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (yVar.d()[e10 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            yVar.P(i10);
        } else {
            long E = c10 == 0 ? yVar.E() : yVar.H();
            if (E != 0) {
                j10 = E;
            }
        }
        yVar.P(16);
        int m11 = yVar.m();
        int m12 = yVar.m();
        yVar.P(4);
        int m13 = yVar.m();
        int m14 = yVar.m();
        if (m11 == 0 && m12 == 65536 && m13 == -65536 && m14 == 0) {
            i11 = 90;
        } else if (m11 == 0 && m12 == -65536 && m13 == 65536 && m14 == 0) {
            i11 = 270;
        } else if (m11 == -65536 && m12 == 0 && m13 == 0 && m14 == -65536) {
            i11 = 180;
        }
        return new f(m10, j10, i11);
    }

    private static o y(a.C0191a aVar, a.b bVar, long j10, h hVar, boolean z10, boolean z11) {
        long j11;
        a.b bVar2;
        long[] jArr;
        long[] jArr2;
        a.C0191a f10;
        Pair<long[], long[]> g10;
        a.C0191a aVar2 = aVar;
        a.C0191a aVar3 = (a.C0191a) a6.a.e(aVar2.f(1835297121));
        int c10 = c(j(((a.b) a6.a.e(aVar3.g(1751411826))).f11022b));
        if (c10 == -1) {
            return null;
        }
        f x10 = x(((a.b) a6.a.e(aVar2.g(1953196132))).f11022b);
        long j12 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = x10.f11046b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long o10 = o(bVar2.f11022b);
        if (j11 != -9223372036854775807L) {
            j12 = m0.C0(j11, 1000000, o10);
        }
        long j13 = j12;
        Pair<Long, String> l10 = l(((a.b) a6.a.e(aVar3.g(1835296868))).f11022b);
        c v10 = v(((a.b) a6.a.e(((a.C0191a) a6.a.e(((a.C0191a) a6.a.e(aVar3.f(1835626086))).f(1937007212))).g(1937011556))).f11022b, x10.f11045a, x10.f11047c, (String) l10.second, hVar, z11);
        if (z10 || (f10 = aVar2.f(1701082227)) == null || (g10 = g(f10)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) g10.second;
            jArr2 = (long[]) g10.first;
        }
        if (v10.f11034b == null) {
            return null;
        }
        return new o(x10.f11045a, c10, ((Long) l10.first).longValue(), o10, j13, v10.f11034b, v10.f11036d, v10.f11033a, v10.f11035c, jArr2, jArr);
    }

    public static List<r> z(a.C0191a aVar, u uVar, long j10, h hVar, boolean z10, boolean z11, l6.h<o, o> hVar2) {
        a.C0191a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar2.f11021d.size(); i10++) {
            a.C0191a aVar3 = aVar2.f11021d.get(i10);
            if (aVar3.f11018a != 1953653099) {
                u uVar2 = uVar;
                l6.h<o, o> hVar3 = hVar2;
            } else {
                o apply = hVar2.apply(y(aVar3, (a.b) a6.a.e(aVar.g(1836476516)), j10, hVar, z10, z11));
                if (apply == null) {
                    u uVar3 = uVar;
                } else {
                    u uVar4 = uVar;
                    arrayList.add(u(apply, (a.C0191a) a6.a.e(((a.C0191a) a6.a.e(((a.C0191a) a6.a.e(aVar3.f(1835297121))).f(1835626086))).f(1937007212)), uVar));
                }
            }
        }
        return arrayList;
    }
}
