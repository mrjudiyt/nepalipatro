package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public abstract class zzib {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzif zzc;
    private int zze;
    private boolean zzf;

    private zzib() {
        this.zzb = zzd;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static zzib zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzia zzia = new zzia(bArr, i11);
        try {
            zzia.zza(i11);
            return zzia;
        } catch (zzji e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zze(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i10);

    public abstract float zzb();

    public abstract void zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract boolean zzd(int i10);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    /* access modifiers changed from: package-private */
    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzhm zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();
}
