package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzccw {
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().zzb(zzbci.zzD)).longValue());
    private long zzb;
    private boolean zzc = true;

    zzccw() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzcch zzcch) {
        if (zzcch != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.zzc) {
                if (Math.abs(timestamp - this.zzb) < this.zza) {
                    return;
                }
            }
            this.zzc = false;
            this.zzb = timestamp;
            zzt.zza.post(new zzccv(zzcch));
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
