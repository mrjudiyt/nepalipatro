package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdbs implements AppEventListener, OnAdMetadataChangedListener, zzcxl, zza, zzczw, zzcyf, zzczk, zzo, zzcyb, zzdfd {
    private final zzdbq zza = new zzdbq(this, (zzdbp) null);
    /* access modifiers changed from: private */
    public zzemk zzb;
    /* access modifiers changed from: private */
    public zzemo zzc;
    /* access modifiers changed from: private */
    public zzeyp zzd;
    /* access modifiers changed from: private */
    public zzfbu zze;

    private static void zzn(Object obj, zzdbr zzdbr) {
        if (obj != null) {
            zzdbr.zza(obj);
        }
    }

    public final void onAdClicked() {
        zzn(this.zzb, zzdai.zza);
        zzn(this.zzc, zzdaj.zza);
    }

    public final void onAdMetadataChanged() {
        zzn(this.zze, zzdao.zza);
    }

    public final void onAppEvent(String str, String str2) {
        zzn(this.zzb, new zzdau(str, str2));
    }

    public final void zza() {
        zzn(this.zzb, zzdbn.zza);
        zzn(this.zze, zzdbo.zza);
    }

    public final void zzb() {
        zzn(this.zzb, zzdbg.zza);
        zzn(this.zze, zzdbh.zza);
    }

    public final void zzbK() {
        zzn(this.zzb, zzdbd.zza);
        zzn(this.zzc, zzdbi.zza);
        zzn(this.zze, zzdbj.zza);
        zzn(this.zzd, zzdbk.zza);
    }

    public final void zzbL() {
        zzn(this.zzd, zzdbb.zza);
    }

    public final void zzbo() {
        zzn(this.zzd, zzdan.zza);
    }

    public final void zzbu() {
        zzn(this.zzd, zzdba.zza);
    }

    public final void zzbv() {
        zzn(this.zzd, zzdaw.zza);
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
        zzn(this.zzb, new zzdar(zzbvw, str, str2));
        zzn(this.zze, new zzdat(zzbvw, str, str2));
    }

    public final void zzbx() {
        zzn(this.zzd, zzdbc.zza);
    }

    public final void zzby(int i10) {
        zzn(this.zzd, new zzdbe(i10));
    }

    public final void zzc() {
        zzn(this.zzb, zzdap.zza);
        zzn(this.zze, zzdaq.zza);
    }

    public final void zze() {
        zzn(this.zzb, zzdah.zza);
        zzn(this.zze, zzdas.zza);
    }

    public final void zzf() {
        zzn(this.zzb, zzdak.zza);
        zzn(this.zze, zzdal.zza);
    }

    public final void zzg() {
        zzn(this.zzd, zzdbf.zza);
    }

    public final void zzh(zzs zzs) {
        zzn(this.zzb, new zzdax(zzs));
        zzn(this.zze, new zzday(zzs));
        zzn(this.zzd, new zzdaz(zzs));
    }

    public final zzdbq zzi() {
        return this.zza;
    }

    public final void zzp(zze zze2) {
        zzn(this.zze, new zzdbl(zze2));
        zzn(this.zzb, new zzdbm(zze2));
    }

    public final void zzq() {
        zzn(this.zzb, zzdam.zza);
    }

    public final void zzs() {
        zzn(this.zzb, zzdav.zza);
    }
}
