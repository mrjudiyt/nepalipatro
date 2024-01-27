package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzak implements zzfza {
    private final Executor zza;
    private final zzdxk zzb;

    public zzak(Executor executor, zzdxk zzdxk) {
        this.zza = executor;
        this.zzb = zzdxk;
    }

    public final /* bridge */ /* synthetic */ e zza(Object obj) {
        zzbvg zzbvg = (zzbvg) obj;
        return zzfzt.zzn(this.zzb.zzb(zzbvg), new zzaj(zzbvg), this.zza);
    }
}
