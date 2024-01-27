package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeux implements zzetw {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbzt zzd;

    public zzeux(zzbzt zzbzt, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zzd = zzbzt;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    public final int zza() {
        return 41;
    }

    public final e zzb() {
        return zzfzt.zzf(zzfzt.zzm(zzfzt.zzh(this.zzb), zzeuv.zza, this.zza), Throwable.class, new zzeuw(this), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(Throwable th) {
        return zzfzt.zzh(new zzeuy(this.zzb));
    }
}
