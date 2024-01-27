package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzboq {
    private static zzboq zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzboq() {
    }

    public static zzboq zza() {
        if (zza == null) {
            zza = new zzboq();
        }
        return zza;
    }

    public final Thread zzb(Context context, String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzbop(this, context, str));
        thread.start();
        return thread;
    }
}
