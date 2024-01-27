package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgod extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgod zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgod zzgod = new zzgod();
        zzb = zzgod;
        zzgtz.zzaU(zzgod.class, zzgod);
    }

    private zzgod() {
    }

    public static zzgoc zzc() {
        return (zzgoc) zzb.zzaA();
    }

    public static zzgod zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgod) zzgtz.zzaG(zzb, zzgsr, zzgtl);
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
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        } else if (i11 == 3) {
            return new zzgod();
        } else {
            if (i11 == 4) {
                return new zzgoc((zzgob) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
