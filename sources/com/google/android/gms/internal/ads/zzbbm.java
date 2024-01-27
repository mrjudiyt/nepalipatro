package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbbm extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbbm zzb;
    private int zzd;
    private int zze = 1000;
    private zzbbc zzf;
    private zzbat zzg;

    static {
        zzbbm zzbbm = new zzbbm();
        zzb = zzbbm;
        zzgtz.zzaU(zzbbm.class, zzbbm);
    }

    private zzbbm() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzazi.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzbbm();
        } else {
            if (i11 == 4) {
                return new zzbbl((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
