package io.flutter.plugins.pathprovider;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.pathprovider.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.PathProviderApi f15217a;

    public /* synthetic */ a(Messages.PathProviderApi pathProviderApi) {
        this.f15217a = pathProviderApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        g.k(this.f15217a, obj, reply);
    }
}
