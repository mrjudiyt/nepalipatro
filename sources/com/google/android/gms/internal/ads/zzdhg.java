package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.a;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdhg implements zzcyz, zzo, zzcyf {
    zzfkc zza;
    private final Context zzb;
    private final zzcgb zzc;
    private final zzfcr zzd;
    private final zzcaz zze;
    private final zzayf zzf;

    public zzdhg(Context context, zzcgb zzcgb, zzfcr zzfcr, zzcaz zzcaz, zzayf zzayf) {
        this.zzb = context;
        this.zzc = zzcgb;
        this.zzd = zzfcr;
        this.zze = zzcaz;
        this.zzf = zzayf;
    }

    public final void zzbL() {
    }

    public final void zzbo() {
    }

    public final void zzbu() {
    }

    public final void zzbv() {
        if (this.zza != null && this.zzc != null) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzeX)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new a());
            }
        }
    }

    public final void zzbx() {
    }

    public final void zzby(int i10) {
        this.zza = null;
    }

    public final void zzq() {
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzeX)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new a());
            }
        }
    }

    public final void zzr() {
        zzeeo zzeeo;
        zzeep zzeep;
        zzeep zzeep2;
        zzayf zzayf = this.zzf;
        if ((zzayf == zzayf.REWARD_BASED_VIDEO_AD || zzayf == zzayf.INTERSTITIAL || zzayf == zzayf.APP_OPEN) && this.zzd.zzV && this.zzc != null) {
            if (zzt.zzA().zzj(this.zzb)) {
                zzcaz zzcaz = this.zze;
                String str = zzcaz.zzb + "." + zzcaz.zzc;
                zzfdq zzfdq = this.zzd.zzX;
                String zza2 = zzfdq.zza();
                if (zzfdq.zzb() == 1) {
                    zzeeo = zzeeo.zzc;
                    zzeep = zzeep.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzaa == 2) {
                        zzeep2 = zzeep.UNSPECIFIED;
                    } else {
                        zzeep2 = zzeep.BEGIN_TO_RENDER;
                    }
                    zzeep = zzeep2;
                    zzeeo = zzeeo.HTML_DISPLAY;
                }
                zzfkc zza3 = zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza2, zzeep, zzeeo, this.zzd.zzan);
                this.zza = zza3;
                if (zza3 != null) {
                    zzt.zzA().zzh(this.zza, (View) this.zzc);
                    this.zzc.zzap(this.zza);
                    zzt.zzA().zzi(this.zza);
                    this.zzc.zzd("onSdkLoaded", new a());
                }
            }
        }
    }
}
