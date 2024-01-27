package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfrp extends zzfrm {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfrm zzb;
    final /* synthetic */ zzfrw zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfrp(zzfrw zzfrw, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfrm zzfrm) {
        super(taskCompletionSource);
        this.zzc = zzfrw;
        this.zza = taskCompletionSource2;
        this.zzb = zzfrm;
    }

    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzfrw.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzfrw.zzp(this.zzc, this.zzb);
        }
    }
}
