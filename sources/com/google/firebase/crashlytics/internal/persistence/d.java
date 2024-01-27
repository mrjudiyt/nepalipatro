package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ d f13907h = new d();

    private /* synthetic */ d() {
    }

    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
    }
}
