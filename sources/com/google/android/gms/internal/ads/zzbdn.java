package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public class zzbdn {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbdn(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbdn zza(String str, double d10) {
        return new zzbdn(str, Double.valueOf(d10), 3);
    }

    public static zzbdn zzb(String str, long j10) {
        return new zzbdn(str, Long.valueOf(j10), 2);
    }

    public static zzbdn zzc(String str, String str2) {
        return new zzbdn(str, str2, 4);
    }

    public static zzbdn zzd(String str, boolean z10) {
        return new zzbdn(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzber zza2 = zzbet.zza();
        if (zza2 == null) {
            if (zzbet.zzb() != null) {
                zzbet.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 == 0) {
            return zza2.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i10 == 1) {
            return zza2.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        if (i10 != 2) {
            return zza2.zzd(this.zza, (String) this.zzb);
        }
        return zza2.zzb(this.zza, ((Double) this.zzb).doubleValue());
    }
}
