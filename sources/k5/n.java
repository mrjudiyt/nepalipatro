package k5;

import java.util.Locale;

/* compiled from: UrlTemplate */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f9727a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f9728b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f9729c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9730d;

    private n(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f9727a = strArr;
        this.f9728b = iArr;
        this.f9729c = strArr2;
        this.f9730d = i10;
    }

    public static n b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new n(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    private static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int indexOf = str.indexOf("$", i10);
            char c10 = 65535;
            if (indexOf == -1) {
                String valueOf = String.valueOf(strArr[i11]);
                String valueOf2 = String.valueOf(str.substring(i10));
                strArr[i11] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                i10 = str.length();
            } else if (indexOf != i10) {
                String valueOf3 = String.valueOf(strArr[i11]);
                String valueOf4 = String.valueOf(str.substring(i10, indexOf));
                strArr[i11] = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                i10 = indexOf;
            } else if (str.startsWith("$$", i10)) {
                strArr[i11] = String.valueOf(strArr[i11]).concat("$");
                i10 += 2;
            } else {
                int i12 = i10 + 1;
                int indexOf2 = str.indexOf("$", i12);
                String substring = str.substring(i12, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i11] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            iArr[i11] = 2;
                            break;
                        case 1:
                            iArr[i11] = 4;
                            break;
                        case 2:
                            iArr[i11] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(str.length() != 0 ? "Invalid template: ".concat(str) : new String("Invalid template: "));
                    }
                    strArr2[i11] = str2;
                }
                i11++;
                strArr[i11] = "";
                i10 = indexOf2 + 1;
            }
        }
        return i11;
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f9730d;
            if (i11 < i12) {
                sb.append(this.f9727a[i11]);
                int[] iArr = this.f9728b;
                if (iArr[i11] == 1) {
                    sb.append(str);
                } else if (iArr[i11] == 2) {
                    sb.append(String.format(Locale.US, this.f9729c[i11], new Object[]{Long.valueOf(j10)}));
                } else if (iArr[i11] == 3) {
                    sb.append(String.format(Locale.US, this.f9729c[i11], new Object[]{Integer.valueOf(i10)}));
                } else if (iArr[i11] == 4) {
                    sb.append(String.format(Locale.US, this.f9729c[i11], new Object[]{Long.valueOf(j11)}));
                }
                i11++;
            } else {
                sb.append(this.f9727a[i12]);
                return sb.toString();
            }
        }
    }
}
