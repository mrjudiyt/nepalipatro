package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqq extends zzaum implements zzbqs {
    zzbqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(3, zza);
    }

    public final void zzf(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(4, zza);
    }

    public final void zzg() {
        zzbh(2, zza());
    }
}
