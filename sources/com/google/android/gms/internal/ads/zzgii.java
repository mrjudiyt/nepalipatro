package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgii {
    private static final zzgii zza = ((zzgii) zzgjq.zza(zzgig.zza));
    private final AtomicReference zzb = new AtomicReference(new zzgjo(new zzgji(), (zzgjn) null));

    public static zzgii zzb() {
        return zza;
    }

    public final zzgbe zza(zzgjc zzgjc, zzgch zzgch) {
        if (!((zzgjo) this.zzb.get()).zzg(zzgjc)) {
            return new zzghx(zzgjc, zzgch);
        }
        return ((zzgjo) this.zzb.get()).zza(zzgjc, zzgch);
    }

    public final zzgjh zzc(zzgbw zzgbw, Class cls) {
        return ((zzgjo) this.zzb.get()).zzb(zzgbw, cls);
    }

    public final synchronized void zzd(zzghp zzghp) {
        zzgji zzgji = new zzgji((zzgjo) this.zzb.get());
        zzgji.zza(zzghp);
        this.zzb.set(new zzgjo(zzgji, (zzgjn) null));
    }

    public final synchronized void zze(zzght zzght) {
        zzgji zzgji = new zzgji((zzgjo) this.zzb.get());
        zzgji.zzb(zzght);
        this.zzb.set(new zzgjo(zzgji, (zzgjn) null));
    }

    public final synchronized void zzf(zzgim zzgim) {
        zzgji zzgji = new zzgji((zzgjo) this.zzb.get());
        zzgji.zzc(zzgim);
        this.zzb.set(new zzgjo(zzgji, (zzgjn) null));
    }

    public final synchronized void zzg(zzgiq zzgiq) {
        zzgji zzgji = new zzgji((zzgjo) this.zzb.get());
        zzgji.zzd(zzgiq);
        this.zzb.set(new zzgjo(zzgji, (zzgjn) null));
    }
}
