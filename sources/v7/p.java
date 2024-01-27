package v7;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import y7.g;

/* compiled from: Headers */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f16868a;

    /* compiled from: Headers */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16869a = new ArrayList(20);

        private void f(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i10), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        char charAt2 = str2.charAt(i11);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i11), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        public b b(String str, String str2) {
            f(str, str2);
            return d(str, str2);
        }

        /* access modifiers changed from: package-private */
        public b c(String str) {
            int indexOf = str.indexOf(CertificateUtil.DELIMITER, 1);
            if (indexOf != -1) {
                return d(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(CertificateUtil.DELIMITER)) {
                return d("", str.substring(1));
            }
            return d("", str);
        }

        /* access modifiers changed from: package-private */
        public b d(String str, String str2) {
            this.f16869a.add(str);
            this.f16869a.add(str2.trim());
            return this;
        }

        public p e() {
            return new p(this);
        }

        public b g(String str) {
            int i10 = 0;
            while (i10 < this.f16869a.size()) {
                if (str.equalsIgnoreCase(this.f16869a.get(i10))) {
                    this.f16869a.remove(i10);
                    this.f16869a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public b h(String str, String str2) {
            f(str, str2);
            g(str);
            d(str, str2);
            return this;
        }
    }

    private static String b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String a(String str) {
        return b(this.f16868a, str);
    }

    public Date c(String str) {
        String a10 = a(str);
        if (a10 != null) {
            return g.b(a10);
        }
        return null;
    }

    public String d(int i10) {
        int i11 = i10 * 2;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f16868a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public b e() {
        b bVar = new b();
        Collections.addAll(bVar.f16869a, this.f16868a);
        return bVar;
    }

    public int f() {
        return this.f16868a.length / 2;
    }

    public String g(int i10) {
        int i11 = (i10 * 2) + 1;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f16868a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int f10 = f();
        for (int i10 = 0; i10 < f10; i10++) {
            sb.append(d(i10));
            sb.append(": ");
            sb.append(g(i10));
            sb.append("\n");
        }
        return sb.toString();
    }

    private p(b bVar) {
        this.f16868a = (String[]) bVar.f16869a.toArray(new String[bVar.f16869a.size()]);
    }
}
