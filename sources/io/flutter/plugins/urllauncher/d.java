package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.UrlLauncherApi f15234a;

    public /* synthetic */ d(Messages.UrlLauncherApi urlLauncherApi) {
        this.f15234a = urlLauncherApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        f.j(this.f15234a, obj, reply);
    }
}
