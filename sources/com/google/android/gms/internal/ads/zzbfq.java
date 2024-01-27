package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbfq extends zzaum implements zzbfs {
    zzbfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final IObjectWrapper zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final void zzbA(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    public final void zzbB(zzbfl zzbfl) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbfl);
        zzbh(8, zza);
    }

    public final void zzbC(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(9, zza);
    }

    public final void zzbD(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    public final void zzbz(String str, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    public final void zzc() {
        zzbh(4, zza());
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(7, zza);
    }

    public final void zze(IObjectWrapper iObjectWrapper, int i10) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeInt(i10);
        zzbh(5, zza);
    }
}
