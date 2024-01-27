package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwa extends zzaum implements zzbwc {
    zzbwa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void zze(zzbvw zzbvw) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbvw);
        zzbh(5, zza);
    }

    public final void zzf() {
        zzbh(4, zza());
    }

    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(7, zza);
    }

    public final void zzh() {
        zzbh(6, zza());
    }

    public final void zzi() {
        zzbh(1, zza());
    }

    public final void zzj() {
        zzbh(2, zza());
    }

    public final void zzk() {
        zzbh(8, zza());
    }

    public final void zzl() {
        zzbh(3, zza());
    }
}
