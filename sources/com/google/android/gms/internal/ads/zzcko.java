package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcko {
    private zzchz zza;
    private zzcmb zzb;
    private zzfhv zzc;
    private zzcmn zzd;
    private zzfep zze;

    private zzcko() {
    }

    /* synthetic */ zzcko(zzckn zzckn) {
    }

    public final zzchw zza() {
        zzhbk.zzc(this.zza, zzchz.class);
        zzhbk.zzc(this.zzb, zzcmb.class);
        if (this.zzc == null) {
            this.zzc = new zzfhv();
        }
        if (this.zzd == null) {
            this.zzd = new zzcmn();
        }
        if (this.zze == null) {
            this.zze = new zzfep();
        }
        return new zzcjs(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzcjr) null);
    }

    public final zzcko zzb(zzchz zzchz) {
        this.zza = zzchz;
        return this;
    }

    public final zzcko zzc(zzcmb zzcmb) {
        this.zzb = zzcmb;
        return this;
    }
}
