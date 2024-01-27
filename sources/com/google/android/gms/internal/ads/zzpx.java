package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpx {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdn zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;

    public zzpx(zzam zzam, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zzdn zzdn, boolean z10, boolean z11) {
        this.zza = zzam;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzdn;
    }

    public final AudioTrack zza(boolean z10, zzk zzk2, int i10) {
        AudioTrack audioTrack;
        try {
            int i11 = zzfk.zza;
            if (i11 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzk2.zza().zza).setAudioFormat(zzfk.zzu(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i10).setOffloadedPlayback(this.zzc == 1).build();
            } else if (i11 >= 21) {
                audioTrack = new AudioTrack(zzk2.zza().zza, zzfk.zzu(this.zze, this.zzf, this.zzg), this.zzh, 1, i10);
            } else {
                int i12 = zzk2.zzc;
                if (i10 == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i10);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpe(state, this.zze, this.zzf, this.zzh, this.zza, zzb(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzpe(0, this.zze, this.zzf, this.zzh, this.zza, zzb(), e10);
        }
    }

    public final boolean zzb() {
        return this.zzc == 1;
    }
}
