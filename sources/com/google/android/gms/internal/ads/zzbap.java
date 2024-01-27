package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbap extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbap zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbap zzbap = new zzbap();
        zzb = zzbap;
        zzgtz.zzaU(zzbap.class, zzbap);
    }

    private zzbap() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzbap();
        } else {
            if (i11 == 4) {
                return new zzbao((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
