package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfau implements zzena {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzchw zzc;
    /* access modifiers changed from: private */
    public final zzemk zzd;
    /* access modifiers changed from: private */
    public final zzfbu zze;
    private zzbdg zzf;
    /* access modifiers changed from: private */
    public final zzfjh zzg;
    private final zzfdl zzh;
    /* access modifiers changed from: private */
    public e zzi;

    public zzfau(Context context, Executor executor, zzchw zzchw, zzemk zzemk, zzfbu zzfbu, zzfdl zzfdl) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchw;
        this.zzd = zzemk;
        this.zzh = zzfdl;
        this.zze = zzfbu;
        this.zzg = zzchw.zzz();
    }

    public final boolean zza() {
        e eVar = this.zzi;
        return eVar != null && !eVar.isDone();
    }

    public final boolean zzb(zzl zzl, String str, zzemy zzemy, zzemz zzemz) {
        zzdgx zzf2;
        zzfje zzfje;
        if (str == null) {
            zzcat.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzfao(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzl.zzf) {
                this.zzc.zzk().zzn(true);
            }
            zzq zzq = ((zzfan) zzemy).zza;
            zzfdl zzfdl = this.zzh;
            zzfdl.zzs(str);
            zzfdl.zzr(zzq);
            zzfdl.zzE(zzl);
            Context context = this.zza;
            zzfdn zzG = zzfdl.zzG();
            zzfit zzb2 = zzfis.zzb(context, zzfjd.zzf(zzG), 4, zzl);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzhW)).booleanValue()) {
                zzdgw zzg2 = this.zzc.zzg();
                zzcwt zzcwt = new zzcwt();
                zzcwt.zze(this.zza);
                zzcwt.zzi(zzG);
                zzg2.zze(zzcwt.zzj());
                zzdda zzdda = new zzdda();
                zzdda.zzj(this.zzd, this.zzb);
                zzdda.zzk(this.zzd, this.zzb);
                zzg2.zzd(zzdda.zzn());
                zzg2.zzc(new zzekt(this.zzf));
                zzf2 = zzg2.zzf();
            } else {
                zzdda zzdda2 = new zzdda();
                zzfbu zzfbu = this.zze;
                if (zzfbu != null) {
                    zzdda2.zze(zzfbu, this.zzb);
                    zzdda2.zzf(this.zze, this.zzb);
                    zzdda2.zzb(this.zze, this.zzb);
                }
                zzdgw zzg3 = this.zzc.zzg();
                zzcwt zzcwt2 = new zzcwt();
                zzcwt2.zze(this.zza);
                zzcwt2.zzi(zzG);
                zzg3.zze(zzcwt2.zzj());
                zzdda2.zzj(this.zzd, this.zzb);
                zzdda2.zze(this.zzd, this.zzb);
                zzdda2.zzf(this.zzd, this.zzb);
                zzdda2.zzb(this.zzd, this.zzb);
                zzdda2.zza(this.zzd, this.zzb);
                zzdda2.zzl(this.zzd, this.zzb);
                zzdda2.zzk(this.zzd, this.zzb);
                zzdda2.zzi(this.zzd, this.zzb);
                zzdda2.zzc(this.zzd, this.zzb);
                zzg3.zzd(zzdda2.zzn());
                zzg3.zzc(new zzekt(this.zzf));
                zzf2 = zzg3.zzf();
            }
            zzdgx zzdgx = zzf2;
            if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
                zzfje zzf3 = zzdgx.zzf();
                zzf3.zzh(4);
                zzf3.zzb(zzl.zzp);
                zzfje = zzf3;
            } else {
                zzfje = null;
            }
            zzcue zza2 = zzdgx.zza();
            e zzi2 = zza2.zzi(zza2.zzj());
            this.zzi = zzi2;
            zzfzt.zzr(zzi2, new zzfat(this, zzemz, zzfje, zzb2, zzdgx), this.zzb);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzbF(zzfeo.zzd(6, (String) null, (zze) null));
    }

    public final void zzi(zzbdg zzbdg) {
        this.zzf = zzbdg;
    }
}
