package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbim implements zzbjj {
    public static final /* synthetic */ zzbim zza = new zzbim();

    private /* synthetic */ zzbim() {
    }

    public final void zza(Object obj, Map map) {
        zzchc zzchc = (zzchc) obj;
        zzbjj zzbjj = zzbji.zza;
        String str = (String) map.get("u");
        if (str == null) {
            zzcat.zzj("URL missing from httpTrack GMSG.");
        } else {
            new zzca(zzchc.getContext(), ((zzchk) zzchc).zzn().zza, str).zzb();
        }
    }
}
