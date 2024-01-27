package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbgn extends zzaum implements zzbgp {
    zzbgn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbgf zzbgf) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbgf);
        zzbh(1, zza);
    }
}
