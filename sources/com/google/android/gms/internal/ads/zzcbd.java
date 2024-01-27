package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcbd implements Executor {
    private final Handler zza = new zzf(Looper.getMainLooper());

    zzcbd() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzL(zzt.zzo().zzc(), th);
                throw th;
            }
        } else {
            this.zza.post(runnable);
        }
    }
}
