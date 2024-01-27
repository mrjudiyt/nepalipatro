package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfnn extends zzgtz implements zzgvk {
    private static final zzguf zzb = new zzfnk();
    /* access modifiers changed from: private */
    public static final zzfnn zzd;
    private int zze;
    private zzgue zzf = zzgtz.zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfnn zzfnn = new zzfnn();
        zzd = zzfnn;
        zzgtz.zzaU(zzfnn.class, zzfnn);
    }

    private zzfnn() {
    }

    public static zzfnm zza() {
        return (zzfnm) zzd.zzaA();
    }

    static /* synthetic */ void zzd(zzfnn zzfnn, String str) {
        str.getClass();
        zzfnn.zze |= 1;
        zzfnn.zzg = str;
    }

    static /* synthetic */ void zze(zzfnn zzfnn, int i10) {
        zzgue zzgue = zzfnn.zzf;
        if (!zzgue.zzc()) {
            zzfnn.zzf = zzgtz.zzaK(zzgue);
        }
        zzfnn.zzf.zzh(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfnl.zza, "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzfnn();
        } else {
            if (i11 == 4) {
                return new zzfnm((zzfnk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzd;
        }
    }
}
