package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.common.BasicMessageChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements BasicMessageChannel.Reply {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyEventChannel.EventResponseHandler f15045a;

    public /* synthetic */ a(KeyEventChannel.EventResponseHandler eventResponseHandler) {
        this.f15045a = eventResponseHandler;
    }

    public final void reply(Object obj) {
        KeyEventChannel.lambda$createReplyHandler$0(this.f15045a, obj);
    }
}
