package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13991a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LibraryVersionComponent.VersionExtractor f13992b;

    public /* synthetic */ b(String str, LibraryVersionComponent.VersionExtractor versionExtractor) {
        this.f13991a = str;
        this.f13992b = versionExtractor;
    }

    public final Object create(ComponentContainer componentContainer) {
        return LibraryVersion.create(this.f13991a, this.f13992b.extract((Context) componentContainer.get(Context.class)));
    }
}
