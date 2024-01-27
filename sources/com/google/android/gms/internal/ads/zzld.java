package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzld implements Runnable {
    public final /* synthetic */ zzlf zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzts zzc;

    public /* synthetic */ zzld(zzlf zzlf, Pair pair, zzts zzts) {
        this.zza = zzlf;
        this.zzb = pair;
        this.zzc = zzts;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzac(((Integer) pair.first).intValue(), (zztw) pair.second, this.zzc);
    }
}
