package u6;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import r6.f;
import r6.s;
import r6.t;
import t6.b;
import y6.c;

/* compiled from: ArrayTypeAdapter */
public final class a<E> extends s<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f16609c = new C0286a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f16610a;

    /* renamed from: b  reason: collision with root package name */
    private final s<E> f16611b;

    /* renamed from: u6.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayTypeAdapter */
    static class C0286a implements t {
        C0286a() {
        }

        public <T> s<T> a(f fVar, x6.a<T> aVar) {
            Type e10 = aVar.e();
            if (!(e10 instanceof GenericArrayType) && (!(e10 instanceof Class) || !((Class) e10).isArray())) {
                return null;
            }
            Type g10 = b.g(e10);
            return new a(fVar, fVar.l(x6.a.b(g10)), b.k(g10));
        }
    }

    public a(f fVar, s<E> sVar, Class<E> cls) {
        this.f16611b = new m(fVar, sVar, cls);
        this.f16610a = cls;
    }

    public Object b(y6.a aVar) {
        if (aVar.I0() == y6.b.NULL) {
            aVar.s0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.L()) {
            arrayList.add(this.f16611b.b(aVar));
        }
        aVar.w();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f16610a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.g0();
            return;
        }
        cVar.j();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f16611b.d(cVar, Array.get(obj, i10));
        }
        cVar.w();
    }
}
