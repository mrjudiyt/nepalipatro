package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzps {
    public static void zza(AudioTrack audioTrack, zzpu zzpu) {
        audioTrack.setPreferredDevice(zzpu == null ? null : zzpu.zza);
    }
}
