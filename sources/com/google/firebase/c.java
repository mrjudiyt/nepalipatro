package com.google.firebase;

import android.content.Context;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements LibraryVersionComponent.VersionExtractor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f13789a = new c();

    private /* synthetic */ c() {
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
    }
}
