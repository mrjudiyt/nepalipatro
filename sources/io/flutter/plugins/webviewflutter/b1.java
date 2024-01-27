package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b1 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebStorageHostApi f15249a;

    public /* synthetic */ b1(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi) {
        this.f15249a = webStorageHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        c1.d(this.f15249a, obj, reply);
    }
}
