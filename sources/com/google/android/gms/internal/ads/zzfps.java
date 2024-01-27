package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class zzfps extends Handler {
    private final Looper zza = Looper.getMainLooper();

    public zzfps() {
    }

    public final void dispatchMessage(Message message) {
        zza(message);
    }

    /* access modifiers changed from: protected */
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfps(Looper looper) {
        super(looper);
    }
}
