package e2;

import a3.j;
import java.security.MessageDigest;

/* compiled from: Option */
public final class f<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final b<Object> f7998e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final T f7999a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f8000b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8001c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f8002d;

    /* compiled from: Option */
    class a implements b<Object> {
        a() {
        }

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    private f(String str, T t10, b<T> bVar) {
        this.f8001c = j.b(str);
        this.f7999a = t10;
        this.f8000b = (b) j.d(bVar);
    }

    public static <T> f<T> a(String str, T t10, b<T> bVar) {
        return new f<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return f7998e;
    }

    private byte[] d() {
        if (this.f8002d == null) {
            this.f8002d = this.f8001c.getBytes(e.f7997a);
        }
        return this.f8002d;
    }

    public static <T> f<T> e(String str) {
        return new f<>(str, (Object) null, b());
    }

    public static <T> f<T> f(String str, T t10) {
        return new f<>(str, t10, b());
    }

    public T c() {
        return this.f7999a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f8001c.equals(((f) obj).f8001c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f8000b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f8001c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f8001c + '\'' + '}';
    }
}
