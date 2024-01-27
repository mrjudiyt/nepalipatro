package f2;

import a3.j;
import f2.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DataRewinderRegistry */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final e.a<?> f8477b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f8478a = new HashMap();

    /* compiled from: DataRewinderRegistry */
    class a implements e.a<Object> {
        a() {
        }

        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry */
    private static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f8479a;

        b(Object obj) {
            this.f8479a = obj;
        }

        public Object a() {
            return this.f8479a;
        }

        public void b() {
        }
    }

    public synchronized <T> e<T> a(T t10) {
        e.a<?> aVar;
        j.d(t10);
        aVar = this.f8478a.get(t10.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it = this.f8478a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e.a<?> next = it.next();
                if (next.a().isAssignableFrom(t10.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f8477b;
        }
        return aVar.b(t10);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f8478a.put(aVar.a(), aVar);
    }
}
