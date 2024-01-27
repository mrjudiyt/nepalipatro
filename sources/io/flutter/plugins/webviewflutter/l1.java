package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l1 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebViewClientHostApi f15296a;

    public /* synthetic */ l1(GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
        this.f15296a = webViewClientHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        m1.e(this.f15296a, obj, reply);
    }
}
