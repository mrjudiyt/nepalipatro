package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbkf extends zzaum implements zzbkh {
    zzbkf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(1, zza);
    }
}
