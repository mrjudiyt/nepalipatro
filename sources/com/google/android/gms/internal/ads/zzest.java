package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzest implements Runnable {
    public final /* synthetic */ zzesx zza;
    public final /* synthetic */ zzbqv zzb;
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ zzelj zze;
    public final /* synthetic */ zzcbl zzf;

    public /* synthetic */ zzest(zzesx zzesx, zzbqv zzbqv, Bundle bundle, List list, zzelj zzelj, zzcbl zzcbl) {
        this.zza = zzesx;
        this.zzb = zzbqv;
        this.zzc = bundle;
        this.zzd = list;
        this.zze = zzelj;
        this.zzf = zzcbl;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
