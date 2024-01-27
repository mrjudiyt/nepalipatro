package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbix implements zzfzp {
    final /* synthetic */ zzcgb zza;

    zzbix(zzcgb zzcgb) {
        this.zza = zzcgb;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcgb zzcgb = this.zza;
        new zzca(zzcgb.getContext(), zzcgb.zzn().zza, (String) obj).zzb();
    }
}
