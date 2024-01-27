package a3;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream */
public class h extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    private int f35h = Integer.MIN_VALUE;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long j10) {
        int i10 = this.f35h;
        if (i10 == 0) {
            return -1;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : (long) i10;
    }

    private void h(long j10) {
        int i10 = this.f35h;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f35h = (int) (((long) i10) - j10);
        }
    }

    public int available() {
        int i10 = this.f35h;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f35h = i10;
    }

    public int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        h(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f35h = Integer.MIN_VALUE;
    }

    public long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0;
        }
        long skip = super.skip(a10);
        h(skip);
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a((long) i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        h((long) read);
        return read;
    }
}
