package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbgx extends zzaum implements zzbgz {
    zzbgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void zze(zzbu zzbu, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbu);
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }
}
