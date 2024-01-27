package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmq extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgmq zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgmt zzf;

    static {
        zzgmq zzgmq = new zzgmq();
        zzb = zzgmq;
        zzgtz.zzaU(zzgmq.class, zzgmq);
    }

    private zzgmq() {
    }

    public static zzgmp zzc() {
        return (zzgmp) zzb.zzaA();
    }

    public static zzgmq zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgmq) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzh(zzgmq zzgmq, zzgmt zzgmt) {
        zzgmt.getClass();
        zzgmq.zzf = zzgmt;
        zzgmq.zzd |= 1;
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
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgmq();
        } else {
            if (i11 == 4) {
                return new zzgmp((zzgmo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgmt zzf() {
        zzgmt zzgmt = this.zzf;
        return zzgmt == null ? zzgmt.zze() : zzgmt;
    }
}
