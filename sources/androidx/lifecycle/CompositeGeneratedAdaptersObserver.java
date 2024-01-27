package androidx.lifecycle;

import androidx.lifecycle.h;
import kotlin.jvm.internal.m;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
public final class CompositeGeneratedAdaptersObserver implements k {

    /* renamed from: h  reason: collision with root package name */
    private final e[] f3405h;

    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        m.f(eVarArr, "generatedAdapters");
        this.f3405h = eVarArr;
    }

    public void onStateChanged(m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        r rVar = new r();
        for (e a10 : this.f3405h) {
            a10.a(mVar, aVar, false, rVar);
        }
        for (e a11 : this.f3405h) {
            a11.a(mVar, aVar, true, rVar);
        }
    }
}
