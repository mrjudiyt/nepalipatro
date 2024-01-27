package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfzg extends zzfys {
    /* access modifiers changed from: private */
    public zzfzf zza;

    zzfzg(zzfvn zzfvn, boolean z10, Executor executor, Callable callable) {
        super(zzfvn, z10, false);
        this.zza = new zzfze(this, callable, executor);
        zzv();
    }

    /* access modifiers changed from: package-private */
    public final void zzf(int i10, Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        zzfzf zzfzf = this.zza;
        if (zzfzf != null) {
            zzfzf.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu() {
        zzfzf zzfzf = this.zza;
        if (zzfzf != null) {
            zzfzf.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzy(int i10) {
        super.zzy(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
