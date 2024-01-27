package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfyn extends zzfyp {
    zzfyn(e eVar, zzfza zzfza) {
        super(eVar, zzfza);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzfza zzfza = (zzfza) obj;
        e zza = zzfza.zza(obj2);
        zzfsw.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfza);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Object obj) {
        zzs((e) obj);
    }
}
