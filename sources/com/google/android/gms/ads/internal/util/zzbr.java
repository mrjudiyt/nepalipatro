package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbr extends zzaum implements zzbt {
    zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzbg = zzbg(1, zza);
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
