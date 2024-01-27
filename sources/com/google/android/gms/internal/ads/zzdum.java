package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdum implements Runnable {
    public final /* synthetic */ zzdur zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzblk zzc;
    public final /* synthetic */ zzfej zzd;
    public final /* synthetic */ List zze;

    public /* synthetic */ zzdum(zzdur zzdur, String str, zzblk zzblk, zzfej zzfej, List list) {
        this.zza = zzdur;
        this.zzb = str;
        this.zzc = zzblk;
        this.zzd = zzfej;
        this.zze = list;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
