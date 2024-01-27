package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzi extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzi zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzgzi zzgzi = new zzgzi();
        zzb = zzgzi;
        zzgtz.zzaU(zzgzi.class, zzgzi);
    }

    private zzgzi() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgzh.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgzi();
        } else {
            if (i11 == 4) {
                return new zzgzg((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
