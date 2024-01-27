package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfrq extends zzfrm {
    final /* synthetic */ zzfrw zza;

    zzfrq(zzfrw zzfrw) {
        this.zza = zzfrw;
    }

    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0) {
                if (this.zza.zzl.decrementAndGet() > 0) {
                    this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfrw zzfrw = this.zza;
            if (zzfrw.zzn != null) {
                zzfrw.zzc.zzc("Unbind from service.", new Object[0]);
                zzfrw zzfrw2 = this.zza;
                zzfrw2.zzb.unbindService(zzfrw2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
