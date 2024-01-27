package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbzi extends zzaum implements zzbzk {
    zzbzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzbzo zzbzo, zzbzh zzbzh) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzbzo);
        zzauo.zzf(zza, zzbzh);
        zzbh(1, zza);
    }

    public final void zzf(zzbtt zzbtt) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbtt);
        zzbh(7, zza);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtk);
        zzbh(10, zza);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtk);
        zzbh(9, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtk);
        zzbh(6, zza);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtk zzbtk) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzbtk);
        zzbh(5, zza);
    }
}
