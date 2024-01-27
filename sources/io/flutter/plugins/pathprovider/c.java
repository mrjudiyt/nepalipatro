package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.pathprovider.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.PathProviderApi f15219a;

    public /* synthetic */ c(Messages.PathProviderApi pathProviderApi) {
        this.f15219a = pathProviderApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        g.h(this.f15219a, obj, reply);
    }
}
