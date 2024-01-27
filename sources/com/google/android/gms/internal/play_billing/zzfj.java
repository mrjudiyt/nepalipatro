package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
public final class zzfj extends zzcb implements zzdg {
    /* access modifiers changed from: private */
    public static final zzfj zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private String zzh = "";

    static {
        zzfj zzfj = new zzfj();
        zzb = zzfj;
        zzcb.zzp(zzfj.class, zzfj);
    }

    private zzfj() {
    }

    public static zzfh zzv() {
        return (zzfh) zzb.zzg();
    }

    static /* synthetic */ void zzx(zzfj zzfj, int i10) {
        zzfj.zzd |= 1;
        zzfj.zze = i10;
    }

    static /* synthetic */ void zzy(zzfj zzfj, String str) {
        str.getClass();
        zzfj.zzd |= 2;
        zzfj.zzf = str;
    }

    static /* synthetic */ void zzz(zzfj zzfj, int i10) {
        zzfj.zzg = i10 - 1;
        zzfj.zzd |= 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzu(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzcb.zzm(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzfi.zza, "zzh"});
        } else if (i11 == 3) {
            return new zzfj();
        } else {
            if (i11 == 4) {
                return new zzfh((zzfg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
