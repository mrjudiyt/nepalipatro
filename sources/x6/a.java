package x6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import t6.b;

/* compiled from: TypeToken */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final Class<? super T> f17103a;

    /* renamed from: b  reason: collision with root package name */
    final Type f17104b;

    /* renamed from: c  reason: collision with root package name */
    final int f17105c;

    protected a() {
        Type d10 = d(getClass());
        this.f17104b = d10;
        this.f17103a = b.k(d10);
        this.f17105c = d10.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> c() {
        return this.f17103a;
    }

    public final Type e() {
        return this.f17104b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f17104b, ((a) obj).f17104b);
    }

    public final int hashCode() {
        return this.f17105c;
    }

    public final String toString() {
        return b.u(this.f17104b);
    }

    a(Type type) {
        Type b10 = b.b((Type) t6.a.b(type));
        this.f17104b = b10;
        this.f17103a = b.k(b10);
        this.f17105c = b10.hashCode();
    }
}
