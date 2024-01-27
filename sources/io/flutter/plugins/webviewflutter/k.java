package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.FlutterAssetManagerHostApi f15290a;

    public /* synthetic */ k(GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
        this.f15290a = flutterAssetManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        m.e(this.f15290a, obj, reply);
    }
}
