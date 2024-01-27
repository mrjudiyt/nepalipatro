package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzefi implements zzdhf {
    public final /* synthetic */ zzeex zza;

    public /* synthetic */ zzefi(zzeex zzeex) {
        this.zza = zzeex;
    }

    public final void zza(boolean z10, Context context, zzcxy zzcxy) {
        zzeex zzeex = this.zza;
        try {
            ((zzfej) zzeex.zzb).zzv(z10);
            ((zzfej) zzeex.zzb).zzw(context);
        } catch (zzfds e10) {
            throw new zzdhe(e10.getCause());
        }
    }
}
