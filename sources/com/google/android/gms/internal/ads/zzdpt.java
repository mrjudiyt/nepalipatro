package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdpt {
    private final zzcgn zza;
    private final Context zzb;
    private final zzaro zzc;
    private final zzbdk zzd;
    private final zzcaz zze;
    private final zza zzf;
    private final zzaxv zzg;
    /* access modifiers changed from: private */
    public final zzdaa zzh;
    private final zzedz zzi;

    public zzdpt(zzcgn zzcgn, Context context, zzaro zzaro, zzbdk zzbdk, zzcaz zzcaz, zza zza2, zzaxv zzaxv, zzdaa zzdaa, zzedz zzedz) {
        this.zza = zzcgn;
        this.zzb = context;
        this.zzc = zzaro;
        this.zzd = zzbdk;
        this.zze = zzcaz;
        this.zzf = zza2;
        this.zzg = zzaxv;
        this.zzh = zzdaa;
        this.zzi = zzedz;
    }

    public final zzcgb zza(zzq zzq, zzfcr zzfcr, zzfcv zzfcv) {
        zzchq zzc2 = zzchq.zzc(zzq);
        String str = zzq.zza;
        zzdpi zzdpi = new zzdpi(this);
        zzedz zzedz = this.zzi;
        zza zza2 = this.zzf;
        zzaxv zzaxv = this.zzg;
        return zzcgn.zza(this.zzb, zzc2, str, false, false, this.zzc, this.zzd, this.zze, (zzbda) null, zzdpi, zza2, zzaxv, zzfcr, zzfcv, zzedz);
    }
}
