package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzern implements zzetv {
    public final zzfcq zza;

    public zzern(zzfcq zzfcq) {
        this.zza = zzfcq;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        zzfcq zzfcq = this.zza;
        Bundle bundle = (Bundle) obj;
        if (zzfcq != null) {
            bundle.putBoolean("render_in_browser", zzfcq.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
