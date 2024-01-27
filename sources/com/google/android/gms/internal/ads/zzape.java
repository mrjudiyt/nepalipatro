package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzape extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzape zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzape zzape = new zzape();
        zzb = zzape;
        zzgtz.zzaU(zzape.class, zzape);
    }

    private zzape() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzapp.zza});
        } else if (i11 == 3) {
            return new zzape();
        } else {
            if (i11 == 4) {
                return new zzapd((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
