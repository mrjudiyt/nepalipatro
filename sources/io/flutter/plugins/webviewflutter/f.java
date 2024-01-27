package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.CookieManagerHostApi f15266a;

    public /* synthetic */ f(GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi) {
        this.f15266a = cookieManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidWebView.CookieManagerHostApi.CC.h(this.f15266a, obj, reply);
    }
}
