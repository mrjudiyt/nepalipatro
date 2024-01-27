package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbi extends zzaum implements zzbk {
    zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public final void zzb(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(2, zza);
    }

    public final void zzc() {
        zzbh(1, zza());
    }
}
