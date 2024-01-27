package g9;

import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.jvm.internal.m;

/* compiled from: StringsJVM.kt */
class p extends o {
    public static byte[] j(String str) {
        m.f(str, "<this>");
        byte[] bytes = str.getBytes(d.f14759b);
        m.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final boolean k(String str, String str2, boolean z10) {
        m.f(str, "<this>");
        m.f(str2, DynamicLink.Builder.KEY_SUFFIX);
        if (!z10) {
            return str.endsWith(str2);
        }
        return p(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean l(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return k(str, str2, z10);
    }

    public static boolean m(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean n(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m(str, str2, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean o(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.f(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            d9.f r0 = g9.q.A(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            p8.c0 r3 = (p8.c0) r3
            int r3 = r3.b()
            char r3 = r4.charAt(r3)
            boolean r3 = g9.b.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.p.o(java.lang.CharSequence):boolean");
    }

    public static final boolean p(String str, int i10, String str2, int i11, int i12, boolean z10) {
        m.f(str, "<this>");
        m.f(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final String q(String str, char c10, char c11, boolean z10) {
        m.f(str, "<this>");
        if (!z10) {
            String replace = str.replace(c10, c11);
            m.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (c.e(charAt, c10, z10)) {
                charAt = c11;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        m.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final String r(String str, String str2, String str3, boolean z10) {
        m.f(str, "<this>");
        m.f(str2, "oldValue");
        m.f(str3, "newValue");
        int i10 = 0;
        int D = q.D(str, str2, 0, z10);
        if (D < 0) {
            return str;
        }
        int length = str2.length();
        int a10 = l.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i10, D);
                sb.append(str3);
                i10 = D + length;
                if (D >= str.length() || (D = q.D(str, str2, D + a10, z10)) <= 0) {
                    sb.append(str, i10, str.length());
                    String sb2 = sb.toString();
                    m.e(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i10, D);
                sb.append(str3);
                i10 = D + length;
                break;
            } while ((D = q.D(str, str2, D + a10, z10)) <= 0);
            sb.append(str, i10, str.length());
            String sb22 = sb.toString();
            m.e(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String s(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return q(str, c10, c11, z10);
    }

    public static /* synthetic */ String t(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return r(str, str2, str3, z10);
    }

    public static final boolean u(String str, String str2, boolean z10) {
        m.f(str, "<this>");
        m.f(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return p(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean v(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return u(str, str2, z10);
    }
}
