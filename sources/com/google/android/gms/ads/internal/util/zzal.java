package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzgad;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzal implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzgad zzb;

    public /* synthetic */ zzal(zzau zzau, zzgad zzgad) {
        this.zza = zzau;
        this.zzb = zzgad;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
