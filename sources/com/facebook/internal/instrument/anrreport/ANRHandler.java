package com.facebook.internal.instrument.anrreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import j3.b;
import j3.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p8.c0;

/* compiled from: ANRHandler.kt */
public final class ANRHandler {
    public static final ANRHandler INSTANCE = new ANRHandler();
    private static final int MAX_ANR_REPORT_NUM = 5;
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    private ANRHandler() {
    }

    public static final synchronized void enable() {
        Class<ANRHandler> cls = ANRHandler.class;
        synchronized (cls) {
            if (!CrashShieldHandler.isObjectCrashing(cls)) {
                try {
                    if (!enabled.getAndSet(true)) {
                        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                            sendANRReports();
                        }
                        ANRDetector aNRDetector = ANRDetector.INSTANCE;
                        ANRDetector.start();
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, cls);
                }
            }
        }
    }

    public static final void sendANRReports() {
        Class<ANRHandler> cls = ANRHandler.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                Utility utility = Utility.INSTANCE;
                if (!Utility.isDataProcessingRestricted()) {
                    InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
                    File[] listAnrReportFiles = InstrumentUtility.listAnrReportFiles();
                    ArrayList arrayList = new ArrayList(listAnrReportFiles.length);
                    for (File load : listAnrReportFiles) {
                        InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                        arrayList.add(InstrumentData.Builder.load(load));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : arrayList) {
                        if (((InstrumentData) next).isValid()) {
                            arrayList2.add(next);
                        }
                    }
                    List O = x.O(arrayList2, c.f15366h);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = l.i(0, Math.min(O.size(), 5)).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(O.get(((c0) it).b()));
                    }
                    InstrumentUtility instrumentUtility2 = InstrumentUtility.INSTANCE;
                    InstrumentUtility.sendReports("anr_reports", jSONArray, new b(O));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendANRReports$lambda-2  reason: not valid java name */
    public static final int m121sendANRReports$lambda2(InstrumentData instrumentData, InstrumentData instrumentData2) {
        Class<ANRHandler> cls = ANRHandler.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return 0;
        }
        try {
            m.e(instrumentData2, "o2");
            return instrumentData.compareTo(instrumentData2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendANRReports$lambda-5  reason: not valid java name */
    public static final void m122sendANRReports$lambda5(List list, GraphResponse graphResponse) {
        Class<ANRHandler> cls = ANRHandler.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
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
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
