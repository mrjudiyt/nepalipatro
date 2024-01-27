package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzla implements Runnable {
    public final /* synthetic */ zzlf zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zztn zzc;
    public final /* synthetic */ zzts zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzla(zzlf zzlf, Pair pair, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        this.zza = zzlf;
        this.zzb = pair;
        this.zzc = zztn;
        this.zzd = zzts;
        this.zze = iOException;
        this.zzf = z10;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zztw) pair.second, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
