package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpp {
    public static zzoq zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzoq.zza;
        }
        zzoo zzoo = new zzoo();
        boolean z11 = false;
        if (zzfk.zza > 32 && playbackOffloadSupport == 2) {
            z11 = true;
        }
        zzoo.zza(true);
        zzoo.zzb(z11);
        zzoo.zzc(z10);
        return zzoo.zzd();
    }
}
