package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcy extends zzaum implements zzda {
    zzcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    public final void zze(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(1, zza);
    }
}
