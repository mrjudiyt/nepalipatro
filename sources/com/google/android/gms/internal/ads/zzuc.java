package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzuc implements Runnable {
    public final /* synthetic */ zzuf zza;
    public final /* synthetic */ zzug zzb;
    public final /* synthetic */ zztn zzc;
    public final /* synthetic */ zzts zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzuc(zzuf zzuf, zzug zzug, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        this.zza = zzuf;
        this.zzb = zzug;
        this.zzc = zztn;
        this.zzd = zzts;
        this.zze = iOException;
        this.zzf = z10;
    }

    public final void run() {
        this.zzb.zzaf(0, this.zza.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
