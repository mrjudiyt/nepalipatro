package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbox;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbv extends zzaum {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbox zzbox, int i10, int i11) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzd(zza, zzq);
        zza.writeString(str);
        zzauo.zzf(zza, zzbox);
        zza.writeInt(233702000);
        zza.writeInt(i11);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        zzbg.recycle();
        return readStrongBinder;
    }
}
