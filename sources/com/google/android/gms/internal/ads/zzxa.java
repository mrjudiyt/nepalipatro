package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzxa implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzxi zza;

    zzxa(zzxb zzxb, zzxi zzxi) {
        this.zza = zzxi;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.zza.zzu();
    }
}
