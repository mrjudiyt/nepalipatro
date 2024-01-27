package androidx.profileinstaller;

import android.view.Choreographer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Choreographer.FrameCallback {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Runnable f3954h;

    public /* synthetic */ l(Runnable runnable) {
        this.f3954h = runnable;
    }

    public final void doFrame(long j10) {
        this.f3954h.run();
    }
}
