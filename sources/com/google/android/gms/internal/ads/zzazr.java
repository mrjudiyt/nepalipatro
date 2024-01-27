package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzazr extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzazr zzb;
    private int zzd;
    private zzazn zze;
    private zzgui zzf = zzgtz.zzaN();
    private int zzg;
    private zzbat zzh;

    static {
        zzazr zzazr = new zzazr();
        zzb = zzazr;
        zzgtz.zzaU(zzazr.class, zzazr);
    }

    private zzazr() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzbar.class, "zzg", zzazi.zza, "zzh"});
        } else if (i11 == 3) {
            return new zzazr();
        } else {
            if (i11 == 4) {
                return new zzazq((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
