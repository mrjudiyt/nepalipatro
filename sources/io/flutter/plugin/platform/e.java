package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController f15051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest f15052b;

    public /* synthetic */ e(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        this.f15051a = platformViewsController;
        this.f15052b = platformViewCreationRequest;
    }

    public final void onFocusChange(View view, boolean z10) {
        this.f15051a.lambda$configureForVirtualDisplay$0(this.f15052b, view, z10);
    }
}
