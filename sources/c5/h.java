package c5;

import a6.m0;
import a6.p;
import a6.x;
import a6.y;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import l6.c;
import x4.a;
import x4.e;

/* compiled from: Id3Decoder */
public final class h extends x4.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5249b = g.f5248a;

    /* renamed from: a  reason: collision with root package name */
    private final a f5250a;

    /* compiled from: Id3Decoder */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* compiled from: Id3Decoder */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f5251a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5252b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f5253c;

        public b(int i10, boolean z10, int i11) {
            this.f5251a = i10;
            this.f5252b = z10;
            this.f5253c = i11;
        }
    }

    public h() {
        this((a) null);
    }

    private static int A(y yVar, int i10) {
        byte[] d10 = yVar.d();
        int e10 = yVar.e();
        int i11 = e10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= e10 + i10) {
                return i10;
            }
            if ((d10[i11] & 255) == 255 && d10[i12] == 0) {
                System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - e10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean B(a6.y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.m()     // Catch:{ all -> 0x00af }
            long r8 = r18.E()     // Catch:{ all -> 0x00af }
            int r10 = r18.I()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.F()     // Catch:{ all -> 0x00af }
            int r8 = r18.F()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.O(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.O(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = 0
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = 0
            goto L_0x0079
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0098
            r1.O(r2)
            return r6
        L_0x0098:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            r1.O(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.P(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.O(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.O(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.h.B(a6.y, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return m0.f210f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static a f(y yVar, int i10, int i11) {
        int i12;
        String str;
        int C = yVar.C();
        String v10 = v(C);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        yVar.j(bArr, 0, i13);
        if (i11 == 2) {
            String valueOf = String.valueOf(c.e(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            i12 = y(bArr, 0);
            String e10 = c.e(new String(bArr, 0, i12, "ISO-8859-1"));
            if (e10.indexOf(47) == -1) {
                if (e10.length() != 0) {
                    str = "image/".concat(e10);
                } else {
                    e10 = new String("image/");
                }
            }
            str = e10;
        }
        int i14 = i12 + 2;
        int x10 = x(bArr, i14, C);
        return new a(str, new String(bArr, i14, x10 - i14, v10), bArr[i12 + 1] & 255, d(bArr, x10 + u(C), i13));
    }

    private static b g(y yVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        yVar.j(bArr, 0, i10);
        return new b(str, bArr);
    }

    private static c h(y yVar, int i10, int i11, boolean z10, int i12, a aVar) {
        y yVar2 = yVar;
        int e10 = yVar.e();
        int y10 = y(yVar.d(), e10);
        String str = new String(yVar.d(), e10, y10 - e10, "ISO-8859-1");
        yVar.O(y10 + 1);
        int m10 = yVar.m();
        int m11 = yVar.m();
        long E = yVar.E();
        long j10 = E == KeyboardMap.kValueMask ? -1 : E;
        long E2 = yVar.E();
        long j11 = E2 == KeyboardMap.kValueMask ? -1 : E2;
        ArrayList arrayList = new ArrayList();
        int i13 = e10 + i10;
        while (yVar.e() < i13) {
            i k10 = k(i11, yVar, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, m10, m11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(y yVar, int i10, int i11, boolean z10, int i12, a aVar) {
        y yVar2 = yVar;
        int e10 = yVar.e();
        int y10 = y(yVar.d(), e10);
        String str = new String(yVar.d(), e10, y10 - e10, "ISO-8859-1");
        yVar2.O(y10 + 1);
        int C = yVar.C();
        boolean z11 = (C & 2) != 0;
        boolean z12 = (C & 1) != 0;
        int C2 = yVar.C();
        String[] strArr = new String[C2];
        for (int i13 = 0; i13 < C2; i13++) {
            int e11 = yVar.e();
            int y11 = y(yVar.d(), e11);
            strArr[i13] = new String(yVar.d(), e11, y11 - e11, "ISO-8859-1");
            yVar2.O(y11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = e10 + i10;
        while (yVar.e() < i14) {
            i k10 = k(i11, yVar2, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(y yVar, int i10) {
        if (i10 < 4) {
            return null;
        }
        int C = yVar.C();
        String v10 = v(C);
        byte[] bArr = new byte[3];
        yVar.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        yVar.j(bArr2, 0, i11);
        int x10 = x(bArr2, 0, C);
        String str2 = new String(bArr2, 0, x10, v10);
        int u10 = x10 + u(C);
        return new e(str, str2, p(bArr2, u10, x(bArr2, u10, C), v10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static c5.i k(int r19, a6.y r20, boolean r21, int r22, c5.h.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.C()
            int r9 = r20.C()
            int r10 = r20.C()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.C()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.G()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.G()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.F()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.I()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.f()
            r7.O(r0)
            return r16
        L_0x0067:
            int r1 = r20.e()
            int r5 = r1 + r15
            int r1 = r20.f()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            a6.p.h(r4, r0)
            int r0 = r20.f()
            r7.O(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.O(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x022f
            if (r4 == 0) goto L_0x00f8
            goto L_0x022f
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.P(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.P(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = A(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            c5.m r1 = r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            c5.m r1 = q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x022b
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            c5.n r1 = t(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            c5.n r1 = s(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            c5.l r1 = o(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            c5.f r1 = l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            c5.a r1 = f(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            c5.e r1 = j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            c5.c r1 = h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            c5.d r1 = i(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            c5.k r1 = n(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            c5.b r1 = g(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
        L_0x01f2:
            if (r1 != 0) goto L_0x021e
            java.lang.String r0 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            int r2 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            r3.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            r3.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            a6.p.h(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
        L_0x021e:
            r7.O(r14)
            return r1
        L_0x0222:
            java.lang.String r0 = "Unsupported character encoding"
            a6.p.h(r12, r0)     // Catch:{ all -> 0x012e }
            r7.O(r14)
            return r16
        L_0x022b:
            r7.O(r14)
            throw r0
        L_0x022f:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            a6.p.h(r12, r0)
            r7.O(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.h.k(int, a6.y, boolean, int, c5.h$a):c5.i");
    }

    private static f l(y yVar, int i10) {
        int C = yVar.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.j(bArr, 0, i11);
        int y10 = y(bArr, 0);
        String str = new String(bArr, 0, y10, "ISO-8859-1");
        int i12 = y10 + 1;
        int x10 = x(bArr, i12, C);
        String p10 = p(bArr, i12, x10, v10);
        int u10 = x10 + u(C);
        int x11 = x(bArr, u10, C);
        return new f(str, p10, p(bArr, u10, x11, v10), d(bArr, x11 + u(C), i11));
    }

    private static b m(y yVar) {
        if (yVar.a() < 10) {
            p.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int F = yVar.F();
        boolean z10 = false;
        if (F != 4801587) {
            String valueOf = String.valueOf(String.format("%06X", new Object[]{Integer.valueOf(F)}));
            p.h("Id3Decoder", valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int C = yVar.C();
        yVar.P(1);
        int C2 = yVar.C();
        int B = yVar.B();
        if (C == 2) {
            if ((C2 & 64) != 0) {
                p.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (C == 3) {
            if ((C2 & 64) != 0) {
                int m10 = yVar.m();
                yVar.P(m10);
                B -= m10 + 4;
            }
        } else if (C == 4) {
            if ((C2 & 64) != 0) {
                int B2 = yVar.B();
                yVar.P(B2 - 4);
                B -= B2;
            }
            if ((C2 & 16) != 0) {
                B -= 10;
            }
        } else {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Skipped ID3 tag with unsupported majorVersion=");
            sb.append(C);
            p.h("Id3Decoder", sb.toString());
            return null;
        }
        if (C < 4 && (C2 & 128) != 0) {
            z10 = true;
        }
        return new b(C, z10, B);
    }

    private static k n(y yVar, int i10) {
        int I = yVar.I();
        int F = yVar.F();
        int F2 = yVar.F();
        int C = yVar.C();
        int C2 = yVar.C();
        x xVar = new x();
        xVar.m(yVar);
        int i11 = ((i10 - 10) * 8) / (C + C2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = xVar.h(C);
            int h11 = xVar.h(C2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(I, F, F2, iArr, iArr2);
    }

    private static l o(y yVar, int i10) {
        byte[] bArr = new byte[i10];
        yVar.j(bArr, 0, i10);
        int y10 = y(bArr, 0);
        return new l(new String(bArr, 0, y10, "ISO-8859-1"), d(bArr, y10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, String str) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static m q(y yVar, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int C = yVar.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.j(bArr, 0, i11);
        return new m(str, (String) null, new String(bArr, 0, x(bArr, 0, C), v10));
    }

    private static m r(y yVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int C = yVar.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.j(bArr, 0, i11);
        int x10 = x(bArr, 0, C);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(C);
        return new m("TXXX", str, p(bArr, u10, x(bArr, u10, C), v10));
    }

    private static n s(y yVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        yVar.j(bArr, 0, i10);
        return new n(str, (String) null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    private static n t(y yVar, int i10) {
        if (i10 < 1) {
            return null;
        }
        int C = yVar.C();
        String v10 = v(C);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        yVar.j(bArr, 0, i11);
        int x10 = x(bArr, 0, C);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(C);
        return new n("WXXX", str, p(bArr, u10, y(bArr, u10), "ISO-8859-1"));
    }

    private static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String w(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    private static int x(byte[] bArr, int i10, int i11) {
        int y10 = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return y10;
        }
        while (y10 < bArr.length - 1) {
            if (y10 % 2 == 0 && bArr[y10 + 1] == 0) {
                return y10;
            }
            y10 = y(bArr, y10 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* access modifiers changed from: protected */
    public x4.a b(e eVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public x4.a e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i10);
        b m10 = m(yVar);
        if (m10 == null) {
            return null;
        }
        int e10 = yVar.e();
        int i11 = m10.f5251a == 2 ? 6 : 10;
        int b10 = m10.f5253c;
        if (m10.f5252b) {
            b10 = A(yVar, m10.f5253c);
        }
        yVar.N(e10 + b10);
        boolean z10 = false;
        if (!B(yVar, m10.f5251a, i11, false)) {
            if (m10.f5251a != 4 || !B(yVar, 4, i11, true)) {
                int a10 = m10.f5251a;
                StringBuilder sb = new StringBuilder(56);
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(a10);
                p.h("Id3Decoder", sb.toString());
                return null;
            }
            z10 = true;
        }
        while (yVar.a() >= i11) {
            i k10 = k(m10.f5251a, yVar, z10, i11, this.f5250a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new x4.a((List<? extends a.b>) arrayList);
    }

    public h(a aVar) {
        this.f5250a = aVar;
    }
}
