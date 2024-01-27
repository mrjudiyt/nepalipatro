package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcuy implements zza {
    private final zzcvc zza;
    private final zzfdn zzb;

    zzcuy(zzcvc zzcvc, zzfdn zzfdn) {
        this.zza = zzcvc;
        this.zzb = zzfdn;
    }

    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
