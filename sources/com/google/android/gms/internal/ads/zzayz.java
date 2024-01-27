package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzayz extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzayz zzb;
    private int zzd;
    private String zze = "";
    private zzgui zzf = zzgtz.zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzayz zzayz = new zzayz();
        zzb = zzayz;
        zzgtz.zzaU(zzayz.class, zzayz);
    }

    private zzayz() {
    }

    public static zzayz zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzayz zzayz, String str) {
        str.getClass();
        zzayz.zzd |= 1;
        zzayz.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzazi.zza;
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzayv.class, "zzg", zzgud, "zzh", zzgud, "zzi", zzgud});
        } else if (i11 == 3) {
            return new zzayz();
        } else {
            if (i11 == 4) {
                return new zzayy((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
