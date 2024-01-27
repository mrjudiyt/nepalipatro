package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzazg extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzazg zzb;
    private int zzd;
    private int zze;
    private zzbav zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzazg zzazg = new zzazg();
        zzb = zzazg;
        zzgtz.zzaU(zzazg.class, zzazg);
    }

    private zzazg() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzazf.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzazg();
        } else {
            if (i11 == 4) {
                return new zzaze((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
