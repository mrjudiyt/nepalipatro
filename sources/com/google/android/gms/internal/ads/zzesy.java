package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzesy implements zzetv {
    private final String zza;
    private final Bundle zzb;

    public zzesy(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (!this.zzb.isEmpty()) {
            bundle.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}
