package com.google.android.gms.analytics;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzd {
    public static String zza(int i10) {
        return zzn("&cd", i10);
    }

    public static String zzb(int i10) {
        return zzn("cd", i10);
    }

    public static String zzc(int i10) {
        return zzn("cd", i10);
    }

    public static String zzd(int i10) {
        return zzn("&cm", i10);
    }

    public static String zze(int i10) {
        return zzn("cm", i10);
    }

    public static String zzf(int i10) {
        return zzn("cm", i10);
    }

    public static String zzg(int i10) {
        return zzn("&il", i10);
    }

    public static String zzh(int i10) {
        return zzn("il", i10);
    }

    public static String zzi(int i10) {
        return zzn("pi", i10);
    }

    public static String zzj(int i10) {
        return zzn("&pr", i10);
    }

    public static String zzk(int i10) {
        return zzn("pr", i10);
    }

    public static String zzl(int i10) {
        return zzn("&promo", i10);
    }

    public static String zzm(int i10) {
        return zzn("promo", i10);
    }

    private static String zzn(String str, int i10) {
        if (i10 <= 0) {
            zzfa.zzb("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i10);
        return sb.toString();
    }
}
