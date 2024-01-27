package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.pathprovider.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.PathProviderApi f15221a;

    public /* synthetic */ e(Messages.PathProviderApi pathProviderApi) {
        this.f15221a = pathProviderApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        g.l(this.f15221a, obj, reply);
    }
}
