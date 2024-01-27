package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhaa extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzhaa zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzhaa zzhaa = new zzhaa();
        zzb = zzhaa;
        zzgtz.zzaU(zzhaa.class, zzhaa);
    }

    private zzhaa() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzhaa();
        } else {
            if (i11 == 4) {
                return new zzgzz((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
