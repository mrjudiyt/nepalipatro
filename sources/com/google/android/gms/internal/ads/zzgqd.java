package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgqd extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgqd zzb;
    private int zzd;
    private String zze = "";
    private zzgpe zzf;

    static {
        zzgqd zzgqd = new zzgqd();
        zzb = zzgqd;
        zzgtz.zzaU(zzgqd.class, zzgqd);
    }

    private zzgqd() {
    }

    public static zzgqd zzd() {
        return zzb;
    }

    public static zzgqd zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgqd) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    public final zzgpe zza() {
        zzgpe zzgpe = this.zzf;
        return zzgpe == null ? zzgpe.zzd() : zzgpe;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgqd();
        } else {
            if (i11 == 4) {
                return new zzgqc((zzgqb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }
}
