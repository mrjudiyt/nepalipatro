package com.google.firebase;

import android.content.Context;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f13787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f13788b;

    public /* synthetic */ b(FirebaseApp firebaseApp, Context context) {
        this.f13787a = firebaseApp;
        this.f13788b = context;
    }

    public final Object get() {
        return this.f13787a.lambda$new$0(this.f13788b);
    }
}
