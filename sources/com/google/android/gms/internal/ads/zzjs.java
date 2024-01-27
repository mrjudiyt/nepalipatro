package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzjs {
    public static zzol zza(Context context, zzkb zzkb, boolean z10) {
        zzoh zzb = zzoh.zzb(context);
        if (zzb == null) {
            zzer.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzol(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            zzkb.zzz(zzb);
        }
        return new zzol(zzb.zza());
    }
}
