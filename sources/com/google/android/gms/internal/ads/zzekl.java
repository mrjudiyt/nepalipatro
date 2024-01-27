package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzekl implements zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcxj zzb;
    private final zzcyd zzc;
    private final zzdff zzd;
    private final zzdex zze;
    private final zzcpr zzf;

    zzekl(zzcxj zzcxj, zzcyd zzcyd, zzdff zzdff, zzdex zzdex, zzcpr zzcpr) {
        this.zzb = zzcxj;
        this.zzc = zzcyd;
        this.zzd = zzdff;
        this.zze = zzdex;
        this.zzf = zzcpr;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzq();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
