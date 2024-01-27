package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbik implements zzbjj {
    public static final /* synthetic */ zzbik zza = new zzbik();

    private /* synthetic */ zzbik() {
    }

    public final void zza(Object obj, Map map) {
        zzchj zzchj = (zzchj) obj;
        zzbjj zzbjj = zzbji.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzaro zzI = zzchj.zzI();
            if (zzI != null) {
                zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzcat.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}
