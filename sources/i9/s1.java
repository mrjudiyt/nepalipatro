package i9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o8.q;
import y8.l;

/* compiled from: JobSupport.kt */
final class s1 extends v1 {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14990m = AtomicIntegerFieldUpdater.newUpdater(s1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: l  reason: collision with root package name */
    private final l<Throwable, q> f14991l;

    public s1(l<? super Throwable, q> lVar) {
        this.f14991l = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        t((Throwable) obj);
        return q.f16189a;
    }

    public void t(Throwable th) {
        if (f14990m.compareAndSet(this, 0, 1)) {
            this.f14991l.invoke(th);
        }
    }
}
