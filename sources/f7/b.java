package f7;

/* compiled from: CodaBarWriter */
public final class b extends n {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f14598a;

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f14599b = {'T', 'N', '*', 'E'};

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f14600c = {'/', ':', '+', '.'};

    /* renamed from: d  reason: collision with root package name */
    private static final char f14601d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f14598a = cArr;
        f14601d = cArr[0];
    }

    public boolean[] c(String str) {
        int i10;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c10 = f14601d;
            sb.append(c10);
            sb.append(str);
            sb.append(c10);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f14598a;
            boolean a10 = a.a(cArr, upperCase);
            boolean a11 = a.a(cArr, upperCase2);
            char[] cArr2 = f14599b;
            boolean a12 = a.a(cArr2, upperCase);
            boolean a13 = a.a(cArr2, upperCase2);
            if (a10) {
                if (!a11) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (a12) {
                if (!a13) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (a11 || a13) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c11 = f14601d;
                sb2.append(c11);
                sb2.append(str);
                sb2.append(c11);
                str = sb2.toString();
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else if (a.a(f14600c, str.charAt(i12))) {
                i11 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i11 + (str.length() - 1))];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = a.f14595a;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                } else if (upperCase3 == cArr3[i15]) {
                    i10 = a.f14596b[i15];
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = 0;
            boolean z10 = true;
            while (true) {
                int i17 = 0;
                while (i16 < 7) {
                    zArr[i13] = z10;
                    i13++;
                    if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                        z10 = !z10;
                        i16++;
                    } else {
                        i17++;
                    }
                }
                break;
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
