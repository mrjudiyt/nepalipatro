package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.pathprovider.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.PathProviderApi f15218a;

    public /* synthetic */ b(Messages.PathProviderApi pathProviderApi) {
        this.f15218a = pathProviderApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        g.m(this.f15218a, obj, reply);
    }
}
