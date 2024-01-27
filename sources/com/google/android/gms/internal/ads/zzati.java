package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzati implements Callable {
    private final zzasp zza;
    private final zzaom zzb;

    public zzati(zzasp zzasp, zzaom zzaom) {
        this.zza = zzasp;
        this.zzb = zzaom;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzapj zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzaom zzaom = this.zzb;
                byte[] zzax = zzc.zzax();
                zzaom.zzak(zzax, 0, zzax.length, zzgtl.zza());
            }
            return null;
        } catch (zzgul | NullPointerException unused) {
            return null;
        }
    }
}
