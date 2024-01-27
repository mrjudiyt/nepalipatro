package com.facebook.internal.instrument.crashreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.a;
import k3.b;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p8.c0;

/* compiled from: CrashHandler.kt */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    public static final Companion Companion = new Companion((g) null);
    private static final int MAX_CRASH_REPORT_NUM = 5;
    /* access modifiers changed from: private */
    public static final String TAG = CrashHandler.class.getCanonicalName();
    /* access modifiers changed from: private */
    public static CrashHandler instance;
    private final Thread.UncaughtExceptionHandler previousHandler;

    /* compiled from: CrashHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final void sendExceptionReports() {
            Utility utility = Utility.INSTANCE;
            if (!Utility.isDataProcessingRestricted()) {
                InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
                File[] listExceptionReportFiles = InstrumentUtility.listExceptionReportFiles();
                ArrayList arrayList = new ArrayList(listExceptionReportFiles.length);
                for (File load : listExceptionReportFiles) {
                    InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                    arrayList.add(InstrumentData.Builder.load(load));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (((InstrumentData) next).isValid()) {
                        arrayList2.add(next);
                    }
                }
                List O = x.O(arrayList2, b.f15430h);
                JSONArray jSONArray = new JSONArray();
                Iterator it = l.i(0, Math.min(O.size(), 5)).iterator();
                while (it.hasNext()) {
                    jSONArray.put(O.get(((c0) it).b()));
                }
                InstrumentUtility instrumentUtility2 = InstrumentUtility.INSTANCE;
                InstrumentUtility.sendReports("crash_reports", jSONArray, new a(O));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: sendExceptionReports$lambda-2  reason: not valid java name */
        public static final int m123sendExceptionReports$lambda2(InstrumentData instrumentData, InstrumentData instrumentData2) {
            m.e(instrumentData2, "o2");
            return instrumentData.compareTo(instrumentData2);
        }

        /* access modifiers changed from: private */
        /* renamed from: sendExceptionReports$lambda-5  reason: not valid java name */
        public static final void m124sendExceptionReports$lambda5(List list, GraphResponse graphResponse) {
            m.f(list, "$validReports");
            m.f(graphResponse, "response");
            try {
                if (graphResponse.getError() == null) {
                    JSONObject jsonObject = graphResponse.getJsonObject();
                    if (m.a(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InstrumentData) it.next()).clear();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final synchronized void enable() {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                sendExceptionReports();
            }
            if (CrashHandler.instance != null) {
                String unused = CrashHandler.TAG;
                return;
            }
            CrashHandler.instance = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler(), (g) null);
            Thread.setDefaultUncaughtExceptionHandler(CrashHandler.instance);
        }
    }

    private CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    public /* synthetic */ CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g gVar) {
        this(uncaughtExceptionHandler);
    }

    public static final synchronized void enable() {
        synchronized (CrashHandler.class) {
            Companion.enable();
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m.f(thread, "t");
        m.f(th, "e");
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        if (InstrumentUtility.isSDKRelatedException(th)) {
            ExceptionAnalyzer exceptionAnalyzer = ExceptionAnalyzer.INSTANCE;
            ExceptionAnalyzer.execute(th);
            InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
            InstrumentData.Builder.build(th, InstrumentData.Type.CrashReport).save();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
