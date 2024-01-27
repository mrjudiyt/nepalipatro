package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbsf extends zzbgr {
    final /* synthetic */ zzbsi zza;

    /* synthetic */ zzbsf(zzbsi zzbsi, zzbse zzbse) {
        this.zza = zzbsi;
    }

    public final void zze(zzbgi zzbgi, String str) {
        zzbsi zzbsi = this.zza;
        if (zzbsi.zzb != null) {
            zzbsi.zzb.onCustomClick(zzbsi.zzf(zzbgi), str);
        }
    }
}
