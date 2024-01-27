package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzboj {
    private final zzbnm zza;
    private e zzb;

    zzboj(zzbnm zzbnm) {
        this.zza = zzbnm;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcbl zzcbl = new zzcbl();
            this.zzb = zzcbl;
            this.zza.zzb((zzaro) null).zzi(new zzbog(zzcbl), new zzboh(zzcbl));
        }
    }

    public final zzbom zza(String str, zzbnt zzbnt, zzbns zzbns) {
        zzd();
        return new zzbom(this.zzb, "google.afma.activeView.handleUpdate", zzbnt, zzbns);
    }

    public final void zzb(String str, zzbjj zzbjj) {
        zzd();
        this.zzb = zzfzt.zzn(this.zzb, new zzboi(str, zzbjj), zzcbg.zzf);
    }

    public final void zzc(String str, zzbjj zzbjj) {
        this.zzb = zzfzt.zzm(this.zzb, new zzbof(str, zzbjj), zzcbg.zzf);
    }
}
