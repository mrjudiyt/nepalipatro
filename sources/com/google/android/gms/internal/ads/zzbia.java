package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbia implements zzbjj {
    private final zzbib zza;

    public zzbia(zzbib zzbib) {
        this.zza = zzbib;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcat.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}
