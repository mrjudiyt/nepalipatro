package l2;

import com.bumptech.glide.f;
import e2.g;
import f2.d;
import l2.n;

/* compiled from: UnitModelLoader */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    private static final v<?> f9951a = new v<>();

    /* compiled from: UnitModelLoader */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        private static final a<?> f9952a = new a<>();

        public static <T> a<T> b() {
            return f9952a;
        }

        public n<Model, Model> a(r rVar) {
            return v.c();
        }
    }

    /* compiled from: UnitModelLoader */
    private static class b<Model> implements d<Model> {

        /* renamed from: h  reason: collision with root package name */
        private final Model f9953h;

        b(Model model) {
            this.f9953h = model;
        }

        public Class<Model> a() {
            return this.f9953h.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        public void d(f fVar, d.a<? super Model> aVar) {
            aVar.f(this.f9953h);
        }

        public e2.a e() {
            return e2.a.LOCAL;
        }
    }

    public static <T> v<T> c() {
        return f9951a;
    }

    public boolean a(Model model) {
        return true;
    }

    public n.a<Model> b(Model model, int i10, int i11, g gVar) {
        return new n.a<>(new z2.b(model), new b(model));
    }
}
