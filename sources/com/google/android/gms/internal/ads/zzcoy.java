package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcoy implements zzcxo {
    private final zzfcv zza;
    private final zzfde zzb;
    private final zzfjt zzc;
    private final zzfjx zzd;

    public zzcoy(zzfde zzfde, zzfjx zzfjx, zzfjt zzfjt) {
        this.zzb = zzfde;
        this.zzd = zzfjx;
        this.zzc = zzfjt;
        this.zza = zzfde.zzb.zzb;
    }

    public final void zzbF(zze zze) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, (zzfcr) null, list));
    }
}
