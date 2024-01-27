package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h0 implements BasicMessageChannel.Reply {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply f15277a;

    public /* synthetic */ h0(GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply reply) {
        this.f15277a = reply;
    }

    public final void reply(Object obj) {
        this.f15277a.reply((List) obj);
    }
}
