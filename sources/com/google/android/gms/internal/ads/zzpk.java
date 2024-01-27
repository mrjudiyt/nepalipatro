package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzpk {
    private final zzpj zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpk(AudioTrack audioTrack) {
        int i10 = zzfk.zza;
        this.zza = new zzpj(audioTrack);
        zzh(0);
    }

    private final void zzh(int i10) {
        this.zzb = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.zze = 0;
            this.zzf = -1;
            this.zzc = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            j10 = (i10 == 2 || i10 == 3) ? 10000000 : 500000;
        } else {
            this.zzd = 10000;
            return;
        }
        this.zzd = j10;
    }

    @TargetApi(19)
    public final long zza() {
        return this.zza.zza();
    }

    @TargetApi(19)
    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    @TargetApi(19)
    public final boolean zzg(long j10) {
        if (j10 - this.zze < this.zzd) {
            return false;
        }
        zzpj zzpj = this.zza;
        this.zze = j10;
        boolean zzc2 = zzpj.zzc();
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return zzc2;
                    }
                    if (!zzc2) {
                        return false;
                    }
                    zzh(0);
                    return true;
                } else if (!zzc2) {
                    zzh(0);
                    return false;
                }
            } else if (!zzc2) {
                zzh(0);
                return false;
            } else if (this.zza.zza() > this.zzf) {
                zzh(2);
                return true;
            }
            return true;
        } else if (zzc2) {
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        } else if (j10 - this.zzc <= 500000) {
            return false;
        } else {
            zzh(3);
            return false;
        }
    }
}
