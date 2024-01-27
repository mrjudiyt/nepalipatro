package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzl extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzl zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgsr zzg;
    private zzgsr zzh;

    static {
        zzgzl zzgzl = new zzgzl();
        zzb = zzgzl;
        zzgtz.zzaU(zzgzl.class, zzgzl);
    }

    private zzgzl() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zzg = zzgsr;
        this.zzh = zzgsr;
    }

    public static zzgzj zza() {
        return (zzgzj) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgzl zzgzl, String str) {
        zzgzl.zzd |= 2;
        zzgzl.zzf = "image/png";
    }

    static /* synthetic */ void zze(zzgzl zzgzl, zzgsr zzgsr) {
        zzgsr.getClass();
        zzgzl.zzd |= 4;
        zzgzl.zzg = zzgsr;
    }

    static /* synthetic */ void zzf(zzgzl zzgzl, int i10) {
        zzgzl.zze = 1;
        zzgzl.zzd = 1 | zzgzl.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgzk.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgzl();
        } else {
            if (i11 == 4) {
                return new zzgzj((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
