package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements PlatformViewsChannel.PlatformViewBufferResized {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15046a;

    public /* synthetic */ c(MethodChannel.Result result) {
        this.f15046a = result;
    }

    public final void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
        PlatformViewsChannel.AnonymousClass1.lambda$resize$0(this.f15046a, platformViewBufferSize);
    }
}
