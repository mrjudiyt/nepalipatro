package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfjo extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzfjo zzb;
    private int zzd;
    private zzfjk zze;

    static {
        zzfjo zzfjo = new zzfjo();
        zzb = zzfjo;
        zzgtz.zzaU(zzfjo.class, zzfjo);
    }

    private zzfjo() {
    }

    public static zzfjn zza() {
        return (zzfjn) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfjo zzfjo, zzfjk zzfjk) {
        zzfjk.getClass();
        zzfjo.zze = zzfjk;
        zzfjo.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzfjo();
        } else {
            if (i11 == 4) {
                return new zzfjn((zzfjl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
