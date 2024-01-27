package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l6.p;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzce {
    private static final Method zza = zzc();
    private static final Method zzb = zzb();
    private final JobScheduler zzc;

    private zzce(JobScheduler jobScheduler) {
        this.zzc = jobScheduler;
    }

    private static int zza() {
        Method method = zzb;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return 0;
    }

    private static Method zzb() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static Method zzc() {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final int zza(JobInfo jobInfo, String str, int i10, String str2) {
        Method method = zza;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.zzc, new Object[]{jobInfo, str, Integer.valueOf(i10), str2});
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.zzc.schedule(jobInfo);
    }

    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) p.j((JobScheduler) context.getSystemService("jobscheduler"));
        if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new zzce(jobScheduler).zza(jobInfo, str, zza(), str2);
    }
}
