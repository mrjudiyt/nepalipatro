package p4;

import k4.j;

/* compiled from: VarintReader */
final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f10564d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10565a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f10566b;

    /* renamed from: c  reason: collision with root package name */
    private int f10567c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f10564d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f10564d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f10567c;
    }

    public long d(j jVar, boolean z10, boolean z11, int i10) {
        if (this.f10566b == 0) {
            if (!jVar.b(this.f10565a, 0, 1, z10)) {
                return -1;
            }
            int c10 = c(this.f10565a[0] & 255);
            this.f10567c = c10;
            if (c10 != -1) {
                this.f10566b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f10567c;
        if (i11 > i10) {
            this.f10566b = 0;
            return -2;
        }
        if (i11 != 1) {
            jVar.readFully(this.f10565a, 1, i11 - 1);
        }
        this.f10566b = 0;
        return a(this.f10565a, this.f10567c, z11);
    }

    public void e() {
        this.f10566b = 0;
        this.f10567c = 0;
    }
}
