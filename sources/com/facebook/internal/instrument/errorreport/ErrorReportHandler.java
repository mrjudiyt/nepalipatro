package com.facebook.internal.instrument.errorreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import g9.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l3.a;
import l3.b;
import l3.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportHandler.kt */
public final class ErrorReportHandler {
    public static final ErrorReportHandler INSTANCE = new ErrorReportHandler();
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    private ErrorReportHandler() {
    }

    public static final void enable() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    public static final File[] listErrorReportFiles() {
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        File instrumentReportDir = InstrumentUtility.getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(b.f15584a);
        m.e(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* access modifiers changed from: private */
    /* renamed from: listErrorReportFiles$lambda-3  reason: not valid java name */
    public static final boolean m125listErrorReportFiles$lambda3(File file, String str) {
        m.e(str, "name");
        b0 b0Var = b0.f15559a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ERROR_REPORT_PREFIX}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        return new f(format).a(str);
    }

    public static final void save(String str) {
        try {
            new ErrorReportData(str).save();
        } catch (Exception unused) {
        }
    }

    public static final void sendErrorReports() {
        Utility utility = Utility.INSTANCE;
        if (!Utility.isDataProcessingRestricted()) {
            File[] listErrorReportFiles = listErrorReportFiles();
            ArrayList arrayList = new ArrayList();
            int length = listErrorReportFiles.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                File file = listErrorReportFiles[i11];
                i11++;
                ErrorReportData errorReportData = new ErrorReportData(file);
                if (errorReportData.isValid()) {
                    arrayList.add(errorReportData);
                }
            }
            t.n(arrayList, c.f15585h);
            JSONArray jSONArray = new JSONArray();
            while (i10 < arrayList.size() && i10 < 1000) {
                jSONArray.put(arrayList.get(i10));
                i10++;
            }
            InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
            InstrumentUtility.sendReports("error_reports", jSONArray, new a(arrayList));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendErrorReports$lambda-0  reason: not valid java name */
    public static final int m126sendErrorReports$lambda0(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
        m.e(errorReportData2, "o2");
        return errorReportData.compareTo(errorReportData2);
    }

    /* access modifiers changed from: private */
    /* renamed from: sendErrorReports$lambda-2  reason: not valid java name */
    public static final void m127sendErrorReports$lambda2(ArrayList arrayList, GraphResponse graphResponse) {
        m.f(arrayList, "$validReports");
        m.f(graphResponse, "response");
        try {
            if (graphResponse.getError() == null) {
                JSONObject jsonObject = graphResponse.getJsonObject();
                if (m.a(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ErrorReportData) it.next()).clear();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
