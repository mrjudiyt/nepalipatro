package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeln extends zzbp {
    final zzfdl zza;
    final zzdjs zzb = new zzdjs();
    private final Context zzc;
    private final zzchw zzd;
    private zzbh zze;

    public zzeln(zzchw zzchw, Context context, String str) {
        zzfdl zzfdl = new zzfdl();
        this.zza = zzfdl;
        this.zzd = zzchw;
        zzfdl.zzs(str);
        this.zzc = context;
    }

    public final zzbn zze() {
        zzdju zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfdl zzfdl = this.zza;
        if (zzfdl.zzg() == null) {
            zzfdl.zzr(zzq.zzc());
        }
        return new zzelo(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    public final void zzf(zzbgm zzbgm) {
        this.zzb.zza(zzbgm);
    }

    public final void zzg(zzbgp zzbgp) {
        this.zzb.zzb(zzbgp);
    }

    public final void zzh(String str, zzbgv zzbgv, zzbgs zzbgs) {
        this.zzb.zzc(str, zzbgv, zzbgs);
    }

    public final void zzi(zzbmb zzbmb) {
        this.zzb.zzd(zzbmb);
    }

    public final void zzj(zzbgz zzbgz, zzq zzq) {
        this.zzb.zze(zzbgz);
        this.zza.zzr(zzq);
    }

    public final void zzk(zzbhc zzbhc) {
        this.zzb.zzf(zzbhc);
    }

    public final void zzl(zzbh zzbh) {
        this.zze = zzbh;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    public final void zzn(zzbls zzbls) {
        this.zza.zzv(zzbls);
    }

    public final void zzo(zzbfc zzbfc) {
        this.zza.zzA(zzbfc);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    public final void zzq(zzcf zzcf) {
        this.zza.zzQ(zzcf);
    }
}
