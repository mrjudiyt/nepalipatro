package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbhq extends zzbgr {
    final /* synthetic */ zzbht zza;

    /* synthetic */ zzbhq(zzbht zzbht, zzbhp zzbhp) {
        this.zza = zzbht;
    }

    public final void zze(zzbgi zzbgi, String str) {
        zzbht zzbht = this.zza;
        if (zzbht.zzb != null) {
            zzbht.zzb.onCustomClick(zzbht.zzf(zzbgi), str);
        }
    }
}
