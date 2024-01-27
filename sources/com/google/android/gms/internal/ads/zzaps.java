package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaps extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzaps zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgsr zzg = zzgsr.zzb;

    static {
        zzaps zzaps = new zzaps();
        zzb = zzaps;
        zzgtz.zzaU(zzaps.class, zzaps);
    }

    private zzaps() {
    }

    public static zzaps zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzaps();
        } else {
            if (i11 == 4) {
                return new zzapr((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
