package com.google.firebase.installations;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f13931h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f13932i;

    public /* synthetic */ c(FirebaseInstallations firebaseInstallations, boolean z10) {
        this.f13931h = firebaseInstallations;
        this.f13932i = z10;
    }

    public final void run() {
        this.f13931h.lambda$doRegistrationOrRefresh$3(this.f13932i);
    }
}
