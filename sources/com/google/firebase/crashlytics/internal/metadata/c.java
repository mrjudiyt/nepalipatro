package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UserMetadata.SerializeableKeysMap f13894a;

    public /* synthetic */ c(UserMetadata.SerializeableKeysMap serializeableKeysMap) {
        this.f13894a = serializeableKeysMap;
    }

    public final Object call() {
        return this.f13894a.lambda$scheduleSerializationTaskIfNeeded$0();
    }
}
