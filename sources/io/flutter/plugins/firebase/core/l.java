package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements BasicMessageChannel.MessageHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidFirebaseCore.FirebaseAppHostApi f15115a;

    public /* synthetic */ l(GeneratedAndroidFirebaseCore.FirebaseAppHostApi firebaseAppHostApi) {
        this.f15115a = firebaseAppHostApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.f(this.f15115a, obj, reply);
    }
}
