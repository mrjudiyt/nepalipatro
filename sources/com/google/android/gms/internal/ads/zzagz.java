package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzagz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private int zzh;
    private int zzi;

    public zzagz(zzfb zzfb, zzfb zzfb2, boolean z10) {
        this.zzg = zzfb;
        this.zzf = zzfb2;
        this.zze = z10;
        zzfb2.zzG(12);
        this.zza = zzfb2.zzo();
        zzfb.zzG(12);
        this.zzi = zzfb.zzo();
        zzabq.zzb(zzfb.zzf() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long j10;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        if (this.zze) {
            j10 = this.zzf.zzu();
        } else {
            j10 = this.zzf.zzt();
        }
        this.zzd = j10;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzo();
            this.zzg.zzH(4);
            int i11 = -1;
            int i12 = this.zzi - 1;
            this.zzi = i12;
            if (i12 > 0) {
                i11 = -1 + this.zzg.zzo();
            }
            this.zzh = i11;
        }
        return true;
    }
}
