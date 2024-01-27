package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.SharedPreferencesApi f15228a;

    public /* synthetic */ f(Messages.SharedPreferencesApi sharedPreferencesApi) {
        this.f15228a = sharedPreferencesApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        i.n(this.f15228a, obj, reply);
    }
}
