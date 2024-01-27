package com.google.firebase.installations;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f13935a;

    public /* synthetic */ e(FirebaseInstallations firebaseInstallations) {
        this.f13935a = firebaseInstallations;
    }

    public final Object call() {
        return this.f13935a.deleteFirebaseInstallationId();
    }
}
