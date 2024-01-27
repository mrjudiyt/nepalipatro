package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseCoreHostApi f15119a;

    public /* synthetic */ p(GeneratedAndroidFirebaseCore.FirebaseCoreHostApi firebaseCoreHostApi) {
        this.f15119a = firebaseCoreHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.e(this.f15119a, obj, reply);
    }
}
