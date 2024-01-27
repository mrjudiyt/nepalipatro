package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbcr {
    public static final void zza(zzbcq zzbcq, zzbco zzbco) {
        if (zzbco.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzbco.zzb())) {
            zzbcq.zzd(zzbco.zza(), zzbco.zzb(), zzbco.zzc(), zzbco.zzd());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
