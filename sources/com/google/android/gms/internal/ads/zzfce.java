package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfce implements zzena {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzchw zzc;
    /* access modifiers changed from: private */
    public final zzfbu zzd;
    /* access modifiers changed from: private */
    public final zzfai zze;
    private final zzfdf zzf;
    /* access modifiers changed from: private */
    public final zzfjh zzg;
    private final zzfdl zzh;
    private e zzi;

    public zzfce(Context context, Executor executor, zzchw zzchw, zzfai zzfai, zzfbu zzfbu, zzfdl zzfdl, zzfdf zzfdf) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchw;
        this.zze = zzfai;
        this.zzd = zzfbu;
        this.zzh = zzfdl;
        this.zzf = zzfdf;
        this.zzg = zzchw.zzz();
    }

    /* access modifiers changed from: private */
    public final zzdpb zzk(zzfag zzfag) {
        zzdpb zzi2 = this.zzc.zzi();
        zzcwt zzcwt = new zzcwt();
        zzcwt.zze(this.zza);
        zzcwt.zzi(((zzfcd) zzfag).zza);
        zzcwt.zzh(this.zzf);
        zzi2.zzd(zzcwt.zzj());
        zzi2.zzc(new zzdda().zzn());
        return zzi2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(zzl zzl, String str, zzemy zzemy, zzemz zzemz) {
        zzfje zzfje;
        zzbwd zzbwd = new zzbwd(zzl, str);
        if (zzbwd.zzb == null) {
            zzcat.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzfbx(this));
        } else {
            e eVar = this.zzi;
            if (eVar == null || eVar.isDone()) {
                if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
                    zzfai zzfai = this.zze;
                    if (zzfai.zzd() != null) {
                        zzfje zzh2 = ((zzdpc) zzfai.zzd()).zzh();
                        zzh2.zzh(5);
                        zzh2.zzb(zzbwd.zza.zzp);
                        zzfje = zzh2;
                        zzfei.zza(this.zza, zzbwd.zza.zzf);
                        if (((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzbwd.zza.zzf) {
                            this.zzc.zzk().zzn(true);
                        }
                        zzfdl zzfdl = this.zzh;
                        zzfdl.zzs(zzbwd.zzb);
                        zzfdl.zzr(zzq.zzd());
                        zzfdl.zzE(zzbwd.zza);
                        Context context = this.zza;
                        zzfdn zzG = zzfdl.zzG();
                        zzfit zzb2 = zzfis.zzb(context, zzfjd.zzf(zzG), 5, zzbwd.zza);
                        zzfcd zzfcd = new zzfcd((zzfcc) null);
                        zzfcd.zza = zzG;
                        e zzc2 = this.zze.zzc(new zzfaj(zzfcd, (zzbvg) null), new zzfby(this), (Object) null);
                        this.zzi = zzc2;
                        zzfzt.zzr(zzc2, new zzfcb(this, zzemz, zzfje, zzb2, zzfcd), this.zzb);
                        return true;
                    }
                }
                zzfje = null;
                zzfei.zza(this.zza, zzbwd.zza.zzf);
                this.zzc.zzk().zzn(true);
                zzfdl zzfdl2 = this.zzh;
                zzfdl2.zzs(zzbwd.zzb);
                zzfdl2.zzr(zzq.zzd());
                zzfdl2.zzE(zzbwd.zza);
                Context context2 = this.zza;
                zzfdn zzG2 = zzfdl2.zzG();
                zzfit zzb22 = zzfis.zzb(context2, zzfjd.zzf(zzG2), 5, zzbwd.zza);
                zzfcd zzfcd2 = new zzfcd((zzfcc) null);
                zzfcd2.zza = zzG2;
                e zzc22 = this.zze.zzc(new zzfaj(zzfcd2, (zzbvg) null), new zzfby(this), (Object) null);
                this.zzi = zzc22;
                zzfzt.zzr(zzc22, new zzfcb(this, zzemz, zzfje, zzb22, zzfcd2), this.zzb);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zzbF(zzfeo.zzd(6, (String) null, (zze) null));
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i10) {
        this.zzh.zzo().zza(i10);
    }
}
