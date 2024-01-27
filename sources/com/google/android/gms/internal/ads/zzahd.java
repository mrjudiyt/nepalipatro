package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzahd implements zzahb {
    private final int zza;
    private final int zzb;
    private final zzfb zzc;

    public zzahd(zzagx zzagx, zzam zzam) {
        zzfb zzfb = zzagx.zza;
        this.zzc = zzfb;
        zzfb.zzG(12);
        int zzo = zzfb.zzo();
        if ("audio/raw".equals(zzam.zzm)) {
            int zzl = zzfk.zzl(zzam.zzB, zzam.zzz);
            if (zzo == 0 || zzo % zzl != 0) {
                zzer.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzl + ", stsz sample size: " + zzo);
                zzo = zzl;
            }
        }
        this.zza = zzo == 0 ? -1 : zzo;
        this.zzb = zzfb.zzo();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzo() : i10;
    }
}
