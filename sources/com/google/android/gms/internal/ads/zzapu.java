package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzapu extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzapu zzb;
    private int zzd;
    private String zze = "";

    static {
        zzapu zzapu = new zzapu();
        zzb = zzapu;
        zzgtz.zzaU(zzapu.class, zzapu);
    }

    private zzapu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzapu();
        } else {
            if (i11 == 4) {
                return new zzapt((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
