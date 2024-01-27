package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzx extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzx zzb;
    private int zzd;
    private String zze = "";
    private zzgsr zzf = zzgsr.zzb;

    static {
        zzgzx zzgzx = new zzgzx();
        zzb = zzgzx;
        zzgtz.zzaU(zzgzx.class, zzgzx);
    }

    private zzgzx() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgzx();
        } else {
            if (i11 == 4) {
                return new zzgzw((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
