package f9;

import java.util.Iterator;
import kotlin.jvm.internal.m;

/* compiled from: Sequences.kt */
class g extends f {

    /* compiled from: Sequences.kt */
    public static final class a implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f14667a;

        public a(Iterator it) {
            this.f14667a = it;
        }

        public Iterator<T> iterator() {
            return this.f14667a;
        }
    }

    public static <T> c<T> a(Iterator<? extends T> it) {
        m.f(it, "<this>");
        return b(new a(it));
    }

    public static final <T> c<T> b(c<? extends T> cVar) {
        m.f(cVar, "<this>");
        return cVar instanceof a ? cVar : new a(cVar);
    }
}
