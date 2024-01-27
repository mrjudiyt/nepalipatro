package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcty implements Callable {
    public final /* synthetic */ zzcue zza;
    public final /* synthetic */ e zzb;
    public final /* synthetic */ e zzc;
    public final /* synthetic */ e zzd;

    public /* synthetic */ zzcty(zzcue zzcue, e eVar, e eVar2, e eVar3) {
        this.zza = zzcue;
        this.zzb = eVar;
        this.zzc = eVar2;
        this.zzd = eVar3;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}
