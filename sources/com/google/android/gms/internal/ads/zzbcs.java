package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbcs {
    public static boolean zza(zzbda zzbda, zzbcx zzbcx, String... strArr) {
        if (zzbcx == null) {
            return false;
        }
        zzbda.zze(zzbcx, zzt.zzB().elapsedRealtime(), strArr);
        return true;
    }
}
