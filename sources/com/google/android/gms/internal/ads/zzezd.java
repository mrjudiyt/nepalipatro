package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzezd implements zzena {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzchw zzc;
    /* access modifiers changed from: private */
    public final zzemk zzd;
    /* access modifiers changed from: private */
    public final zzemo zze;
    /* access modifiers changed from: private */
    public final ViewGroup zzf;
    private zzbdg zzg;
    /* access modifiers changed from: private */
    public final zzdaa zzh;
    /* access modifiers changed from: private */
    public final zzfjh zzi;
    /* access modifiers changed from: private */
    public final zzdch zzj;
    private final zzfdl zzk;
    /* access modifiers changed from: private */
    public e zzl;

    public zzezd(Context context, Executor executor, zzq zzq, zzchw zzchw, zzemk zzemk, zzemo zzemo, zzfdl zzfdl, zzdch zzdch) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchw;
        this.zzd = zzemk;
        this.zze = zzemo;
        this.zzk = zzfdl;
        this.zzh = zzchw.zzf();
        this.zzi = zzchw.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdch;
        zzfdl.zzr(zzq);
    }

    public final boolean zza() {
        e eVar = this.zzl;
        return eVar != null && !eVar.isDone();
    }

    public final boolean zzb(zzl zzl2, String str, zzemy zzemy, zzemz zzemz) {
        zzcrs zzcrs;
        zzfje zzfje;
        if (str == null) {
            zzcat.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzeyz(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue() && zzl2.zzf) {
                this.zzc.zzk().zzn(true);
            }
            zzfdl zzfdl = this.zzk;
            zzfdl.zzs(str);
            zzfdl.zzE(zzl2);
            Context context = this.zza;
            zzfdn zzG = zzfdl.zzG();
            zzfit zzb2 = zzfis.zzb(context, zzfjd.zzf(zzG), 3, zzl2);
            if (!((Boolean) zzbeh.zze.zze()).booleanValue() || !this.zzk.zzg().zzk) {
                if (((Boolean) zzba.zzc().zzb(zzbci.zzhU)).booleanValue()) {
                    zzcrr zze2 = this.zzc.zze();
                    zzcwt zzcwt = new zzcwt();
                    zzcwt.zze(this.zza);
                    zzcwt.zzi(zzG);
                    zze2.zzi(zzcwt.zzj());
                    zzdda zzdda = new zzdda();
                    zzdda.zzj(this.zzd, this.zzb);
                    zzdda.zzk(this.zzd, this.zzb);
                    zze2.zzf(zzdda.zzn());
                    zze2.zze(new zzekt(this.zzg));
                    zze2.zzd(new zzdho(zzdju.zza, (zzbh) null));
                    zze2.zzg(new zzcsp(this.zzh, this.zzj));
                    zze2.zzc(new zzcqs(this.zzf));
                    zzcrs = zze2.zzk();
                } else {
                    zzcrr zze3 = this.zzc.zze();
                    zzcwt zzcwt2 = new zzcwt();
                    zzcwt2.zze(this.zza);
                    zzcwt2.zzi(zzG);
                    zze3.zzi(zzcwt2.zzj());
                    zzdda zzdda2 = new zzdda();
                    zzdda2.zzj(this.zzd, this.zzb);
                    zzdda2.zza(this.zzd, this.zzb);
                    zzdda2.zza(this.zze, this.zzb);
                    zzdda2.zzl(this.zzd, this.zzb);
                    zzdda2.zzd(this.zzd, this.zzb);
                    zzdda2.zze(this.zzd, this.zzb);
                    zzdda2.zzf(this.zzd, this.zzb);
                    zzdda2.zzb(this.zzd, this.zzb);
                    zzdda2.zzk(this.zzd, this.zzb);
                    zzdda2.zzi(this.zzd, this.zzb);
                    zze3.zzf(zzdda2.zzn());
                    zze3.zze(new zzekt(this.zzg));
                    zze3.zzd(new zzdho(zzdju.zza, (zzbh) null));
                    zze3.zzg(new zzcsp(this.zzh, this.zzj));
                    zze3.zzc(new zzcqs(this.zzf));
                    zzcrs = zze3.zzk();
                }
                zzcrs zzcrs2 = zzcrs;
                if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
                    zzfje zzj2 = zzcrs2.zzj();
                    zzj2.zzh(3);
                    zzj2.zzb(zzl2.zzp);
                    zzfje = zzj2;
                } else {
                    zzfje = null;
                }
                zzcue zzd2 = zzcrs2.zzd();
                e zzi2 = zzd2.zzi(zzd2.zzj());
                this.zzl = zzi2;
                zzfzt.zzr(zzi2, new zzezc(this, zzemz, zzfje, zzb2, zzcrs2), this.zzb);
                return true;
            }
            zzemk zzemk = this.zzd;
            if (zzemk != null) {
                zzemk.zzbF(zzfeo.zzd(7, (String) null, (zze) null));
            }
            return false;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfdl zzi() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zzbF(zzfeo.zzd(6, (String) null, (zze) null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(zzbe zzbe) {
        this.zze.zza(zzbe);
    }

    public final void zzp(zzdab zzdab) {
        this.zzh.zzo(zzdab, this.zzb);
    }

    public final void zzq(zzbdg zzbdg) {
        this.zzg = zzbdg;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzV(view, view.getContext());
    }
}
