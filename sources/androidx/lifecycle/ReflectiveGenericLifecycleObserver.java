package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.h;

@Deprecated
class ReflectiveGenericLifecycleObserver implements k {

    /* renamed from: h  reason: collision with root package name */
    private final Object f3422h;

    /* renamed from: i  reason: collision with root package name */
    private final b.a f3423i;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3422h = obj;
        this.f3423i = b.f3452c.c(obj.getClass());
    }

    public void onStateChanged(m mVar, h.a aVar) {
        this.f3423i.a(mVar, aVar, this.f3422h);
    }
}
