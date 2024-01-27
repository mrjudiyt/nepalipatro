package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzly implements zzkt {
    private final zzdy zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzcg zze = zzcg.zza;

    public zzly(zzdy zzdy) {
        this.zza = zzdy;
    }

    public final long zza() {
        long j10;
        long j11 = this.zzc;
        if (!this.zzb) {
            return j11;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzcg zzcg = this.zze;
        if (zzcg.zzc == 1.0f) {
            j10 = zzfk.zzq(elapsedRealtime);
        } else {
            j10 = zzcg.zza(elapsedRealtime);
        }
        return j11 + j10;
    }

    public final void zzb(long j10) {
        this.zzc = j10;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    public final zzcg zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (!this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
            this.zzb = true;
        }
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    public final void zzg(zzcg zzcg) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzcg;
    }
}
