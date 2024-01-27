package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzdh extends zzaum implements zzdj {
    zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzf(zza, iObjectWrapper);
        zzauo.zzf(zza, iObjectWrapper2);
        zzbh(1, zza);
    }
}
