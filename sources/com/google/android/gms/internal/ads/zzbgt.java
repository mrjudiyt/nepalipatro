package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbgt extends zzaum implements zzbgv {
    zzbgt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzbgi zzbgi) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgi);
        zzbh(1, zza);
    }
}
