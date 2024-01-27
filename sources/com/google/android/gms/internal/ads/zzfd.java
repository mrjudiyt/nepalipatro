package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfd implements zzdy {
    protected zzfd() {
    }

    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    public final zzei zzb(Looper looper, Handler.Callback callback) {
        return new zzfg(new Handler(looper, callback));
    }
}
