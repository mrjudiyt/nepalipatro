package f7;

import b7.b;
import com.google.zxing.c;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Code128Writer */
public final class d extends n {

    /* compiled from: Code128Writer */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int f(CharSequence charSequence, int i10, int i11) {
        a g10;
        a g11;
        char charAt;
        a g12 = g(charSequence, i10);
        a aVar = a.ONE_DIGIT;
        if (g12 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (g12 == aVar2) {
            if (i10 >= charSequence.length() || ((charAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || charAt >= '`'))) {
                return 100;
            }
            return 101;
        } else if (i11 == 99) {
            return 99;
        } else {
            if (i11 == 100) {
                a aVar3 = a.FNC_1;
                if (g12 == aVar3 || (g10 = g(charSequence, i10 + 2)) == aVar2 || g10 == aVar) {
                    return 100;
                }
                if (g10 != aVar3) {
                    int i12 = i10 + 4;
                    while (true) {
                        g11 = g(charSequence, i12);
                        if (g11 != a.TWO_DIGITS) {
                            break;
                        }
                        i12 += 2;
                    }
                    if (g11 == a.ONE_DIGIT) {
                        return 100;
                    }
                    return 99;
                } else if (g(charSequence, i10 + 3) == a.TWO_DIGITS) {
                    return 99;
                } else {
                    return 100;
                }
            } else {
                if (g12 == a.FNC_1) {
                    g12 = g(charSequence, i10 + 1);
                }
                if (g12 == a.TWO_DIGITS) {
                    return 99;
                }
                return 100;
            }
        }
    }

    private static a g(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i11);
        if (charAt2 < '0' || charAt2 > '9') {
            return a.ONE_DIGIT;
        }
        return a.TWO_DIGITS;
    }

    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<c, ?> map) {
        if (aVar == com.google.zxing.a.CODE_128) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (true) {
            int i16 = 103;
            if (i12 < length) {
                int f10 = f(str, i12, i14);
                int i17 = 100;
                if (f10 == i14) {
                    switch (str.charAt(i12)) {
                        case 241:
                            i17 = 102;
                            break;
                        case 242:
                            i17 = 97;
                            break;
                        case 243:
                            i17 = 96;
                            break;
                        case 244:
                            if (i14 == 101) {
                                i17 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i14 != 100) {
                                if (i14 == 101) {
                                    i17 = str.charAt(i12) - ' ';
                                    if (i17 < 0) {
                                        i17 += 96;
                                        break;
                                    }
                                } else {
                                    i17 = Integer.parseInt(str.substring(i12, i12 + 2));
                                    i12++;
                                    break;
                                }
                            } else {
                                i17 = str.charAt(i12) - ' ';
                                break;
                            }
                            break;
                    }
                    i12++;
                } else {
                    if (i14 != 0) {
                        i16 = f10;
                    } else if (f10 == 100) {
                        i16 = 104;
                    } else if (f10 != 101) {
                        i16 = 105;
                    }
                    i17 = i16;
                    i14 = f10;
                }
                arrayList.add(c.f14602a[i17]);
                i13 += i17 * i15;
                if (i12 != 0) {
                    i15++;
                }
            } else {
                int[][] iArr = c.f14602a;
                arrayList.add(iArr[i13 % 103]);
                arrayList.add(iArr[106]);
                int i18 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i19 : (int[]) r13.next()) {
                        i18 += i19;
                    }
                }
                boolean[] zArr = new boolean[i18];
                for (int[] b10 : arrayList) {
                    i10 += n.b(zArr, i10, b10, true);
                }
                return zArr;
            }
        }
    }
}
