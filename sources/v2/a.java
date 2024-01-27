package v2;

import e2.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0202a<?>> f12309a = new ArrayList();

    /* renamed from: v2.a$a  reason: collision with other inner class name */
    /* compiled from: EncoderRegistry */
    private static final class C0202a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f12310a;

        /* renamed from: b  reason: collision with root package name */
        final d<T> f12311b;

        C0202a(Class<T> cls, d<T> dVar) {
            this.f12310a = cls;
            this.f12311b = dVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.f12310a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.f12309a.add(new C0202a(cls, dVar));
    }

    public synchronized <T> d<T> b(Class<T> cls) {
        for (C0202a next : this.f12309a) {
            if (next.a(cls)) {
                return next.f12311b;
            }
        }
        return null;
    }
}
