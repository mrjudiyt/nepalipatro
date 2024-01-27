package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13961a;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging) {
        this.f13961a = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        this.f13961a.lambda$new$2((TopicsSubscriber) obj);
    }
}
