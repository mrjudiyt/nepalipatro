package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgzt extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgzt zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zzi = "";
    private String zzj = "";

    static {
        zzgzt zzgzt = new zzgzt();
        zzb = zzgzt;
        zzgtz.zzaU(zzgzt.class, zzgzt);
    }

    private zzgzt() {
    }

    public static zzgzs zza() {
        return (zzgzs) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgzt zzgzt, String str) {
        zzgzt.zzd |= 1;
        zzgzt.zze = str;
    }

    static /* synthetic */ void zze(zzgzt zzgzt, long j10) {
        zzgzt.zzd |= 2;
        zzgzt.zzf = j10;
    }

    static /* synthetic */ void zzf(zzgzt zzgzt, boolean z10) {
        zzgzt.zzd |= 4;
        zzgzt.zzg = z10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgzu.zza, "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzgzt();
        } else {
            if (i11 == 4) {
                return new zzgzs((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
