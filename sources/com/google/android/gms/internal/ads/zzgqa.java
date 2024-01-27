package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgqa extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgqa zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgqd zzf;

    static {
        zzgqa zzgqa = new zzgqa();
        zzb = zzgqa;
        zzgtz.zzaU(zzgqa.class, zzgqa);
    }

    private zzgqa() {
    }

    public static zzgpz zzc() {
        return (zzgpz) zzb.zzaA();
    }

    public static zzgqa zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgqa) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzh(zzgqa zzgqa, zzgqd zzgqd) {
        zzgqd.getClass();
        zzgqa.zzf = zzgqd;
        zzgqa.zzd |= 1;
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
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgqa();
        } else {
            if (i11 == 4) {
                return new zzgpz((zzgpy) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgqd zzf() {
        zzgqd zzgqd = this.zzf;
        return zzgqd == null ? zzgqd.zzd() : zzgqd;
    }
}
