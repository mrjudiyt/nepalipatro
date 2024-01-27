package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpe extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpe zzb;
    /* access modifiers changed from: private */
    public String zzd = "";
    /* access modifiers changed from: private */
    public zzgsr zze = zzgsr.zzb;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgpe zzgpe = new zzgpe();
        zzb = zzgpe;
        zzgtz.zzaU(zzgpe.class, zzgpe);
    }

    private zzgpe() {
    }

    public static zzgpd zza() {
        return (zzgpd) zzb.zzaA();
    }

    public static zzgpe zzd() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgpe();
        } else {
            if (i11 == 4) {
                return new zzgpd((zzgpc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgqf zze() {
        zzgqf zzb2 = zzgqf.zzb(this.zzf);
        return zzb2 == null ? zzgqf.UNRECOGNIZED : zzb2;
    }

    public final zzgsr zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
