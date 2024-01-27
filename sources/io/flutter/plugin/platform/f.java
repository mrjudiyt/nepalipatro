package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController f15053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest f15054b;

    public /* synthetic */ f(PlatformViewsController platformViewsController, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        this.f15053a = platformViewsController;
        this.f15054b = platformViewCreationRequest;
    }

    public final void onFocusChange(View view, boolean z10) {
        this.f15053a.lambda$configureForTextureLayerComposition$1(this.f15054b, view, z10);
    }
}
