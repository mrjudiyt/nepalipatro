package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdox extends zzcsx {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdhf zze;
    private final zzdel zzf;
    private final zzcxy zzg;
    private final zzczf zzh;
    private final zzctr zzi;
    private final zzbwm zzj;
    private final zzfnb zzk;
    private final zzfdg zzl;
    private boolean zzm = false;

    zzdox(zzcsw zzcsw, Context context, zzcgb zzcgb, zzdhf zzdhf, zzdel zzdel, zzcxy zzcxy, zzczf zzczf, zzctr zzctr, zzfcr zzfcr, zzfnb zzfnb, zzfdg zzfdg) {
        super(zzcsw);
        this.zzc = context;
        this.zze = zzdhf;
        this.zzd = new WeakReference(zzcgb);
        this.zzf = zzdel;
        this.zzg = zzcxy;
        this.zzh = zzczf;
        this.zzi = zzctr;
        this.zzk = zzfnb;
        zzbwi zzbwi = zzfcr.zzn;
        this.zzj = new zzbxg(zzbwi != null ? zzbwi.zza : "", zzbwi != null ? zzbwi.zzb : 1);
        this.zzl = zzfdg;
    }

    public final void finalize() {
        try {
            zzcgb zzcgb = (zzcgb) this.zzd.get();
            if (((Boolean) zzba.zzc().zzb(zzbci.zzgH)).booleanValue()) {
                if (!this.zzm && zzcgb != null) {
                    zzcbg.zze.execute(new zzdow(zzcgb));
                }
            } else if (zzcgb != null) {
                zzcgb.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwm zzc() {
        return this.zzj;
    }

    public final zzfdg zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcgb zzcgb = (zzcgb) this.zzd.get();
        return zzcgb != null && !zzcgb.zzaB();
    }

    public final boolean zzh(boolean z10, Activity activity) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaA)).booleanValue()) {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzF(this.zzc)) {
                zzcat.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) zzba.zzc().zzb(zzbci.zzaB)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzcat.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfeo.zzd(10, (String) null, (zze) null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z10, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdhe e10) {
            this.zzg.zzc(e10);
            return false;
        }
    }
}
