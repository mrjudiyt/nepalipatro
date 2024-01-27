package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.JavaScriptChannelHostApi f15350a;

    public /* synthetic */ x(GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi) {
        this.f15350a = javaScriptChannelHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        y.c(this.f15350a, obj, reply);
    }
}
