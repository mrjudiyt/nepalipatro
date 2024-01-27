package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbbq extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbbq zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbbq zzbbq = new zzbbq();
        zzb = zzbbq;
        zzgtz.zzaU(zzbbq.class, zzbbq);
    }

    private zzbbq() {
    }

    public static zzbbp zza() {
        return (zzbbp) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbbq zzbbq, boolean z10) {
        zzbbq.zzd |= 1;
        zzbbq.zze = z10;
    }

    static /* synthetic */ void zze(zzbbq zzbbq, int i10) {
        zzbbq.zzd |= 2;
        zzbbq.zzf = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzbbq();
        } else {
            if (i11 == 4) {
                return new zzbbp((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzf() {
        return this.zze;
    }
}
