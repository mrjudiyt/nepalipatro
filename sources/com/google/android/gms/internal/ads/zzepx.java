package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzepx implements Callable {
    public final /* synthetic */ zzepy zza;

    public /* synthetic */ zzepx(zzepy zzepy) {
        this.zza = zzepy;
    }

    public final Object call() {
        return new zzepz(Long.valueOf(zzt.zzB().currentTimeMillis() - zzt.zzo().zzh().zzh().zza()).longValue());
    }
}
