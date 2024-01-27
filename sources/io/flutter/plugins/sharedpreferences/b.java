package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.SharedPreferencesApi f15224a;

    public /* synthetic */ b(Messages.SharedPreferencesApi sharedPreferencesApi) {
        this.f15224a = sharedPreferencesApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        i.l(this.f15224a, obj, reply);
    }
}
