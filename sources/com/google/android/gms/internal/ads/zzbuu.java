package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbuu extends zzaum implements zzbuw {
    zzbuu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    public final void zze(zzbuo zzbuo, zzbuz zzbuz) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbuo);
        zzauo.zzf(zza, zzbuz);
        zzbh(3, zza);
    }

    public final void zzf(zzbuk zzbuk, zzbuz zzbuz) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbuk);
        zzauo.zzf(zza, zzbuz);
        zzbh(1, zza);
    }
}
