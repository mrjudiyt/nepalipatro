package com.google.android.exoplayer2.audio;

import a6.m0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: FloatResamplingAudioProcessor */
final class f extends d {

    /* renamed from: i  reason: collision with root package name */
    private static final int f6379i = Float.floatToIntBits(Float.NaN);

    f() {
    }

    private static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f6379i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f6370b.f6266c;
        if (i11 == 536870912) {
            byteBuffer2 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public AudioProcessor.a h(AudioProcessor.a aVar) {
        int i10 = aVar.f6266c;
        if (!m0.i0(i10)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        } else if (i10 != 4) {
            return new AudioProcessor.a(aVar.f6264a, aVar.f6265b, 4);
        } else {
            return AudioProcessor.a.f6263e;
        }
    }
}
