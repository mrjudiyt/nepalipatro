package h7;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f14795a;

    /* renamed from: b  reason: collision with root package name */
    private int f14796b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14797c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14798d;

    a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f14795a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f14795a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f14798d = i11 * 17;
        this.f14797c = i10;
        this.f14796b = -1;
    }

    /* access modifiers changed from: package-private */
    public b a() {
        return this.f14795a[this.f14796b];
    }

    public byte[][] b(int i10, int i11) {
        int[] iArr = new int[2];
        iArr[1] = this.f14798d * i10;
        iArr[0] = this.f14797c * i11;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i12 = this.f14797c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f14795a[i13 / i11].b(i10);
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f14796b++;
    }
}
