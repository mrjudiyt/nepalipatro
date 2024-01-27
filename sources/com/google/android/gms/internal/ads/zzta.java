package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzta implements zzvo {
    public final zzvo zza;
    final /* synthetic */ zztb zzb;
    private boolean zzc;

    public zzta(zztb zztb, zzvo zzvo) {
        this.zzb = zztb;
        this.zza = zzvo;
    }

    public final int zza(zzkn zzkn, zzht zzht, int i10) {
        zztb zztb = this.zzb;
        if (zztb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzht.zzc(4);
            return -4;
        }
        long zzb2 = zztb.zzb();
        int zza2 = this.zza.zza(zzkn, zzht, i10);
        if (zza2 == -5) {
            zzam zzam = zzkn.zza;
            Objects.requireNonNull(zzam);
            int i11 = zzam.zzC;
            int i12 = 0;
            if (i11 == 0) {
                if (zzam.zzD != 0) {
                    i11 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i12 = zzam.zzD;
            }
            zzak zzb3 = zzam.zzb();
            zzb3.zzE(i11);
            zzb3.zzF(i12);
            zzkn.zza = zzb3.zzac();
            return -5;
        }
        long j10 = this.zzb.zzb;
        if (j10 == Long.MIN_VALUE || ((zza2 != -4 || zzht.zze < j10) && (zza2 != -3 || zzb2 != Long.MIN_VALUE || zzht.zzd))) {
            return zza2;
        }
        zzht.zzb();
        zzht.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
