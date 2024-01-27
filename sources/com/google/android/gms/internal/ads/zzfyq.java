package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfyq implements Runnable {
    public final /* synthetic */ zzfys zza;
    public final /* synthetic */ e zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzfyq(zzfys zzfys, e eVar, int i10) {
        this.zza = zzfys;
        this.zzb = eVar;
        this.zzc = i10;
    }

    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}
