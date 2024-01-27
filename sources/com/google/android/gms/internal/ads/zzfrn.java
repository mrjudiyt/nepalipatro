package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfrn implements IBinder.DeathRecipient {
    public final /* synthetic */ zzfrw zza;

    public /* synthetic */ zzfrn(zzfrw zzfrw) {
        this.zza = zzfrw;
    }

    public final void binderDied() {
        zzfrw.zzj(this.zza);
    }
}
