package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi f15307a;

    public /* synthetic */ o(GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi) {
        this.f15307a = geolocationPermissionsCallbackHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        p.c(this.f15307a, obj, reply);
    }
}
