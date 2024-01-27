package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a1 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebStorageHostApi f15243a;

    public /* synthetic */ a1(GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi) {
        this.f15243a = webStorageHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        c1.e(this.f15243a, obj, reply);
    }
}
