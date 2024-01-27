package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgqi extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgqi zzb;
    private String zzd = "";
    private zzgui zze = zzgtz.zzaN();

    static {
        zzgqi zzgqi = new zzgqi();
        zzb = zzgqi;
        zzgtz.zzaU(zzgqi.class, zzgqi);
    }

    private zzgqi() {
    }

    public static zzgqi zzc() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgph.class});
        } else if (i11 == 3) {
            return new zzgqi();
        } else {
            if (i11 == 4) {
                return new zzgqh((zzgqg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
