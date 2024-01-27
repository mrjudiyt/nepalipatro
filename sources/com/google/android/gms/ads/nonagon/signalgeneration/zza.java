package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdsj;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ zzc zza;
    public final /* synthetic */ zzdsj zzb;
    public final /* synthetic */ ArrayDeque zzc;
    public final /* synthetic */ ArrayDeque zzd;

    public /* synthetic */ zza(zzc zzc2, zzdsj zzdsj, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.zza = zzc2;
        this.zzb = zzdsj;
        this.zzc = arrayDeque;
        this.zzd = arrayDeque2;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd);
    }
}
