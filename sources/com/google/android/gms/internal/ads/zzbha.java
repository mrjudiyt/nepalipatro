package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbha extends zzaum implements zzbhc {
    zzbha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbhl zzbhl) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbhl);
        zzbh(1, zza);
    }
}
