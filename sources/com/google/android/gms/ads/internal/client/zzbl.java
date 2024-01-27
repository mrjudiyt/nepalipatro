package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbl extends zzaum implements zzbn {
    zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String zze() {
        throw null;
    }

    public final String zzf() {
        throw null;
    }

    public final void zzg(zzl zzl) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        zzbh(1, zza);
    }

    public final void zzh(zzl zzl, int i10) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzl);
        zza.writeInt(i10);
        zzbh(5, zza);
    }

    public final boolean zzi() {
        Parcel zzbg = zzbg(3, zza());
        boolean zzg = zzauo.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
