package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i f13903a = new i();

    private /* synthetic */ i() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
    }
}
