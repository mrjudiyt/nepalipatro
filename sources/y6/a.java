package y6;

import com.facebook.internal.ServerProtocol;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import t6.f;
import u6.e;

/* compiled from: JsonReader */
public class a implements Closeable {

    /* renamed from: w  reason: collision with root package name */
    private static final char[] f17296w = ")]}'\n".toCharArray();

    /* renamed from: h  reason: collision with root package name */
    private final Reader f17297h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17298i = false;

    /* renamed from: j  reason: collision with root package name */
    private final char[] f17299j = new char[1024];

    /* renamed from: k  reason: collision with root package name */
    private int f17300k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f17301l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f17302m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f17303n = 0;

    /* renamed from: o  reason: collision with root package name */
    int f17304o = 0;

    /* renamed from: p  reason: collision with root package name */
    private long f17305p;

    /* renamed from: q  reason: collision with root package name */
    private int f17306q;

    /* renamed from: r  reason: collision with root package name */
    private String f17307r;

    /* renamed from: s  reason: collision with root package name */
    private int[] f17308s;

    /* renamed from: t  reason: collision with root package name */
    private int f17309t;

    /* renamed from: u  reason: collision with root package name */
    private String[] f17310u;

    /* renamed from: v  reason: collision with root package name */
    private int[] f17311v;

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    /* compiled from: JsonReader */
    static class C0295a extends f {
        C0295a() {
        }

        public void a(a aVar) {
            if (aVar instanceof e) {
                ((e) aVar).Y0();
                return;
            }
            int i10 = aVar.f17304o;
            if (i10 == 0) {
                i10 = aVar.u();
            }
            if (i10 == 13) {
                aVar.f17304o = 9;
            } else if (i10 == 12) {
                aVar.f17304o = 8;
            } else if (i10 == 14) {
                aVar.f17304o = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.I0() + aVar.c0());
            }
        }
    }

    static {
        f.f16522a = new C0295a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f17308s = iArr;
        this.f17309t = 0;
        this.f17309t = 0 + 1;
        iArr[0] = 6;
        this.f17310u = new String[32];
        this.f17311v = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f17297h = reader;
    }

    private boolean J(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f17299j;
        int i13 = this.f17303n;
        int i14 = this.f17300k;
        this.f17303n = i13 - i14;
        int i15 = this.f17301l;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f17301l = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f17301l = 0;
        }
        this.f17300k = 0;
        do {
            Reader reader = this.f17297h;
            int i17 = this.f17301l;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f17301l + read;
            this.f17301l = i11;
            if (this.f17302m == 0 && (i12 = this.f17303n) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f17300k++;
                this.f17303n = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private int K0() {
        String str;
        String str2;
        int i10;
        char c10 = this.f17299j[this.f17300k];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str2 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
            str = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f17300k + i11 >= this.f17301l && !J(i11 + 1)) {
                return 0;
            }
            char c11 = this.f17299j[this.f17300k + i11];
            if (c11 != str2.charAt(i11) && c11 != str.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f17300k + length < this.f17301l || J(length + 1)) && Y(this.f17299j[this.f17300k + length])) {
            return 0;
        }
        this.f17300k += length;
        this.f17304o = i10;
        return i10;
    }

    private int L0() {
        char c10;
        char[] cArr = this.f17299j;
        int i10 = this.f17300k;
        int i11 = this.f17301l;
        int i12 = 0;
        int i13 = 0;
        char c11 = 0;
        boolean z10 = true;
        long j10 = 0;
        boolean z11 = false;
        while (true) {
            if (i10 + i13 == i11) {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!J(i13 + 1)) {
                    break;
                }
                i10 = this.f17300k;
                i11 = this.f17301l;
            }
            c10 = cArr[i10 + i13];
            if (c10 == '+') {
                i12 = 0;
                if (c11 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i12 = 0;
                if (c11 != 2 && c11 != 4) {
                    return 0;
                }
                c11 = 5;
                i13++;
            } else {
                if (c10 == '-') {
                    i12 = 0;
                    if (c11 == 0) {
                        c11 = 1;
                        z11 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                } else if (c10 == '.') {
                    i12 = 0;
                    if (c11 != 2) {
                        return 0;
                    }
                    c11 = 3;
                } else if (c10 >= '0' && c10 <= '9') {
                    if (c11 == 1 || c11 == 0) {
                        j10 = (long) (-(c10 - '0'));
                        i12 = 0;
                        c11 = 2;
                    } else {
                        if (c11 == 2) {
                            if (j10 == 0) {
                                return 0;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            int i14 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                            z10 &= i14 > 0 || (i14 == 0 && j11 < j10);
                            j10 = j11;
                        } else if (c11 == 3) {
                            i12 = 0;
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            i12 = 0;
                            c11 = 7;
                        }
                        i12 = 0;
                    }
                }
                i13++;
            }
            c11 = 6;
            i13++;
        }
        if (Y(c10)) {
            return 0;
        }
        if (c11 == 2 && z10 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
            if (!z11) {
                j10 = -j10;
            }
            this.f17305p = j10;
            this.f17300k += i13;
            this.f17304o = 15;
            return 15;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.f17306q = i13;
            this.f17304o = 16;
            return 16;
        }
    }

    private void M0(int i10) {
        int i11 = this.f17309t;
        int[] iArr = this.f17308s;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(i11 * 2)];
            int[] iArr3 = new int[(i11 * 2)];
            String[] strArr = new String[(i11 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f17311v, 0, iArr3, 0, this.f17309t);
            System.arraycopy(this.f17310u, 0, strArr, 0, this.f17309t);
            this.f17308s = iArr2;
            this.f17311v = iArr3;
            this.f17310u = strArr;
        }
        int[] iArr4 = this.f17308s;
        int i12 = this.f17309t;
        this.f17309t = i12 + 1;
        iArr4[i12] = i10;
    }

    private char N0() {
        int i10;
        int i11;
        if (this.f17300k != this.f17301l || J(1)) {
            char[] cArr = this.f17299j;
            int i12 = this.f17300k;
            int i13 = i12 + 1;
            this.f17300k = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.f17302m++;
                this.f17303n = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    throw U0("Invalid escape sequence");
                } else if (i13 + 4 <= this.f17301l || J(4)) {
                    char c11 = 0;
                    int i14 = this.f17300k;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.f17299j[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i10 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f17299j, this.f17300k, 4));
                            } else {
                                i10 = c12 - 'A';
                            }
                            i11 = i10 + 10;
                        } else {
                            i11 = c12 - '0';
                        }
                        c11 = (char) (c13 + i11);
                        i14++;
                    }
                    this.f17300k += 4;
                    return c11;
                } else {
                    throw U0("Unterminated escape sequence");
                }
            }
            return c10;
        }
        throw U0("Unterminated escape sequence");
    }

    private void P0(char c10) {
        char[] cArr = this.f17299j;
        do {
            int i10 = this.f17300k;
            int i11 = this.f17301l;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f17300k = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f17300k = i12;
                    N0();
                    i10 = this.f17300k;
                    i11 = this.f17301l;
                } else {
                    if (c11 == 10) {
                        this.f17302m++;
                        this.f17303n = i12;
                    }
                    i10 = i12;
                }
            }
            this.f17300k = i10;
        } while (J(1));
        throw U0("Unterminated string");
    }

    private boolean Q0(String str) {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.f17300k + length > this.f17301l && !J(length)) {
                return false;
            }
            char[] cArr = this.f17299j;
            int i11 = this.f17300k;
            if (cArr[i11] == 10) {
                this.f17302m++;
                this.f17303n = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.f17299j[this.f17300k + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.f17300k++;
        }
    }

    private void R0() {
        char c10;
        do {
            if (this.f17300k < this.f17301l || J(1)) {
                char[] cArr = this.f17299j;
                int i10 = this.f17300k;
                int i11 = i10 + 1;
                this.f17300k = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f17302m++;
                    this.f17303n = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void S0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f17300k
            int r2 = r1 + r0
            int r3 = r4.f17301l
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f17299j
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.j()
        L_0x004b:
            int r1 = r4.f17300k
            int r1 = r1 + r0
            r4.f17300k = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f17300k = r1
            r0 = 1
            boolean r0 = r4.J(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.S0():void");
    }

    private IOException U0(String str) {
        throw new MalformedJsonException(str + c0());
    }

    private boolean Y(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    private void j() {
        if (!this.f17298i) {
            throw U0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void q() {
        r0(true);
        int i10 = this.f17300k - 1;
        this.f17300k = i10;
        char[] cArr = f17296w;
        if (i10 + cArr.length <= this.f17301l || J(cArr.length)) {
            int i11 = 0;
            while (true) {
                char[] cArr2 = f17296w;
                if (i11 >= cArr2.length) {
                    this.f17300k += cArr2.length;
                    return;
                } else if (this.f17299j[this.f17300k + i11] == cArr2[i11]) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    private int r0(boolean z10) {
        char[] cArr = this.f17299j;
        int i10 = this.f17300k;
        int i11 = this.f17301l;
        while (true) {
            if (i10 == i11) {
                this.f17300k = i10;
                if (J(1)) {
                    i10 = this.f17300k;
                    i11 = this.f17301l;
                } else if (!z10) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + c0());
                }
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == 10) {
                this.f17302m++;
                this.f17303n = i12;
            } else if (!(c10 == ' ' || c10 == 13 || c10 == 9)) {
                if (c10 == '/') {
                    this.f17300k = i12;
                    if (i12 == i11) {
                        this.f17300k = i12 - 1;
                        boolean J = J(2);
                        this.f17300k++;
                        if (!J) {
                            return c10;
                        }
                    }
                    j();
                    int i13 = this.f17300k;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f17300k = i13 + 1;
                        if (Q0("*/")) {
                            i10 = this.f17300k + 2;
                            i11 = this.f17301l;
                        } else {
                            throw U0("Unterminated comment");
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f17300k = i13 + 1;
                        R0();
                        i10 = this.f17300k;
                        i11 = this.f17301l;
                    }
                } else if (c10 == '#') {
                    this.f17300k = i12;
                    j();
                    R0();
                    i10 = this.f17300k;
                    i11 = this.f17301l;
                } else {
                    this.f17300k = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f17300k = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String v0(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f17299j
            r1 = 0
        L_0x0003:
            int r2 = r9.f17300k
            int r3 = r9.f17301l
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f17300k = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004f
            r9.f17300k = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0040
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r1.append(r0, r3, r7)
            char r2 = r9.N0()
            r1.append(r2)
            int r2 = r9.f17300k
            int r3 = r9.f17301l
            goto L_0x0007
        L_0x004f:
            r5 = 10
            if (r2 != r5) goto L_0x005a
            int r2 = r9.f17302m
            int r2 = r2 + r6
            r9.f17302m = r2
            r9.f17303n = r7
        L_0x005a:
            r2 = r7
            goto L_0x0009
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f17300k = r2
            boolean r2 = r9.J(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.U0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.v0(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String y0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f17300k
            int r4 = r3 + r2
            int r5 = r6.f17301l
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f17299j
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.j()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f17299j
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.J(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f17299j
            int r4 = r6.f17300k
            r1.append(r3, r4, r2)
            int r3 = r6.f17300k
            int r3 = r3 + r2
            r6.f17300k = r3
            r2 = 1
            boolean r2 = r6.J(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f17299j
            int r3 = r6.f17300k
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f17299j
            int r3 = r6.f17300k
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f17300k
            int r2 = r2 + r0
            r6.f17300k = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.y0():java.lang.String");
    }

    public void E() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 2) {
            int i11 = this.f17309t - 1;
            this.f17309t = i11;
            this.f17310u[i11] = null;
            int[] iArr = this.f17311v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f17304o = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + I0() + c0());
    }

    public b I0() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean L() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final void O0(boolean z10) {
        this.f17298i = z10;
    }

    public void T0() {
        int i10 = 0;
        do {
            int i11 = this.f17304o;
            if (i11 == 0) {
                i11 = u();
            }
            if (i11 == 3) {
                M0(1);
            } else if (i11 == 1) {
                M0(3);
            } else {
                if (i11 == 4) {
                    this.f17309t--;
                } else if (i11 == 2) {
                    this.f17309t--;
                } else if (i11 == 14 || i11 == 10) {
                    S0();
                    this.f17304o = 0;
                } else if (i11 == 8 || i11 == 12) {
                    P0('\'');
                    this.f17304o = 0;
                } else if (i11 == 9 || i11 == 13) {
                    P0('\"');
                    this.f17304o = 0;
                } else {
                    if (i11 == 16) {
                        this.f17300k += this.f17306q;
                    }
                    this.f17304o = 0;
                }
                i10--;
                this.f17304o = 0;
            }
            i10++;
            this.f17304o = 0;
        } while (i10 != 0);
        int[] iArr = this.f17311v;
        int i12 = this.f17309t;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f17310u[i12 - 1] = "null";
    }

    public final boolean W() {
        return this.f17298i;
    }

    public void a() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 3) {
            M0(1);
            this.f17311v[this.f17309t - 1] = 0;
            this.f17304o = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + I0() + c0());
    }

    /* access modifiers changed from: package-private */
    public String c0() {
        return " at line " + (this.f17302m + 1) + " column " + ((this.f17300k - this.f17303n) + 1) + " path " + m0();
    }

    public void close() {
        this.f17304o = 0;
        this.f17308s[0] = 8;
        this.f17309t = 1;
        this.f17297h.close();
    }

    public boolean g0() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 5) {
            this.f17304o = 0;
            int[] iArr = this.f17311v;
            int i11 = this.f17309t - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f17304o = 0;
            int[] iArr2 = this.f17311v;
            int i12 = this.f17309t - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + I0() + c0());
        }
    }

    public void h() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 1) {
            M0(3);
            this.f17304o = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + I0() + c0());
    }

    public double h0() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 15) {
            this.f17304o = 0;
            int[] iArr = this.f17311v;
            int i11 = this.f17309t - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f17305p;
        }
        if (i10 == 16) {
            this.f17307r = new String(this.f17299j, this.f17300k, this.f17306q);
            this.f17300k += this.f17306q;
        } else if (i10 == 8 || i10 == 9) {
            this.f17307r = v0(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f17307r = y0();
        } else if (i10 != 11) {
            throw new IllegalStateException("Expected a double but was " + I0() + c0());
        }
        this.f17304o = 11;
        double parseDouble = Double.parseDouble(this.f17307r);
        if (this.f17298i || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f17307r = null;
            this.f17304o = 0;
            int[] iArr2 = this.f17311v;
            int i12 = this.f17309t - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + c0());
    }

    public int k0() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 15) {
            long j10 = this.f17305p;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f17304o = 0;
                int[] iArr = this.f17311v;
                int i12 = this.f17309t - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f17305p + c0());
        }
        if (i10 == 16) {
            this.f17307r = new String(this.f17299j, this.f17300k, this.f17306q);
            this.f17300k += this.f17306q;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f17307r = y0();
            } else {
                this.f17307r = v0(i10 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f17307r);
                this.f17304o = 0;
                int[] iArr2 = this.f17311v;
                int i13 = this.f17309t - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + I0() + c0());
        }
        this.f17304o = 11;
        double parseDouble = Double.parseDouble(this.f17307r);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f17307r = null;
            this.f17304o = 0;
            int[] iArr3 = this.f17311v;
            int i15 = this.f17309t - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f17307r + c0());
    }

    public long l0() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 15) {
            this.f17304o = 0;
            int[] iArr = this.f17311v;
            int i11 = this.f17309t - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f17305p;
        }
        if (i10 == 16) {
            this.f17307r = new String(this.f17299j, this.f17300k, this.f17306q);
            this.f17300k += this.f17306q;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                this.f17307r = y0();
            } else {
                this.f17307r = v0(i10 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f17307r);
                this.f17304o = 0;
                int[] iArr2 = this.f17311v;
                int i12 = this.f17309t - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + I0() + c0());
        }
        this.f17304o = 11;
        double parseDouble = Double.parseDouble(this.f17307r);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f17307r = null;
            this.f17304o = 0;
            int[] iArr3 = this.f17311v;
            int i13 = this.f17309t - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f17307r + c0());
    }

    public String m0() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = this.f17309t;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f17308s[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(this.f17311v[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String[] strArr = this.f17310u;
                if (strArr[i11] != null) {
                    sb.append(strArr[i11]);
                }
            }
        }
        return sb.toString();
    }

    public String o0() {
        String str;
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 14) {
            str = y0();
        } else if (i10 == 12) {
            str = v0('\'');
        } else if (i10 == 13) {
            str = v0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + I0() + c0());
        }
        this.f17304o = 0;
        this.f17310u[this.f17309t - 1] = str;
        return str;
    }

    public void s0() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 7) {
            this.f17304o = 0;
            int[] iArr = this.f17311v;
            int i11 = this.f17309t - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + I0() + c0());
    }

    public String toString() {
        return getClass().getSimpleName() + c0();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        int r02;
        int[] iArr = this.f17308s;
        int i10 = this.f17309t;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int r03 = r0(true);
            if (r03 != 44) {
                if (r03 == 59) {
                    j();
                } else if (r03 == 93) {
                    this.f17304o = 4;
                    return 4;
                } else {
                    throw U0("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (r02 = r0(true)) != 44) {
                if (r02 == 59) {
                    j();
                } else if (r02 == 125) {
                    this.f17304o = 2;
                    return 2;
                } else {
                    throw U0("Unterminated object");
                }
            }
            int r04 = r0(true);
            if (r04 == 34) {
                this.f17304o = 13;
                return 13;
            } else if (r04 == 39) {
                j();
                this.f17304o = 12;
                return 12;
            } else if (r04 != 125) {
                j();
                this.f17300k--;
                if (Y((char) r04)) {
                    this.f17304o = 14;
                    return 14;
                }
                throw U0("Expected name");
            } else if (i11 != 5) {
                this.f17304o = 2;
                return 2;
            } else {
                throw U0("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int r05 = r0(true);
            if (r05 != 58) {
                if (r05 == 61) {
                    j();
                    if (this.f17300k < this.f17301l || J(1)) {
                        char[] cArr = this.f17299j;
                        int i12 = this.f17300k;
                        if (cArr[i12] == '>') {
                            this.f17300k = i12 + 1;
                        }
                    }
                } else {
                    throw U0("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            if (this.f17298i) {
                q();
            }
            this.f17308s[this.f17309t - 1] = 7;
        } else if (i11 == 7) {
            if (r0(false) == -1) {
                this.f17304o = 17;
                return 17;
            }
            j();
            this.f17300k--;
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int r06 = r0(true);
        if (r06 == 34) {
            this.f17304o = 9;
            return 9;
        } else if (r06 != 39) {
            if (!(r06 == 44 || r06 == 59)) {
                if (r06 == 91) {
                    this.f17304o = 3;
                    return 3;
                } else if (r06 != 93) {
                    if (r06 != 123) {
                        this.f17300k--;
                        int K0 = K0();
                        if (K0 != 0) {
                            return K0;
                        }
                        int L0 = L0();
                        if (L0 != 0) {
                            return L0;
                        }
                        if (Y(this.f17299j[this.f17300k])) {
                            j();
                            this.f17304o = 10;
                            return 10;
                        }
                        throw U0("Expected value");
                    }
                    this.f17304o = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f17304o = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                j();
                this.f17300k--;
                this.f17304o = 7;
                return 7;
            }
            throw U0("Unexpected value");
        } else {
            j();
            this.f17304o = 8;
            return 8;
        }
    }

    public void w() {
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 4) {
            int i11 = this.f17309t - 1;
            this.f17309t = i11;
            int[] iArr = this.f17311v;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f17304o = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + I0() + c0());
    }

    public String w0() {
        String str;
        int i10 = this.f17304o;
        if (i10 == 0) {
            i10 = u();
        }
        if (i10 == 10) {
            str = y0();
        } else if (i10 == 8) {
            str = v0('\'');
        } else if (i10 == 9) {
            str = v0('\"');
        } else if (i10 == 11) {
            str = this.f17307r;
            this.f17307r = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f17305p);
        } else if (i10 == 16) {
            str = new String(this.f17299j, this.f17300k, this.f17306q);
            this.f17300k += this.f17306q;
        } else {
            throw new IllegalStateException("Expected a string but was " + I0() + c0());
        }
        this.f17304o = 0;
        int[] iArr = this.f17311v;
        int i11 = this.f17309t - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }
}
