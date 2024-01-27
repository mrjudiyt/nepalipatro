package androidx.concurrent.futures;

/* compiled from: ResolvableFuture */
public final class e<V> extends a<V> {
    private e() {
    }

    public static <V> e<V> a() {
        return new e<>();
    }

    public boolean set(V v10) {
        return super.set(v10);
    }

    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    public boolean setFuture(com.google.common.util.concurrent.e<? extends V> eVar) {
        return super.setFuture(eVar);
    }
}
