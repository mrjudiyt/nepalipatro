package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfnb {
    private final Context zza;
    private final Looper zzb;

    public zzfnb(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfnp zza2 = zzfnr.zza();
        zza2.zza(this.zza.getPackageName());
        zza2.zzc(2);
        zzfnm zza3 = zzfnn.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzfnc(this.zza, this.zzb, (zzfnr) zza2.zzal()).zza();
    }
}
