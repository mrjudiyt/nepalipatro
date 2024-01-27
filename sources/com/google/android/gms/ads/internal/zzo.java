package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzaro;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    zzo(zzs zzs) {
        this.zza = zzs;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        zzs zzs = this.zza;
        return new zzaro(zzarn.zzt(zzs.zza.zza, zzs.zzd, false));
    }
}
