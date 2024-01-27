package b3;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final g<Object> f4991a = new C0095a();

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    /* compiled from: FactoryPools */
    class C0095a implements g<Object> {
        C0095a() {
        }

        public void a(Object obj) {
        }
    }

    /* compiled from: FactoryPools */
    class b implements d<List<T>> {
        b() {
        }

        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* compiled from: FactoryPools */
    class c implements g<List<T>> {
        c() {
        }

        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools */
    public interface d<T> {
        T a();
    }

    /* compiled from: FactoryPools */
    private static final class e<T> implements androidx.core.util.e<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f4992a;

        /* renamed from: b  reason: collision with root package name */
        private final g<T> f4993b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.util.e<T> f4994c;

        e(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
            this.f4994c = eVar;
            this.f4992a = dVar;
            this.f4993b = gVar;
        }

        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).f().b(true);
            }
            this.f4993b.a(t10);
            return this.f4994c.a(t10);
        }

        public T b() {
            T b10 = this.f4994c.b();
            if (b10 == null) {
                b10 = this.f4992a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(b10.getClass());
                }
            }
            if (b10 instanceof f) {
                ((f) b10).f().b(false);
            }
            return b10;
        }
    }

    /* compiled from: FactoryPools */
    public interface f {
        c f();
    }

    /* compiled from: FactoryPools */
    public interface g<T> {
        void a(T t10);
    }

    private static <T extends f> androidx.core.util.e<T> a(androidx.core.util.e<T> eVar, d<T> dVar) {
        return b(eVar, dVar, c());
    }

    private static <T> androidx.core.util.e<T> b(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return f4991a;
    }

    public static <T extends f> androidx.core.util.e<T> d(int i10, d<T> dVar) {
        return a(new androidx.core.util.g(i10), dVar);
    }

    public static <T> androidx.core.util.e<List<T>> e() {
        return f(20);
    }

    public static <T> androidx.core.util.e<List<T>> f(int i10) {
        return b(new androidx.core.util.g(i10), new b(), new c());
    }
}
