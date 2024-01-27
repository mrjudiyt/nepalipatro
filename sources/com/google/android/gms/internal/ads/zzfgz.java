package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfgz {
    final /* synthetic */ zzfhj zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfgz(zzfhj zzfhj, Object obj, List list, zzfgy zzfgy) {
        this.zza = zzfhj;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfhi zza(Callable callable) {
        zzfzs zzb2 = zzfzt.zzb(this.zzc);
        e zza2 = zzb2.zza(zzfgx.zza, zzcbg.zzf);
        e zza3 = zzb2.zza(callable, this.zza.zzb);
        return new zzfhi(this.zza, this.zzb, (String) null, zza2, this.zzc, zza3, (zzfhh) null);
    }
}
