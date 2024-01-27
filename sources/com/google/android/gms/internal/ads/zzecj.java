package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzecj implements zzcyz, zzcxo {
    private static final Object zza = new Object();
    private static int zzb;
    private final zzg zzc;
    private final zzect zzd;

    public zzecj(zzect zzect, zzg zzg) {
        this.zzd = zzect;
        this.zzc = zzg;
    }

    private final void zzb(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgf)).booleanValue() && !this.zzc.zzQ()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                intValue = ((Integer) zzba.zzc().zzb(zzbci.zzgg)).intValue();
            }
            if (i10 < intValue) {
                this.zzd.zzd(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    public final void zzbF(zze zze) {
        zzb(false);
    }

    public final void zzr() {
        zzb(true);
    }
}
