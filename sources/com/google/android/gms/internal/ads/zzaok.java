package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaok extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzaok zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzaok zzaok = new zzaok();
        zzb = zzaok;
        zzgtz.zzaU(zzaok.class, zzaok);
    }

    private zzaok() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzaok();
        } else {
            if (i11 == 4) {
                return new zzaoj((zzaod) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
