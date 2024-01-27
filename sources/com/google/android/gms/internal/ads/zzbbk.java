package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbbk extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbbk zzb;
    private int zzd;
    private int zze = 1000;
    private zzbbc zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzbbk zzbbk = new zzbbk();
        zzb = zzbbk;
        zzgtz.zzaU(zzbbk.class, zzbbk);
    }

    private zzbbk() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzazi.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzbbk();
        } else {
            if (i11 == 4) {
                return new zzbbj((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
