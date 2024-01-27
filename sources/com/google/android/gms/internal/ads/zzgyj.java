package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgyj extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgyj zzb;
    private int zzd;
    private String zze = "";
    private zzgyi zzf;
    private long zzg;
    private String zzh = "";

    static {
        zzgyj zzgyj = new zzgyj();
        zzb = zzgyj;
        zzgtz.zzaU(zzgyj.class, zzgyj);
    }

    private zzgyj() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgyj();
        } else {
            if (i11 == 4) {
                return new zzgyg((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
