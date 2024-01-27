package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakx implements zzakw {
    private final zzabp zza;
    private final zzacs zzb;
    private final zzakz zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzakx(zzabp zzabp, zzacs zzacs, zzakz zzakz, String str, int i10) {
        this.zza = zzabp;
        this.zzb = zzacs;
        this.zzc = zzakz;
        int i11 = zzakz.zzb * zzakz.zze;
        int i12 = zzakz.zzd;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = zzakz.zzc * i13;
            int i15 = i14 * 8;
            int max = Math.max(i13, i14 / 10);
            this.zze = max;
            zzak zzak = new zzak();
            zzak.zzU(str);
            zzak.zzx(i15);
            zzak.zzQ(i15);
            zzak.zzN(max);
            zzak.zzy(zzakz.zzb);
            zzak.zzV(zzakz.zzc);
            zzak.zzP(i10);
            this.zzd = zzak.zzac();
            return;
        }
        throw zzcc.zza("Expected block size: " + i13 + "; got: " + i12, (Throwable) null);
    }

    public final void zza(int i10, long j10) {
        this.zza.zzO(new zzalc(this.zzc, 1, (long) i10, j10));
        this.zzb.zzl(this.zzd);
    }

    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0;
    }

    public final boolean zzc(zzabn zzabn, long j10) {
        int i10;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
            if (i10 <= 0 || (i11 = this.zzg) >= (i12 = this.zze)) {
                zzakz zzakz = this.zzc;
                int i13 = this.zzg;
                int i14 = zzakz.zzd;
                int i15 = i13 / i14;
            } else {
                int zza2 = zzacq.zza(this.zzb, zzabn, (int) Math.min((long) (i12 - i11), j11), true);
                if (zza2 == -1) {
                    j11 = 0;
                } else {
                    this.zzg += zza2;
                    j11 -= (long) zza2;
                }
            }
        }
        zzakz zzakz2 = this.zzc;
        int i132 = this.zzg;
        int i142 = zzakz2.zzd;
        int i152 = i132 / i142;
        if (i152 > 0) {
            int i16 = i152 * i142;
            int i17 = this.zzg - i16;
            this.zzb.zzt(this.zzf + zzfk.zzr(this.zzh, 1000000, (long) zzakz2.zzc), 1, i16, i17, (zzacr) null);
            this.zzh += (long) i152;
            this.zzg = i17;
        }
        if (i10 <= 0) {
            return true;
        }
        return false;
    }
}
