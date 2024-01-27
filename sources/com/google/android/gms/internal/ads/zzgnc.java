package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgnc extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgnc zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgni zzf;
    /* access modifiers changed from: private */
    public zzgsr zzg = zzgsr.zzb;

    static {
        zzgnc zzgnc = new zzgnc();
        zzb = zzgnc;
        zzgtz.zzaU(zzgnc.class, zzgnc);
    }

    private zzgnc() {
    }

    public static zzgnb zzc() {
        return (zzgnb) zzb.zzaA();
    }

    public static zzgnc zze() {
        return zzb;
    }

    public static zzgnc zzf(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgnc) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzj(zzgnc zzgnc, zzgni zzgni) {
        zzgni.getClass();
        zzgnc.zzf = zzgni;
        zzgnc.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgnc();
        } else {
            if (i11 == 4) {
                return new zzgnb((zzgna) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgni zzg() {
        zzgni zzgni = this.zzf;
        return zzgni == null ? zzgni.zze() : zzgni;
    }

    public final zzgsr zzh() {
        return this.zzg;
    }
}
