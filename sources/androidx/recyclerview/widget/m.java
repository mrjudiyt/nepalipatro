package androidx.recyclerview.widget;

import androidx.collection.e;
import androidx.core.util.f;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore */
class m {

    /* renamed from: a  reason: collision with root package name */
    final androidx.collection.a<RecyclerView.c0, a> f4321a = new androidx.collection.a<>();

    /* renamed from: b  reason: collision with root package name */
    final e<RecyclerView.c0> f4322b = new e<>();

    /* compiled from: ViewInfoStore */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        static androidx.core.util.e<a> f4323d = new f(20);

        /* renamed from: a  reason: collision with root package name */
        int f4324a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.k.c f4325b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.k.c f4326c;

        private a() {
        }

        static void a() {
            do {
            } while (f4323d.b() != null);
        }

        static a b() {
            a b10 = f4323d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f4324a = 0;
            aVar.f4325b = null;
            aVar.f4326c = null;
            f4323d.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    interface b {
    }

    m() {
    }

    /* access modifiers changed from: package-private */
    public void a(long j10, RecyclerView.c0 c0Var) {
        this.f4322b.k(j10, c0Var);
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.c0 c0Var, RecyclerView.k.c cVar) {
        a aVar = this.f4321a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4321a.put(c0Var, aVar);
        }
        aVar.f4325b = cVar;
        aVar.f4324a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a.a();
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.c0 c0Var) {
        int n10 = this.f4322b.n() - 1;
        while (true) {
            if (n10 < 0) {
                break;
            } else if (c0Var == this.f4322b.o(n10)) {
                this.f4322b.m(n10);
                break;
            } else {
                n10--;
            }
        }
        a remove = this.f4321a.remove(c0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
