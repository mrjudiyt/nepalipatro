package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzewi implements Callable {
    public final /* synthetic */ e zza;
    public final /* synthetic */ e zzb;

    public /* synthetic */ zzewi(e eVar, e eVar2) {
        this.zza = eVar;
        this.zzb = eVar2;
    }

    public final Object call() {
        return new zzewk((String) this.zza.get(), (String) this.zzb.get());
    }
}
