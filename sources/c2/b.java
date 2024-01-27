package c2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
class b implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private final InputStream f5212h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Charset f5213i;

    /* renamed from: j  reason: collision with root package name */
    private byte[] f5214j;

    /* renamed from: k  reason: collision with root package name */
    private int f5215k;

    /* renamed from: l  reason: collision with root package name */
    private int f5216l;

    /* compiled from: StrictLineReader */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        public String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, b.this.f5213i.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void h() {
        InputStream inputStream = this.f5212h;
        byte[] bArr = this.f5214j;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f5215k = 0;
            this.f5216l = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.f5212h) {
            if (this.f5214j != null) {
                this.f5214j = null;
                this.f5212h.close();
            }
        }
    }

    public boolean j() {
        return this.f5216l == -1;
    }

    public String q() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f5212h) {
            if (this.f5214j != null) {
                if (this.f5215k >= this.f5216l) {
                    h();
                }
                for (int i12 = this.f5215k; i12 != this.f5216l; i12++) {
                    byte[] bArr2 = this.f5214j;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f5215k;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f5213i.name());
                                this.f5215k = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f5213i.name());
                        this.f5215k = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f5216l - this.f5215k) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f5214j;
                    int i14 = this.f5215k;
                    aVar.write(bArr3, i14, this.f5216l - i14);
                    this.f5216l = -1;
                    h();
                    i10 = this.f5215k;
                    while (true) {
                        if (i10 != this.f5216l) {
                            bArr = this.f5214j;
                            if (bArr[i10] == 10) {
                                break loop1;
                            }
                            i10++;
                        }
                    }
                }
                int i15 = this.f5215k;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f5215k = i10 + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(c.f5218a)) {
            this.f5212h = inputStream;
            this.f5213i = charset;
            this.f5214j = new byte[i10];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
