package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Store;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13964a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13965b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Store.Token f13966c;

    public /* synthetic */ j(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f13964a = firebaseMessaging;
        this.f13965b = str;
        this.f13966c = token;
    }

    public final Task then(Object obj) {
        return this.f13964a.lambda$blockingGetToken$9(this.f13965b, this.f13966c, (String) obj);
    }
}
