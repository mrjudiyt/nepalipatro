package com.google.android.gms.analytics;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzl implements Runnable {
    final /* synthetic */ zzh zza;
    final /* synthetic */ zzr zzb;

    zzl(zzr zzr, zzh zzh) {
        this.zzb = zzr;
        this.zza = zzh;
    }

    public final void run() {
        this.zza.zzd().zze(this.zza);
        for (zzs zza2 : this.zzb.zzc) {
            zza2.zza();
        }
        zzh zzh = this.zza;
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzh.zzm(), "Measurement must be submitted");
        List<zzt> zzf = zzh.zzf();
        if (!zzf.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (zzt next : zzf) {
                Uri zzb2 = next.zzb();
                if (!hashSet.contains(zzb2)) {
                    hashSet.add(zzb2);
                    next.zze(zzh);
                }
            }
        }
    }
}
