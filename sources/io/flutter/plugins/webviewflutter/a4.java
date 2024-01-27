package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.InstanceManager;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a4 implements InstanceManager.FinalizationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BinaryMessenger f15246a;

    public /* synthetic */ a4(BinaryMessenger binaryMessenger) {
        this.f15246a = binaryMessenger;
    }

    public final void onFinalize(long j10) {
        new GeneratedAndroidWebView.JavaObjectFlutterApi(this.f15246a).dispose(Long.valueOf(j10), z3.f15361a);
    }
}
