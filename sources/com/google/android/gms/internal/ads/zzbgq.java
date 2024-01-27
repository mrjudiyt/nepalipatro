package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbgq extends zzaum implements zzbgs {
    zzbgq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzbgi zzbgi, String str) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgi);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
