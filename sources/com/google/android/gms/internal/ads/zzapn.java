package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzapn extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzapn zzb;
    private int zzd;
    private zzgsr zze;
    private zzgsr zzf;
    private zzgsr zzg;
    private zzgsr zzh;

    static {
        zzapn zzapn = new zzapn();
        zzb = zzapn;
        zzgtz.zzaU(zzapn.class, zzapn);
    }

    private zzapn() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zze = zzgsr;
        this.zzf = zzgsr;
        this.zzg = zzgsr;
        this.zzh = zzgsr;
    }

    public static zzapm zza() {
        return (zzapm) zzb.zzaA();
    }

    public static zzapn zzd(byte[] bArr, zzgtl zzgtl) {
        return (zzapn) zzgtz.zzaI(zzb, bArr, zzgtl);
    }

    static /* synthetic */ void zzi(zzapn zzapn, zzgsr zzgsr) {
        zzapn.zzd |= 1;
        zzapn.zze = zzgsr;
    }

    static /* synthetic */ void zzj(zzapn zzapn, zzgsr zzgsr) {
        zzapn.zzd |= 2;
        zzapn.zzf = zzgsr;
    }

    static /* synthetic */ void zzk(zzapn zzapn, zzgsr zzgsr) {
        zzapn.zzd |= 4;
        zzapn.zzg = zzgsr;
    }

    static /* synthetic */ void zzl(zzapn zzapn, zzgsr zzgsr) {
        zzapn.zzd |= 8;
        zzapn.zzh = zzgsr;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzapn();
        } else {
            if (i11 == 4) {
                return new zzapm((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgsr zze() {
        return this.zze;
    }

    public final zzgsr zzf() {
        return this.zzf;
    }

    public final zzgsr zzg() {
        return this.zzh;
    }

    public final zzgsr zzh() {
        return this.zzg;
    }
}
