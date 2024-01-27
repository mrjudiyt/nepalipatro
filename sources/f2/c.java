package f2;

import com.facebook.internal.NativeProtocol;
import i2.b;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream */
public final class c extends OutputStream {

    /* renamed from: h  reason: collision with root package name */
    private final OutputStream f8473h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f8474i;

    /* renamed from: j  reason: collision with root package name */
    private b f8475j;

    /* renamed from: k  reason: collision with root package name */
    private int f8476k;

    public c(OutputStream outputStream, b bVar) {
        this(outputStream, bVar, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    }

    private void a() {
        int i10 = this.f8476k;
        if (i10 > 0) {
            this.f8473h.write(this.f8474i, 0, i10);
            this.f8476k = 0;
        }
    }

    private void h() {
        if (this.f8476k == this.f8474i.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f8474i;
        if (bArr != null) {
            this.f8475j.d(bArr);
            this.f8474i = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f8473h.close();
            release();
        } catch (Throwable th) {
            this.f8473h.close();
            throw th;
        }
    }

    public void flush() {
        a();
        this.f8473h.flush();
    }

    public void write(int i10) {
        byte[] bArr = this.f8474i;
        int i11 = this.f8476k;
        this.f8476k = i11 + 1;
        bArr[i11] = (byte) i10;
        h();
    }

    c(OutputStream outputStream, b bVar, int i10) {
        this.f8473h = outputStream;
        this.f8475j = bVar;
        this.f8474i = (byte[]) bVar.e(i10, byte[].class);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f8476k;
            if (i15 != 0 || i13 < this.f8474i.length) {
                int min = Math.min(i13, this.f8474i.length - i15);
                System.arraycopy(bArr, i14, this.f8474i, this.f8476k, min);
                this.f8476k += min;
                i12 += min;
                h();
            } else {
                this.f8473h.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}
