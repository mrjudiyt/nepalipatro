package com.google.firebase;

import android.content.Context;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements LibraryVersionComponent.VersionExtractor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f13917a = new e();

    private /* synthetic */ e() {
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$1((Context) obj);
    }
}
