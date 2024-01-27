package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbbe extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbbe zzb;
    private int zzd;
    private zzbav zze;
    private int zzf = 1000;
    private zzbbc zzg;
    private zzbat zzh;

    static {
        zzbbe zzbbe = new zzbbe();
        zzb = zzbbe;
        zzgtz.zzaU(zzbbe.class, zzbbe);
    }

    private zzbbe() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzazi.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzbbe();
        } else {
            if (i11 == 4) {
                return new zzbbd((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
