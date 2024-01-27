package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgar extends zzgac {
    final /* synthetic */ zzgas zza;
    private final Callable zzb;

    zzgar(zzgas zzgas, Callable callable) {
        this.zza = zzgas;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() {
        return this.zzb.call();
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
    public final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
