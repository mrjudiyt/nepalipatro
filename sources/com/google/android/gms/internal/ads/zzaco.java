package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaco {
    private int zza;
    private int zzb;
    private zzabp zzc;
    private zzacs zzd;

    public static final boolean zzd(zzabn zzabn, int i10, int i11) {
        zzfb zzfb = new zzfb(2);
        ((zzabc) zzabn).zzm(zzfb.zzI(), 0, 2, false);
        if (zzfb.zzp() == i10) {
            return true;
        }
        return false;
    }

    public final int zza(zzabn zzabn, zzacj zzacj) {
        int i10 = this.zzb;
        if (i10 == 1) {
            zzacs zzacs = this.zzd;
            Objects.requireNonNull(zzacs);
            int zza2 = zzacq.zza(zzacs, zzabn, 1024, true);
            if (zza2 == -1) {
                this.zzb = 2;
                this.zzd.zzt(0, 1, this.zza, 0, (zzacr) null);
                this.zza = 0;
            } else {
                this.zza += zza2;
            }
            return 0;
        } else if (i10 == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void zzb(zzabp zzabp, String str) {
        this.zzc = zzabp;
        zzacs zzw = zzabp.zzw(1024, 4);
        this.zzd = zzw;
        zzak zzak = new zzak();
        zzak.zzB(str);
        zzak.zzZ(1);
        zzak.zzaa(1);
        zzw.zzl(zzak.zzac());
        this.zzc.zzD();
        this.zzc.zzO(new zzacp(-9223372036854775807L));
        this.zzb = 1;
    }

    public final void zzc(long j10) {
        if (j10 == 0 || this.zzb == 1) {
            this.zzb = 1;
            this.zza = 0;
        }
    }
}
