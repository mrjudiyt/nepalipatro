package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdyl implements zzdyn {
    private final Map zza;
    private final zzgad zzb;
    /* access modifiers changed from: private */
    public final zzdae zzc;

    public zzdyl(Map map, zzgad zzgad, zzdae zzdae) {
        this.zza = map;
        this.zzb = zzgad;
        this.zzc = zzdae;
    }

    public final e zzb(zzbvg zzbvg) {
        this.zzc.zzbr(zzbvg);
        e zzg = zzfzt.zzg(new zzdwm(3));
        for (String trim : ((String) zzba.zzc().zzb(zzbci.zzhX)).split(",")) {
            zzhbp zzhbp = (zzhbp) this.zza.get(trim.trim());
            if (zzhbp != null) {
                zzg = zzfzt.zzf(zzg, zzdwm.class, new zzdyj(zzhbp, zzbvg), this.zzb);
            }
        }
        zzfzt.zzr(zzg, new zzdyk(this), zzcbg.zzf);
        return zzg;
    }
}
