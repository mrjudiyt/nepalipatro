package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzhx {
    private final Context zza;
    private final zzhv zzb;

    public zzhx(Context context, Handler handler, zzhw zzhw) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzhv(this, handler, zzhw);
    }
}
