package k4;

import a6.m0;
import com.facebook.internal.NativeProtocol;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import z5.g;

/* compiled from: DefaultExtractorInput */
public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9577a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final g f9578b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9579c;

    /* renamed from: d  reason: collision with root package name */
    private long f9580d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f9581e = new byte[NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST];

    /* renamed from: f  reason: collision with root package name */
    private int f9582f;

    /* renamed from: g  reason: collision with root package name */
    private int f9583g;

    public f(g gVar, long j10, long j11) {
        this.f9578b = gVar;
        this.f9580d = j10;
        this.f9579c = j11;
    }

    private void p(int i10) {
        if (i10 != -1) {
            this.f9580d += (long) i10;
        }
    }

    private void q(int i10) {
        int i11 = this.f9582f + i10;
        byte[] bArr = this.f9581e;
        if (i11 > bArr.length) {
            this.f9581e = Arrays.copyOf(this.f9581e, m0.r(bArr.length * 2, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i11, i11 + 524288));
        }
    }

    private int r(byte[] bArr, int i10, int i11) {
        int i12 = this.f9583g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f9581e, 0, bArr, i10, min);
        v(min);
        return min;
    }

    private int s(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f9578b.read(bArr, i10 + i12, i11 - i12);
            if (read != -1) {
                return i12 + read;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private int t(int i10) {
        int min = Math.min(this.f9583g, i10);
        v(min);
        return min;
    }

    private void v(int i10) {
        int i11 = this.f9583g - i10;
        this.f9583g = i11;
        this.f9582f = 0;
        byte[] bArr = this.f9581e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f9581e = bArr2;
    }

    public long a() {
        return this.f9579c;
    }

    public boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        int r10 = r(bArr, i10, i11);
        while (r10 < i11 && r10 != -1) {
            r10 = s(bArr, i10, i11, r10, z10);
        }
        p(r10);
        return r10 != -1;
    }

    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        if (!m(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f9581e, this.f9582f - i11, bArr, i10, i11);
        return true;
    }

    public long e() {
        return this.f9580d + ((long) this.f9582f);
    }

    public void f(int i10) {
        m(i10, false);
    }

    public int g(int i10) {
        int t10 = t(i10);
        if (t10 == 0) {
            byte[] bArr = this.f9577a;
            t10 = s(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        p(t10);
        return t10;
    }

    public long getPosition() {
        return this.f9580d;
    }

    public int i(byte[] bArr, int i10, int i11) {
        int i12;
        q(i11);
        int i13 = this.f9583g;
        int i14 = this.f9582f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = s(this.f9581e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f9583g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f9581e, this.f9582f, bArr, i10, i12);
        this.f9582f += i12;
        return i12;
    }

    public void k() {
        this.f9582f = 0;
    }

    public void l(int i10) {
        u(i10, false);
    }

    public boolean m(int i10, boolean z10) {
        q(i10);
        int i11 = this.f9583g - this.f9582f;
        while (i11 < i10) {
            i11 = s(this.f9581e, this.f9582f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f9583g = this.f9582f + i11;
        }
        this.f9582f += i10;
        return true;
    }

    public void o(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    public int read(byte[] bArr, int i10, int i11) {
        int r10 = r(bArr, i10, i11);
        if (r10 == 0) {
            r10 = s(bArr, i10, i11, 0, true);
        }
        p(r10);
        return r10;
    }

    public void readFully(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    public boolean u(int i10, boolean z10) {
        int t10 = t(i10);
        while (t10 < i10 && t10 != -1) {
            t10 = s(this.f9577a, -t10, Math.min(i10, this.f9577a.length + t10), t10, z10);
        }
        p(t10);
        return t10 != -1;
    }
}
