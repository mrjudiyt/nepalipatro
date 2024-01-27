package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbcy {
    private final Map zza = new HashMap();
    private final zzbda zzb;

    public zzbcy(zzbda zzbda) {
        this.zzb = zzbda;
    }

    public final zzbda zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbcx zzbcx) {
        this.zza.put(str, zzbcx);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbcx zzbcx = (zzbcx) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbcx != null) {
            this.zzb.zze(zzbcx, j10, strArr);
        }
        this.zza.put(str, new zzbcx(j10, (String) null, (zzbcx) null));
    }
}
