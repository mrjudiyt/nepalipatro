package k7;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: ByteMatrix */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f15452a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15453b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15454c;

    public b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = i10;
        iArr[0] = i11;
        this.f15452a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f15453b = i10;
        this.f15454c = i11;
    }

    public void a(byte b10) {
        for (byte[] fill : this.f15452a) {
            Arrays.fill(fill, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f15452a[i11][i10];
    }

    public byte[][] c() {
        return this.f15452a;
    }

    public int d() {
        return this.f15454c;
    }

    public int e() {
        return this.f15453b;
    }

    public void f(int i10, int i11, int i12) {
        this.f15452a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f15452a[i11][i10] = z10 ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f15453b * 2 * this.f15454c) + 2);
        for (int i10 = 0; i10 < this.f15454c; i10++) {
            byte[] bArr = this.f15452a[i10];
            for (int i11 = 0; i11 < this.f15453b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb.append(" 0");
                } else if (b10 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
