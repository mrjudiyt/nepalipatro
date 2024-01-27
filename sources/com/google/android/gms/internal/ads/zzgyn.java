package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgyn extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgyn zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzgyn zzgyn = new zzgyn();
        zzb = zzgyn;
        zzgtz.zzaU(zzgyn.class, zzgyn);
    }

    private zzgyn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgym.zza, "zzf", zzgyk.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgyn();
        } else {
            if (i11 == 4) {
                return new zzgyl((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
