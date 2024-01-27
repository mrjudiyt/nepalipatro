package u6;

import java.lang.reflect.Type;
import java.util.Collection;
import r6.f;
import r6.s;
import r6.t;
import t6.c;
import t6.i;

/* compiled from: CollectionTypeAdapterFactory */
public final class b implements t {

    /* renamed from: h  reason: collision with root package name */
    private final c f16612h;

    /* compiled from: CollectionTypeAdapterFactory */
    private static final class a<E> extends s<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final s<E> f16613a;

        /* renamed from: b  reason: collision with root package name */
        private final i<? extends Collection<E>> f16614b;

        public a(f fVar, Type type, s<E> sVar, i<? extends Collection<E>> iVar) {
            this.f16613a = new m(fVar, sVar, type);
            this.f16614b = iVar;
        }

        /* renamed from: e */
        public Collection<E> b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            Collection<E> collection = (Collection) this.f16614b.a();
            aVar.a();
            while (aVar.L()) {
                collection.add(this.f16613a.b(aVar));
            }
            aVar.w();
            return collection;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.g0();
                return;
            }
            cVar.j();
            for (E d10 : collection) {
                this.f16613a.d(cVar, d10);
            }
            cVar.w();
        }
    }

    public b(c cVar) {
        this.f16612h = cVar;
    }

    public <T> s<T> a(f fVar, x6.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        if (!Collection.class.isAssignableFrom(c10)) {
            return null;
        }
        Type h10 = t6.b.h(e10, c10);
        return new a(fVar, h10, fVar.l(x6.a.b(h10)), this.f16612h.a(aVar));
    }
}
