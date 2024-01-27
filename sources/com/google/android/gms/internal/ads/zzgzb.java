package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzb extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzb zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzgzb zzgzb = new zzgzb();
        zzb = zzgzb;
        zzgtz.zzaU(zzgzb.class, zzgzb);
    }

    private zzgzb() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzgyz.zza;
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzgud, "zzf", "zzg", zzgud});
        } else if (i11 == 3) {
            return new zzgzb();
        } else {
            if (i11 == 4) {
                return new zzgza((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
