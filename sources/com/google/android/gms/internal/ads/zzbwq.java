package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwq extends zzaum implements zzbws {
    zzbwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() {
        zzbh(7, zza());
    }

    public final void zzf() {
        zzbh(6, zza());
    }

    public final void zzg() {
        zzbh(2, zza());
    }

    public final void zzh(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(4, zza);
    }

    public final void zzi(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(5, zza);
    }

    public final void zzj() {
        zzbh(1, zza());
    }

    public final void zzk(zzbwm zzbwm) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbwm);
        zzbh(3, zza);
    }
}
