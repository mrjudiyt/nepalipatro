package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.UrlLauncherApi f15235a;

    public /* synthetic */ e(Messages.UrlLauncherApi urlLauncherApi) {
        this.f15235a = urlLauncherApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        f.g(this.f15235a, obj, reply);
    }
}
