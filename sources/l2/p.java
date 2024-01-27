package l2;

import androidx.core.util.e;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final r f9921a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9922b;

    /* compiled from: ModelLoaderRegistry */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C0166a<?>> f9923a = new HashMap();

        /* renamed from: l2.p$a$a  reason: collision with other inner class name */
        /* compiled from: ModelLoaderRegistry */
        private static class C0166a<Model> {

            /* renamed from: a  reason: collision with root package name */
            final List<n<Model, ?>> f9924a;

            public C0166a(List<n<Model, ?>> list) {
                this.f9924a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f9923a.clear();
        }

        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0166a aVar = this.f9923a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f9924a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f9923a.put(cls, new C0166a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public p(e<List<Throwable>> eVar) {
        this(new r(eVar));
    }

    private static <A> Class<A> b(A a10) {
        return a10.getClass();
    }

    private synchronized <A> List<n<A, ?>> e(Class<A> cls) {
        List<n<A, ?>> b10;
        b10 = this.f9922b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f9921a.c(cls));
            this.f9922b.c(cls, b10);
        }
        return b10;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.f9921a.b(cls, cls2, oVar);
        this.f9922b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f9921a.g(cls);
    }

    public <A> List<n<A, ?>> d(A a10) {
        List e10 = e(b(a10));
        if (!e10.isEmpty()) {
            int size = e10.size();
            List<n<A, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) e10.get(i10);
                if (nVar.a(a10)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a10, e10);
        }
        throw new Registry.NoModelLoaderAvailableException(a10);
    }

    private p(r rVar) {
        this.f9922b = new a();
        this.f9921a = rVar;
    }
}
