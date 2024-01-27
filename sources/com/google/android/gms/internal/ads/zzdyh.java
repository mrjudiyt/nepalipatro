package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdyh implements zzdag {
    private final Context zza;
    private final zzbyy zzb;

    zzdyh(Context context, zzbyy zzbyy) {
        this.zza = context;
        this.zzb = zzbyy;
    }

    public final void zzbr(zzbvg zzbvg) {
    }

    public final void zzbs(zzfde zzfde) {
        if (!TextUtils.isEmpty(zzfde.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzfde.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzfde.zzb.zzb.zzd);
        }
    }
}
