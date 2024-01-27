package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p1 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebViewHostApi f15313a;

    public /* synthetic */ p1(GeneratedAndroidWebView.WebViewHostApi webViewHostApi) {
        this.f15313a = webViewHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidWebView.WebViewHostApi.CC.C(this.f15313a, obj, reply);
    }
}
