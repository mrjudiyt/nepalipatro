package l2;

import a3.j;
import androidx.core.util.e;
import com.bumptech.glide.f;
import com.bumptech.glide.load.engine.GlideException;
import e2.g;
import f2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l2.n;

/* compiled from: MultiModelLoader */
class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<Model, Data>> f9925a;

    /* renamed from: b  reason: collision with root package name */
    private final e<List<Throwable>> f9926b;

    /* compiled from: MultiModelLoader */
    static class a<Data> implements d<Data>, d.a<Data> {

        /* renamed from: h  reason: collision with root package name */
        private final List<d<Data>> f9927h;

        /* renamed from: i  reason: collision with root package name */
        private final e<List<Throwable>> f9928i;

        /* renamed from: j  reason: collision with root package name */
        private int f9929j = 0;

        /* renamed from: k  reason: collision with root package name */
        private f f9930k;

        /* renamed from: l  reason: collision with root package name */
        private d.a<? super Data> f9931l;

        /* renamed from: m  reason: collision with root package name */
        private List<Throwable> f9932m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f9933n;

        a(List<d<Data>> list, e<List<Throwable>> eVar) {
            this.f9928i = eVar;
            j.c(list);
            this.f9927h = list;
        }

        private void g() {
            if (!this.f9933n) {
                if (this.f9929j < this.f9927h.size() - 1) {
                    this.f9929j++;
                    d(this.f9930k, this.f9931l);
                    return;
                }
                j.d(this.f9932m);
                this.f9931l.c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f9932m)));
            }
        }

        public Class<Data> a() {
            return this.f9927h.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.f9932m;
            if (list != null) {
                this.f9928i.a(list);
            }
            this.f9932m = null;
            for (d<Data> b10 : this.f9927h) {
                b10.b();
            }
        }

        public void c(Exception exc) {
            ((List) j.d(this.f9932m)).add(exc);
            g();
        }

        public void cancel() {
            this.f9933n = true;
            for (d<Data> cancel : this.f9927h) {
                cancel.cancel();
            }
        }

        public void d(f fVar, d.a<? super Data> aVar) {
            this.f9930k = fVar;
            this.f9931l = aVar;
            this.f9932m = this.f9928i.b();
            this.f9927h.get(this.f9929j).d(fVar, this);
            if (this.f9933n) {
                cancel();
            }
        }

        public e2.a e() {
            return this.f9927h.get(0).e();
        }

        public void f(Data data) {
            if (data != null) {
                this.f9931l.f(data);
            } else {
                g();
            }
        }
    }

    q(List<n<Model, Data>> list, e<List<Throwable>> eVar) {
        this.f9925a = list;
        this.f9926b = eVar;
    }

    public boolean a(Model model) {
        for (n<Model, Data> a10 : this.f9925a) {
            if (a10.a(model)) {
                return true;
            }
        }
        return false;
    }

    public n.a<Data> b(Model model, int i10, int i11, g gVar) {
        n.a b10;
        int size = this.f9925a.size();
        ArrayList arrayList = new ArrayList(size);
        e2.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = this.f9925a.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, gVar)) != null) {
                eVar = b10.f9918a;
                arrayList.add(b10.f9920c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f9926b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f9925a.toArray()) + '}';
    }
}
