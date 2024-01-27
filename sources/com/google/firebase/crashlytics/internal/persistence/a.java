package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f13904a = new a();

    private /* synthetic */ a() {
    }

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str);
    }
}
