package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzalx {
    private final Executor zza;

    public zzalx(Handler handler) {
        this.zza = new zzalv(this, handler);
    }

    public final void zza(zzamg zzamg, zzamp zzamp) {
        zzamg.zzm("post-error");
        ((zzalv) this.zza).zza.post(new zzalw(zzamg, zzamm.zza(zzamp), (Runnable) null));
    }

    public final void zzb(zzamg zzamg, zzamm zzamm, Runnable runnable) {
        zzamg.zzq();
        zzamg.zzm("post-response");
        ((zzalv) this.zza).zza.post(new zzalw(zzamg, zzamm, runnable));
    }
}
