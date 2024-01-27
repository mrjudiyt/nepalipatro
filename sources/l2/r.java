package l2;

import a3.j;
import androidx.core.util.e;
import com.bumptech.glide.Registry;
import e2.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l2.n;

/* compiled from: MultiModelLoaderFactory */
public class r {

    /* renamed from: e  reason: collision with root package name */
    private static final c f9934e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final n<Object, Object> f9935f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<b<?, ?>> f9936a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9937b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b<?, ?>> f9938c;

    /* renamed from: d  reason: collision with root package name */
    private final e<List<Throwable>> f9939d;

    /* compiled from: MultiModelLoaderFactory */
    private static class a implements n<Object, Object> {
        a() {
        }

        public boolean a(Object obj) {
            return false;
        }

        public n.a<Object> b(Object obj, int i10, int i11, g gVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    private static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Model> f9940a;

        /* renamed from: b  reason: collision with root package name */
        final Class<Data> f9941b;

        /* renamed from: c  reason: collision with root package name */
        final o<? extends Model, ? extends Data> f9942c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f9940a = cls;
            this.f9941b = cls2;
            this.f9942c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.f9940a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f9941b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    static class c {
        c() {
        }

        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, e<List<Throwable>> eVar) {
            return new q<>(list, eVar);
        }
    }

    public r(e<List<Throwable>> eVar) {
        this(eVar, f9934e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List<b<?, ?>> list = this.f9936a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private <Model, Data> n<Model, Data> e(b<?, ?> bVar) {
        return (n) j.d(bVar.f9942c.a(this));
    }

    private static <Model, Data> n<Model, Data> f() {
        return f9935f;
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model> List<n<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.f9936a) {
                if (!this.f9938c.contains(next)) {
                    if (next.a(cls)) {
                        this.f9938c.add(next);
                        arrayList.add(e(next));
                        this.f9938c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f9938c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b next : this.f9936a) {
                if (this.f9938c.contains(next)) {
                    z10 = true;
                } else if (next.b(cls, cls2)) {
                    this.f9938c.add(next);
                    arrayList.add(e(next));
                    this.f9938c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f9937b.a(arrayList, this.f9939d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f9938c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.f9936a) {
            if (!arrayList.contains(next.f9941b) && next.a(cls)) {
                arrayList.add(next.f9941b);
            }
        }
        return arrayList;
    }

    r(e<List<Throwable>> eVar, c cVar) {
        this.f9936a = new ArrayList();
        this.f9938c = new HashSet();
        this.f9939d = eVar;
        this.f9937b = cVar;
    }
}
