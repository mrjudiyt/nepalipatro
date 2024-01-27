package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ c f13906h = new c();

    private /* synthetic */ c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((File) obj2).getName().compareTo(((File) obj).getName());
    }
}
