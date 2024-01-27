package f9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.m;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<c<T>> f14659a;

    public a(c<? extends T> cVar) {
        m.f(cVar, "sequence");
        this.f14659a = new AtomicReference<>(cVar);
    }

    public Iterator<T> iterator() {
        c andSet = this.f14659a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
