package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzfz extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzfz zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzfm zzg;

    static {
        zzfz zzfz = new zzfz();
        zzb = zzfz;
        zzcb.zzp(zzfz.class, zzfz);
    }

    private zzfz() {
    }

    static /* synthetic */ void zzA(zzfz zzfz, zzff zzff) {
        zzff.getClass();
        zzfz.zzf = zzff;
        zzfz.zze = 3;
    }

    public static zzfy zzv() {
        return (zzfy) zzb.zzg();
    }

    static /* synthetic */ void zzx(zzfz zzfz, zzgd zzgd) {
        zzgd.getClass();
        zzfz.zzf = zzgd;
        zzfz.zze = 4;
    }

    static /* synthetic */ void zzy(zzfz zzfz, zzfm zzfm) {
        zzfz.zzg = zzfm;
        zzfz.zzd |= 1;
    }

    static /* synthetic */ void zzz(zzfz zzfz, zzfb zzfb) {
        zzfb.getClass();
        zzfz.zzf = zzfb;
        zzfz.zze = 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzfb.class, zzff.class, zzgd.class});
        } else if (i11 == 3) {
            return new zzfz();
        } else {
            if (i11 == 4) {
                return new zzfy((zzfx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
