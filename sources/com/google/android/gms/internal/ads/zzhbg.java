package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbg extends zzhay {
    private static final zzhbp zza = zzhbd.zza(Collections.emptyMap());

    /* synthetic */ zzhbg(Map map, zzhbe zzhbe) {
        super(map);
    }

    public static zzhbf zzc(int i10) {
        return new zzhbf(i10, (zzhbe) null);
    }

    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzhaz.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhbp) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
