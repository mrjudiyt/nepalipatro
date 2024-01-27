package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzto implements zztu, zztt {
    public final zztw zza;
    private final long zzb;
    private zzty zzc;
    private zztu zzd;
    private zztt zze;
    private long zzf = -9223372036854775807L;
    private final zzxz zzg;

    public zzto(zztw zztw, zzxz zzxz, long j10) {
        this.zza = zztw;
        this.zzg = zzxz;
        this.zzb = j10;
    }

    private final long zzv(long j10) {
        long j11 = this.zzf;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long zza(long j10, zzlv zzlv) {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zza(j10, zzlv);
    }

    public final long zzb() {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zzb();
    }

    public final long zzc() {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zzc();
    }

    public final long zzd() {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zzd();
    }

    public final long zze(long j10) {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zze(j10);
    }

    public final long zzf(zzxk[] zzxkArr, boolean[] zArr, zzvo[] zzvoArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.zzf;
        if (j12 == -9223372036854775807L || j10 != this.zzb) {
            j11 = j10;
        } else {
            this.zzf = -9223372036854775807L;
            j11 = j12;
        }
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zzf(zzxkArr, zArr, zzvoArr, zArr2, j11);
    }

    public final /* bridge */ /* synthetic */ void zzg(zzvq zzvq) {
        zztu zztu = (zztu) zzvq;
        zztt zztt = this.zze;
        int i10 = zzfk.zza;
        zztt.zzg(this);
    }

    public final zzvx zzh() {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        return zztu.zzh();
    }

    public final void zzi(zztu zztu) {
        zztt zztt = this.zze;
        int i10 = zzfk.zza;
        zztt.zzi(this);
    }

    public final void zzj(long j10, boolean z10) {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        zztu.zzj(j10, false);
    }

    public final void zzk() {
        try {
            zztu zztu = this.zzd;
            if (zztu != null) {
                zztu.zzk();
                return;
            }
            zzty zzty = this.zzc;
            if (zzty != null) {
                zzty.zzz();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    public final void zzl(zztt zztt, long j10) {
        this.zze = zztt;
        zztu zztu = this.zzd;
        if (zztu != null) {
            zztu.zzl(this, zzv(this.zzb));
        }
    }

    public final void zzm(long j10) {
        zztu zztu = this.zzd;
        int i10 = zzfk.zza;
        zztu.zzm(j10);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(zzks zzks) {
        zztu zztu = this.zzd;
        return zztu != null && zztu.zzo(zzks);
    }

    public final boolean zzp() {
        zztu zztu = this.zzd;
        return zztu != null && zztu.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zztw zztw) {
        long zzv = zzv(this.zzb);
        zzty zzty = this.zzc;
        Objects.requireNonNull(zzty);
        zztu zzI = zzty.zzI(zztw, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j10) {
        this.zzf = j10;
    }

    public final void zzt() {
        zztu zztu = this.zzd;
        if (zztu != null) {
            zzty zzty = this.zzc;
            Objects.requireNonNull(zzty);
            zzty.zzG(zztu);
        }
    }

    public final void zzu(zzty zzty) {
        zzdx.zzf(this.zzc == null);
        this.zzc = zzty;
    }
}
