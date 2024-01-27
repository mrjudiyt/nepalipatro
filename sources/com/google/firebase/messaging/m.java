package com.google.firebase.messaging;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements FirebaseInstanceIdInternal.NewTokenListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13969a;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging) {
        this.f13969a = firebaseMessaging;
    }

    public final void onNewToken(String str) {
        this.f13969a.lambda$new$0(str);
    }
}
