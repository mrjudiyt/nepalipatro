package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.DownloadListenerHostApi f15276a;

    public /* synthetic */ h(GeneratedAndroidWebView.DownloadListenerHostApi downloadListenerHostApi) {
        this.f15276a = downloadListenerHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        i.c(this.f15276a, obj, reply);
    }
}
