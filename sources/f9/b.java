package f9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import y8.l;

/* compiled from: Sequences.kt */
public final class b<T> implements c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f14660a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14661b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f14662c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, z8.a {

        /* renamed from: h  reason: collision with root package name */
        private final Iterator<T> f14663h;

        /* renamed from: i  reason: collision with root package name */
        private int f14664i = -1;

        /* renamed from: j  reason: collision with root package name */
        private T f14665j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ b<T> f14666k;

        a(b<T> bVar) {
            this.f14666k = bVar;
            this.f14663h = bVar.f14660a.iterator();
        }

        private final void b() {
            while (this.f14663h.hasNext()) {
                T next = this.f14663h.next();
                if (((Boolean) this.f14666k.f14662c.invoke(next)).booleanValue() == this.f14666k.f14661b) {
                    this.f14665j = next;
                    this.f14664i = 1;
                    return;
                }
            }
            this.f14664i = 0;
        }

        public boolean hasNext() {
            if (this.f14664i == -1) {
                b();
            }
            return this.f14664i == 1;
        }

        public T next() {
            if (this.f14664i == -1) {
                b();
            }
            if (this.f14664i != 0) {
                T t10 = this.f14665j;
                this.f14665j = null;
                this.f14664i = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c<? extends T> cVar, boolean z10, l<? super T, Boolean> lVar) {
        m.f(cVar, "sequence");
        m.f(lVar, "predicate");
        this.f14660a = cVar;
        this.f14661b = z10;
        this.f14662c = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
