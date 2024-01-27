package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfoc extends zzaum {
    zzfoc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfoa zze(zzfny zzfny) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfny);
        Parcel zzbg = zzbg(1, zza);
        zzfoa zzfoa = (zzfoa) zzauo.zza(zzbg, zzfoa.CREATOR);
        zzbg.recycle();
        return zzfoa;
    }

    public final zzfoj zzf(zzfoh zzfoh) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfoh);
        Parcel zzbg = zzbg(3, zza);
        zzfoj zzfoj = (zzfoj) zzauo.zza(zzbg, zzfoj.CREATOR);
        zzbg.recycle();
        return zzfoj;
    }

    public final void zzg(zzfnv zzfnv) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzfnv);
        zzbh(2, zza);
    }
}
