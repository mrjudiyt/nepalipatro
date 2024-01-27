package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzalr implements Runnable {
    final /* synthetic */ zzamg zza;
    final /* synthetic */ zzals zzb;

    zzalr(zzals zzals, zzamg zzamg) {
        this.zzb = zzals;
        this.zza = zzamg;
    }

    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
