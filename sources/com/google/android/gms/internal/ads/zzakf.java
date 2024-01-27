package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzakf {
    private final List zza;
    private final zzacs[] zzb;

    public zzakf(List list) {
        this.zza = list;
        this.zzb = new zzacs[list.size()];
    }

    public final void zza(long j10, zzfb zzfb) {
        zzaaz.zza(j10, zzfb, this.zzb);
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
            String str2 = zzam.zzb;
            if (str2 == null) {
                str2 = zzakq.zzb();
            }
            zzak zzak = new zzak();
            zzak.zzJ(str2);
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
