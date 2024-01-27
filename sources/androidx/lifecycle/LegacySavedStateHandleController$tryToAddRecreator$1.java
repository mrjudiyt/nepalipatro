package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import kotlin.jvm.internal.m;

/* compiled from: LegacySavedStateHandleController.kt */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements k {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ h f3410h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ a f3411i;

    LegacySavedStateHandleController$tryToAddRecreator$1(h hVar, a aVar) {
        this.f3410h = hVar;
        this.f3411i = aVar;
    }

    public void onStateChanged(m mVar, h.a aVar) {
        m.f(mVar, "source");
        m.f(aVar, "event");
        if (aVar == h.a.ON_START) {
            this.f3410h.c(this);
            this.f3411i.i(LegacySavedStateHandleController.a.class);
        }
    }
}
