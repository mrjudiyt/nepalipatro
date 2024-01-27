package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgah extends zzfyh.zzi implements Runnable {
    private final Runnable zza;

    public zzgah(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e10) {
            zzd(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + "]";
    }
}
