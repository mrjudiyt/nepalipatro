package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzevn implements zzetw {
    private final Context zza;
    private final String zzb;
    private final zzgad zzc;

    public zzevn(zzbvi zzbvi, Context context, String str, zzgad zzgad) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzgad;
    }

    public final int zza() {
        return 42;
    }

    public final e zzb() {
        return this.zzc.zzb(new zzevm(this));
    }
}
