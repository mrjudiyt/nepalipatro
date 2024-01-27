package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.sharedpreferences.Messages;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Messages.SharedPreferencesApi f15230a;

    public /* synthetic */ h(Messages.SharedPreferencesApi sharedPreferencesApi) {
        this.f15230a = sharedPreferencesApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        i.j(this.f15230a, obj, reply);
    }
}
