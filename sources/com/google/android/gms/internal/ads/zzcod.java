package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcod implements zzcnl {
    private final zzfcq zza;

    public zzcod(zzfcq zzfcq) {
        this.zza = zzfcq;
    }

    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(str));
            } catch (Exception e10) {
                throw new IllegalStateException("Invalid render_in_browser state", e10);
            }
        }
    }
}
