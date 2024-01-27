package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzewn implements zzetw {
    final zzgad zza;
    final List zzb;
    final zzbbt zzc;

    public zzewn(zzbbt zzbbt, zzgad zzgad, List list) {
        this.zzc = zzbbt;
        this.zza = zzgad;
        this.zzb = list;
    }

    public final int zza() {
        return 48;
    }

    public final e zzb() {
        return this.zza.zzb(new zzewm(this));
    }
}
