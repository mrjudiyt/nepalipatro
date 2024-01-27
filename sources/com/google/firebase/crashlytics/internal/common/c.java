package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f13880a = new c();

    private /* synthetic */ c() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(CrashlyticsController.APP_EXCEPTION_MARKER_PREFIX);
    }
}
