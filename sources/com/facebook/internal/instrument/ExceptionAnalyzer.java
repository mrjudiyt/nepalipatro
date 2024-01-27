package com.facebook.internal.instrument;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import i3.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExceptionAnalyzer.kt */
public final class ExceptionAnalyzer {
    public static final ExceptionAnalyzer INSTANCE = new ExceptionAnalyzer();
    private static boolean enabled;

    private ExceptionAnalyzer() {
    }

    public static final void enable() {
        ExceptionAnalyzer exceptionAnalyzer = INSTANCE;
        enabled = true;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            exceptionAnalyzer.sendExceptionAnalysisReports$facebook_core_release();
        }
    }

    public static final void execute(Throwable th) {
        if (enabled && !isDebug$facebook_core_release() && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            m.e(stackTrace, "e.stackTrace");
            for (StackTraceElement className : stackTrace) {
                FeatureManager featureManager = FeatureManager.INSTANCE;
                String className2 = className.getClassName();
                m.e(className2, "it.className");
                FeatureManager.Feature feature = FeatureManager.getFeature(className2);
                if (feature != FeatureManager.Feature.Unknown) {
                    FeatureManager.disableFeature(feature);
                    hashSet.add(feature.toString());
                }
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAutoLogAppEventsEnabled() && (!hashSet.isEmpty())) {
                InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                InstrumentData.Builder.build(new JSONArray(hashSet)).save();
            }
        }
    }

    public static final boolean isDebug$facebook_core_release() {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: sendExceptionAnalysisReports$lambda-1  reason: not valid java name */
    public static final void m113sendExceptionAnalysisReports$lambda1(InstrumentData instrumentData, GraphResponse graphResponse) {
        m.f(instrumentData, "$instrumentData");
        m.f(graphResponse, "response");
        try {
            if (graphResponse.getError() == null) {
                JSONObject jsonObject = graphResponse.getJsonObject();
                if (m.a(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.clear();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void sendExceptionAnalysisReports$facebook_core_release() {
        Utility utility = Utility.INSTANCE;
        if (!Utility.isDataProcessingRestricted()) {
            InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
            File[] listExceptionAnalysisReportFiles = InstrumentUtility.listExceptionAnalysisReportFiles();
            ArrayList arrayList = new ArrayList();
            int length = listExceptionAnalysisReportFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file = listExceptionAnalysisReportFiles[i10];
                i10++;
                InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                InstrumentData load = InstrumentData.Builder.load(file);
                if (load.isValid()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crash_shield", load.toString());
                        GraphRequest.Companion companion = GraphRequest.Companion;
                        b0 b0Var = b0.f15559a;
                        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                        m.e(format, "java.lang.String.format(format, *args)");
                        arrayList.add(companion.newPostRequest((AccessToken) null, format, jSONObject, new a(load)));
                    } catch (JSONException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                new GraphRequestBatch((Collection<GraphRequest>) arrayList).executeAsync();
            }
        }
    }
}
