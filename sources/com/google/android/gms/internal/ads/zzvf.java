package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzvf extends zzsx implements zzuw {
    private final zzgh zza;
    private final zzrd zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhk zzh;
    private zzbp zzi;
    private final zzvc zzj;
    private final zzyd zzk;

    /* synthetic */ zzvf(zzbp zzbp, zzgh zzgh, zzvc zzvc, zzrd zzrd, zzyd zzyd, int i10, zzve zzve) {
        this.zzi = zzbp;
        this.zza = zzgh;
        this.zzj = zzvc;
        this.zzb = zzrd;
        this.zzk = zzyd;
        this.zzc = i10;
    }

    private final void zzw() {
        long j10 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzbp zzJ = zzJ();
        zzvs zzvs = r1;
        zzvs zzvs2 = new zzvs(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0, 0, z10, false, false, (Object) null, zzJ, z11 ? zzJ.zzf : null);
        zzo(this.zzd ? new zzvb(this, zzvs) : zzvs);
    }

    public final void zzG(zztu zztu) {
        ((zzva) zztu).zzN();
    }

    public final zztu zzI(zztw zztw, zzxz zzxz, long j10) {
        zzgi zza2 = this.zza.zza();
        zzhk zzhk = this.zzh;
        if (zzhk != null) {
            zza2.zzf(zzhk);
        }
        zzbi zzbi = zzJ().zzd;
        Objects.requireNonNull(zzbi);
        zzvc zzvc = this.zzj;
        zzb();
        return new zzva(zzbi.zzb, zza2, new zzsz(zzvc.zza), this.zzb, zzc(zztw), this.zzk, zze(zztw), this, zzxz, (String) null, this.zzc, zzfk.zzq(-9223372036854775807L));
    }

    public final synchronized zzbp zzJ() {
        return this.zzi;
    }

    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zze;
        }
        if (this.zzd || this.zze != j10 || this.zzf != z10 || this.zzg != z11) {
            this.zze = j10;
            this.zzf = z10;
            this.zzg = z11;
            this.zzd = false;
            zzw();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzhk zzhk) {
        this.zzh = zzhk;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzw();
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final synchronized void zzt(zzbp zzbp) {
        this.zzi = zzbp;
    }

    public final void zzz() {
    }
}
