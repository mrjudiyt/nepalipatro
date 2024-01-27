package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfdt implements zzbjj {
    public final /* synthetic */ zzdfd zza;
    public final /* synthetic */ zzcou zzb;
    public final /* synthetic */ zzfjx zzc;
    public final /* synthetic */ zzedo zzd;

    public /* synthetic */ zzfdt(zzdfd zzdfd, zzcou zzcou, zzfjx zzfjx, zzedo zzedo) {
        this.zza = zzdfd;
        this.zzb = zzcou;
        this.zzc = zzfjx;
        this.zzd = zzedo;
    }

    public final void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        zzbji.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzcat.zzj("URL missing from click GMSG.");
            return;
        }
        zzedo zzedo = this.zzd;
        zzfjx zzfjx = this.zzc;
        zzfzt.zzr(zzbji.zza(zzcgb, str), new zzfdv(zzcgb, this.zzb, zzfjx, zzedo), zzcbg.zza);
    }
}
