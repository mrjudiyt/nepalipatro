package androidx.lifecycle;

import androidx.lifecycle.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import r8.g;

/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends i implements k {

    /* renamed from: h  reason: collision with root package name */
    private final h f3412h;

    /* renamed from: i  reason: collision with root package name */
    private final g f3413i;

    public h g() {
        return this.f3412h;
    }

    public g i() {
        return this.f3413i;
    }

    public void onStateChanged(m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        if (g().b().compareTo(h.b.DESTROYED) <= 0) {
            g().c(this);
            y1.d(i(), (CancellationException) null, 1, (Object) null);
        }
    }
}
