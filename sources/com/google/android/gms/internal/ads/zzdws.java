package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdws implements Callable {
    public final /* synthetic */ zzaro zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdws(zzaro zzaro, Context context) {
        this.zza = zzaro;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzc().zzg(this.zzb);
    }
}
