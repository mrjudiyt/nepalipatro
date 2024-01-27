package w4;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.mediacodec.o;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f16980a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.c f16981b;

    public /* synthetic */ e(o oVar, h.c cVar) {
        this.f16980a = oVar;
        this.f16981b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f16980a.p(this.f16981b, mediaCodec, j10, j11);
    }
}
