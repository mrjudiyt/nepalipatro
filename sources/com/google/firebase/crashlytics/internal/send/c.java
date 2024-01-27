package com.google.firebase.crashlytics.internal.send;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import q3.h;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReportQueue f13911a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13912b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f13913c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsReportWithSessionId f13914d;

    public /* synthetic */ c(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z10, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.f13911a = reportQueue;
        this.f13912b = taskCompletionSource;
        this.f13913c = z10;
        this.f13914d = crashlyticsReportWithSessionId;
    }

    public final void a(Exception exc) {
        this.f13911a.lambda$sendReport$1(this.f13912b, this.f13913c, this.f13914d, exc);
    }
}
