package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgyp extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgyp zzb;
    private int zzd;
    private zzgsr zze;
    private zzgsr zzf;
    private byte zzg = 2;

    static {
        zzgyp zzgyp = new zzgyp();
        zzb = zzgyp;
        zzgtz.zzaU(zzgyp.class, zzgyp);
    }

    private zzgyp() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zze = zzgsr;
        this.zzf = zzgsr;
    }

    public static zzgyo zza() {
        return (zzgyo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgyp zzgyp, zzgsr zzgsr) {
        zzgyp.zzd |= 1;
        zzgyp.zze = zzgsr;
    }

    static /* synthetic */ void zze(zzgyp zzgyp, zzgsr zzgsr) {
        zzgyp.zzd |= 2;
        zzgyp.zzf = zzgsr;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgyp();
        } else {
            if (i11 == 4) {
                return new zzgyo((zzgxt) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzg = b10;
            return null;
        }
    }
}
