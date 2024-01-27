package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgyx extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgyx zzb;
    private int zzd;
    private zzgyw zze;
    private zzgui zzf = zzgtz.zzaN();
    private zzgsr zzg;
    private zzgsr zzh;
    private int zzi;
    private zzgsr zzj;
    private byte zzk = 2;

    static {
        zzgyx zzgyx = new zzgyx();
        zzb = zzgyx;
        zzgtz.zzaU(zzgyx.class, zzgyx);
    }

    private zzgyx() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zzg = zzgsr;
        this.zzh = zzgsr;
        this.zzj = zzgsr;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgyp.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzgyx();
        } else {
            if (i11 == 4) {
                return new zzgyu((zzgxt) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzk = b10;
            return null;
        }
    }
}
