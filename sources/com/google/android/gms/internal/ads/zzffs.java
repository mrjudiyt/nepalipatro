package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzffs implements zzfzp {
    final /* synthetic */ zzffv zza;
    final /* synthetic */ zzffw zzb;

    zzffs(zzffw zzffw, zzffv zzffv) {
        this.zzb = zzffw;
        this.zza = zzffv;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzffw zzffw = this.zzb;
            if (zzffw.zzf == 1) {
                zzffw.zzh();
            }
        }
    }
}
