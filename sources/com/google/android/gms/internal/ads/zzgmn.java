package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmn extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgmn zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgsr zzf = zzgsr.zzb;
    private zzgmt zzg;

    static {
        zzgmn zzgmn = new zzgmn();
        zzb = zzgmn;
        zzgtz.zzaU(zzgmn.class, zzgmn);
    }

    private zzgmn() {
    }

    public static zzgmm zzc() {
        return (zzgmm) zzb.zzaA();
    }

    public static zzgmn zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgmn) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzj(zzgmn zzgmn, zzgmt zzgmt) {
        zzgmt.getClass();
        zzgmn.zzg = zzgmt;
        zzgmn.zzd |= 1;
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
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgmn();
        } else {
            if (i11 == 4) {
                return new zzgmm((zzgml) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgmt zzf() {
        zzgmt zzgmt = this.zzg;
        return zzgmt == null ? zzgmt.zze() : zzgmt;
    }

    public final zzgsr zzg() {
        return this.zzf;
    }
}
