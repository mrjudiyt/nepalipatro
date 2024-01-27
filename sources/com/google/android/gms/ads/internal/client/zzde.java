package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzde extends zzaum implements zzdg {
    zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void zze(zzs zzs) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzs);
        zzbh(1, zza);
    }

    public final boolean zzf() {
        Parcel zzbg = zzbg(2, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
