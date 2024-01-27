package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbjp implements zzbjj {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzb zzb;
    private final zzbrs zzc;
    private final zzbrz zzd;

    public zzbjp(zzb zzb2, zzbrs zzbrs, zzbrz zzbrz) {
        this.zzb = zzb2;
        this.zzc = zzbrs;
        this.zzd = zzbrz;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        boolean z10 = true;
        if (intValue != 5) {
            if (intValue != 7) {
                zzb zzb2 = this.zzb;
                if (!zzb2.zzc()) {
                    zzb2.zzb((String) null);
                    return;
                } else if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                } else if (intValue == 3) {
                    new zzbrv(zzcgb, map).zzb();
                    return;
                } else if (intValue == 4) {
                    new zzbrq(zzcgb, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        zzcat.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z10 = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcgb == null) {
            zzcat.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        zzcgb.zzaq(i10);
    }
}
