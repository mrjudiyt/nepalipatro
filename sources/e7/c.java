package e7;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: C40Encoder */
class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb, StringBuilder sb2, int i10) {
        int length = sb.length();
        sb.delete(length - i10, length);
        hVar.f14302f--;
        int c10 = c(hVar.c(), sb2);
        hVar.k();
        return c10;
    }

    private static String d(CharSequence charSequence, int i10) {
        int charAt = (charSequence.charAt(i10) * 1600) + (charSequence.charAt(i10 + 1) * '(') + charSequence.charAt(i10 + 2) + 1;
        return new String(new char[]{(char) (charAt / UserVerificationMethods.USER_VERIFY_HANDPRINT), (char) (charAt % UserVerificationMethods.USER_VERIFY_HANDPRINT)});
    }

    static void g(h hVar, StringBuilder sb) {
        hVar.s(d(sb, 0));
        sb.delete(0, 3);
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f14302f++;
            int c11 = c(c10, sb);
            int a10 = hVar.a() + ((sb.length() / 3) << 1);
            hVar.q(a10);
            int a11 = hVar.g().a() - a10;
            if (hVar.i()) {
                if (sb.length() % 3 == 0 && j.n(hVar.d(), hVar.f14302f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a11 < 2 || a11 > 2)) {
                    c11 = b(hVar, sb, sb2, c11);
                }
                while (sb.length() % 3 == 1 && ((c11 <= 3 && a11 != 1) || c11 > 3)) {
                    c11 = b(hVar, sb, sb2, c11);
                }
            }
        }
        f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    public int c(char c10, StringBuilder sb) {
        if (c10 == ' ') {
            sb.append(3);
            return 1;
        } else if (c10 >= '0' && c10 <= '9') {
            sb.append((char) ((c10 - '0') + 4));
            return 1;
        } else if (c10 >= 'A' && c10 <= 'Z') {
            sb.append((char) ((c10 - 'A') + 14));
            return 1;
        } else if (c10 < ' ') {
            sb.append(0);
            sb.append(c10);
            return 2;
        } else if (c10 >= '!' && c10 <= '/') {
            sb.append(1);
            sb.append((char) (c10 - '!'));
            return 2;
        } else if (c10 >= ':' && c10 <= '@') {
            sb.append(1);
            sb.append((char) ((c10 - ':') + 15));
            return 2;
        } else if (c10 >= '[' && c10 <= '_') {
            sb.append(1);
            sb.append((char) ((c10 - '[') + 22));
            return 2;
        } else if (c10 < '`' || c10 > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c10 - 128), sb) + 2;
        } else {
            sb.append(2);
            sb.append((char) (c10 - '`'));
            return 2;
        }
    }

    public int e() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a10 = hVar.a() + ((sb.length() / 3) << 1);
        hVar.q(a10);
        int a11 = hVar.g().a() - a10;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (hVar.i()) {
                hVar.r(254);
            }
        } else if (a11 == 1 && length == 1) {
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (hVar.i()) {
                hVar.r(254);
            }
            hVar.f14302f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (a11 > 0 || hVar.i()) {
                hVar.r(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.o(0);
    }
}
