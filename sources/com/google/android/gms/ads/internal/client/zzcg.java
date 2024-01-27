package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzcg extends zzaum implements zzci {
    zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    public final void zzb() {
        zzbh(5, zza());
    }

    public final void zzc() {
        zzbh(3, zza());
    }

    public final void zzd(zze zze) {
        Parcel zza = zza();
        zzauo.zzd(zza, zze);
        zzbh(1, zza);
    }

    public final void zze() {
        zzbh(4, zza());
    }

    public final void zzf() {
        zzbh(2, zza());
    }
}
