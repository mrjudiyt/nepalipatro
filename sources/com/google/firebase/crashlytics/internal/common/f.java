package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Comparator {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ f f13883h = new f();

    private /* synthetic */ f() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
    }
}
