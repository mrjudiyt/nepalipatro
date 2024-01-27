package com.facebook.internal.instrument.errorreport;

import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportData.kt */
public final class ErrorReportData {
    public static final Companion Companion = new Companion((g) null);
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PRARAM_ERROR_MESSAGE = "error_message";
    private String errorMessage;
    private String filename;
    private Long timestamp;

    /* compiled from: ErrorReportData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ErrorReportData(String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ERROR_REPORT_PREFIX);
        Long l10 = this.timestamp;
        Objects.requireNonNull(l10, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        m.e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    public final void clear() {
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(ErrorReportData errorReportData) {
        m.f(errorReportData, "data");
        Long l10 = this.timestamp;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = errorReportData.timestamp;
        if (l11 == null) {
            return 1;
        }
        return m.i(l11.longValue(), longValue);
    }

    public final JSONObject getParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean isValid() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            return super.toString();
        }
        String jSONObject = parameters.toString();
        m.e(jSONObject, "params.toString()");
        return jSONObject;
    }

    public ErrorReportData(File file) {
        m.f(file, "file");
        String name = file.getName();
        m.e(name, "file.name");
        this.filename = name;
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        JSONObject readFile = InstrumentUtility.readFile(name, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0));
            this.errorMessage = readFile.optString("error_message", (String) null);
        }
    }
}
