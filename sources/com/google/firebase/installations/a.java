package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f13929a;

    public /* synthetic */ a(FirebaseApp firebaseApp) {
        this.f13929a = firebaseApp;
    }

    public final Object get() {
        return FirebaseInstallations.lambda$new$0(this.f13929a);
    }
}
