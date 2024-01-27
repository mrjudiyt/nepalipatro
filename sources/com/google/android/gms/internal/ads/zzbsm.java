package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbsm extends zzaum implements zzbso {
    zzbsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void zze(Intent intent) {
        Parcel zza = zza();
        zzauo.zzd(zza, intent);
        zzbh(1, zza);
    }

    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(4, zza);
    }

    public final void zzh() {
        zzbh(3, zza());
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
