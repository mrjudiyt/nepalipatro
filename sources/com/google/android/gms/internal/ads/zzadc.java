package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzadc implements zzacm {
    final /* synthetic */ zzadf zza;
    private final long zzb;

    public zzadc(zzadf zzadf, long j10) {
        this.zza = zzadf;
        this.zzb = j10;
    }

    public final long zza() {
        return this.zzb;
    }

    public final zzack zzg(long j10) {
        zzack zza2 = this.zza.zzg[0].zza(j10);
        int i10 = 1;
        while (true) {
            zzadf zzadf = this.zza;
            if (i10 >= zzadf.zzg.length) {
                return zza2;
            }
            zzack zza3 = zzadf.zzg[i10].zza(j10);
            if (zza3.zza.zzc < zza2.zza.zzc) {
                zza2 = zza3;
            }
            i10++;
        }
    }

    public final boolean zzh() {
        return true;
    }
}
