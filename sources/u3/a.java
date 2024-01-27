package u3;

/* compiled from: DoubleCheck */
public final class a<T> implements n8.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11728c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile n8.a<T> f11729a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f11730b = f11728c;

    private a(n8.a<T> aVar) {
        this.f11729a = aVar;
    }

    public static <P extends n8.a<T>, T> n8.a<T> a(P p10) {
        d.b(p10);
        if (p10 instanceof a) {
            return p10;
        }
        return new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f11728c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t10 = this.f11730b;
        T t11 = f11728c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f11730b;
                if (t10 == t11) {
                    t10 = this.f11729a.get();
                    this.f11730b = b(this.f11730b, t10);
                    this.f11729a = null;
                }
            }
        }
        return t10;
    }
}
