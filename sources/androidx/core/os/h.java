package androidx.core.os;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import o8.l;
import o8.m;
import r8.d;

/* compiled from: OutcomeReceiver.kt */
final class h<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* renamed from: h  reason: collision with root package name */
    private final d<R> f2390h;

    public h(d<? super R> dVar) {
        super(false);
        this.f2390h = dVar;
    }

    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            d<R> dVar = this.f2390h;
            l.a aVar = l.f16183h;
            dVar.resumeWith(l.a(m.a(e10)));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            d<R> dVar = this.f2390h;
            l.a aVar = l.f16183h;
            dVar.resumeWith(l.a(r10));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
