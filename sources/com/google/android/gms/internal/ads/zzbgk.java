package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbgk extends zzaum implements zzbgm {
    zzbgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzbgd zzbgd) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgd);
        zzbh(1, zza);
    }
}
