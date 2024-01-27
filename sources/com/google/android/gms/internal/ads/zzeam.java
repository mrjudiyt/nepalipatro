package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeam implements Callable {
    public final /* synthetic */ zzeav zza;
    public final /* synthetic */ e zzb;
    public final /* synthetic */ e zzc;
    public final /* synthetic */ zzbvg zzd;
    public final /* synthetic */ zzfit zze;

    public /* synthetic */ zzeam(zzeav zzeav, e eVar, e eVar2, zzbvg zzbvg, zzfit zzfit) {
        this.zza = zzeav;
        this.zzb = eVar;
        this.zzc = eVar2;
        this.zzd = zzbvg;
        this.zze = zzfit;
    }

    public final Object call() {
        return this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
