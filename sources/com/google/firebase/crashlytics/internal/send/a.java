package com.google.firebase.crashlytics.internal.send;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;
import q3.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f13908a = new a();

    private /* synthetic */ a() {
    }

    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
