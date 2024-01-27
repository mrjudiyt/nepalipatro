package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfot extends zzaum implements zzfov {
    zzfot(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    public final void zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString((String) null);
        zzbh(8, zza);
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
        zza.writeInt(i10);
        zzbh(6, zza);
    }

    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbh(5, zza);
    }
}
