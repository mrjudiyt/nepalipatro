package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: ProcessDetailsProvider.kt */
public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final ProcessDetails buildProcessDetails(String str, int i10, int i11, boolean z10) {
        return new ProcessDetails(str, i10, i11, z10);
    }

    static /* synthetic */ ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i10, int i11, boolean z10, int i12, Object obj) {
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

    public final List<ProcessDetails> getAppProcessDetails(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            m.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, m.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final ProcessDetails getCurrentProcessDetails(Context context) {
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
            if (((ProcessDetails) t10).getPid() == myPid) {
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
        ProcessDetails processDetails = (ProcessDetails) t10;
        if (processDetails != null) {
            return processDetails;
        }
        return buildProcessDetails$default(this, getProcessName$com_google_firebase_firebase_sessions(), myPid, 0, false, 12, (Object) null);
    }

    public final String getProcessName$com_google_firebase_firebase_sessions() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String myProcessName = Process.myProcessName();
            m.e(myProcessName, "myProcessName()");
            return myProcessName;
        } else if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        } else {
            String myProcessName2 = ProcessUtils.getMyProcessName();
            return myProcessName2 != null ? myProcessName2 : "";
        }
    }
}
