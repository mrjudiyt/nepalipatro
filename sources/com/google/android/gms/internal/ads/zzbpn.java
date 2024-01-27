package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbpn extends zzdp {
    private final Object zza = new Object();
    private volatile zzdt zzb;

    public final float zze() {
        throw new RemoteException();
    }

    public final float zzf() {
        throw new RemoteException();
    }

    public final float zzg() {
        throw new RemoteException();
    }

    public final int zzh() {
        throw new RemoteException();
    }

    public final zzdt zzi() {
        zzdt zzdt;
        synchronized (this.zza) {
            zzdt = this.zzb;
        }
        return zzdt;
    }

    public final void zzj(boolean z10) {
        throw new RemoteException();
    }

    public final void zzk() {
        throw new RemoteException();
    }

    public final void zzl() {
        throw new RemoteException();
    }

    public final void zzm(zzdt zzdt) {
        synchronized (this.zza) {
            this.zzb = zzdt;
        }
    }

    public final void zzn() {
        throw new RemoteException();
    }

    public final boolean zzo() {
        throw new RemoteException();
    }

    public final boolean zzp() {
        throw new RemoteException();
    }

    public final boolean zzq() {
        throw new RemoteException();
    }
}
