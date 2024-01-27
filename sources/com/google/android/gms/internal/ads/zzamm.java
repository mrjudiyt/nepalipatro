package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzamm {
    public final Object zza;
    public final zzalp zzb;
    public final zzamp zzc;
    public boolean zzd;

    private zzamm(zzamp zzamp) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzamp;
    }

    private zzamm(Object obj, zzalp zzalp) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzalp;
        this.zzc = null;
    }

    public static zzamm zza(zzamp zzamp) {
        return new zzamm(zzamp);
    }

    public static zzamm zzb(Object obj, zzalp zzalp) {
        return new zzamm(obj, zzalp);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
