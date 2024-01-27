package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzald implements zzabm {
    private final zzfb zza = new zzfb(4);
    private final zzaco zzb = new zzaco();

    public final int zzb(zzabn zzabn, zzacj zzacj) {
        return this.zzb.zza(zzabn, zzacj);
    }

    public final void zzc(zzabp zzabp) {
        this.zzb.zzb(zzabp, "image/webp");
    }

    public final void zzd(long j10, long j11) {
        this.zzb.zzc(j10);
    }

    public final boolean zze(zzabn zzabn) {
        this.zza.zzD(4);
        zzabc zzabc = (zzabc) zzabn;
        zzabc.zzm(this.zza.zzI(), 0, 4, false);
        if (this.zza.zzt() == 1380533830) {
            zzabc.zzl(4, false);
            this.zza.zzD(4);
            zzabc.zzm(this.zza.zzI(), 0, 4, false);
            if (this.zza.zzt() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
