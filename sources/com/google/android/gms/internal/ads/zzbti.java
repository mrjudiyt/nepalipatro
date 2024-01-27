package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbti extends zzaum implements zzbtk {
    zzbti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(2, zza);
    }

    public final void zzf(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbh(1, zza);
    }
}
