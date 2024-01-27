package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcwo implements Callable {
    public final /* synthetic */ zzcwp zza;
    public final /* synthetic */ e zzb;

    public /* synthetic */ zzcwo(zzcwp zzcwp, e eVar) {
        this.zza = zzcwp;
        this.zzb = eVar;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
