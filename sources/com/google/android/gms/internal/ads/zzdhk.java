package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdhk implements zzcxl, zzdem {
    private final zzbyg zza;
    private final Context zzb;
    private final zzbyy zzc;
    private final View zzd;
    private String zze;
    private final zzayf zzf;

    public zzdhk(zzbyg zzbyg, Context context, zzbyy zzbyy, View view, zzayf zzayf) {
        this.zza = zzbyg;
        this.zzb = context;
        this.zzc = zzbyy;
        this.zzd = view;
        this.zzf = zzayf;
    }

    public final void zza() {
        this.zza.zzb(false);
    }

    public final void zzb() {
    }

    public final void zzbw(zzbvw zzbvw, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzbyy zzbyy = this.zzc;
                Context context = this.zzb;
                zzbyy.zzo(context, zzbyy.zza(context), this.zza.zza(), zzbvw.zzc(), zzbvw.zzb());
            } catch (RemoteException e10) {
                zzcat.zzk("Remote Exception to get reward item.", e10);
            }
        }
    }

    public final void zzc() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzk() {
    }

    public final void zzl() {
        if (this.zzf != zzayf.APP_OPEN) {
            String zzd2 = this.zzc.zzd(this.zzb);
            this.zze = zzd2;
            this.zze = String.valueOf(zzd2).concat(this.zzf == zzayf.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}
