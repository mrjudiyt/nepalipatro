package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgph extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgph zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzgph zzgph = new zzgph();
        zzb = zzgph;
        zzgtz.zzaU(zzgph.class, zzgph);
    }

    private zzgph() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgph();
        } else {
            if (i11 == 4) {
                return new zzgpg((zzgpf) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
