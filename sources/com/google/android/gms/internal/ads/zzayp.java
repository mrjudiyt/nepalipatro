package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzayp extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzayp zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzayp zzayp = new zzayp();
        zzb = zzayp;
        zzgtz.zzaU(zzayp.class, zzayp);
    }

    private zzayp() {
    }

    public static zzayo zza() {
        return (zzayo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzayp zzayp, boolean z10) {
        zzayp.zzd |= 1;
        zzayp.zze = z10;
    }

    static /* synthetic */ void zze(zzayp zzayp, boolean z10) {
        zzayp.zzd |= 2;
        zzayp.zzf = z10;
    }

    static /* synthetic */ void zzf(zzayp zzayp, int i10) {
        zzayp.zzd |= 4;
        zzayp.zzg = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzayp();
        } else {
            if (i11 == 4) {
                return new zzayo((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
