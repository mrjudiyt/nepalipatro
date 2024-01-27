package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgyf extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgyf zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgyf zzgyf = new zzgyf();
        zzb = zzgyf;
        zzgtz.zzaU(zzgyf.class, zzgyf);
    }

    private zzgyf() {
    }

    public static zzgye zza() {
        return (zzgye) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgyf zzgyf, String str) {
        zzgyf.zzd |= 1;
        zzgyf.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgyf();
        } else {
            if (i11 == 4) {
                return new zzgye((zzgxt) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
