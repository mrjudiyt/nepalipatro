package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbci;

@TargetApi(30)
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzz extends zzy {
    public final int zzn(Context context) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzim)).booleanValue()) {
            return 0;
        }
        return super.zzn(context);
    }
}
