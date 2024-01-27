package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzajq implements zzaje {
    private final zzfb zza = new zzfb(10);
    private zzacs zzb;
    private boolean zzc;
    private long zzd = -9223372036854775807L;
    private int zze;
    private int zzf;

    public final void zza(zzfb zzfb) {
        zzdx.zzb(this.zzb);
        if (this.zzc) {
            int zza2 = zzfb.zza();
            int i10 = this.zzf;
            if (i10 < 10) {
                int min = Math.min(zza2, 10 - i10);
                System.arraycopy(zzfb.zzI(), zzfb.zzc(), this.zza.zzI(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzG(0);
                    if (this.zza.zzl() == 73 && this.zza.zzl() == 68 && this.zza.zzl() == 51) {
                        this.zza.zzH(3);
                        this.zze = this.zza.zzk() + 10;
                    } else {
                        zzer.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(zza2, this.zze - this.zzf);
            this.zzb.zzr(zzfb, min2);
            this.zzf += min2;
        }
    }

    public final void zzb(zzabp zzabp, zzakq zzakq) {
        zzakq.zzc();
        zzacs zzw = zzabp.zzw(zzakq.zza(), 5);
        this.zzb = zzw;
        zzak zzak = new zzak();
        zzak.zzJ(zzakq.zzb());
        zzak.zzU("application/id3");
        zzw.zzl(zzak.zzac());
    }

    public final void zzc(boolean z10) {
        int i10;
        zzdx.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                this.zzb.zzt(j10, 1, i10, 0, (zzacr) null);
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.zzc = true;
            if (j10 != -9223372036854775807L) {
                this.zzd = j10;
            }
            this.zze = 0;
            this.zzf = 0;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
