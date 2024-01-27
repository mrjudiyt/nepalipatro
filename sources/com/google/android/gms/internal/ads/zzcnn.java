package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcnn implements zzcnl {
    private final zzg zza;

    public zzcnn(zzg zzg) {
        this.zza = zzg;
    }

    public final void zza(Map map) {
        this.zza.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
