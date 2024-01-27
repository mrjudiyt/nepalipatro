package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgq implements zzgh {
    private final zzhe zza = new zzhe();
    private zzhk zzb;
    private String zzc;
    private int zzd = 8000;
    private int zze = 8000;
    private boolean zzf;

    public final zzgq zzb(boolean z10) {
        this.zzf = true;
        return this;
    }

    public final zzgq zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzgq zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzgq zze(zzhk zzhk) {
        this.zzb = zzhk;
        return this;
    }

    public final zzgq zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzgv zza() {
        zzgv zzgv = new zzgv(this.zzc, this.zzd, this.zze, this.zzf, this.zza, (zzfsx) null, false, (zzgu) null);
        zzhk zzhk = this.zzb;
        if (zzhk != null) {
            zzgv.zzf(zzhk);
        }
        return zzgv;
    }
}
