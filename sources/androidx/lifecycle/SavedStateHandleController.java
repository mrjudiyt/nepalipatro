package androidx.lifecycle;

import androidx.lifecycle.h;
import androidx.savedstate.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateHandleController.kt */
public final class SavedStateHandleController implements k {

    /* renamed from: h  reason: collision with root package name */
    private final String f3440h;

    /* renamed from: i  reason: collision with root package name */
    private final z f3441i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3442j;

    public SavedStateHandleController(String str, z zVar) {
        m.f(str, Constants.KEY);
        m.f(zVar, "handle");
        this.f3440h = str;
        this.f3441i = zVar;
    }

    public final void g(a aVar, h hVar) {
        m.f(aVar, "registry");
        m.f(hVar, "lifecycle");
        if (!this.f3442j) {
            this.f3442j = true;
            hVar.a(this);
            aVar.h(this.f3440h, this.f3441i.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final z h() {
        return this.f3441i;
    }

    public final boolean i() {
        return this.f3442j;
    }

    public void onStateChanged(m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        if (aVar == h.a.ON_DESTROY) {
            this.f3442j = false;
            mVar.getLifecycle().c(this);
        }
    }
}
