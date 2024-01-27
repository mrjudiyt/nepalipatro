package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzebe implements zzfzp {
    final /* synthetic */ zzbuz zza;

    zzebe(zzebf zzebf, zzbuz zzbuz) {
        this.zza = zzbuz;
    }

    public final void zza(Throwable th) {
        try {
            this.zza.zze(zzbb.zzb(th));
        } catch (RemoteException e10) {
            zze.zzb("Ad service can't call client", e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e10) {
            zze.zzb("Ad service can't call client", e10);
        }
    }
}
