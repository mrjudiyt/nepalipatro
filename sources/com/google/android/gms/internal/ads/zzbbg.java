package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbbg extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbbg zzb;
    private int zzd;
    private int zze = 1000;
    private zzbbc zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzbbg zzbbg = new zzbbg();
        zzb = zzbbg;
        zzgtz.zzaU(zzbbg.class, zzbbg);
    }

    private zzbbg() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzazi.zza, "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzbbg();
        } else {
            if (i11 == 4) {
                return new zzbbf((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
