package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfdu implements zzbjj {
    public final /* synthetic */ zzfjx zza;
    public final /* synthetic */ zzedo zzb;

    public /* synthetic */ zzfdu(zzfjx zzfjx, zzedo zzedo) {
        this.zza = zzfjx;
        this.zzb = zzedo;
    }

    public final void zza(Object obj, Map map) {
        zzcfs zzcfs = (zzcfs) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zzcat.zzj("URL missing from httpTrack GMSG.");
        } else if (!zzcfs.zzD().zzak) {
            this.zza.zzc(str, (zzfje) null);
        } else {
            this.zzb.zzd(new zzedq(zzt.zzB().currentTimeMillis(), ((zzcgy) zzcfs).zzP().zzb, str, 2));
        }
    }
}
