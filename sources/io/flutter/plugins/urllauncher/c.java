package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.UrlLauncherApi f15233a;

    public /* synthetic */ c(Messages.UrlLauncherApi urlLauncherApi) {
        this.f15233a = urlLauncherApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        f.i(this.f15233a, obj, reply);
    }
}
