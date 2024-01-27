package a3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream */
public final class c extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    private final long f22h;

    /* renamed from: i  reason: collision with root package name */
    private int f23i;

    private c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f22h = j10;
    }

    private int a(int i10) {
        if (i10 >= 0) {
            this.f23i += i10;
        } else if (this.f22h - ((long) this.f23i) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f22h + ", but read: " + this.f23i);
        }
        return i10;
    }

    public static InputStream h(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    public synchronized int available() {
        return (int) Math.max(this.f22h - ((long) this.f23i), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i10, int i11) {
        return a(super.read(bArr, i10, i11));
    }
}
