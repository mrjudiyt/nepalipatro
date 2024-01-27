package androidx.lifecycle;

import androidx.lifecycle.h;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleAttacher implements k {

    /* renamed from: h  reason: collision with root package name */
    private final b0 f3439h;

    public SavedStateHandleAttacher(b0 b0Var) {
        m.f(b0Var, "provider");
        this.f3439h = b0Var;
    }

    public void onStateChanged(m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        if (aVar == h.a.ON_CREATE) {
            mVar.getLifecycle().c(this);
            this.f3439h.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
