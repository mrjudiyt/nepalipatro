package z5;

import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.InputStream;

/* compiled from: DataSourceInputStream */
public final class j extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    private final a f13210h;

    /* renamed from: i  reason: collision with root package name */
    private final b f13211i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f13212j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13213k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13214l = false;

    /* renamed from: m  reason: collision with root package name */
    private long f13215m;

    public j(a aVar, b bVar) {
        this.f13210h = aVar;
        this.f13211i = bVar;
        this.f13212j = new byte[1];
    }

    private void a() {
        if (!this.f13213k) {
            this.f13210h.h(this.f13211i);
            this.f13213k = true;
        }
    }

    public void close() {
        if (!this.f13214l) {
            this.f13210h.close();
            this.f13214l = true;
        }
    }

    public void h() {
        a();
    }

    public int read() {
        if (read(this.f13212j) == -1) {
            return -1;
        }
        return this.f13212j[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) {
        a6.a.f(!this.f13214l);
        a();
        int read = this.f13210h.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f13215m += (long) read;
        return read;
    }
}
