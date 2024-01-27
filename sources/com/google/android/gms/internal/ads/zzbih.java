package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbih implements zzbjj {
    public final /* synthetic */ zzdfd zza;
    public final /* synthetic */ zzcou zzb;

    public /* synthetic */ zzbih(zzdfd zzdfd, zzcou zzcou) {
        this.zza = zzdfd;
        this.zzb = zzcou;
    }

    public final void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        zzbji.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzcat.zzj("URL missing from click GMSG.");
            return;
        }
        zzcou zzcou = this.zzb;
        zzfzk zzu = zzfzk.zzu(zzbji.zza(zzcgb, str));
        zzbij zzbij = new zzbij(zzcou);
        zzgad zzgad = zzcbg.zza;
        zzfzt.zzr(zzfzt.zzn(zzu, zzbij, zzgad), new zzbix(zzcgb), zzgad);
    }
}
