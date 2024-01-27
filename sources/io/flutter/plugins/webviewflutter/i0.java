package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebChromeClientHostApi f15281a;

    public /* synthetic */ i0(GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi) {
        this.f15281a = webChromeClientHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        k0.d(this.f15281a, obj, reply);
    }
}
