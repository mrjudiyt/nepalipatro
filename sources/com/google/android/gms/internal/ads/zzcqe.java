package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcqe {
    private final zzfib zza;
    private final zzdso zzb;
    private final zzfde zzc;

    public zzcqe(zzdso zzdso, zzfde zzfde, zzfib zzfib) {
        this.zza = zzfib;
        this.zzb = zzdso;
        this.zzc = zzfde;
    }

    private static String zzb(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j10, int i10) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
            zzfib zzfib = this.zza;
            zzfde zzfde = this.zzc;
            zzfia zzb2 = zzfia.zzb("ad_closed");
            zzb2.zzg(zzfde.zzb.zzb);
            zzb2.zza("show_time", String.valueOf(j10));
            zzb2.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzb2.zza("acr", zzb(i10));
            zzfib.zzb(zzb2);
            return;
        }
        zzdso zzdso = this.zzb;
        zzfde zzfde2 = this.zzc;
        zzdsn zza2 = zzdso.zza();
        zza2.zze(zzfde2.zzb.zzb);
        zza2.zzb(NativeProtocol.WEB_DIALOG_ACTION, "ad_closed");
        zza2.zzb("show_time", String.valueOf(j10));
        zza2.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zza2.zzb("acr", zzb(i10));
        zza2.zzg();
    }
}
