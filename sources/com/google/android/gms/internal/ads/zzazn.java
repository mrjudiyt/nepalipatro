package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzazn extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzazn zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzgue zzg = zzgtz.zzaJ();
    private zzbat zzh;

    static {
        zzazn zzazn = new zzazn();
        zzb = zzazn;
        zzgtz.zzaU(zzazn.class, zzazn);
    }

    private zzazn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzazi.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzazn();
        } else {
            if (i11 == 4) {
                return new zzazm((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
