package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzflz implements Runnable {
    zzflz() {
    }

    public final void run() {
        if (zzfmc.zzc != null) {
            zzfmc.zzc.post(zzfmc.zzd);
            zzfmc.zzc.postDelayed(zzfmc.zze, 200);
        }
    }
}
