package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzewc implements zzetw {
    final zzgad zza;
    final Context zzb;
    final zzaxk zzc;

    public zzewc(zzaxk zzaxk, zzgad zzgad, Context context) {
        this.zzc = zzaxk;
        this.zza = zzgad;
        this.zzb = context;
    }

    public final int zza() {
        return 45;
    }

    public final e zzb() {
        return this.zza.zzb(new zzewb(this));
    }
}
