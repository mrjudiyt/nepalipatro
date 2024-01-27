package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbvx extends zzaum {
    zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvw zzbvw, String str, String str2) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbvw);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
