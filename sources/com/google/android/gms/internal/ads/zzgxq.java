package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgxq extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgxq zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public long zze;
    /* access modifiers changed from: private */
    public long zzf;

    static {
        zzgxq zzgxq = new zzgxq();
        zzb = zzgxq;
        zzgtz.zzaU(zzgxq.class, zzgxq);
    }

    private zzgxq() {
    }

    public static zzgxp zza() {
        return (zzgxp) zzb.zzaA();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgxq();
        } else {
            if (i11 == 4) {
                return new zzgxp((zzgxo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
