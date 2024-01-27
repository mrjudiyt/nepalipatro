package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionReportingCoordinator f13882a;

    public /* synthetic */ e(SessionReportingCoordinator sessionReportingCoordinator) {
        this.f13882a = sessionReportingCoordinator;
    }

    public final Object then(Task task) {
        return Boolean.valueOf(this.f13882a.onReportSendComplete(task));
    }
}
