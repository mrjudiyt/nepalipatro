package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzcx extends zzbs {
    @VisibleForTesting
    zzcx(zzbv zzbv) {
        super(zzbv);
    }

    public final zzba zza() {
        zzW();
        return zzq().zzd();
    }

    public final String zzb() {
        zzW();
        zzba zza = zza();
        int i10 = zza.zza;
        int i11 = zza.zzb;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i10);
        sb.append("x");
        sb.append(i11);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void zzd() {
    }
}
