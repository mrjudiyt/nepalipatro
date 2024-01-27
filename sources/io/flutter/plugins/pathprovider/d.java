package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.pathprovider.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.PathProviderApi f15220a;

    public /* synthetic */ d(Messages.PathProviderApi pathProviderApi) {
        this.f15220a = pathProviderApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        g.j(this.f15220a, obj, reply);
    }
}
