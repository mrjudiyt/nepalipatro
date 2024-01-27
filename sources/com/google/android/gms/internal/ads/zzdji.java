package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdji extends zzdp {
    private final Object zza = new Object();
    private final zzdq zzb;
    private final zzbpm zzc;

    public zzdji(zzdq zzdq, zzbpm zzbpm) {
        this.zzb = zzdq;
        this.zzc = zzbpm;
    }

    public final float zze() {
        throw new RemoteException();
    }

    public final float zzf() {
        zzbpm zzbpm = this.zzc;
        if (zzbpm != null) {
            return zzbpm.zzg();
        }
        return 0.0f;
    }

    public final float zzg() {
        zzbpm zzbpm = this.zzc;
        if (zzbpm != null) {
            return zzbpm.zzh();
        }
        return 0.0f;
    }

    public final int zzh() {
        throw new RemoteException();
    }

    public final zzdt zzi() {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq == null) {
                return null;
            }
            zzdt zzi = zzdq.zzi();
            return zzi;
        }
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
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                zzdq.zzm(zzdt);
            }
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
