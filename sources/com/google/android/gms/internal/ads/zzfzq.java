package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfzq implements Runnable {
    final Future zza;
    final zzfzp zzb;

    zzfzq(Future future, zzfzp zzfzp) {
        this.zza = future;
        this.zzb = zzfzp;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzgav) || (zza2 = zzgaw.zza((zzgav) future)) == null) {
            try {
                this.zzb.zzb(zzfzt.zzp(this.zza));
            } catch (ExecutionException e10) {
                this.zzb.zza(e10.getCause());
            } catch (Error | RuntimeException e11) {
                this.zzb.zza(e11);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfsp zza2 = zzfsq.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
