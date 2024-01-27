package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzsb {
    public static void zza(zzru zzru, zzol zzol) {
        LogSessionId zza = zzol.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            zzru.zzb.setString("log-session-id", zza.getStringId());
        }
    }
}
