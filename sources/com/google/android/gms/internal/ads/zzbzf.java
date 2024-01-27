package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbzf extends zzaum implements zzbzh {
    zzbzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(2, zza);
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzauo.zzd(zza, bundle);
        zzbh(3, zza);
    }
}
