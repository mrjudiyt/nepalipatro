package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcde implements Runnable {
    private final zzccq zza;
    private boolean zzb = false;

    zzcde(zzccq zzccq) {
        this.zza = zzccq;
    }

    private final void zzc() {
        zzfps zzfps = zzt.zza;
        zzfps.removeCallbacks(this);
        zzfps.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
