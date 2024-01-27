package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgo implements zzgh {
    private final Context zza;
    private final zzgh zzb;

    public zzgo(Context context) {
        zzgq zzgq = new zzgq();
        this.zza = context.getApplicationContext();
        this.zzb = zzgq;
    }

    public final /* bridge */ /* synthetic */ zzgi zza() {
        return new zzgp(this.zza, ((zzgq) this.zzb).zza());
    }
}
