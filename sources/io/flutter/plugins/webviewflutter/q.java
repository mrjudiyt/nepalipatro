package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.InstanceManagerHostApi f15316a;

    public /* synthetic */ q(GeneratedAndroidWebView.InstanceManagerHostApi instanceManagerHostApi) {
        this.f15316a = instanceManagerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        s.c(this.f15316a, obj, reply);
    }
}
