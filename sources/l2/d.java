package l2;

import com.bumptech.glide.f;
import e2.g;
import f2.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import l2.n;

/* compiled from: ByteBufferFileLoader */
public class d implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader */
    private static final class a implements f2.d<ByteBuffer> {

        /* renamed from: h  reason: collision with root package name */
        private final File f9878h;

        a(File file) {
            this.f9878h = file;
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public void d(f fVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(a3.a.a(this.f9878h));
            } catch (IOException e10) {
                aVar.c(e10);
            }
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    /* compiled from: ByteBufferFileLoader */
    public static class b implements o<File, ByteBuffer> {
        public n<File, ByteBuffer> a(r rVar) {
            return new d();
        }
    }

    /* renamed from: c */
    public n.a<ByteBuffer> b(File file, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(file), new a(file));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
