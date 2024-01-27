package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgnl extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgnl zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgnr zzf;
    /* access modifiers changed from: private */
    public zzgsr zzg = zzgsr.zzb;

    static {
        zzgnl zzgnl = new zzgnl();
        zzb = zzgnl;
        zzgtz.zzaU(zzgnl.class, zzgnl);
    }

    private zzgnl() {
    }

    public static zzgnk zzc() {
        return (zzgnk) zzb.zzaA();
    }

    public static zzgnl zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgnl) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzi(zzgnl zzgnl, zzgnr zzgnr) {
        zzgnr.getClass();
        zzgnl.zzf = zzgnr;
        zzgnl.zzd |= 1;
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
            return new zzgnl();
        } else {
            if (i11 == 4) {
                return new zzgnk((zzgnj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgnr zzf() {
        zzgnr zzgnr = this.zzf;
        return zzgnr == null ? zzgnr.zze() : zzgnr;
    }

    public final zzgsr zzg() {
        return this.zzg;
    }
}
