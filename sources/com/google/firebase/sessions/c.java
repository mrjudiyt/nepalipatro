package com.google.firebase.sessions;

import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.FirebaseSessions;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements FirebaseAppLifecycleListener {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f14054a = new c();

    private /* synthetic */ c() {
    }

    public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
        FirebaseSessions.AnonymousClass1.m159invokeSuspend$lambda1(str, firebaseOptions);
    }
}
