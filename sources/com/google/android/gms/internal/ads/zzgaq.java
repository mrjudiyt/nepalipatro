package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgaq extends zzgac {
    final /* synthetic */ zzgas zza;
    private final zzfyz zzb;

    zzgaq(zzgas zzgas, zzfyz zzfyz) {
        this.zza = zzgas;
        this.zzb = zzfyz;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzfyz zzfyz = this.zzb;
        e zza2 = zzfyz.zza();
        zzfsw.zzd(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfyz);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((e) obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
