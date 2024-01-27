package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgor extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgor zzb;
    private int zzd;
    private zzgou zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzgor zzgor = new zzgor();
        zzb = zzgor;
        zzgtz.zzaU(zzgor.class, zzgor);
    }

    private zzgor() {
    }

    public static zzgoq zzc() {
        return (zzgoq) zzb.zzaA();
    }

    public static zzgor zze() {
        return zzb;
    }

    public static zzgor zzf(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgor) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzh(zzgor zzgor, zzgou zzgou) {
        zzgou.getClass();
        zzgor.zze = zzgou;
        zzgor.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgor();
        } else {
            if (i11 == 4) {
                return new zzgoq((zzgop) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgou zzg() {
        zzgou zzgou = this.zze;
        return zzgou == null ? zzgou.zzf() : zzgou;
    }
}
