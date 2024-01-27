package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakt {
    private final List zza;
    private final zzacs[] zzb;

    public zzakt(List list) {
        this.zza = list;
        this.zzb = new zzacs[list.size()];
    }

    public final void zza(long j10, zzfb zzfb) {
        if (zzfb.zza() >= 9) {
            int zzf = zzfb.zzf();
            int zzf2 = zzfb.zzf();
            int zzl = zzfb.zzl();
            if (zzf == 434 && zzf2 == 1195456820 && zzl == 3) {
                zzaaz.zzb(j10, zzfb, this.zzb);
            }
        }
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzakq.zzc();
            zzacs zzw = zzabp.zzw(zzakq.zza(), 3);
            zzam zzam = (zzam) this.zza.get(i10);
            String str = zzam.zzm;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzdx.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzak zzak = new zzak();
            zzak.zzJ(zzakq.zzb());
            zzak.zzU(str);
            zzak.zzW(zzam.zze);
            zzak.zzM(zzam.zzd);
            zzak.zzw(zzam.zzE);
            zzak.zzK(zzam.zzo);
            zzw.zzl(zzak.zzac());
            this.zzb[i10] = zzw;
        }
    }
}
