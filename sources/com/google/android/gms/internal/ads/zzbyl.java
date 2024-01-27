package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbyl implements Callable {
    public final /* synthetic */ zzbyy zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbyl(zzbyy zzbyy, Context context) {
        this.zza = zzbyy;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb);
    }
}
