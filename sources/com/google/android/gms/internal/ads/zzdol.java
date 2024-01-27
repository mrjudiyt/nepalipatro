package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdol extends zzdnv implements zzdfd {
    private zzdfd zza;

    public final synchronized void zzbK() {
        zzdfd zzdfd = this.zza;
        if (zzdfd != null) {
            zzdfd.zzbK();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzi(zza zza2, zzbhz zzbhz, zzo zzo, zzbib zzbib, zzz zzz, zzdfd zzdfd) {
        super.zzh(zza2, zzbhz, zzo, zzbib, zzz);
        this.zza = zzdfd;
    }

    public final synchronized void zzs() {
        zzdfd zzdfd = this.zza;
        if (zzdfd != null) {
            zzdfd.zzs();
        }
    }
}
