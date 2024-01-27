package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbll extends zzaum implements zzbln {
    zzbll(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public final void zzb(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbh(1, zza);
    }
}
