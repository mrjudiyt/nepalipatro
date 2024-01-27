package h4;

import com.google.android.exoplayer2.decoder.DecoderException;

/* compiled from: Decoder */
public interface c<I, O, E extends DecoderException> {
    O b();

    I c();

    void d(I i10);

    void flush();

    void release();
}
