package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.common.util.VisibleForTesting;

@Deprecated
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzfa {
    private static volatile Logger zza = new zzcu();

    @VisibleForTesting
    public static Logger zza() {
        return zza;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str2 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
                sb.append(str);
                sb.append(CertificateUtil.DELIMITER);
                sb.append(str2);
            }
            String zzb = zzeu.zzc.zzb();
        }
        Logger logger = zza;
        if (logger != null) {
            logger.error(str);
        }
    }

    @VisibleForTesting
    public static void zzc(Logger logger) {
        zza = logger;
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzd(String str) {
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzO(str);
        } else if (zzf(0)) {
            String zzb = zzeu.zzc.zzb();
        }
        Logger logger = zza;
        if (logger != null) {
            logger.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzR(str);
        } else if (zzf(2)) {
            String zzb = zzeu.zzc.zzb();
        }
        Logger logger = zza;
        if (logger != null) {
            logger.warn(str);
        }
    }

    public static boolean zzf(int i10) {
        return zza != null && zza.getLogLevel() <= i10;
    }
}
