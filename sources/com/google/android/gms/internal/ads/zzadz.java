package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzadz extends zzady {
    private final zzfb zzb = new zzfb(zzfy.zza);
    private final zzfb zzc = new zzfb(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzadz(zzacs zzacs) {
        super(zzacs);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzfb zzfb) {
        int zzl = zzfb.zzl();
        int i10 = zzl >> 4;
        int i11 = zzl & 15;
        if (i11 == 7) {
            this.zzg = i10;
            return i10 != 5;
        }
        throw new zzadx("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzfb zzfb, long j10) {
        int zzl = zzfb.zzl();
        long zzg2 = (long) zzfb.zzg();
        if (zzl == 0) {
            if (!this.zze) {
                zzfb zzfb2 = new zzfb(new byte[zzfb.zza()]);
                zzfb.zzC(zzfb2.zzI(), 0, zzfb.zza());
                zzaar zza = zzaar.zza(zzfb2);
                this.zzd = zza.zzb;
                zzak zzak = new zzak();
                zzak.zzU("video/avc");
                zzak.zzz(zza.zzi);
                zzak.zzab(zza.zzc);
                zzak.zzH(zza.zzd);
                zzak.zzR(zza.zzh);
                zzak.zzK(zza.zza);
                this.zza.zzl(zzak.zzac());
                this.zze = true;
                return false;
            }
        } else if (zzl == 1 && this.zze) {
            int i10 = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i10 == 0) {
                return false;
            }
            byte[] zzI = this.zzc.zzI();
            zzI[0] = 0;
            zzI[1] = 0;
            zzI[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzfb.zza() > 0) {
                zzfb.zzC(this.zzc.zzI(), i11, this.zzd);
                this.zzc.zzG(0);
                zzfb zzfb3 = this.zzc;
                zzfb zzfb4 = this.zzb;
                int zzo = zzfb3.zzo();
                zzfb4.zzG(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzfb, zzo);
                i12 = i12 + 4 + zzo;
            }
            this.zza.zzt(j10 + (zzg2 * 1000), i10, i12, 0, (zzacr) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
