package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f13901a = new g();

    private /* synthetic */ g() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseFile(jsonReader);
    }
}
