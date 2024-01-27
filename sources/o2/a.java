package o2;

import f2.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder */
public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f10366a;

    /* renamed from: o2.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferRewinder */
    public static class C0175a implements e.a<ByteBuffer> {
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f10366a = byteBuffer;
    }

    public void b() {
    }

    /* renamed from: c */
    public ByteBuffer a() {
        this.f10366a.position(0);
        return this.f10366a;
    }
}
