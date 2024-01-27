package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbf extends zzaum implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void zzc() {
        zzbh(6, zza());
    }

    public final void zzd() {
        zzbh(1, zza());
    }

    public final void zze(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(2, zza);
    }

    public final void zzf(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(8, zza);
    }

    public final void zzg() {
        zzbh(7, zza());
    }

    public final void zzh() {
        zzbh(3, zza());
    }

    public final void zzi() {
        zzbh(4, zza());
    }

    public final void zzj() {
        zzbh(5, zza());
    }

    public final void zzk() {
        zzbh(9, zza());
    }
}
