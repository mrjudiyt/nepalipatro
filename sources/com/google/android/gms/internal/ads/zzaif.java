package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaif implements zzabm {
    public static final zzabt zza = zzaie.zza;
    private zzabp zzb;
    private zzain zzc;
    private boolean zzd;

    private final boolean zza(zzabn zzabn) {
        zzaih zzaih = new zzaih();
        if (zzaih.zzb(zzabn, true) && (zzaih.zza & 2) == 2) {
            int min = Math.min(zzaih.zze, 8);
            zzfb zzfb = new zzfb(min);
            ((zzabc) zzabn).zzm(zzfb.zzI(), 0, min, false);
            zzfb.zzG(0);
            if (zzfb.zza() >= 5 && zzfb.zzl() == 127 && zzfb.zzt() == 1179402563) {
                this.zzc = new zzaid();
            } else {
                zzfb.zzG(0);
                try {
                    if (zzacy.zzd(1, zzfb, true)) {
                        this.zzc = new zzaip();
                    }
                } catch (zzcc unused) {
                }
                zzfb.zzG(0);
                if (zzaij.zzd(zzfb)) {
                    this.zzc = new zzaij();
                }
            }
            return true;
        }
        return false;
    }

    public final int zzb(zzabn zzabn, zzacj zzacj) {
        zzdx.zzb(this.zzb);
        if (this.zzc == null) {
            if (zza(zzabn)) {
                zzabn.zzj();
            } else {
                throw zzcc.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzd) {
            zzacs zzw = this.zzb.zzw(0, 1);
            this.zzb.zzD();
            this.zzc.zzh(this.zzb, zzw);
            this.zzd = true;
        }
        return this.zzc.zze(zzabn, zzacj);
    }

    public final void zzc(zzabp zzabp) {
        this.zzb = zzabp;
    }

    public final void zzd(long j10, long j11) {
        zzain zzain = this.zzc;
        if (zzain != null) {
            zzain.zzj(j10, j11);
        }
    }

    public final boolean zze(zzabn zzabn) {
        try {
            return zza(zzabn);
        } catch (zzcc unused) {
            return false;
        }
    }
}
