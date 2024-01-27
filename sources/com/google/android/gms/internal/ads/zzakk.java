package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakk implements zzakd {
    final /* synthetic */ zzakm zza;
    private final zzfa zzb = new zzfa(new byte[4], 4);

    public zzakk(zzakm zzakm) {
        this.zza = zzakm;
    }

    public final void zza(zzfb zzfb) {
        if (zzfb.zzl() == 0 && (zzfb.zzl() & 128) != 0) {
            zzfb.zzH(6);
            int zza2 = zzfb.zza() / 4;
            for (int i10 = 0; i10 < zza2; i10++) {
                zzfb.zzB(this.zzb, 4);
                zzfa zzfa = this.zzb;
                int zzd = zzfa.zzd(16);
                zzfa.zzl(3);
                if (zzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    if (this.zza.zzf.get(zzd2) == null) {
                        zzakm zzakm = this.zza;
                        zzakm.zzf.put(zzd2, new zzake(new zzakl(zzakm, zzd2)));
                        zzakm zzakm2 = this.zza;
                        zzakm2.zzl = zzakm2.zzl + 1;
                    }
                }
            }
            this.zza.zzf.remove(0);
        }
    }

    public final void zzb(zzfi zzfi, zzabp zzabp, zzakq zzakq) {
    }
}
