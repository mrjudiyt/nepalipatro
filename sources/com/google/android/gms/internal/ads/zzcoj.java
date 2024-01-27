package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcoj implements zzcnl {
    private final zzdvm zza;

    zzcoj(zzdvm zzdvm) {
        this.zza = zzdvm;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzn(str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE));
        }
    }
}
