package io.flutter.plugins.urllauncher;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.urllauncher.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.UrlLauncherApi f15232a;

    public /* synthetic */ b(Messages.UrlLauncherApi urlLauncherApi) {
        this.f15232a = urlLauncherApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        f.h(this.f15232a, obj, reply);
    }
}
