package a6;

import java.nio.charset.Charset;
import java.util.Arrays;
import l6.e;

/* compiled from: ParsableByteArray */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f278a;

    /* renamed from: b  reason: collision with root package name */
    private int f279b;

    /* renamed from: c  reason: collision with root package name */
    private int f280c;

    public y() {
        this.f278a = m0.f210f;
    }

    public String A(int i10, Charset charset) {
        String str = new String(this.f278a, this.f279b, i10, charset);
        this.f279b += i10;
        return str;
    }

    public int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public int C() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        this.f279b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int D() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        byte b10 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f279b = i12 + 2;
        return b10;
    }

    public long E() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        int i13 = i12 + 1;
        this.f279b = i13;
        this.f279b = i13 + 1;
        return ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8) | (((long) bArr[i13]) & 255);
    }

    public int F() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        byte b10 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f279b = i12 + 1;
        return (bArr[i12] & 255) | b10;
    }

    public int G() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(m10);
        throw new IllegalStateException(sb.toString());
    }

    public long H() {
        long v10 = v();
        if (v10 >= 0) {
            return v10;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(v10);
        throw new IllegalStateException(sb.toString());
    }

    public int I() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        this.f279b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long J() {
        int i10;
        int i11;
        long j10 = (long) this.f278a[this.f279b];
        int i12 = 7;
        while (true) {
            i10 = 1;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            while (i10 < i11) {
                byte b10 = this.f278a[this.f279b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j10);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f279b += i11;
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j10);
        throw new NumberFormatException(sb2.toString());
    }

    public void K(int i10) {
        M(b() < i10 ? new byte[i10] : this.f278a, i10);
    }

    public void L(byte[] bArr) {
        M(bArr, bArr.length);
    }

    public void M(byte[] bArr, int i10) {
        this.f278a = bArr;
        this.f280c = i10;
        this.f279b = 0;
    }

    public void N(int i10) {
        a.a(i10 >= 0 && i10 <= this.f278a.length);
        this.f280c = i10;
    }

    public void O(int i10) {
        a.a(i10 >= 0 && i10 <= this.f280c);
        this.f279b = i10;
    }

    public void P(int i10) {
        O(this.f279b + i10);
    }

    public int a() {
        return this.f280c - this.f279b;
    }

    public int b() {
        return this.f278a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f278a = Arrays.copyOf(this.f278a, i10);
        }
    }

    public byte[] d() {
        return this.f278a;
    }

    public int e() {
        return this.f279b;
    }

    public int f() {
        return this.f280c;
    }

    public char g() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f278a[this.f279b] & 255;
    }

    public void i(x xVar, int i10) {
        j(xVar.f274a, 0, i10);
        xVar.p(0);
    }

    public void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f278a, this.f279b, bArr, i10, i11);
        this.f279b += i11;
    }

    public String k(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f279b;
        while (i10 < this.f280c && this.f278a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f278a;
        int i11 = this.f279b;
        String E = m0.E(bArr, i11, i10 - i11);
        this.f279b = i10;
        if (i10 < this.f280c) {
            this.f279b = i10 + 1;
        }
        return E;
    }

    public double l() {
        return Double.longBitsToDouble(v());
    }

    public int m() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i13 = i12 + 1;
        this.f279b = i13;
        byte b11 = b10 | ((bArr[i12] & 255) << 8);
        this.f279b = i13 + 1;
        return (bArr[i13] & 255) | b11;
    }

    public int n() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        byte b10 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f279b = i12 + 1;
        return (bArr[i12] & 255) | b10;
    }

    public String o() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f279b;
        while (i10 < this.f280c && !m0.k0(this.f278a[i10])) {
            i10++;
        }
        int i11 = this.f279b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f278a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f279b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f278a;
        int i12 = this.f279b;
        String E = m0.E(bArr2, i12, i10 - i12);
        this.f279b = i10;
        int i13 = this.f280c;
        if (i10 == i13) {
            return E;
        }
        byte[] bArr3 = this.f278a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f279b = i14;
            if (i14 == i13) {
                return E;
            }
        }
        int i15 = this.f279b;
        if (bArr3[i15] == 10) {
            this.f279b = i15 + 1;
        }
        return E;
    }

    public int p() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        byte b10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i12 + 1;
        this.f279b = i13;
        byte b11 = b10 | ((bArr[i12] & 255) << 16);
        this.f279b = i13 + 1;
        return ((bArr[i13] & 255) << 24) | b11;
    }

    public long q() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        int i13 = i12 + 1;
        this.f279b = i13;
        int i14 = i13 + 1;
        this.f279b = i14;
        int i15 = i14 + 1;
        this.f279b = i15;
        int i16 = i15 + 1;
        this.f279b = i16;
        int i17 = i16 + 1;
        this.f279b = i17;
        this.f279b = i17 + 1;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24) | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40) | ((((long) bArr[i16]) & 255) << 48) | ((((long) bArr[i17]) & 255) << 56);
    }

    public short r() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        this.f279b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long s() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        int i13 = i12 + 1;
        this.f279b = i13;
        this.f279b = i13 + 1;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24);
    }

    public int t() {
        int p10 = p();
        if (p10 >= 0) {
            return p10;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(p10);
        throw new IllegalStateException(sb.toString());
    }

    public int u() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        this.f279b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long v() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        int i12 = i11 + 1;
        this.f279b = i12;
        int i13 = i12 + 1;
        this.f279b = i13;
        int i14 = i13 + 1;
        this.f279b = i14;
        int i15 = i14 + 1;
        this.f279b = i15;
        int i16 = i15 + 1;
        this.f279b = i16;
        int i17 = i16 + 1;
        this.f279b = i17;
        this.f279b = i17 + 1;
        return ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40) | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24) | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8) | (((long) bArr[i17]) & 255);
    }

    public String w() {
        return k(0);
    }

    public String x(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f279b;
        int i12 = (i11 + i10) - 1;
        String E = m0.E(this.f278a, i11, (i12 >= this.f280c || this.f278a[i12] != 0) ? i10 : i10 - 1);
        this.f279b += i10;
        return E;
    }

    public short y() {
        byte[] bArr = this.f278a;
        int i10 = this.f279b;
        int i11 = i10 + 1;
        this.f279b = i11;
        this.f279b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String z(int i10) {
        return A(i10, e.f15604c);
    }

    public y(int i10) {
        this.f278a = new byte[i10];
        this.f280c = i10;
    }

    public y(byte[] bArr) {
        this.f278a = bArr;
        this.f280c = bArr.length;
    }

    public y(byte[] bArr, int i10) {
        this.f278a = bArr;
        this.f280c = i10;
    }
}
