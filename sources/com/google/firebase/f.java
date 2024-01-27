package com.google.firebase;

import android.content.Context;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements LibraryVersionComponent.VersionExtractor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f13923a = new f();

    private /* synthetic */ f() {
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$2((Context) obj);
    }
}
