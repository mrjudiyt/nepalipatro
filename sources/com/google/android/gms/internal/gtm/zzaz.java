package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzaz extends zzj<zzaz> {
    private final Map<String, Object> zza = new HashMap();

    public final String toString() {
        return zzj.zza(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        zzaz zzaz = (zzaz) zzj;
        Preconditions.checkNotNull(zzaz);
        zzaz.zza.putAll(this.zza);
    }

    public final Map<String, Object> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
