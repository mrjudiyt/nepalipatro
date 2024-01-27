package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class zzcat {
    protected static final zzftj zza = zzftj.zzb(4000);

    static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        return str + " @" + lineNumber;
    }

    public static void zze(String str) {
        if (zzm(3) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzf(String str, Throwable th) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (zzm(6) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzh(String str, Throwable th) {
        zzm(6);
    }

    public static void zzi(String str) {
        if (zzm(4) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzj(String str) {
        if (zzm(5) && str != null && str.length() > 4000) {
            for (String str2 : zza.zzd(str)) {
            }
        }
    }

    public static void zzk(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, Throwable th) {
        if (!zzm(5)) {
            return;
        }
        if (th != null) {
            zzk(zzd(str), th);
        } else {
            zzj(zzd(str));
        }
    }

    public static boolean zzm(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
