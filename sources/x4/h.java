package x4;

import a6.a;
import java.nio.ByteBuffer;

/* compiled from: SimpleMetadataDecoder */
public abstract class h implements c {
    public final a a(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a.e(eVar.f6469j);
        a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.o()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract a b(e eVar, ByteBuffer byteBuffer);
}
