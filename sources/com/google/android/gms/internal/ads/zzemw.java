package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzemw implements zzcxo {
    public final /* synthetic */ zzemk zza;
    public final /* synthetic */ zzbmb zzb;

    public /* synthetic */ zzemw(zzemk zzemk, zzbmb zzbmb) {
        this.zza = zzemk;
        this.zzb = zzbmb;
    }

    public final void zzbF(zze zze) {
        this.zza.zzbF(zze);
        zzbmb zzbmb = this.zzb;
        if (zzbmb != null) {
            try {
                zzbmb.zzf(zze);
            } catch (RemoteException e10) {
                zzcat.zzl("#007 Could not call remote method.", e10);
            }
        }
        if (zzbmb != null) {
            try {
                zzbmb.zze(zze.zza);
            } catch (RemoteException e11) {
                zzcat.zzl("#007 Could not call remote method.", e11);
            }
        }
    }
}
