package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ b f13879h = new b();

    private /* synthetic */ b() {
    }

    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
