package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
abstract class zzvy {
    private static final zzvy zza = new zzvu((zzvt) null);
    private static final zzvy zzb = new zzvw((zzvv) null);

    /* synthetic */ zzvy(zzvx zzvx) {
    }

    static zzvy zzd() {
        return zza;
    }

    static zzvy zze() {
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> void zzc(Object obj, Object obj2, long j10);
}
