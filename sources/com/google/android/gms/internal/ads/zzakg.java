package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakg implements zzaax {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();
    private final int zzc;

    public zzakg(int i10, zzfi zzfi, int i11) {
        this.zzc = i10;
        this.zza = zzfi;
    }

    public final zzaaw zza(zzabn zzabn, long j10) {
        int zza2;
        int i10;
        long zzf = zzabn.zzf();
        int min = (int) Math.min(112800, zzabn.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzabc) zzabn).zzm(this.zzb.zzI(), 0, min, false);
        zzfb zzfb = this.zzb;
        int zzd = zzfb.zzd();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzfb.zza() >= 188 && (i10 = zza2 + 188) <= zzd) {
            long zzb2 = zzaks.zzb(zzfb, (zza2 = zzaks.zza(zzfb.zzI(), zzfb.zzc(), zzd)), this.zzc);
            if (zzb2 != -9223372036854775807L) {
                long zzb3 = this.zza.zzb(zzb2);
                if (zzb3 <= j10) {
                    j13 = (long) zza2;
                    if (100000 + zzb3 <= j10) {
                        j12 = zzb3;
                    }
                } else if (j12 == -9223372036854775807L) {
                    return zzaaw.zzd(zzb3, zzf);
                }
                return zzaaw.zze(zzf + j13);
            }
            zzfb.zzG(i10);
            j11 = (long) i10;
        }
        return j12 != -9223372036854775807L ? zzaaw.zzf(j12, zzf + j11) : zzaaw.zza;
    }

    public final void zzb() {
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
    }
}
