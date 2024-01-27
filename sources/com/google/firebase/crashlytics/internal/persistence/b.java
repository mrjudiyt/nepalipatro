package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f13905a = new b();

    private /* synthetic */ b() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(CrashlyticsReportPersistence.EVENT_FILE_NAME_PREFIX);
    }
}
