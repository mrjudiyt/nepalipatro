package f9;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: Sequences.kt */
public final class j<T, R> implements c<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f14669a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f14670b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, z8.a {

        /* renamed from: h  reason: collision with root package name */
        private final Iterator<T> f14671h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j<T, R> f14672i;

        a(j<T, R> jVar) {
            this.f14672i = jVar;
            this.f14671h = jVar.f14669a.iterator();
        }

        public boolean hasNext() {
            return this.f14671h.hasNext();
        }

        public R next() {
            return this.f14672i.f14670b.invoke(this.f14671h.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(c<? extends T> cVar, l<? super T, ? extends R> lVar) {
        m.f(cVar, "sequence");
        m.f(lVar, "transformer");
        this.f14669a = cVar;
        this.f14670b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
