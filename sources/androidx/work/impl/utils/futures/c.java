package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.e;

/* compiled from: SettableFuture */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> s() {
        return new c<>();
    }

    public boolean o(V v10) {
        return super.o(v10);
    }

    public boolean p(Throwable th) {
        return super.p(th);
    }

    public boolean q(e<? extends V> eVar) {
        return super.q(eVar);
    }
}
