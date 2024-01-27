package g9;

import d9.d;
import d9.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.k;
import o8.o;
import p8.c0;
import y8.l;
import y8.p;

/* compiled from: Strings.kt */
class q extends p {

    /* compiled from: Strings.kt */
    static final class a extends n implements p<CharSequence, Integer, k<? extends Integer, ? extends Integer>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ char[] f14782h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f14783i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f14782h = cArr;
            this.f14783i = z10;
        }

        public final k<Integer, Integer> a(CharSequence charSequence, int i10) {
            m.f(charSequence, "$this$$receiver");
            int I = q.I(charSequence, this.f14782h, i10, this.f14783i);
            if (I < 0) {
                return null;
            }
            return o.a(Integer.valueOf(I), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class b extends n implements p<CharSequence, Integer, k<? extends Integer, ? extends Integer>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<String> f14784h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f14785i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f14784h = list;
            this.f14785i = z10;
        }

        public final k<Integer, Integer> a(CharSequence charSequence, int i10) {
            m.f(charSequence, "$this$$receiver");
            k w10 = q.z(charSequence, this.f14784h, i10, this.f14785i, false);
            if (w10 != null) {
                return o.a(w10.c(), Integer.valueOf(((String) w10.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class c extends n implements l<f, String> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ CharSequence f14786h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f14786h = charSequence;
        }

        /* renamed from: a */
        public final String invoke(f fVar) {
            m.f(fVar, "it");
            return q.f0(this.f14786h, fVar);
        }
    }

    public static final f A(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        return new f(0, charSequence.length() - 1);
    }

    public static final int B(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int C(CharSequence charSequence, char c10, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return I(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int D(CharSequence charSequence, String str, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return F(charSequence, str, i10, charSequence.length(), z10, false, 16, (Object) null);
    }

    private static final int E(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        d dVar;
        if (!z11) {
            dVar = new f(l.a(i10, 0), l.c(i11, charSequence.length()));
        } else {
            dVar = l.g(l.c(i10, B(charSequence)), l.a(i11, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a10 = dVar.a();
            int b10 = dVar.b();
            int c10 = dVar.c();
            if ((c10 <= 0 || a10 > b10) && (c10 >= 0 || b10 > a10)) {
                return -1;
            }
            while (true) {
                if (W(charSequence2, 0, charSequence, a10, charSequence2.length(), z10)) {
                    return a10;
                }
                if (a10 == b10) {
                    return -1;
                }
                a10 += c10;
            }
        } else {
            int a11 = dVar.a();
            int b11 = dVar.b();
            int c11 = dVar.c();
            if ((c11 <= 0 || a11 > b11) && (c11 >= 0 || b11 > a11)) {
                return -1;
            }
            while (true) {
                if (p.p((String) charSequence2, 0, (String) charSequence, a11, charSequence2.length(), z10)) {
                    return a11;
                }
                if (a11 == b11) {
                    return -1;
                }
                a11 += c11;
            }
        }
    }

    static /* synthetic */ int F(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return E(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static /* synthetic */ int G(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return C(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return D(charSequence, str, i10, z10);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        m.f(charSequence, "<this>");
        m.f(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            c0 d10 = new f(l.a(i10, 0), B(charSequence)).iterator();
            while (d10.hasNext()) {
                int b10 = d10.b();
                char charAt = charSequence.charAt(b10);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        continue;
                        break;
                    } else if (c.e(cArr[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return b10;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(k.t(cArr), i10);
    }

    public static final int J(CharSequence charSequence, char c10, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return N(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int K(CharSequence charSequence, String str, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(str, "string");
        if (z10 || !(charSequence instanceof String)) {
            return E(charSequence, str, i10, 0, z10, true);
        }
        return ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int L(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = B(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return J(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int M(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = B(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return K(charSequence, str, i10, z10);
    }

    public static final int N(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c10 = l.c(i10, B(charSequence)); -1 < c10; c10--) {
                char charAt = charSequence.charAt(c10);
                int length = cArr.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (c.e(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return c10;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(k.t(cArr), i10);
    }

    public static final f9.c<String> O(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        return e0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> P(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        return i.g(O(charSequence));
    }

    public static final CharSequence Q(CharSequence charSequence, int i10, char c10) {
        m.f(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            c0 d10 = new f(1, i10 - charSequence.length()).iterator();
            while (d10.hasNext()) {
                d10.b();
                sb.append(c10);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String R(String str, int i10, char c10) {
        m.f(str, "<this>");
        return Q(str, i10, c10).toString();
    }

    private static final f9.c<f> S(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        X(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final f9.c<f> T(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        X(i11);
        return new e(charSequence, i10, i11, new b(j.c(strArr), z10));
    }

    static /* synthetic */ f9.c U(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return S(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ f9.c V(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return T(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean W(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.e(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final void X(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List<String> Y(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        m.f(charSequence, "<this>");
        m.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return a0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<f> c10 = i.c(U(charSequence, cArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(q.l(c10, 10));
        for (f f02 : c10) {
            arrayList.add(f0(charSequence, f02));
        }
        return arrayList;
    }

    public static final List<String> Z(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        m.f(charSequence, "<this>");
        m.f(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return a0(charSequence, str, z10, i10);
            }
        }
        Iterable<f> c10 = i.c(V(charSequence, strArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(q.l(c10, 10));
        for (f f02 : c10) {
            arrayList.add(f0(charSequence, f02));
        }
        return arrayList;
    }

    private static final List<String> a0(CharSequence charSequence, String str, boolean z10, int i10) {
        X(i10);
        int i11 = 0;
        int D = D(charSequence, str, 0, z10);
        if (D == -1 || i10 == 1) {
            return o.b(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = l.c(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, D).toString());
            i11 = str.length() + D;
            if ((z11 && arrayList.size() == i10 - 1) || (D = D(charSequence, str, i11, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, D).toString());
            i11 = str.length() + D;
            break;
        } while ((D = D(charSequence, str, i11, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List b0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Y(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List c0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Z(charSequence, strArr, z10, i10);
    }

    public static final f9.c<String> d0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        m.f(charSequence, "<this>");
        m.f(strArr, "delimiters");
        return i.e(V(charSequence, strArr, 0, z10, i10, 2, (Object) null), new c(charSequence));
    }

    public static /* synthetic */ f9.c e0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return d0(charSequence, strArr, z10, i10);
    }

    public static final String f0(CharSequence charSequence, f fVar) {
        m.f(charSequence, "<this>");
        m.f(fVar, "range");
        return charSequence.subSequence(fVar.i().intValue(), fVar.g().intValue() + 1).toString();
    }

    public static final String g0(String str, char c10, String str2) {
        m.f(str, "<this>");
        m.f(str2, "missingDelimiterValue");
        int G = G(str, c10, 0, false, 6, (Object) null);
        if (G == -1) {
            return str2;
        }
        String substring = str.substring(G + 1, str.length());
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String h0(String str, String str2, String str3) {
        m.f(str, "<this>");
        m.f(str2, "delimiter");
        m.f(str3, "missingDelimiterValue");
        int H = H(str, str2, 0, false, 6, (Object) null);
        if (H == -1) {
            return str3;
        }
        String substring = str.substring(H + str2.length(), str.length());
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String i0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return g0(str, c10, str2);
    }

    public static /* synthetic */ String j0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return h0(str, str2, str3);
    }

    public static String k0(String str, char c10, String str2) {
        m.f(str, "<this>");
        m.f(str2, "missingDelimiterValue");
        int L = L(str, c10, 0, false, 6, (Object) null);
        if (L == -1) {
            return str2;
        }
        String substring = str.substring(L + 1, str.length());
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String l0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return k0(str, c10, str2);
    }

    public static final String m0(String str, char c10, String str2) {
        m.f(str, "<this>");
        m.f(str2, "missingDelimiterValue");
        int G = G(str, c10, 0, false, 6, (Object) null);
        if (G == -1) {
            return str2;
        }
        String substring = str.substring(0, G);
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String n0(String str, String str2, String str3) {
        m.f(str, "<this>");
        m.f(str2, "delimiter");
        m.f(str3, "missingDelimiterValue");
        int H = H(str, str2, 0, false, 6, (Object) null);
        if (H == -1) {
            return str3;
        }
        String substring = str.substring(0, H);
        m.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String o0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m0(str, c10, str2);
    }

    public static /* synthetic */ String p0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return n0(str, str2, str3);
    }

    public static CharSequence q0(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = b.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean x(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (H(charSequence, (String) charSequence2, 0, z10, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (F(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean y(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return x(charSequence, charSequence2, z10);
    }

    /* access modifiers changed from: private */
    public static final k<Integer, String> z(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        T t10;
        T t11;
        if (z10 || collection.size() != 1) {
            d fVar = !z11 ? new f(l.a(i10, 0), charSequence.length()) : l.g(l.c(i10, B(charSequence)), 0);
            if (charSequence instanceof String) {
                int a10 = fVar.a();
                int b10 = fVar.b();
                int c10 = fVar.c();
                if ((c10 > 0 && a10 <= b10) || (c10 < 0 && b10 <= a10)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t11 = null;
                                break;
                            }
                            t11 = it.next();
                            String str = (String) t11;
                            if (p.p(str, 0, (String) charSequence, a10, str.length(), z10)) {
                                break;
                            }
                        }
                        String str2 = (String) t11;
                        if (str2 == null) {
                            if (a10 == b10) {
                                break;
                            }
                            a10 += c10;
                        } else {
                            return o.a(Integer.valueOf(a10), str2);
                        }
                    }
                }
            } else {
                int a11 = fVar.a();
                int b11 = fVar.b();
                int c11 = fVar.c();
                if ((c11 > 0 && a11 <= b11) || (c11 < 0 && b11 <= a11)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t10 = null;
                                break;
                            }
                            t10 = it2.next();
                            String str3 = (String) t10;
                            if (W(str3, 0, charSequence, a11, str3.length(), z10)) {
                                break;
                            }
                        }
                        String str4 = (String) t10;
                        if (str4 == null) {
                            if (a11 == b11) {
                                break;
                            }
                            a11 += c11;
                        } else {
                            return o.a(Integer.valueOf(a11), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) x.L(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i11 = i10;
        int H = !z11 ? H(charSequence2, str6, i11, false, 4, (Object) null) : M(charSequence2, str6, i11, false, 4, (Object) null);
        if (H < 0) {
            return null;
        }
        return o.a(Integer.valueOf(H), str5);
    }
}
