package l2;

import a3.j;
import e2.e;
import e2.g;
import f2.d;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader */
public interface n<Model, Data> {

    /* compiled from: ModelLoader */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final e f9918a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e> f9919b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f9920c;

        public a(e eVar, d<Data> dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public a(e eVar, List<e> list, d<Data> dVar) {
            this.f9918a = (e) j.d(eVar);
            this.f9919b = (List) j.d(list);
            this.f9920c = (d) j.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, g gVar);
}
