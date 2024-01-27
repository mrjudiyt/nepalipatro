package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavr implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzavv zzb;

    zzavr(zzavv zzavv, View view) {
        this.zzb = zzavv;
        this.zza = view;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
