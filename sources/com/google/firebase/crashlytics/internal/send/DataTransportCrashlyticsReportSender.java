package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import q3.b;
import q3.e;
import s3.u;

public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private static final e<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = a.f13908a;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private final ReportQueue reportQueue;
    private final e<CrashlyticsReport, byte[]> transportTransform;

    DataTransportCrashlyticsReportSender(ReportQueue reportQueue2, e<CrashlyticsReport, byte[]> eVar) {
        this.reportQueue = reportQueue2;
        this.transportTransform = eVar;
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        u.f(context);
        b b10 = b.b("json");
        e<CrashlyticsReport, byte[]> eVar = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(u.c().g(new a(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY)).a(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, b10, eVar), settingsProvider.getSettingsSync(), onDemandCounter), eVar);
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public Task<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z10) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z10).getTask();
    }
}
