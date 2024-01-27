package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzgd extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzgd zzb;
    private int zzd;
    private int zze;

    static {
        zzgd zzgd = new zzgd();
        zzb = zzgd;
        zzcb.zzp(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    public static zzgd zzw() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzgc.zza});
        } else if (i11 == 3) {
            return new zzgd();
        } else {
            if (i11 == 4) {
                return new zzgb((zzga) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
