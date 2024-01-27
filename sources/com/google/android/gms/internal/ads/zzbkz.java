package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbkz extends zzaum {
    zzbkz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkt zzbkt, zzbky zzbky) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbkt);
        zzauo.zzf(zza, zzbky);
        zzbi(2, zza);
    }
}
