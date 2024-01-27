package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwf extends zzaum implements zzbwh {
    zzbwf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    public final void zzg(IObjectWrapper iObjectWrapper, int i10) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzbh(9, zza);
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(4, zza);
    }

    public final void zzk(IObjectWrapper iObjectWrapper, int i10) {
        throw null;
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwi) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzbwi);
        zzbh(7, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(11, zza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }
}
