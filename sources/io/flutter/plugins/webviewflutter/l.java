package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.FlutterAssetManagerHostApi f15294a;

    public /* synthetic */ l(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
        this.f15294a = flutterAssetManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        m.d(this.f15294a, obj, reply);
    }
}
