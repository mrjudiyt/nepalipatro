package e7;

/* compiled from: X12Encoder */
final class n extends c {
    n() {
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f14302f++;
            c(c10, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f14302f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    public int c(char c10, StringBuilder sb) {
        if (c10 == 13) {
            sb.append(0);
        } else if (c10 == ' ') {
            sb.append(3);
        } else if (c10 == '*') {
            sb.append(1);
        } else if (c10 == '>') {
            sb.append(2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb.append((char) ((c10 - '0') + 4));
        } else if (c10 < 'A' || c10 > 'Z') {
            j.e(c10);
        } else {
            sb.append((char) ((c10 - 'A') + 14));
        }
        return 1;
    }

    public int e() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb) {
        hVar.p();
        int a10 = hVar.g().a() - hVar.a();
        hVar.f14302f -= sb.length();
        if (hVar.f() > 1 || a10 > 1 || hVar.f() != a10) {
            hVar.r(254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
