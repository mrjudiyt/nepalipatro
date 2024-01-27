package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzezn implements zzffv {
    public final zzfah zza;
    public final zzfaj zzb;
    public final zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final zzw zzf;
    public final zzffk zzg;

    public zzezn(zzfah zzfah, zzfaj zzfaj, zzl zzl, String str, Executor executor, zzw zzw, zzffk zzffk) {
        this.zza = zzfah;
        this.zzb = zzfaj;
        this.zzc = zzl;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzw;
        this.zzg = zzffk;
    }

    public final zzffk zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
