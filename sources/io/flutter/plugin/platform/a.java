package io.flutter.plugin.platform;

import io.flutter.plugin.platform.PlatformPlugin;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ PlatformPlugin.AnonymousClass2 f15047h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f15048i;

    public /* synthetic */ a(PlatformPlugin.AnonymousClass2 r12, int i10) {
        this.f15047h = r12;
        this.f15048i = i10;
    }

    public final void run() {
        this.f15047h.lambda$onSystemUiVisibilityChange$0(this.f15048i);
    }
}
