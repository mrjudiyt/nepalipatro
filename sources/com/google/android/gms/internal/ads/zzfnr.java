package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfnr extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzfnr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfnn zzh;

    static {
        zzfnr zzfnr = new zzfnr();
        zzb = zzfnr;
        zzgtz.zzaU(zzfnr.class, zzfnr);
    }

    private zzfnr() {
    }

    public static zzfnp zza() {
        return (zzfnp) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfnr zzfnr, String str) {
        str.getClass();
        zzfnr.zzd |= 2;
        zzfnr.zzf = str;
    }

    static /* synthetic */ void zze(zzfnr zzfnr, zzfnn zzfnn) {
        zzfnn.getClass();
        zzfnr.zzh = zzfnn;
        zzfnr.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzfnr zzfnr, int i10) {
        zzfnr.zze = 1;
        zzfnr.zzd = 1 | zzfnr.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfnq.zza, "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzfnr();
        } else {
            if (i11 == 4) {
                return new zzfnp((zzfno) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
