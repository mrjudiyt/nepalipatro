package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzawq extends zzaum implements zzaws {
    zzawq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void zzb(int i10) {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(2, zza);
    }

    public final void zzc(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(3, zza);
    }

    public final void zzd(zzawp zzawp) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzawp);
        zzbh(1, zza);
    }
}
