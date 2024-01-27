package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpo {
    public static zzoq zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zzoq.zza;
        }
        zzoo zzoo = new zzoo();
        zzoo.zza(true);
        zzoo.zzc(z10);
        return zzoo.zzd();
    }
}
