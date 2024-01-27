package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzrn extends Handler {
    final /* synthetic */ zzrp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzrn(zzrp zzrp, Looper looper) {
        super(looper);
        this.zza = zzrp;
    }

    public final void handleMessage(Message message) {
        zzrp.zza(this.zza, message);
    }
}
