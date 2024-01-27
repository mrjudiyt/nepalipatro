package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdkm implements zzbjj {
    public final /* synthetic */ zzdkn zza;
    public final /* synthetic */ zzbhi zzb;

    public /* synthetic */ zzdkm(zzdkn zzdkn, zzbhi zzbhi) {
        this.zza = zzdkn;
        this.zzb = zzbhi;
    }

    public final void zza(Object obj, Map map) {
        zzdkn zzdkn = this.zza;
        try {
            zzdkn.zzb = Long.valueOf(Long.parseLong((String) map.get(Constants.TIMESTAMP)));
        } catch (NumberFormatException unused) {
            zzcat.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzbhi zzbhi = this.zzb;
        zzdkn.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbhi == null) {
            zzcat.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbhi.zzf(str);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
