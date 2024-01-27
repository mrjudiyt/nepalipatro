package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbuq extends zzaum implements zzbus {
    zzbuq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbvg zzbvg, zzbvc zzbvc) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbvg);
        zzauo.zzf(zza, zzbvc);
        zzbh(6, zza);
    }

    public final void zzf(zzbvg zzbvg, zzbvc zzbvc) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbvg);
        zzauo.zzf(zza, zzbvc);
        zzbh(5, zza);
    }

    public final void zzg(zzbvg zzbvg, zzbvc zzbvc) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbvg);
        zzauo.zzf(zza, zzbvc);
        zzbh(4, zza);
    }

    public final void zzh(String str, zzbvc zzbvc) {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, zzbvc);
        zzbh(7, zza);
    }
}
