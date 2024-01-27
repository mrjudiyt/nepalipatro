package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaju implements zzakd {
    private zzam zza;
    private zzfi zzb;
    private zzacs zzc;

    public zzaju(String str) {
        zzak zzak = new zzak();
        zzak.zzU(str);
        this.zza = zzak.zzac();
    }

    public final void zza(zzfb zzfb) {
        zzdx.zzb(this.zzb);
        int i10 = zzfk.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd != -9223372036854775807L && zze != -9223372036854775807L) {
            zzam zzam = this.zza;
            if (zze != zzam.zzq) {
                zzak zzb2 = zzam.zzb();
                zzb2.zzY(zze);
                zzam zzac = zzb2.zzac();
                this.zza = zzac;
                this.zzc.zzl(zzac);
            }
            int zza2 = zzfb.zza();
            this.zzc.zzr(zzfb, zza2);
            this.zzc.zzt(zzd, 1, zza2, 0, (zzacr) null);
        }
    }

    public final void zzb(zzfi zzfi, zzabp zzabp, zzakq zzakq) {
        this.zzb = zzfi;
        zzakq.zzc();
        zzacs zzw = zzabp.zzw(zzakq.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
