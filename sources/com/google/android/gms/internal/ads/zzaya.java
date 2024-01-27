package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzaya {
    final /* synthetic */ zzayb zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzaya(zzayb zzayb, byte[] bArr, zzaxz zzaxz) {
        this.zza = zzayb;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzayb zzayb = this.zza;
            if (zzayb.zzb) {
                zzayb.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            zzcat.zzf("Clearcut log failed", e10);
        }
    }

    public final zzaya zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new zzaxy(this));
    }
}
