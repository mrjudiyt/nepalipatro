package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbfj extends zzaum implements zzbfl {
    zzbfj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() {
        Parcel zzbg = zzbg(2, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final float zzf() {
        Parcel zzbg = zzbg(6, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final float zzg() {
        Parcel zzbg = zzbg(5, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final zzdq zzh() {
        Parcel zzbg = zzbg(7, zza());
        zzdq zzb = zzdp.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final IObjectWrapper zzi() {
        Parcel zzbg = zzbg(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    public final boolean zzk() {
        Parcel zzbg = zzbg(10, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final boolean zzl() {
        Parcel zzbg = zzbg(8, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }

    public final void zzm(zzbgw zzbgw) {
        throw null;
    }
}
