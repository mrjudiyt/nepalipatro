package com.google.firebase.crashlytics.internal.metadata;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserMetadata f13892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f13893b;

    public /* synthetic */ b(UserMetadata userMetadata, List list) {
        this.f13892a = userMetadata;
        this.f13893b = list;
    }

    public final Object call() {
        return this.f13892a.lambda$updateRolloutsState$1(this.f13893b);
    }
}
