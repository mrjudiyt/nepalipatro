package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfhy {
    private final Executor zza;
    private final zzcay zzb;

    public zzfhy(Executor executor, zzcay zzcay) {
        this.zza = executor;
        this.zzb = zzcay;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(String str) {
        this.zza.execute(new zzfhx(this, str));
    }
}
