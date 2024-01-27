package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.JavaObjectHostApi f15335a;

    public /* synthetic */ u(GeneratedAndroidWebView.JavaObjectHostApi javaObjectHostApi) {
        this.f15335a = javaObjectHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        v.c(this.f15335a, obj, reply);
    }
}
