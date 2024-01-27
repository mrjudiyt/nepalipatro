package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbjq implements zzfzp {
    final /* synthetic */ zza zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbju zzd;

    zzbjq(zzbju zzbju, zza zza2, Map map, String str) {
        this.zzd = zzbju;
        this.zza = zza2;
        this.zzb = map;
        this.zzc = str;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "OpenGmsgHandler.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zza zza2 = this.zza;
        Map map = this.zzb;
        String str = this.zzc;
        this.zzd.zzh((String) obj, zza2, map, str);
    }
}
