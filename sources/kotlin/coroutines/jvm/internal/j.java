package kotlin.coroutines.jvm.internal;

import r8.d;
import r8.g;
import r8.h;

/* compiled from: ContinuationImpl.kt */
public abstract class j extends a {
    public j(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h.f16410h)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public g getContext() {
        return h.f16410h;
    }
}
