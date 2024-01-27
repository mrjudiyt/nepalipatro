package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseAppHostApi f15114a;

    public /* synthetic */ k(GeneratedAndroidFirebaseCore.FirebaseAppHostApi firebaseAppHostApi) {
        this.f15114a = firebaseAppHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.e(this.f15114a, obj, reply);
    }
}
