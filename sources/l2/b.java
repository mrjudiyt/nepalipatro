package l2;

import com.bumptech.glide.f;
import e2.g;
import f2.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l2.n;

/* compiled from: ByteArrayLoader */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    private final C0165b<Data> f9873a;

    /* compiled from: ByteArrayLoader */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: l2.b$a$a  reason: collision with other inner class name */
        /* compiled from: ByteArrayLoader */
        class C0164a implements C0165b<ByteBuffer> {
            C0164a() {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0164a());
        }
    }

    /* renamed from: l2.b$b  reason: collision with other inner class name */
    /* compiled from: ByteArrayLoader */
    public interface C0165b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader */
    private static class c<Data> implements f2.d<Data> {

        /* renamed from: h  reason: collision with root package name */
        private final byte[] f9875h;

        /* renamed from: i  reason: collision with root package name */
        private final C0165b<Data> f9876i;

        c(byte[] bArr, C0165b<Data> bVar) {
            this.f9875h = bArr;
            this.f9876i = bVar;
        }

        public Class<Data> a() {
            return this.f9876i.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        public void d(f fVar, d.a<? super Data> aVar) {
            aVar.f(this.f9876i.b(this.f9875h));
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    /* compiled from: ByteArrayLoader */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader */
        class a implements C0165b<InputStream> {
            a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public n<byte[], InputStream> a(r rVar) {
            return new b(new a());
        }
    }

    public b(C0165b<Data> bVar) {
        this.f9873a = bVar;
    }

    /* renamed from: c */
    public n.a<Data> b(byte[] bArr, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(bArr), new c(bArr, this.f9873a));
    }

    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}
