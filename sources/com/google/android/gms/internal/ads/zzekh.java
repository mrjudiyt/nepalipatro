package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzekh extends zzbpc {
    private final zzcxj zza;
    private final zzdfb zzb;
    private final zzcyd zzc;
    private final zzcys zzd;
    private final zzcyx zze;
    private final zzdcf zzf;
    private final zzczr zzg;
    private final zzdft zzh;
    private final zzdcb zzi;
    private final zzcxy zzj;

    public zzekh(zzcxj zzcxj, zzdfb zzdfb, zzcyd zzcyd, zzcys zzcys, zzcyx zzcyx, zzdcf zzdcf, zzczr zzczr, zzdft zzdft, zzdcb zzdcb, zzcxy zzcxy) {
        this.zza = zzcxj;
        this.zzb = zzdfb;
        this.zzc = zzcyd;
        this.zzd = zzcys;
        this.zze = zzcyx;
        this.zzf = zzdcf;
        this.zzg = zzczr;
        this.zzh = zzdft;
        this.zzi = zzdcb;
        this.zzj = zzcxy;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzbK();
    }

    public final void zzf() {
        this.zzg.zzby(4);
    }

    public final void zzg(int i10) {
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int i10, String str) {
    }

    @Deprecated
    public final void zzj(int i10) {
        zzk(new zze(i10, "", AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public final void zzk(zze zze2) {
        this.zzj.zza(zzfeo.zzc(8, zze2));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzr();
    }

    public final void zzp() {
        this.zzg.zzbv();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final void zzr(zzbgi zzbgi, String str) {
    }

    public void zzs(zzbwi zzbwi) {
    }

    public void zzt(zzbwm zzbwm) {
    }

    public void zzu() {
    }

    public void zzv() {
        this.zzh.zza();
    }

    public final void zzw() {
        this.zzh.zzb();
    }

    public final void zzx() {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
