package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfrs extends zzfrm {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfrv zzb;

    zzfrs(zzfrv zzfrv, IBinder iBinder) {
        this.zzb = zzfrv;
        this.zza = iBinder;
    }

    public final void zza() {
        this.zzb.zza.zzn = zzfrh.zzb(this.zza);
        zzfrw.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        for (Runnable run : this.zzb.zza.zze) {
            run.run();
        }
        this.zzb.zza.zze.clear();
    }
}
