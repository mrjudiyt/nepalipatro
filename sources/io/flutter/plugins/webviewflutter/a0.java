package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.PermissionRequestHostApi f15242a;

    public /* synthetic */ a0(GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi) {
        this.f15242a = permissionRequestHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        c0.d(this.f15242a, obj, reply);
    }
}
