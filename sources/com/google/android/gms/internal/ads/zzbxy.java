package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbxy {
    private final Clock zza;
    private final zzg zzb;
    private final zzbyy zzc;

    zzbxy(Clock clock, zzg zzg, zzbyy zzbyy) {
        this.zza = clock;
        this.zzb = zzg;
        this.zzc = zzbyy;
    }

    public final void zza() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzaq)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i10, long j10) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzap)).booleanValue()) {
            if (j10 - this.zzb.zzf() < 0) {
                zze.zza("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzaq)).booleanValue()) {
                this.zzb.zzL(-1);
                this.zzb.zzM(j10);
            } else {
                this.zzb.zzL(i10);
                this.zzb.zzM(j10);
            }
            zza();
        }
    }
}
