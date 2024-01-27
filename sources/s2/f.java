package s2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?, ?>> f11325a = new ArrayList();

    /* compiled from: TranscoderRegistry */
    private static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Z> f11326a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<R> f11327b;

        /* renamed from: c  reason: collision with root package name */
        final e<Z, R> f11328c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f11326a = cls;
            this.f11327b = cls2;
            this.f11328c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f11326a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11327b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a next : this.f11325a) {
            if (next.a(cls, cls2)) {
                return next.f11328c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a10 : this.f11325a) {
            if (a10.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f11325a.add(new a(cls, cls2, eVar));
    }
}
