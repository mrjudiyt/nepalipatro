package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzr;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzby extends zzcw {
    final /* synthetic */ zzcc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzby(zzcc zzcc, zzbv zzbv) {
        super(zzbv);
        this.zza = zzcc;
    }

    public final void zza() {
        zzcc zzcc = this.zza;
        zzr.zzh();
        if (zzcc.zzg()) {
            zzcc.zzO("Inactivity, disconnecting from device AnalyticsService");
            zzcc.zzc();
        }
    }
}
