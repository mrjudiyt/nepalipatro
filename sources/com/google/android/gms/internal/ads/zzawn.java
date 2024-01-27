package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzawn extends zzaum implements zzawp {
    zzawn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzbu zze() {
        throw null;
    }

    public final zzdn zzf() {
        Parcel zzbg = zzbg(5, zza());
        zzdn zzb = zzdm.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final void zzg(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(6, zza);
    }

    public final void zzh(zzdg zzdg) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzdg);
        zzbh(7, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzaww zzaww) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, zzaww);
        zzbh(4, zza);
    }
}
