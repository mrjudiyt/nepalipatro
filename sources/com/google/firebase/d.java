package com.google.firebase;

import android.content.Context;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements LibraryVersionComponent.VersionExtractor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f13915a = new d();

    private /* synthetic */ d() {
    }

    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$0((Context) obj);
    }
}
