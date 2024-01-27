package androidx.lifecycle;

import androidx.lifecycle.h;
import kotlin.jvm.internal.m;

/* compiled from: SingleGeneratedAdapterObserver.kt */
public final class SingleGeneratedAdapterObserver implements k {

    /* renamed from: h  reason: collision with root package name */
    private final e f3443h;

    public SingleGeneratedAdapterObserver(e eVar) {
        m.f(eVar, "generatedAdapter");
        this.f3443h = eVar;
    }

    public void onStateChanged(m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        this.f3443h.a(mVar, aVar, false, (r) null);
        this.f3443h.a(mVar, aVar, true, (r) null);
    }
}
