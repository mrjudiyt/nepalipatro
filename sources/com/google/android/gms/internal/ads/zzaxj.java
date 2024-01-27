package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaxj extends zzaum {
    zzaxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzaxh zzaxh) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzaxh);
        Parcel zzbg = zzbg(3, zza);
        long readLong = zzbg.readLong();
        zzbg.recycle();
        return readLong;
    }

    public final zzaxe zzf(zzaxh zzaxh) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzaxh);
        Parcel zzbg = zzbg(1, zza);
        zzaxe zzaxe = (zzaxe) zzauo.zza(zzbg, zzaxe.CREATOR);
        zzbg.recycle();
        return zzaxe;
    }

    public final zzaxe zzg(zzaxh zzaxh) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzaxh);
        Parcel zzbg = zzbg(2, zza);
        zzaxe zzaxe = (zzaxe) zzauo.zza(zzbg, zzaxe.CREATOR);
        zzbg.recycle();
        return zzaxe;
    }
}
