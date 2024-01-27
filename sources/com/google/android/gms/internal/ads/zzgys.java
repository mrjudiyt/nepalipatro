package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgys extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgys zzb;
    private int zzd;
    private zzgsr zze;
    private zzgsr zzf;
    private zzgsr zzg;

    static {
        zzgys zzgys = new zzgys();
        zzb = zzgys;
        zzgtz.zzaU(zzgys.class, zzgys);
    }

    private zzgys() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zze = zzgsr;
        this.zzf = zzgsr;
        this.zzg = zzgsr;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgys();
        } else {
            if (i11 == 4) {
                return new zzgyr((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
