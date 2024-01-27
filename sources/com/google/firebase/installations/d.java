package com.google.firebase.installations;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f13933h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f13934i;

    public /* synthetic */ d(FirebaseInstallations firebaseInstallations, boolean z10) {
        this.f13933h = firebaseInstallations;
        this.f13934i = z10;
    }

    public final void run() {
        this.f13933h.lambda$getToken$2(this.f13934i);
    }
}
