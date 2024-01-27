package io.flutter.plugin.platform;

import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.platform.PlatformViewsController;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController.AnonymousClass1 f15056h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ VirtualDisplayController f15057i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ float f15058j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsChannel.PlatformViewBufferResized f15059k;

    public /* synthetic */ h(PlatformViewsController.AnonymousClass1 r12, VirtualDisplayController virtualDisplayController, float f10, PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
        this.f15056h = r12;
        this.f15057i = virtualDisplayController;
        this.f15058j = f10;
        this.f15059k = platformViewBufferResized;
    }

    public final void run() {
        this.f15056h.lambda$resize$0(this.f15057i, this.f15058j, this.f15059k);
    }
}
