package v2;

import e2.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f12323a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry */
    private static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f12324a;

        /* renamed from: b  reason: collision with root package name */
        final j<T> f12325b;

        a(Class<T> cls, j<T> jVar) {
            this.f12324a = cls;
            this.f12325b = jVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.f12324a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, j<Z> jVar) {
        this.f12323a.add(new a(cls, jVar));
    }

    public synchronized <Z> j<Z> b(Class<Z> cls) {
        int size = this.f12323a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.f12323a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f12325b;
            }
        }
        return null;
    }
}
