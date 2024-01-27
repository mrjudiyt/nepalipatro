package io.flutter.plugins.webviewflutter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o2 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ InstanceManager f15310h;

    public /* synthetic */ o2(InstanceManager instanceManager) {
        this.f15310h = instanceManager;
    }

    public final void run() {
        this.f15310h.releaseAllFinalizedInstances();
    }
}
