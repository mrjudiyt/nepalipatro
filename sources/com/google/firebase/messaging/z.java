package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RequestDeduplicator f13988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13989b;

    public /* synthetic */ z(RequestDeduplicator requestDeduplicator, String str) {
        this.f13988a = requestDeduplicator;
        this.f13989b = str;
    }

    public final Object then(Task task) {
        return this.f13988a.lambda$getOrStartGetTokenRequest$0(this.f13989b, task);
    }
}
