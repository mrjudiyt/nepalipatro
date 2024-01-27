package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzajd implements zzaje {
    private final List zza;
    private final zzacs[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzajd(List list) {
        this.zza = list;
        this.zzb = new zzacs[list.size()];
    }

    private final boolean zzf(zzfb zzfb, int i10) {
        if (zzfb.zza() == 0) {
            return false;
        }
        if (zzfb.zzl() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    public final void zza(zzfb zzfb) {
        if (!this.zzc) {
            return;
        }
        if (this.zzd != 2 || zzf(zzfb, 32)) {
            if (this.zzd != 1 || zzf(zzfb, 0)) {
                int zzc2 = zzfb.zzc();
                int zza2 = zzfb.zza();
                zzacs[] zzacsArr = this.zzb;
                for (zzacs zzr : zzacsArr) {
                    zzfb.zzG(zzc2);
                    zzr.zzr(zzfb, zza2);
                }
                this.zze += zza2;
            }
        }
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzakn zzakn = (zzakn) this.zza.get(i10);
            zzakq.zzc();
            zzacs zzw = zzabp.zzw(zzakq.zza(), 3);
            zzak zzak = new zzak();
            zzak.zzJ(zzakq.zzb());
            zzak.zzU("application/dvbsubs");
            zzak.zzK(Collections.singletonList(zzakn.zzb));
            zzak.zzM(zzakn.zza);
            zzw.zzl(zzak.zzac());
            this.zzb[i10] = zzw;
        }
    }

    public final void zzc(boolean z10) {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                zzacs[] zzacsArr = this.zzb;
                for (zzacs zzt : zzacsArr) {
                    zzt.zzt(this.zzf, 1, this.zze, 0, (zzacr) null);
                }
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.zzc = true;
            if (j10 != -9223372036854775807L) {
                this.zzf = j10;
            }
            this.zze = 0;
            this.zzd = 2;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
