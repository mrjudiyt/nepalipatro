package f2;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: ExifOrientationStream */
public final class g extends FilterInputStream {

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f8480j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f8481k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f8482l;

    /* renamed from: h  reason: collision with root package name */
    private final byte f8483h;

    /* renamed from: i  reason: collision with root package name */
    private int f8484i;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f8480j = bArr;
        int length = bArr.length;
        f8481k = length;
        f8482l = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
        }
        this.f8483h = (byte) i10;
    }

    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i10;
        int i11;
        int i12 = this.f8484i;
        if (i12 < 2 || i12 > (i11 = f8482l)) {
            i10 = super.read();
        } else if (i12 == i11) {
            i10 = this.f8483h;
        } else {
            i10 = f8480j[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f8484i++;
        }
        return i10;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f8484i = (int) (((long) this.f8484i) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f8484i;
        int i14 = f8482l;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f8483h;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f8480j, this.f8484i - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f8484i += i12;
        }
        return i12;
    }
}
