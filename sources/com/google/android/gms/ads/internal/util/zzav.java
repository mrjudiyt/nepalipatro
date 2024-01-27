package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzav extends zzcz {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    zzav(zzay zzay, Context context) {
        this.zzb = zzay;
        this.zza = context;
    }

    public final void zze(zze zze) {
        if (zze != null) {
            this.zzb.zzi(this.zza, zze.zzb, true, true);
        }
    }
}
