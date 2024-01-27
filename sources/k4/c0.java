package k4;

/* compiled from: VorbisBitArray */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9539a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9540b;

    /* renamed from: c  reason: collision with root package name */
    private int f9541c;

    /* renamed from: d  reason: collision with root package name */
    private int f9542d;

    public c0(byte[] bArr) {
        this.f9539a = bArr;
        this.f9540b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f9540b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f9541c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f9540b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f9542d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            a6.a.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.c0.a():void");
    }

    public int b() {
        return (this.f9541c * 8) + this.f9542d;
    }

    public boolean c() {
        boolean z10 = (((this.f9539a[this.f9541c] & 255) >> this.f9542d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f9541c;
        int min = Math.min(i10, 8 - this.f9542d);
        int i12 = i11 + 1;
        int i13 = ((this.f9539a[i11] & 255) >> this.f9542d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f9539a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f9541c + i11;
        this.f9541c = i12;
        int i13 = this.f9542d + (i10 - (i11 * 8));
        this.f9542d = i13;
        if (i13 > 7) {
            this.f9541c = i12 + 1;
            this.f9542d = i13 - 8;
        }
        a();
    }
}
