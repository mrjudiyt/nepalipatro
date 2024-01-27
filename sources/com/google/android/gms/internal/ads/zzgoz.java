package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgoz extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgoz zzb;
    private String zzd = "";
    private zzgsr zze = zzgsr.zzb;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgoz zzgoz = new zzgoz();
        zzb = zzgoz;
        zzgtz.zzaU(zzgoz.class, zzgoz);
    }

    private zzgoz() {
    }

    public static zzgow zza() {
        return (zzgow) zzb.zzaA();
    }

    public static zzgoz zze() {
        return zzb;
    }

    static /* synthetic */ void zzh(zzgoz zzgoz, String str) {
        str.getClass();
        zzgoz.zzd = str;
    }

    static /* synthetic */ void zzi(zzgoz zzgoz, zzgsr zzgsr) {
        zzgsr.getClass();
        zzgoz.zze = zzgsr;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgoz();
        } else {
            if (i11 == 4) {
                return new zzgow((zzgov) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgoy zzc() {
        int i10 = this.zzf;
        zzgoy zzgoy = zzgoy.UNKNOWN_KEYMATERIAL;
        if (i10 != 0) {
            zzgoy = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzgoy.REMOTE : zzgoy.ASYMMETRIC_PUBLIC : zzgoy.ASYMMETRIC_PRIVATE : zzgoy.SYMMETRIC;
        }
        return zzgoy == null ? zzgoy.UNRECOGNIZED : zzgoy;
    }

    public final zzgsr zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
