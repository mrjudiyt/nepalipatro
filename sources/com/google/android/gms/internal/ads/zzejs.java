package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzejs implements zzdhf {
    public final /* synthetic */ zzeex zza;

    public /* synthetic */ zzejs(zzeex zzeex) {
        this.zza = zzeex;
    }

    public final void zza(boolean z10, Context context, zzcxy zzcxy) {
        zzeex zzeex = this.zza;
        try {
            ((zzfej) zzeex.zzb).zzv(z10);
            ((zzfej) zzeex.zzb).zzA();
        } catch (zzfds e10) {
            zzcat.zzk("Cannot show rewarded video.", e10);
            throw new zzdhe(e10.getCause());
        }
    }
}
