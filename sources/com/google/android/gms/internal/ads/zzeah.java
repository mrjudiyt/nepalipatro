package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeah implements Callable {
    public final /* synthetic */ e zza;
    public final /* synthetic */ e zzb;

    public /* synthetic */ zzeah(e eVar, e eVar2) {
        this.zza = eVar;
        this.zzb = eVar2;
    }

    public final Object call() {
        e eVar = this.zzb;
        return new zzeau((zzebi) this.zza.get(), ((zzeas) eVar.get()).zzb, ((zzeas) eVar.get()).zza);
    }
}
