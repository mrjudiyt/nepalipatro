package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.SharedPreferencesApi f15229a;

    public /* synthetic */ g(Messages.SharedPreferencesApi sharedPreferencesApi) {
        this.f15229a = sharedPreferencesApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        i.m(this.f15229a, obj, reply);
    }
}
