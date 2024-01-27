package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzey extends zzas {
    zzey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zze() {
        zzl(2, zza());
    }

    public final void zzf(Map map, long j10, String str, List<zzcp> list) {
        Parcel zza = zza();
        zza.writeMap(map);
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeTypedList(list);
        zzl(1, zza);
    }
}
