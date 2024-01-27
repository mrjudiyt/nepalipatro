package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.UrlLauncherApi f15231a;

    public /* synthetic */ a(Messages.UrlLauncherApi urlLauncherApi) {
        this.f15231a = urlLauncherApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        f.k(this.f15231a, obj, reply);
    }
}
