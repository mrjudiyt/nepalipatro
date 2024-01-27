package com.facebook.internal.instrument;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import g9.d;
import g9.f;
import i3.e;
import i3.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstrumentUtility.kt */
public final class InstrumentUtility {
    public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";
    public static final String ANR_REPORT_PREFIX = "anr_log_";
    private static final String CODELESS_PREFIX = "com.facebook.appevents.codeless";
    public static final String CRASH_REPORT_PREFIX = "crash_log_";
    public static final String CRASH_SHIELD_PREFIX = "shield_log_";
    public static final String ERROR_REPORT_PREFIX = "error_log_";
    private static final String FBSDK_PREFIX = "com.facebook";
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();
    private static final String INSTRUMENT_DIR = "instrument";
    private static final String METASDK_PREFIX = "com.meta";
    private static final String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";
    public static final String THREAD_CHECK_PREFIX = "thread_check_log_";

    private InstrumentUtility() {
    }

    public static final boolean deleteFile(String str) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null) {
            return false;
        }
        return new File(instrumentReportDir, str).delete();
    }

    public static final String getCause(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    public static final File getInstrumentReportDir() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), INSTRUMENT_DIR);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String getStackTrace(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            m.e(stackTrace, "t.stackTrace");
            int i10 = 0;
            int length = stackTrace.length;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean isFromFbOrMeta(StackTraceElement stackTraceElement) {
        m.f(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        m.e(className, "element.className");
        if (!p.v(className, FBSDK_PREFIX, false, 2, (Object) null)) {
            String className2 = stackTraceElement.getClassName();
            m.e(className2, "element.className");
            return p.v(className2, METASDK_PREFIX, false, 2, (Object) null);
        }
    }

    public static final boolean isSDKRelatedException(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            m.e(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                m.e(stackTraceElement, "element");
                if (isFromFbOrMeta(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean isSDKRelatedThread(Thread thread) {
        StackTraceElement[] stackTrace;
        if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                m.e(stackTraceElement, "element");
                if (isFromFbOrMeta(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    m.e(className, "element.className");
                    if (!p.v(className, CODELESS_PREFIX, false, 2, (Object) null)) {
                        String className2 = stackTraceElement.getClassName();
                        m.e(className2, "element.className");
                        if (!p.v(className2, SUGGESTED_EVENTS_PREFIX, false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    m.e(methodName, "element.methodName");
                    if (!p.v(methodName, "onClick", false, 2, (Object) null)) {
                        String methodName2 = stackTraceElement.getMethodName();
                        m.e(methodName2, "element.methodName");
                        if (!p.v(methodName2, "onItemClick", false, 2, (Object) null)) {
                            String methodName3 = stackTraceElement.getMethodName();
                            m.e(methodName3, "element.methodName");
                            if (!p.v(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(e.f14885a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    /* renamed from: listAnrReportFiles$lambda-1  reason: not valid java name */
    public static final boolean m117listAnrReportFiles$lambda1(File file, String str) {
        m.e(str, "name");
        b0 b0Var = b0.f15559a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANR_REPORT_PREFIX}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(i3.f.f14886a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    /* renamed from: listExceptionAnalysisReportFiles$lambda-2  reason: not valid java name */
    public static final boolean m118listExceptionAnalysisReportFiles$lambda2(File file, String str) {
        m.e(str, "name");
        b0 b0Var = b0.f15559a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANALYSIS_REPORT_PREFIX}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(g.f14887a);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    /* renamed from: listExceptionReportFiles$lambda-3  reason: not valid java name */
    public static final boolean m119listExceptionReportFiles$lambda3(File file, String str) {
        m.e(str, "name");
        b0 b0Var = b0.f15559a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{CRASH_REPORT_PREFIX, CRASH_SHIELD_PREFIX, THREAD_CHECK_PREFIX}, 3));
        m.e(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final JSONObject readFile(String str, boolean z10) {
        File instrumentReportDir = getInstrumentReportDir();
        if (!(instrumentReportDir == null || str == null)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(instrumentReportDir, str));
                Utility utility = Utility.INSTANCE;
                return new JSONObject(Utility.readStreamToString(fileInputStream));
            } catch (Exception unused) {
                if (z10) {
                    deleteFile(str);
                }
            }
        }
        return null;
    }

    public static final void sendReports(String str, JSONArray jSONArray, GraphRequest.Callback callback) {
        m.f(jSONArray, "reports");
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                Utility utility = Utility.INSTANCE;
                JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
                if (dataProcessingOptions != null) {
                    Iterator<String> keys = dataProcessingOptions.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, dataProcessingOptions.get(next));
                    }
                }
                GraphRequest.Companion companion = GraphRequest.Companion;
                b0 b0Var = b0.f15559a;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                m.e(format, "java.lang.String.format(format, *args)");
                companion.newPostRequest((AccessToken) null, format, jSONObject, callback).executeAsync();
            } catch (JSONException unused) {
            }
        }
    }

    public static final void writeFile(String str, String str2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, str));
                byte[] bytes = str2.getBytes(d.f14759b);
                m.e(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static final String getStackTrace(Thread thread) {
        m.f(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        m.e(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
