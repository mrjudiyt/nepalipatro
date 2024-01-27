package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaov extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzaov zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzaov zzaov = new zzaov();
        zzb = zzaov;
        zzgtz.zzaU(zzaov.class, zzaov);
    }

    private zzaov() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzapp.zza;
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzgud, "zzg", zzgud});
        } else if (i11 == 3) {
            return new zzaov();
        } else {
            if (i11 == 4) {
                return new zzaou((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
