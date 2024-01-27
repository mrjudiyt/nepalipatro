package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzalw implements Runnable {
    private final zzamg zza;
    private final zzamm zzb;
    private final Runnable zzc;

    public zzalw(zzamg zzamg, zzamm zzamm, Runnable runnable) {
        this.zza = zzamg;
        this.zzb = zzamm;
        this.zzc = runnable;
    }

    public final void run() {
        this.zza.zzw();
        zzamm zzamm = this.zzb;
        if (zzamm.zzc()) {
            this.zza.zzo(zzamm.zza);
        } else {
            this.zza.zzn(zzamm.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
