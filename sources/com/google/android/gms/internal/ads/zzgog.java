package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgog extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgog zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzgsr zze = zzgsr.zzb;

    static {
        zzgog zzgog = new zzgog();
        zzb = zzgog;
        zzgtz.zzaU(zzgog.class, zzgog);
    }

    private zzgog() {
    }

    public static zzgof zzc() {
        return (zzgof) zzb.zzaA();
    }

    public static zzgog zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgog) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgog();
        } else {
            if (i11 == 4) {
                return new zzgof((zzgoe) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsr zzf() {
        return this.zze;
    }
}
