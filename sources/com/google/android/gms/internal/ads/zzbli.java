package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbli extends zzaum implements zzblk {
    zzbli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(3, zza);
    }

    public final void zzf() {
        zzbh(2, zza());
    }
}
