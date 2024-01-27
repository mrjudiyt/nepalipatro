package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzakb {
    private final zzaje zza;
    private final zzfi zzb;
    private final zzfa zzc = new zzfa(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzakb(zzaje zzaje, zzfi zzfi) {
        this.zza = zzaje;
        this.zzb = zzfi;
    }

    public final void zza(zzfb zzfb) {
        long j10;
        long j11;
        zzfb zzfb2 = zzfb;
        zzfb2.zzC(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzfa zzfa = this.zzc;
        zzfb2.zzC(zzfa.zza, 0, zzfa.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long zzd2 = (long) this.zzc.zzd(3);
            this.zzc.zzl(1);
            int zzd3 = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long zzd4 = (long) this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (this.zzf || !this.zze) {
                j11 = zzd2;
            } else {
                this.zzc.zzl(4);
                this.zzc.zzl(1);
                this.zzc.zzl(1);
                j11 = zzd2;
                this.zzc.zzl(1);
                this.zzb.zzb(((long) (this.zzc.zzd(15) << 15)) | (((long) this.zzc.zzd(3)) << 30) | ((long) this.zzc.zzd(15)));
                this.zzf = true;
            }
            j10 = this.zzb.zzb((j11 << 30) | ((long) zzd3) | zzd4);
        } else {
            j10 = 0;
        }
        this.zza.zzd(j10, 4);
        this.zza.zza(zzfb2);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
