package com.google.android.exoplayer2.audio;

import a6.a;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: ChannelMappingAudioProcessor */
final class e extends d {

    /* renamed from: i  reason: collision with root package name */
    private int[] f6377i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f6378j;

    e() {
    }

    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a.e(this.f6378j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f6370b.f6267d) * this.f6371c.f6267d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f6370b.f6267d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    public AudioProcessor.a h(AudioProcessor.a aVar) {
        int[] iArr = this.f6377i;
        if (iArr == null) {
            return AudioProcessor.a.f6263e;
        }
        if (aVar.f6266c == 2) {
            boolean z10 = aVar.f6265b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f6265b) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
            }
            if (z10) {
                return new AudioProcessor.a(aVar.f6264a, iArr.length, 2);
            }
            return AudioProcessor.a.f6263e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f6378j = this.f6377i;
    }

    /* access modifiers changed from: protected */
    public void k() {
        this.f6378j = null;
        this.f6377i = null;
    }

    public void m(int[] iArr) {
        this.f6377i = iArr;
    }
}
