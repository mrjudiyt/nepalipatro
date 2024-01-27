package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f13895a = new a();

    private /* synthetic */ a() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEvent(jsonReader);
    }
}
