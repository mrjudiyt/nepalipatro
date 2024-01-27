package io.flutter.plugin.platform;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController f15049a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15050b;

    public /* synthetic */ d(PlatformViewsController platformViewsController, int i10) {
        this.f15049a = platformViewsController;
        this.f15050b = i10;
    }

    public final void onFocusChange(View view, boolean z10) {
        this.f15049a.lambda$initializePlatformViewIfNeeded$2(this.f15050b, view, z10);
    }
}
