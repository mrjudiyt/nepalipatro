package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeol {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeok zzb;

    /* access modifiers changed from: package-private */
    public final zzeok zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzeok zzeok) {
        this.zzb = zzeok;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
