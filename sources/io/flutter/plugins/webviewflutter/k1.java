package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k1 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebViewClientHostApi f15291a;

    public /* synthetic */ k1(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
        this.f15291a = webViewClientHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        m1.d(this.f15291a, obj, reply);
    }
}
