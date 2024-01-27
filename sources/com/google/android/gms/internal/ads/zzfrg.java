package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfrg extends zzaum implements zzfri {
    zzfrg(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(Bundle bundle, zzfrk zzfrk) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzauo.zzf(zza, zzfrk);
        zzbi(2, zza);
    }

    public final void zzf(String str, Bundle bundle, zzfrk zzfrk) {
        Parcel zza = zza();
        zza.writeString(str);
        zzauo.zzd(zza, bundle);
        zzauo.zzf(zza, zzfrk);
        zzbi(1, zza);
    }

    public final void zzg(Bundle bundle, zzfrk zzfrk) {
        Parcel zza = zza();
        zzauo.zzd(zza, bundle);
        zzauo.zzf(zza, zzfrk);
        zzbi(3, zza);
    }
}
