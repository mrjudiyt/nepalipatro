package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: ProcessDetailsProvider.kt */
public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i10, i11, z10);
    }

    private final String getProcessName() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String myProcessName = Process.myProcessName();
            m.e(myProcessName, "{\n      Process.myProcessName()\n    }");
            return myProcessName;
        } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
            return "";
        } else {
            return processName;
        }
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String str) {
        m.f(str, "processName");
        return buildProcessDetails$default(this, str, 0, 0, false, 14, (Object) null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String str, int i10) {
        m.f(str, "processName");
        return buildProcessDetails$default(this, str, i10, 0, false, 12, (Object) null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String str, int i10, int i11) {
        m.f(str, "processName");
        return buildProcessDetails$default(this, str, i10, i11, false, 8, (Object) null);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String str, int i10, int i11, boolean z10) {
        m.f(str, "processName");
        CrashlyticsReport.Session.Event.Application.ProcessDetails build = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(str).setPid(i10).setImportance(i11).setDefaultProcess(z10).build();
        m.e(build, "builder()\n      .setProc…ltProcess)\n      .build()");
        return build;
    }

    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(Context context) {
        m.f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = p.e();
        }
        List u10 = x.u(list);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
        for (Object next : u10) {
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.l(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(m.a(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(Context context) {
        T t10;
        boolean z10;
        m.f(context, "context");
        int myPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) t10).getPid() == myPid) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) t10;
        if (processDetails != null) {
            return processDetails;
        }
        return buildProcessDetails$default(this, getProcessName(), myPid, 0, false, 12, (Object) null);
    }
}
