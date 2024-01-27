package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfze extends zzfzf {
    final /* synthetic */ zzfzg zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfze(zzfzg zzfzg, Callable callable, Executor executor) {
        super(zzfzg, executor);
        this.zza = zzfzg;
        this.zzc = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
