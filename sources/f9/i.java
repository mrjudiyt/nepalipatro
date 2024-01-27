package f9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: _Sequences.kt */
class i extends h {

    /* compiled from: Iterables.kt */
    public static final class a implements Iterable<T>, z8.a {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f14668h;

        public a(c cVar) {
            this.f14668h = cVar;
        }

        public Iterator<T> iterator() {
            return this.f14668h.iterator();
        }
    }

    public static <T> Iterable<T> c(c<? extends T> cVar) {
        m.f(cVar, "<this>");
        return new a(cVar);
    }

    public static <T> c<T> d(c<? extends T> cVar, l<? super T, Boolean> lVar) {
        m.f(cVar, "<this>");
        m.f(lVar, "predicate");
        return new b(cVar, true, lVar);
    }

    public static <T, R> c<R> e(c<? extends T> cVar, l<? super T, ? extends R> lVar) {
        m.f(cVar, "<this>");
        m.f(lVar, "transform");
        return new j(cVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C f(c<? extends T> cVar, C c10) {
        m.f(cVar, "<this>");
        m.f(c10, "destination");
        for (Object add : cVar) {
            c10.add(add);
        }
        return c10;
    }

    public static <T> List<T> g(c<? extends T> cVar) {
        m.f(cVar, "<this>");
        return p.j(h(cVar));
    }

    public static final <T> List<T> h(c<? extends T> cVar) {
        m.f(cVar, "<this>");
        return (List) f(cVar, new ArrayList());
    }
}
