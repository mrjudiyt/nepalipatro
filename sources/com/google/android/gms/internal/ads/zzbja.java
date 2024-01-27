package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbja implements zzbjj {
    zzbja() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        if (zzcgb.zzJ() != null) {
            zzcgb.zzJ().zza();
        }
        zzl zzL = zzcgb.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        zzl zzM = zzcgb.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzcat.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
