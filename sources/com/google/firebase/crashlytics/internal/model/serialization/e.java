package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f13899a = new e();

    private /* synthetic */ e() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader);
    }
}
