package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzazz extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzazz zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazz zzazz = new zzazz();
        zzb = zzazz;
        zzgtz.zzaU(zzazz.class, zzazz);
    }

    private zzazz() {
    }

    public static zzazs zza() {
        return (zzazs) zzb.zzaA();
    }

    public static zzazz zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzazz zzazz, int i10) {
        zzazz.zze = i10 - 1;
        zzazz.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzazz zzazz, int i10) {
        zzazz.zzf = i10 - 1;
        zzazz.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzazx.zza, "zzf", zzazu.zza});
        } else if (i11 == 3) {
            return new zzazz();
        } else {
            if (i11 == 4) {
                return new zzazs((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzazv.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzazy.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
