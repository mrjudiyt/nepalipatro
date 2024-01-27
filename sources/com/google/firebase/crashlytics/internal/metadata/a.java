package com.google.firebase.crashlytics.internal.metadata;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserMetadata f13891a;

    public /* synthetic */ a(UserMetadata userMetadata) {
        this.f13891a = userMetadata;
    }

    public final Object call() {
        return this.f13891a.lambda$setUserId$0();
    }
}
