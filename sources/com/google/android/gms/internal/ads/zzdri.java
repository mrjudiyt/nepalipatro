package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdri implements zzdag, zzcyz, zzcxo, zzcyf, zza, zzdcs {
    private final zzaxv zza;
    private boolean zzb = false;

    public zzdri(zzaxv zzaxv, zzfam zzfam) {
        this.zza = zzaxv;
        zzaxv.zzc(2);
        if (zzfam != null) {
            zzaxv.zzc(1101);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zzbF(zze zze) {
        switch (zze.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzbr(zzbvg zzbvg) {
    }

    public final void zzbs(zzfde zzfde) {
        this.zza.zzb(new zzdre(zzfde));
    }

    public final void zzh() {
        this.zza.zzc(1109);
    }

    public final void zzi(zzayq zzayq) {
        this.zza.zzb(new zzdrh(zzayq));
        this.zza.zzc(1103);
    }

    public final void zzj(zzayq zzayq) {
        this.zza.zzb(new zzdrf(zzayq));
        this.zza.zzc(1102);
    }

    public final void zzl(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    public final void zzm(zzayq zzayq) {
        this.zza.zzb(new zzdrg(zzayq));
        this.zza.zzc(1104);
    }

    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    public final synchronized void zzq() {
        this.zza.zzc(6);
    }

    public final void zzr() {
        this.zza.zzc(3);
    }
}
