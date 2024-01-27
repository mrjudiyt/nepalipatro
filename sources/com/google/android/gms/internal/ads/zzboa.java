package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbd;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzboa {
    static final zzbd zza = new zzbny();
    static final zzbd zzb = new zzbnz();
    private final zzbnm zzc;

    public zzboa(Context context, zzcaz zzcaz, String str, zzfjh zzfjh) {
        this.zzc = new zzbnm(context, zzcaz, str, zza, zzb, zzfjh);
    }

    public final zzbnq zza(String str, zzbnt zzbnt, zzbns zzbns) {
        return new zzboe(this.zzc, str, zzbnt, zzbns);
    }

    public final zzboj zzb() {
        return new zzboj(this.zzc);
    }
}
