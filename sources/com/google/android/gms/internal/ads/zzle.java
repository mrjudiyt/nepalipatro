package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzle implements Runnable {
    public final /* synthetic */ zzlf zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zztn zzc;
    public final /* synthetic */ zzts zzd;

    public /* synthetic */ zzle(zzlf zzlf, Pair pair, zztn zztn, zzts zzts) {
        this.zza = zzlf;
        this.zzb = pair;
        this.zzc = zztn;
        this.zzd = zzts;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzae(((Integer) pair.first).intValue(), (zztw) pair.second, this.zzc, this.zzd);
    }
}
