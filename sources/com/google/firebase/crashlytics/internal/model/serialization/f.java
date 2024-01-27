package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f13900a = new f();

    private /* synthetic */ f() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
    }
}
