package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzdr extends zzaum implements zzdt {
    zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void zze() {
        zzbh(4, zza());
    }

    public final void zzf(boolean z10) {
        Parcel zza = zza();
        int i10 = zzauo.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzbh(5, zza);
    }

    public final void zzg() {
        zzbh(3, zza());
    }

    public final void zzh() {
        zzbh(2, zza());
    }

    public final void zzi() {
        zzbh(1, zza());
    }
}
