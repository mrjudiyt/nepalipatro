package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbpi extends zzaum {
    zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel zzbg = zzbg(7, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final Bundle zzf() {
        Parcel zzbg = zzbg(15, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final zzdq zzg() {
        Parcel zzbg = zzbg(17, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbfg zzh() {
        Parcel zzbg = zzbg(19, zza());
        zzbfg zzj = zzbff.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    public final zzbfo zzi() {
        Parcel zzbg = zzbg(5, zza());
        zzbfo zzg = zzbfn.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    public final IObjectWrapper zzj() {
        Parcel zzbg = zzbg(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk() {
        Parcel zzbg = zzbg(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzl() {
        Parcel zzbg = zzbg(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final String zzm() {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzn() {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzo() {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzp() {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzq() {
        Parcel zzbg = zzbg(8, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzr() {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(11, zza);
    }

    public final void zzt() {
        zzbh(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(12, zza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, iObjectWrapper2);
        zzauo.zzf(zza, iObjectWrapper3);
        zzbh(22, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(16, zza);
    }

    public final boolean zzx() {
        Parcel zzbg = zzbg(14, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzy() {
        Parcel zzbg = zzbg(13, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
