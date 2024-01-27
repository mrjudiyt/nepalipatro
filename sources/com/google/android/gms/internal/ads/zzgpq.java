package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpq extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpq zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgpq zzgpq = new zzgpq();
        zzb = zzgpq;
        zzgtz.zzaU(zzgpq.class, zzgpq);
    }

    private zzgpq() {
    }

    public static zzgpp zza() {
        return (zzgpp) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgpq zzgpq, String str) {
        str.getClass();
        zzgpq.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgpq();
        } else {
            if (i11 == 4) {
                return new zzgpp((zzgpn) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
