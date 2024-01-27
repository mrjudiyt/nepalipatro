package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbde extends zzaum implements zzbdg {
    zzbde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbdd zzbdd) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbdd);
        zzbh(1, zza);
    }
}
