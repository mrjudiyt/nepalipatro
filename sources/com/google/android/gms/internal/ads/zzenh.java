package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzenh implements zzena {
    private final zzfdl zza;
    /* access modifiers changed from: private */
    public final zzchw zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzemx zzd;
    /* access modifiers changed from: private */
    public final zzfjh zze;
    private zzctl zzf;

    public zzenh(zzchw zzchw, Context context, zzemx zzemx, zzfdl zzfdl) {
        this.zzb = zzchw;
        this.zzc = context;
        this.zzd = zzemx;
        this.zza = zzfdl;
        this.zze = zzchw.zzz();
        zzfdl.zzu(zzemx.zzd());
    }

    public final boolean zza() {
        zzctl zzctl = this.zzf;
        return zzctl != null && zzctl.zzf();
    }

    public final boolean zzb(zzl zzl, String str, zzemy zzemy, zzemz zzemz) {
        zzfje zzfje;
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc) && zzl.zzs == null) {
            zzcat.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new zzenc(this));
            return false;
        } else if (str == null) {
            zzcat.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new zzend(this));
            return false;
        } else {
            zzfei.zza(this.zzc, zzl.zzf);
            if (((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzl.zzf) {
                this.zzb.zzk().zzn(true);
            }
            int i10 = ((zzenb) zzemy).zza;
            zzfdl zzfdl = this.zza;
            zzfdl.zzE(zzl);
            zzfdl.zzz(i10);
            Context context = this.zzc;
            zzfdn zzG = zzfdl.zzG();
            zzfit zzb2 = zzfis.zzb(context, zzfjd.zzf(zzG), 8, zzl);
            zzcb zzcb = zzG.zzn;
            if (zzcb != null) {
                this.zzd.zzd().zzm(zzcb);
            }
            zzdhs zzh = this.zzb.zzh();
            zzcwt zzcwt = new zzcwt();
            zzcwt.zze(this.zzc);
            zzcwt.zzi(zzG);
            zzh.zzf(zzcwt.zzj());
            zzdda zzdda = new zzdda();
            zzdda.zzk(this.zzd.zzd(), this.zzb.zzB());
            zzh.zze(zzdda.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcqs((ViewGroup) null));
            zzdht zzg = zzh.zzg();
            if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
                zzfje zzf2 = zzg.zzf();
                zzf2.zzh(8);
                zzf2.zzb(zzl.zzp);
                zzfje = zzf2;
            } else {
                zzfje = null;
            }
            this.zzb.zzx().zzc(1);
            zzgad zzgad = zzcbg.zza;
            zzhbk.zzb(zzgad);
            ScheduledExecutorService zzC = this.zzb.zzC();
            zzcue zza2 = zzg.zza();
            zzctl zzctl = new zzctl(zzgad, zzC, zza2.zzi(zza2.zzj()));
            this.zzf = zzctl;
            zzctl.zze(new zzeng(this, zzemz, zzfje, zzb2, zzg));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzbF(zzfeo.zzd(4, (String) null, (zze) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzbF(zzfeo.zzd(6, (String) null, (zze) null));
    }
}
