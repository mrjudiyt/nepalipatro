package o5;

import a6.a;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import h4.g;
import java.nio.ByteBuffer;

/* compiled from: SimpleSubtitleDecoder */
public abstract class c extends g<h, i, SubtitleDecoderException> implements f {

    /* renamed from: n  reason: collision with root package name */
    private final String f10430n;

    protected c(String str) {
        super(new h[2], new i[2]);
        this.f10430n = str;
        u(1024);
    }

    /* access modifiers changed from: protected */
    public abstract e A(byte[] bArr, int i10, boolean z10);

    public void a(long j10) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final h g() {
        return new h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final i h() {
        return new d(new b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final SubtitleDecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final SubtitleDecoderException j(h hVar, i iVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a.e(hVar.f6469j);
            i iVar2 = iVar;
            iVar2.t(hVar.f6471l, A(byteBuffer.array(), byteBuffer.limit(), z10), hVar.f10433p);
            iVar.l(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }
}
