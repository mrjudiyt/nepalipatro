package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhac extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzhac zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgue zzg = zzgtz.zzaJ();
    private int zzh;
    private zzgui zzi = zzgtz.zzaN();
    private zzgsr zzj = zzgsr.zzb;

    static {
        zzhac zzhac = new zzhac();
        zzb = zzhac;
        zzgtz.zzaU(zzhac.class, zzhac);
    }

    private zzhac() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzhaa.class, "zzj"});
        } else if (i11 == 3) {
            return new zzhac();
        } else {
            if (i11 == 4) {
                return new zzhab((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
