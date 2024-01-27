package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbzt {
    public final e zza(Context context, int i10) {
        zzcbl zzcbl = new zzcbl();
        zzay.zzb();
        if (zzcam.zzt(context)) {
            zzcbg.zza.execute(new zzbzs(this, context, zzcbl));
        }
        return zzcbl;
    }
}
