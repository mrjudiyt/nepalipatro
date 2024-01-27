package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcj extends zzaum implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbox getAdapterCreator() {
        Parcel zzbg = zzbg(2, zza());
        zzbox zzf = zzbow.zzf(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzf;
    }

    public final zzen getLiteSdkVersion() {
        Parcel zzbg = zzbg(1, zza());
        zzen zzen = (zzen) zzauo.zza(zzbg, zzen.CREATOR);
        zzbg.recycle();
        return zzen;
    }
}
