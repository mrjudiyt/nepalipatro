package v7;

import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import ea.e;
import java.net.IDN;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: HttpUrl */
public final class q {

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f16870j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f16871a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16872b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16873c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f16874d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f16875e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f16876f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f16877g;

    /* renamed from: h  reason: collision with root package name */
    private final String f16878h;

    /* renamed from: i  reason: collision with root package name */
    private final String f16879i;

    /* compiled from: HttpUrl */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f16880a;

        /* renamed from: b  reason: collision with root package name */
        String f16881b = "";

        /* renamed from: c  reason: collision with root package name */
        String f16882c = "";

        /* renamed from: d  reason: collision with root package name */
        String f16883d;

        /* renamed from: e  reason: collision with root package name */
        int f16884e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f16885f;

        /* renamed from: g  reason: collision with root package name */
        List<String> f16886g;

        /* renamed from: h  reason: collision with root package name */
        String f16887h;

        /* compiled from: HttpUrl */
        enum a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public b() {
            ArrayList arrayList = new ArrayList();
            this.f16885f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int i10, int i11) {
            String w10 = q.w(str, i10, i11, false);
            if (!w10.startsWith("[") || !w10.endsWith("]")) {
                return f(w10);
            }
            InetAddress e10 = e(w10, 1, w10.length() - 1);
            if (e10 == null) {
                return null;
            }
            byte[] address = e10.getAddress();
            if (address.length == 16) {
                return j(address);
            }
            throw new AssertionError();
        }

        private static boolean c(String str) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean d(String str, int i10, int i11, byte[] bArr, int i12) {
            int i13 = i12;
            while (i10 < i11) {
                if (i13 == bArr.length) {
                    return false;
                }
                if (i13 != i12) {
                    if (str.charAt(i10) != '.') {
                        return false;
                    }
                    i10++;
                }
                int i14 = i10;
                int i15 = 0;
                while (i14 < i11) {
                    char charAt = str.charAt(i14);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i14++;
                    }
                }
                if (i14 - i10 == 0) {
                    return false;
                }
                bArr[i13] = (byte) i15;
                i13++;
                i10 = i14;
            }
            if (i13 != i12 + 4) {
                return false;
            }
            return true;
        }

        private static InetAddress e(String str, int i10, int i11) {
            byte[] bArr = new byte[16];
            int i12 = 0;
            int i13 = -1;
            int i14 = -1;
            while (true) {
                if (i10 >= i11) {
                    break;
                } else if (i12 == 16) {
                    return null;
                } else {
                    int i15 = i10 + 2;
                    if (i15 > i11 || !str.regionMatches(i10, "::", 0, 2)) {
                        if (i12 != 0) {
                            if (str.regionMatches(i10, CertificateUtil.DELIMITER, 0, 1)) {
                                i10++;
                            } else if (!str.regionMatches(i10, ".", 0, 1) || !d(str, i14, i11, bArr, i12 - 2)) {
                                return null;
                            } else {
                                i12 += 2;
                            }
                        }
                        i14 = i10;
                    } else if (i13 != -1) {
                        return null;
                    } else {
                        i12 += 2;
                        i13 = i12;
                        if (i15 == i11) {
                            break;
                        }
                        i14 = i15;
                    }
                    i10 = i14;
                    int i16 = 0;
                    while (i10 < i11) {
                        int h10 = q.h(str.charAt(i10));
                        if (h10 == -1) {
                            break;
                        }
                        i16 = (i16 << 4) + h10;
                        i10++;
                    }
                    int i17 = i10 - i14;
                    if (i17 == 0 || i17 > 4) {
                        return null;
                    }
                    int i18 = i12 + 1;
                    bArr[i12] = (byte) ((i16 >>> 8) & 255);
                    i12 = i18 + 1;
                    bArr[i18] = (byte) (i16 & 255);
                }
            }
            if (i12 != 16) {
                if (i13 == -1) {
                    return null;
                }
                int i19 = i12 - i13;
                System.arraycopy(bArr, i13, bArr, 16 - i19, i19);
                Arrays.fill(bArr, i13, (16 - i12) + i13, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static String f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty() && !c(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static String j(byte[] bArr) {
            int i10 = 0;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            while (i12 < bArr.length) {
                int i14 = i12;
                while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                    i14 += 2;
                }
                int i15 = i14 - i12;
                if (i15 > i13) {
                    i11 = i12;
                    i13 = i15;
                }
                i12 = i14 + 2;
            }
            e eVar = new e();
            while (i10 < bArr.length) {
                if (i10 == i11) {
                    eVar.G(58);
                    i10 += i13;
                    if (i10 == 16) {
                        eVar.G(58);
                    }
                } else {
                    if (i10 > 0) {
                        eVar.G(58);
                    }
                    eVar.b0((long) (((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255)));
                    i10 += 2;
                }
            }
            return eVar.o0();
        }

        private boolean k(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean l(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int n(String str, int i10, int i11) {
            try {
                int parseInt = Integer.parseInt(q.e(str, i10, i11, "", false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private void o() {
            List<String> list = this.f16885f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f16885f.isEmpty()) {
                this.f16885f.add("");
                return;
            }
            List<String> list2 = this.f16885f;
            list2.set(list2.size() - 1, "");
        }

        private static int q(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) == ']');
                }
                i10++;
            }
            return i11;
        }

        private void r(String str, int i10, int i11, boolean z10, boolean z11) {
            String e10 = q.e(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, true);
            if (!k(e10)) {
                if (l(e10)) {
                    o();
                    return;
                }
                List<String> list = this.f16885f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f16885f;
                    list2.set(list2.size() - 1, e10);
                } else {
                    this.f16885f.add(e10);
                }
                if (z10) {
                    this.f16885f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void t(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f16885f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f16885f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f16885f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = v7.q.j(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.r(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v7.q.b.t(java.lang.String, int, int):void");
        }

        private static int v(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i10;
                        }
                    }
                }
            }
            return -1;
        }

        private int w(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private int x(String str, int i10, int i11) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                char charAt = str.charAt(i12);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i12 + 1;
                }
            }
            return i10;
        }

        private static int y(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public q a() {
            if (this.f16880a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f16883d != null) {
                return new q(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i10 = this.f16884e;
            return i10 != -1 ? i10 : q.i(this.f16880a);
        }

        public b h(String str) {
            this.f16886g = str != null ? q.C(q.f(str, " \"'<>#", true, true, true)) : null;
            return this;
        }

        public b i(String str) {
            if (str != null) {
                String b10 = b(str, 0, str.length());
                if (b10 != null) {
                    this.f16883d = b10;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        /* access modifiers changed from: package-private */
        public a m(q qVar, String str) {
            int b10;
            int i10;
            String str2 = str;
            int w10 = w(str2, 0, str.length());
            int x10 = x(str2, w10, str.length());
            if (v(str2, w10, x10) != -1) {
                if (str.regionMatches(true, w10, "https:", 0, 6)) {
                    this.f16880a = "https";
                    w10 += 6;
                } else if (!str.regionMatches(true, w10, "http:", 0, 5)) {
                    return a.UNSUPPORTED_SCHEME;
                } else {
                    this.f16880a = "http";
                    w10 += 5;
                }
            } else if (qVar == null) {
                return a.MISSING_SCHEME;
            } else {
                this.f16880a = qVar.f16871a;
            }
            int y10 = y(str2, w10, x10);
            char c10 = '?';
            char c11 = '#';
            if (y10 >= 2 || qVar == null || !qVar.f16871a.equals(this.f16880a)) {
                int i11 = w10 + y10;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    b10 = q.j(str2, i11, x10, "@/\\?#");
                    char charAt = b10 != x10 ? str2.charAt(b10) : 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        int i12 = b10;
                        int q10 = q(str2, i11, i12);
                        int i13 = q10 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z10) {
                                int b11 = q.j(str2, i11, b10, CertificateUtil.DELIMITER);
                                int i14 = b11;
                                String str3 = "%40";
                                i10 = b10;
                                String e10 = q.e(str, i11, b11, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (z11) {
                                    e10 = this.f16881b + str3 + e10;
                                }
                                this.f16881b = e10;
                                if (i14 != i10) {
                                    this.f16882c = q.e(str, i14 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                    z10 = true;
                                }
                                z11 = true;
                            } else {
                                i10 = b10;
                                this.f16882c += "%40" + q.e(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            }
                            i11 = i10 + 1;
                        }
                        c10 = '?';
                        c11 = '#';
                    }
                }
                int i122 = b10;
                int q102 = q(str2, i11, i122);
                int i132 = q102 + 1;
                if (i132 < i122) {
                    this.f16883d = b(str2, i11, q102);
                    int n10 = n(str2, i132, i122);
                    this.f16884e = n10;
                    if (n10 == -1) {
                        return a.INVALID_PORT;
                    }
                } else {
                    this.f16883d = b(str2, i11, q102);
                    this.f16884e = q.i(this.f16880a);
                }
                if (this.f16883d == null) {
                    return a.INVALID_HOST;
                }
                w10 = i122;
            } else {
                this.f16881b = qVar.p();
                this.f16882c = qVar.l();
                this.f16883d = qVar.f16874d;
                this.f16884e = qVar.f16875e;
                this.f16885f.clear();
                this.f16885f.addAll(qVar.n());
                if (w10 == x10 || str2.charAt(w10) == '#') {
                    h(qVar.o());
                }
            }
            int b12 = q.j(str2, w10, x10, "?#");
            t(str2, w10, b12);
            if (b12 < x10 && str2.charAt(b12) == '?') {
                int b13 = q.j(str2, b12, x10, "#");
                this.f16886g = q.C(q.e(str, b12 + 1, b13, " \"'<>#", true, true, true));
                b12 = b13;
            }
            if (b12 < x10 && str2.charAt(b12) == '#') {
                this.f16887h = q.e(str, 1 + b12, x10, "", true, false, false);
            }
            return a.SUCCESS;
        }

        public b p(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i10);
            }
            this.f16884e = i10;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b s() {
            int size = this.f16885f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f16885f.set(i10, q.f(this.f16885f.get(i10), "[]", true, false, true));
            }
            List<String> list = this.f16886g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f16886g.get(i11);
                    if (str != null) {
                        this.f16886g.set(i11, q.f(str, "\\^`{|}", true, true, true));
                    }
                }
            }
            String str2 = this.f16887h;
            if (str2 != null) {
                this.f16887h = q.f(str2, " \"#<>\\^`{|}", true, false, false);
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16880a);
            sb.append("://");
            if (!this.f16881b.isEmpty() || !this.f16882c.isEmpty()) {
                sb.append(this.f16881b);
                if (!this.f16882c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f16882c);
                }
                sb.append('@');
            }
            if (this.f16883d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f16883d);
                sb.append(']');
            } else {
                sb.append(this.f16883d);
            }
            int g10 = g();
            if (g10 != q.i(this.f16880a)) {
                sb.append(':');
                sb.append(g10);
            }
            q.v(sb, this.f16885f);
            if (this.f16886g != null) {
                sb.append('?');
                q.s(sb, this.f16886g);
            }
            if (this.f16887h != null) {
                sb.append('#');
                sb.append(this.f16887h);
            }
            return sb.toString();
        }

        public b u(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f16880a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f16880a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }
    }

    static List<String> C(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    static String e(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z12) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z10) || (codePointAt == 43 && z11)))) {
                e eVar = new e();
                eVar.T0(str, i10, i12);
                g(eVar, str, i12, i11, str2, z10, z11, z12);
                return eVar.o0();
            }
            i12 += Character.charCount(codePointAt);
        }
        return str.substring(i10, i11);
    }

    static String f(String str, String str2, boolean z10, boolean z11, boolean z12) {
        return e(str, 0, str.length(), str2, z10, z11, z12);
    }

    static void g(e eVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12) {
        e eVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z11) {
                    eVar.U(z10 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z12) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && !z10))) {
                    if (eVar2 == null) {
                        eVar2 = new e();
                    }
                    eVar2.U0(codePointAt);
                    while (!eVar2.F()) {
                        byte readByte = eVar2.readByte() & 255;
                        eVar.G(37);
                        char[] cArr = f16870j;
                        eVar.G(cArr[(readByte >> 4) & 15]);
                        eVar.G(cArr[readByte & 15]);
                    }
                } else {
                    eVar.U0(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    static int h(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static int i(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* access modifiers changed from: private */
    public static int j(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    static void s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static q u(String str) {
        b bVar = new b();
        if (bVar.m((q) null, str) == b.a.SUCCESS) {
            return bVar.a();
        }
        return null;
    }

    static void v(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append('/');
            sb.append(list.get(i10));
        }
    }

    static String w(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                e eVar = new e();
                eVar.T0(str, i10, i12);
                z(eVar, str, i12, i11, z10);
                return eVar.o0();
            }
        }
        return str.substring(i10, i11);
    }

    static String x(String str, boolean z10) {
        return w(str, 0, str.length(), z10);
    }

    private List<String> y(List<String> list, boolean z10) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? x(next, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void z(e eVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int h10 = h(str.charAt(i10 + 1));
                int h11 = h(str.charAt(i12));
                if (!(h10 == -1 || h11 == -1)) {
                    eVar.G((h10 << 4) + h11);
                    i10 = i12;
                    i10 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z10) {
                eVar.G(32);
                i10 += Character.charCount(codePointAt);
            }
            eVar.U0(codePointAt);
            i10 += Character.charCount(codePointAt);
        }
    }

    public int A() {
        return this.f16875e;
    }

    public String B() {
        if (this.f16877g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        s(sb, this.f16877g);
        return sb.toString();
    }

    public q D(String str) {
        b bVar = new b();
        if (bVar.m(this, str) == b.a.SUCCESS) {
            return bVar.a();
        }
        return null;
    }

    public String E() {
        return this.f16871a;
    }

    public URI F() {
        try {
            return new URI(t().s().toString());
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.f16879i);
        }
    }

    public URL G() {
        try {
            return new URL(this.f16879i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).f16879i.equals(this.f16879i);
    }

    public int hashCode() {
        return this.f16879i.hashCode();
    }

    public String k() {
        if (this.f16878h == null) {
            return null;
        }
        return this.f16879i.substring(this.f16879i.indexOf(35) + 1);
    }

    public String l() {
        if (this.f16873c.isEmpty()) {
            return "";
        }
        int indexOf = this.f16879i.indexOf(64);
        return this.f16879i.substring(this.f16879i.indexOf(58, this.f16871a.length() + 3) + 1, indexOf);
    }

    public String m() {
        int indexOf = this.f16879i.indexOf(47, this.f16871a.length() + 3);
        String str = this.f16879i;
        return this.f16879i.substring(indexOf, j(str, indexOf, str.length(), "?#"));
    }

    public List<String> n() {
        int indexOf = this.f16879i.indexOf(47, this.f16871a.length() + 3);
        String str = this.f16879i;
        int j10 = j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j10) {
            int i10 = indexOf + 1;
            int j11 = j(this.f16879i, i10, j10, RemoteSettings.FORWARD_SLASH_STRING);
            arrayList.add(this.f16879i.substring(i10, j11));
            indexOf = j11;
        }
        return arrayList;
    }

    public String o() {
        if (this.f16877g == null) {
            return null;
        }
        int indexOf = this.f16879i.indexOf(63) + 1;
        String str = this.f16879i;
        return this.f16879i.substring(indexOf, j(str, indexOf + 1, str.length(), "#"));
    }

    public String p() {
        if (this.f16872b.isEmpty()) {
            return "";
        }
        int length = this.f16871a.length() + 3;
        String str = this.f16879i;
        return this.f16879i.substring(length, j(str, length, str.length(), ":@"));
    }

    public String q() {
        return this.f16874d;
    }

    public boolean r() {
        return this.f16871a.equals("https");
    }

    public b t() {
        b bVar = new b();
        bVar.f16880a = this.f16871a;
        bVar.f16881b = p();
        bVar.f16882c = l();
        bVar.f16883d = this.f16874d;
        bVar.f16884e = this.f16875e != i(this.f16871a) ? this.f16875e : -1;
        bVar.f16885f.clear();
        bVar.f16885f.addAll(n());
        bVar.h(o());
        bVar.f16887h = k();
        return bVar;
    }

    public String toString() {
        return this.f16879i;
    }

    private q(b bVar) {
        this.f16871a = bVar.f16880a;
        this.f16872b = x(bVar.f16881b, false);
        this.f16873c = x(bVar.f16882c, false);
        this.f16874d = bVar.f16883d;
        this.f16875e = bVar.g();
        this.f16876f = y(bVar.f16885f, false);
        List<String> list = bVar.f16886g;
        String str = null;
        this.f16877g = list != null ? y(list, true) : null;
        String str2 = bVar.f16887h;
        this.f16878h = str2 != null ? x(str2, false) : str;
        this.f16879i = bVar.toString();
    }
}
