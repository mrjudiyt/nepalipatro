package com.google.android.exoplayer2.audio;

import a6.m0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: TrimmingAudioProcessor */
final class l extends d {

    /* renamed from: i  reason: collision with root package name */
    private int f6431i;

    /* renamed from: j  reason: collision with root package name */
    private int f6432j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6433k;

    /* renamed from: l  reason: collision with root package name */
    private int f6434l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f6435m = m0.f210f;

    /* renamed from: n  reason: collision with root package name */
    private int f6436n;

    /* renamed from: o  reason: collision with root package name */
    private long f6437o;

    public ByteBuffer b() {
        int i10;
        if (super.c() && (i10 = this.f6436n) > 0) {
            l(i10).put(this.f6435m, 0, this.f6436n).flip();
            this.f6436n = 0;
        }
        return super.b();
    }

    public boolean c() {
        return super.c() && this.f6436n == 0;
    }

    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f6434l);
            this.f6437o += (long) (min / this.f6370b.f6267d);
            this.f6434l -= min;
            byteBuffer.position(position + min);
            if (this.f6434l <= 0) {
                int i11 = i10 - min;
                int length = (this.f6436n + i11) - this.f6435m.length;
                ByteBuffer l10 = l(length);
                int r10 = m0.r(length, 0, this.f6436n);
                l10.put(this.f6435m, 0, r10);
                int r11 = m0.r(length - r10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + r11);
                l10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - r11;
                int i13 = this.f6436n - r10;
                this.f6436n = i13;
                byte[] bArr = this.f6435m;
                System.arraycopy(bArr, r10, bArr, 0, i13);
                byteBuffer.get(this.f6435m, this.f6436n, i12);
                this.f6436n += i12;
                l10.flip();
            }
        }
    }

    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.f6266c == 2) {
            this.f6433k = true;
            return (this.f6431i == 0 && this.f6432j == 0) ? AudioProcessor.a.f6263e : aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f6433k) {
            this.f6433k = false;
            int i10 = this.f6432j;
            int i11 = this.f6370b.f6267d;
            this.f6435m = new byte[(i10 * i11)];
            this.f6434l = this.f6431i * i11;
        }
        this.f6436n = 0;
    }

    /* access modifiers changed from: protected */
    public void j() {
        if (this.f6433k) {
            int i10 = this.f6436n;
            if (i10 > 0) {
                this.f6437o += (long) (i10 / this.f6370b.f6267d);
            }
            this.f6436n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f6435m = m0.f210f;
    }

    public long m() {
        return this.f6437o;
    }

    public void n() {
        this.f6437o = 0;
    }

    public void o(int i10, int i11) {
        this.f6431i = i10;
        this.f6432j = i11;
    }
}
