package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcb {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzcb(long j10) {
        this.zza = j10;
    }

    public final void zza(long j10) {
        synchronized (this.zzc) {
            this.zza = j10;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            long elapsedRealtime = zzt.zzB().elapsedRealtime();
            if (this.zzb + this.zza > elapsedRealtime) {
                return false;
            }
            this.zzb = elapsedRealtime;
            return true;
        }
    }
}
