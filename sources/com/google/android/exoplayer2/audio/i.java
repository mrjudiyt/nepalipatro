package com.google.android.exoplayer2.audio;

import a6.a;
import a6.m0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: SilenceSkippingAudioProcessor */
public final class i extends d {

    /* renamed from: i  reason: collision with root package name */
    private final long f6382i;

    /* renamed from: j  reason: collision with root package name */
    private final long f6383j;

    /* renamed from: k  reason: collision with root package name */
    private final short f6384k;

    /* renamed from: l  reason: collision with root package name */
    private int f6385l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6386m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f6387n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f6388o;

    /* renamed from: p  reason: collision with root package name */
    private int f6389p;

    /* renamed from: q  reason: collision with root package name */
    private int f6390q;

    /* renamed from: r  reason: collision with root package name */
    private int f6391r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6392s;

    /* renamed from: t  reason: collision with root package name */
    private long f6393t;

    public i() {
        this(150000, 20000, 1024);
    }

    private int m(long j10) {
        return (int) ((j10 * ((long) this.f6370b.f6264a)) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f6384k) {
                int i10 = this.f6385l;
                return ((limit / i10) * i10) + i10;
            }
        }
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f6384k) {
                int i10 = this.f6385l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f6392s = true;
        }
    }

    private void r(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f6392s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        int position = o10 - byteBuffer.position();
        byte[] bArr = this.f6387n;
        int length = bArr.length;
        int i10 = this.f6390q;
        int i11 = length - i10;
        if (o10 >= limit || position >= i11) {
            int min = Math.min(position, i11);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f6387n, this.f6390q, min);
            int i12 = this.f6390q + min;
            this.f6390q = i12;
            byte[] bArr2 = this.f6387n;
            if (i12 == bArr2.length) {
                if (this.f6392s) {
                    r(bArr2, this.f6391r);
                    this.f6393t += (long) ((this.f6390q - (this.f6391r * 2)) / this.f6385l);
                } else {
                    this.f6393t += (long) ((i12 - this.f6391r) / this.f6385l);
                }
                w(byteBuffer, this.f6387n, this.f6390q);
                this.f6390q = 0;
                this.f6389p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        r(bArr, i10);
        this.f6390q = 0;
        this.f6389p = 0;
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f6387n.length));
        int n10 = n(byteBuffer);
        if (n10 == byteBuffer.position()) {
            this.f6389p = 1;
        } else {
            byteBuffer.limit(n10);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o10 = o(byteBuffer);
        byteBuffer.limit(o10);
        this.f6393t += (long) (byteBuffer.remaining() / this.f6385l);
        w(byteBuffer, this.f6388o, this.f6391r);
        if (o10 < limit) {
            r(this.f6388o, this.f6391r);
            this.f6389p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f6391r);
        int i11 = this.f6391r - min;
        System.arraycopy(bArr, i10 - i11, this.f6388o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f6388o, i11, min);
    }

    public boolean a() {
        return this.f6386m;
    }

    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i10 = this.f6389p;
            if (i10 == 0) {
                t(byteBuffer);
            } else if (i10 == 1) {
                s(byteBuffer);
            } else if (i10 == 2) {
                u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.f6266c == 2) {
            return this.f6386m ? aVar : AudioProcessor.a.f6263e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f6386m) {
            this.f6385l = this.f6370b.f6267d;
            int m10 = m(this.f6382i) * this.f6385l;
            if (this.f6387n.length != m10) {
                this.f6387n = new byte[m10];
            }
            int m11 = m(this.f6383j) * this.f6385l;
            this.f6391r = m11;
            if (this.f6388o.length != m11) {
                this.f6388o = new byte[m11];
            }
        }
        this.f6389p = 0;
        this.f6393t = 0;
        this.f6390q = 0;
        this.f6392s = false;
    }

    /* access modifiers changed from: protected */
    public void j() {
        int i10 = this.f6390q;
        if (i10 > 0) {
            r(this.f6387n, i10);
        }
        if (!this.f6392s) {
            this.f6393t += (long) (this.f6391r / this.f6385l);
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f6386m = false;
        this.f6391r = 0;
        byte[] bArr = m0.f210f;
        this.f6387n = bArr;
        this.f6388o = bArr;
    }

    public long p() {
        return this.f6393t;
    }

    public void v(boolean z10) {
        this.f6386m = z10;
    }

    public i(long j10, long j11, short s10) {
        a.a(j11 <= j10);
        this.f6382i = j10;
        this.f6383j = j11;
        this.f6384k = s10;
        byte[] bArr = m0.f210f;
        this.f6387n = bArr;
        this.f6388o = bArr;
    }
}
