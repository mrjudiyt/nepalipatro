package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmz extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgmz zzb;
    private int zzd;
    private zzgnf zze;
    private zzgor zzf;

    static {
        zzgmz zzgmz = new zzgmz();
        zzb = zzgmz;
        zzgtz.zzaU(zzgmz.class, zzgmz);
    }

    private zzgmz() {
    }

    public static zzgmy zza() {
        return (zzgmy) zzb.zzaA();
    }

    public static zzgmz zzd(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgmz) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzg(zzgmz zzgmz, zzgnf zzgnf) {
        zzgnf.getClass();
        zzgmz.zze = zzgnf;
        zzgmz.zzd |= 1;
    }

    static /* synthetic */ void zzh(zzgmz zzgmz, zzgor zzgor) {
        zzgor.getClass();
        zzgmz.zzf = zzgor;
        zzgmz.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgmz();
        } else {
            if (i11 == 4) {
                return new zzgmy((zzgmx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgnf zze() {
        zzgnf zzgnf = this.zze;
        return zzgnf == null ? zzgnf.zze() : zzgnf;
    }

    public final zzgor zzf() {
        zzgor zzgor = this.zzf;
        return zzgor == null ? zzgor.zze() : zzgor;
    }
}
