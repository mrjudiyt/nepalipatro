package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcay;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzca extends zzb {
    private final zzcay zza;
    private final String zzb;

    public zzca(Context context, String str, String str2) {
        this.zza = new zzcay(zzt.zzp().zzc(context, str));
        this.zzb = str2;
    }

    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
