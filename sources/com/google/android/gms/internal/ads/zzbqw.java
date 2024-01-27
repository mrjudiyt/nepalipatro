package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbqw extends zzaum implements zzbqy {
    zzbqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(1, zza);
    }

    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(2, zza);
    }

    public final void zzg(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(3, zza);
    }
}
