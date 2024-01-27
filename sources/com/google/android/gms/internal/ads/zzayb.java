package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzayb {
    zzaur zza;
    boolean zzb;
    /* access modifiers changed from: private */
    public final ExecutorService zzc;

    public zzayb() {
        this.zzc = zzcai.zzb;
    }

    public zzayb(Context context) {
        ExecutorService executorService = zzcai.zzb;
        this.zzc = executorService;
        executorService.execute(new zzaxw(this, context));
    }
}
