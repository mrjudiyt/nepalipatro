package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpt {
    public static void zza(AudioTrack audioTrack, zzol zzol) {
        LogSessionId zza = zzol.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
