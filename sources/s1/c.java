package s1;

import java.util.ArrayList;
import java.util.List;
import t1.d;
import v1.p;

/* compiled from: ConstraintController */
public abstract class c<T> implements r1.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f11313a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f11314b;

    /* renamed from: c  reason: collision with root package name */
    private d<T> f11315c;

    /* renamed from: d  reason: collision with root package name */
    private a f11316d;

    /* compiled from: ConstraintController */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(d<T> dVar) {
        this.f11315c = dVar;
    }

    private void h(a aVar, T t10) {
        if (!this.f11313a.isEmpty() && aVar != null) {
            if (t10 == null || c(t10)) {
                aVar.b(this.f11313a);
            } else {
                aVar.a(this.f11313a);
            }
        }
    }

    public void a(T t10) {
        this.f11314b = t10;
        h(this.f11316d, t10);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(p pVar);

    /* access modifiers changed from: package-private */
    public abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f11314b;
        return t10 != null && c(t10) && this.f11313a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f11313a.clear();
        for (p next : iterable) {
            if (b(next)) {
                this.f11313a.add(next.f12255a);
            }
        }
        if (this.f11313a.isEmpty()) {
            this.f11315c.c(this);
        } else {
            this.f11315c.a(this);
        }
        h(this.f11316d, this.f11314b);
    }

    public void f() {
        if (!this.f11313a.isEmpty()) {
            this.f11313a.clear();
            this.f11315c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f11316d != aVar) {
            this.f11316d = aVar;
            h(aVar, this.f11314b);
        }
    }
}
