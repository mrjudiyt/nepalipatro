package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.SharedPreferencesApi f15223a;

    public /* synthetic */ a(Messages.SharedPreferencesApi sharedPreferencesApi) {
        this.f15223a = sharedPreferencesApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        i.k(this.f15223a, obj, reply);
    }
}
