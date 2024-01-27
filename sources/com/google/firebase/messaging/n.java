package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements RequestDeduplicator.GetTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13970a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13971b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Store.Token f13972c;

    public /* synthetic */ n(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f13970a = firebaseMessaging;
        this.f13971b = str;
        this.f13972c = token;
    }

    public final Task start() {
        return this.f13970a.lambda$blockingGetToken$10(this.f13971b, this.f13972c);
    }
}
