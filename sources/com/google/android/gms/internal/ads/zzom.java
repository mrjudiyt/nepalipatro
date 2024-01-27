package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzom {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i10, int i11) {
        for (int i12 = 10; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzfk.zzg(i12)).build(), zza)) {
                return i12;
            }
        }
        return 0;
    }

    public static zzfvs<Integer> zzb() {
        zzfvp zzfvp = new zzfvp();
        zzfxs zze = zzon.zzc.keySet().iterator();
        while (zze.hasNext()) {
            int intValue = ((Integer) zze.next()).intValue();
            if (zzfk.zza >= zzfk.zzf(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza)) {
                zzfvp.zzf(Integer.valueOf(intValue));
            }
        }
        zzfvp.zzf(2);
        return zzfvp.zzi();
    }
}
