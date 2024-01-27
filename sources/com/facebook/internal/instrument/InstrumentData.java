package com.facebook.internal.instrument;

import android.os.Build;
import com.facebook.internal.Utility;
import java.io.File;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentData.kt */
public final class InstrumentData {
    public static final Companion Companion = new Companion((g) null);
    private static final String PARAM_APP_VERSION = "app_version";
    private static final String PARAM_CALLSTACK = "callstack";
    private static final String PARAM_DEVICE_MODEL = "device_model";
    private static final String PARAM_DEVICE_OS = "device_os_version";
    private static final String PARAM_FEATURE_NAMES = "feature_names";
    private static final String PARAM_REASON = "reason";
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PARAM_TYPE = "type";
    private static final String UNKNOWN = "Unknown";
    private String appVersion;
    private String cause;
    private JSONArray featureNames;
    private String filename;
    private String stackTrace;
    private Long timestamp;
    private Type type;

    /* compiled from: InstrumentData.kt */
    public static final class Builder {
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        public static final InstrumentData build(Throwable th, Type type) {
            m.f(type, "t");
            return new InstrumentData(th, type, (g) null);
        }

        public static final InstrumentData load(File file) {
            m.f(file, "file");
            return new InstrumentData(file, (g) null);
        }

        public static final InstrumentData build(JSONArray jSONArray) {
            m.f(jSONArray, "features");
            return new InstrumentData(jSONArray, (g) null);
        }

        public static final InstrumentData build(String str, String str2) {
            return new InstrumentData(str, str2, (g) null);
        }
    }

    /* compiled from: InstrumentData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Type getType(String str) {
            if (p.v(str, InstrumentUtility.CRASH_REPORT_PREFIX, false, 2, (Object) null)) {
                return Type.CrashReport;
            }
            if (p.v(str, InstrumentUtility.CRASH_SHIELD_PREFIX, false, 2, (Object) null)) {
                return Type.CrashShield;
            }
            if (p.v(str, InstrumentUtility.THREAD_CHECK_PREFIX, false, 2, (Object) null)) {
                return Type.ThreadCheck;
            }
            if (p.v(str, InstrumentUtility.ANALYSIS_REPORT_PREFIX, false, 2, (Object) null)) {
                return Type.Analysis;
            }
            if (p.v(str, InstrumentUtility.ANR_REPORT_PREFIX, false, 2, (Object) null)) {
                return Type.AnrReport;
            }
            return Type.Unknown;
        }
    }

    /* compiled from: InstrumentData.kt */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* compiled from: InstrumentData.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] iArr = new int[Type.values().length];
                iArr[Type.Analysis.ordinal()] = 1;
                iArr[Type.AnrReport.ordinal()] = 2;
                iArr[Type.CrashReport.ordinal()] = 3;
                iArr[Type.CrashShield.ordinal()] = 4;
                iArr[Type.ThreadCheck.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String getLogPrefix() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return InstrumentUtility.ANALYSIS_REPORT_PREFIX;
            }
            if (i10 == 2) {
                return InstrumentUtility.ANR_REPORT_PREFIX;
            }
            if (i10 == 3) {
                return InstrumentUtility.CRASH_REPORT_PREFIX;
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : InstrumentUtility.THREAD_CHECK_PREFIX;
            }
            return InstrumentUtility.CRASH_SHIELD_PREFIX;
        }

        public String toString() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* compiled from: InstrumentData.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.Analysis.ordinal()] = 1;
            iArr[Type.AnrReport.ordinal()] = 2;
            iArr[Type.CrashReport.ordinal()] = 3;
            iArr[Type.CrashShield.ordinal()] = 4;
            iArr[Type.ThreadCheck.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentData(File file, g gVar) {
        this(file);
    }

    public /* synthetic */ InstrumentData(String str, String str2, g gVar) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type2, g gVar) {
        this(th, type2);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANALYSIS_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        m.e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, g gVar) {
        this(jSONArray);
    }

    private final JSONObject getAnalysisReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(PARAM_FEATURE_NAMES, jSONArray);
            }
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getExceptionReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_DEVICE_OS, Build.VERSION.RELEASE);
            jSONObject.put(PARAM_DEVICE_MODEL, Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put(PARAM_APP_VERSION, str);
            }
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(PARAM_CALLSTACK, str3);
            }
            Type type2 = this.type;
            if (type2 != null) {
                jSONObject.put("type", type2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getParameters() {
        Type type2 = this.type;
        int i10 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i10 == 1) {
            return getAnalysisReportParameters();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return getExceptionReportParameters();
        }
        return null;
    }

    public final void clear() {
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(InstrumentData instrumentData) {
        m.f(instrumentData, "data");
        Long l10 = this.timestamp;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = instrumentData.timestamp;
        if (l11 == null) {
            return 1;
        }
        return m.i(l11.longValue(), longValue);
    }

    public final boolean isValid() {
        Type type2 = this.type;
        int i10 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.stackTrace == null || this.timestamp == null) {
                    return false;
                }
                return true;
            } else if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
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
            String jSONObject = new JSONObject().toString();
            m.e(jSONObject, "JSONObject().toString()");
            return jSONObject;
        }
        String jSONObject2 = parameters.toString();
        m.e(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    private InstrumentData(Throwable th, Type type2) {
        this.type = type2;
        Utility utility = Utility.INSTANCE;
        this.appVersion = Utility.getAppVersion();
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type2.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        m.e(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.filename = stringBuffer2;
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        Utility utility = Utility.INSTANCE;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANR_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        m.e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = stringBuffer2;
    }

    private InstrumentData(File file) {
        String name = file.getName();
        m.e(name, "file.name");
        this.filename = name;
        this.type = Companion.getType(name);
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        JSONObject readFile = InstrumentUtility.readFile(this.filename, true);
        if (readFile != null) {
            this.timestamp = Long.valueOf(readFile.optLong("timestamp", 0));
            this.appVersion = readFile.optString(PARAM_APP_VERSION, (String) null);
            this.cause = readFile.optString("reason", (String) null);
            this.stackTrace = readFile.optString(PARAM_CALLSTACK, (String) null);
            this.featureNames = readFile.optJSONArray(PARAM_FEATURE_NAMES);
        }
    }
}
