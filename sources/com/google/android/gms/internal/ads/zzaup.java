package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzaup extends zzaum implements zzaur {
    zzaup(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void zze(IObjectWrapper iObjectWrapper, String str) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzbh(2, zza);
    }

    public final void zzf() {
        zzbh(3, zza());
    }

    public final void zzg(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(7, zza);
    }

    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray((int[]) null);
        zzbh(4, zza);
    }

    public final void zzi(int i10) {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbh(6, zza);
    }

    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbh(5, zza);
    }
}
