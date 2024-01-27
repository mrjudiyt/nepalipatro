package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqh extends zzaum implements zzbqj {
    zzbqh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(2, zza);
    }

    public final void zzf(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(3, zza);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzauo.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    public final void zzh(zzbpg zzbpg) {
        Parcel zza = zza();
        zzauo.zzf(zza, zzbpg);
        zzbh(4, zza);
    }
}
