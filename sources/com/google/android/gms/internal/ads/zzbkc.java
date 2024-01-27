package com.google.android.gms.internal.ads;

import com.facebook.bolts.AppLinks;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbkc implements zzbjj {
    private final zzdvm zza;

    public zzbkc(zzdvm zzdvm) {
        Preconditions.checkNotNull(zzdvm, "The Inspector Manager must not be null");
        this.zza = zzdvm;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey(AppLinks.KEY_NAME_EXTRAS)) {
            long j10 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j10 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get(AppLinks.KEY_NAME_EXTRAS), j10);
        }
    }
}
