package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcuq implements zzcyz, zza, zzdag, zzcyf, zzcxl, zzdcs {
    private final Clock zza;
    private final zzbzv zzb;

    public zzcuq(Clock clock, zzbzv zzbzv) {
        this.zza = clock;
        this.zzb = zzbzv;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zza() {
        this.zzb.zze();
    }

    public final void zzb() {
    }

    public final void zzbr(zzbvg zzbvg) {
    }

    public final void zzbs(zzfde zzfde) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
    }

    public final void zzc() {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    public final void zzh() {
    }

    public final void zzi(zzayq zzayq) {
        this.zzb.zzi();
    }

    public final void zzj(zzayq zzayq) {
    }

    public final void zzk(zzl zzl) {
        this.zzb.zzj(zzl);
    }

    public final void zzl(boolean z10) {
    }

    public final void zzm(zzayq zzayq) {
        this.zzb.zzg();
    }

    public final void zzn(boolean z10) {
    }

    public final void zzq() {
        this.zzb.zzf();
    }

    public final void zzr() {
        this.zzb.zzh(true);
    }
}
