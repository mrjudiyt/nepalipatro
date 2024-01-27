package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.a;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeni implements zzetw {
    private final Context zza;

    zzeni(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final e zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzcG)).booleanValue()) {
            return zzfzt.zzh((Object) null);
        }
        return zzfzt.zzh(new zzenj(a.a(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
