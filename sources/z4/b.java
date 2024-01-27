package z4;

import a6.y;
import java.nio.ByteBuffer;
import java.util.Arrays;
import x4.a;
import x4.e;
import x4.h;

/* compiled from: EventMessageDecoder */
public final class b extends h {
    /* access modifiers changed from: protected */
    public a b(e eVar, ByteBuffer byteBuffer) {
        return new a(c(new y(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(y yVar) {
        return new a((String) a6.a.e(yVar.w()), (String) a6.a.e(yVar.w()), yVar.v(), yVar.v(), Arrays.copyOfRange(yVar.d(), yVar.e(), yVar.f()));
    }
}
