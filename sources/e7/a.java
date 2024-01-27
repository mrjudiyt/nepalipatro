package e7;

/* compiled from: ASCIIEncoder */
final class a implements g {
    a() {
    }

    private static char b(char c10, char c11) {
        if (j.f(c10) && j.f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f14302f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f14302f), hVar.d().charAt(hVar.f14302f + 1)));
            hVar.f14302f += 2;
            return;
        }
        char c10 = hVar.c();
        int n10 = j.n(hVar.d(), hVar.f14302f, c());
        if (n10 != c()) {
            if (n10 == 1) {
                hVar.r(230);
                hVar.o(1);
            } else if (n10 == 2) {
                hVar.r(239);
                hVar.o(2);
            } else if (n10 == 3) {
                hVar.r(238);
                hVar.o(3);
            } else if (n10 == 4) {
                hVar.r(240);
                hVar.o(4);
            } else if (n10 == 5) {
                hVar.r(231);
                hVar.o(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n10)));
            }
        } else if (j.g(c10)) {
            hVar.r(235);
            hVar.r((char) ((c10 - 128) + 1));
            hVar.f14302f++;
        } else {
            hVar.r((char) (c10 + 1));
            hVar.f14302f++;
        }
    }

    public int c() {
        return 0;
    }
}
