package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzuk implements zztu, zztt {
    /* access modifiers changed from: private */
    public final zztu zza;
    private final long zzb;
    private zztt zzc;

    public zzuk(zztu zztu, long j10) {
        this.zza = zztu;
        this.zzb = j10;
    }

    public final long zza(long j10, zzlv zzlv) {
        long j11 = this.zzb;
        return this.zza.zza(j10 - j11, zzlv) + j11;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j10) {
        long j11 = this.zzb;
        return this.zza.zze(j10 - j11) + j11;
    }

    public final long zzf(zzxk[] zzxkArr, boolean[] zArr, zzvo[] zzvoArr, boolean[] zArr2, long j10) {
        zzvo[] zzvoArr2 = zzvoArr;
        zzvo[] zzvoArr3 = new zzvo[zzvoArr2.length];
        int i10 = 0;
        while (true) {
            zzvo zzvo = null;
            if (i10 >= zzvoArr2.length) {
                break;
            }
            zzul zzul = (zzul) zzvoArr2[i10];
            if (zzul != null) {
                zzvo = zzul.zzc();
            }
            zzvoArr3[i10] = zzvo;
            i10++;
        }
        long zzf = this.zza.zzf(zzxkArr, zArr, zzvoArr3, zArr2, j10 - this.zzb);
        for (int i11 = 0; i11 < zzvoArr2.length; i11++) {
            zzvo zzvo2 = zzvoArr3[i11];
            if (zzvo2 == null) {
                zzvoArr2[i11] = null;
            } else {
                zzvo zzvo3 = zzvoArr2[i11];
                if (zzvo3 == null || ((zzul) zzvo3).zzc() != zzvo2) {
                    zzvoArr2[i11] = new zzul(zzvo2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzvq zzvq) {
        zztu zztu = (zztu) zzvq;
        zztt zztt = this.zzc;
        Objects.requireNonNull(zztt);
        zztt.zzg(this);
    }

    public final zzvx zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zztu zztu) {
        zztt zztt = this.zzc;
        Objects.requireNonNull(zztt);
        zztt.zzi(this);
    }

    public final void zzj(long j10, boolean z10) {
        this.zza.zzj(j10 - this.zzb, false);
    }

    public final void zzk() {
        this.zza.zzk();
    }

    public final void zzl(zztt zztt, long j10) {
        this.zzc = zztt;
        this.zza.zzl(this, j10 - this.zzb);
    }

    public final void zzm(long j10) {
        this.zza.zzm(j10 - this.zzb);
    }

    public final boolean zzo(zzks zzks) {
        long j10 = zzks.zza;
        long j11 = this.zzb;
        zzkq zza2 = zzks.zza();
        zza2.zze(j10 - j11);
        return this.zza.zzo(zza2.zzg());
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }
}
