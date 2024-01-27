package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcpj implements zzbjj {
    final /* synthetic */ zzcpm zza;

    zzcpj(zzcpm zzcpm) {
        this.zza = zzcpm;
    }

    public final void zza(Object obj, Map map) {
        if (zzcpm.zzg(this.zza, map)) {
            this.zza.zzc.execute(new zzcpi(this));
        }
    }
}
