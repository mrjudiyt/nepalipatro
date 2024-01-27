package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzcc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbmy implements zzbjj {
    final /* synthetic */ zzbmh zza;
    final /* synthetic */ zzcc zzb;
    final /* synthetic */ zzbnm zzc;

    zzbmy(zzbnm zzbnm, zzaro zzaro, zzbmh zzbmh, zzcc zzcc) {
        this.zzc = zzbnm;
        this.zza = zzbmh;
        this.zzb = zzcc;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbjj, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbnn zzbnn = (zzbnn) obj;
        synchronized (this.zzc.zza) {
            zzcat.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zzcat.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzaro) null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
