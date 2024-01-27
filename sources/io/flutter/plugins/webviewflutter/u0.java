package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.WebSettingsHostApi f15336a;

    public /* synthetic */ u0(GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
        this.f15336a = webSettingsHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        z0.w(this.f15336a, obj, reply);
    }
}
