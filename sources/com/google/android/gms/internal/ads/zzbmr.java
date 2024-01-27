package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbmr implements Runnable {
    public final /* synthetic */ zzbnm zza;
    public final /* synthetic */ zzbnl zzb;
    public final /* synthetic */ zzbmh zzc;
    public final /* synthetic */ ArrayList zzd;
    public final /* synthetic */ long zze;

    public /* synthetic */ zzbmr(zzbnm zzbnm, zzbnl zzbnl, zzbmh zzbmh, ArrayList arrayList, long j10) {
        this.zza = zzbnm;
        this.zzb = zzbnl;
        this.zzc = zzbmh;
        this.zzd = arrayList;
        this.zze = j10;
    }

    public final void run() {
        this.zza.zzi(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
