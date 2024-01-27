package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzapw extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzapw zzb;
    private int zzd;
    private zzgui zze = zzgtz.zzaN();
    private zzgsr zzf = zzgsr.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzapw zzapw = new zzapw();
        zzb = zzapw;
        zzgtz.zzaU(zzapw.class, zzapw);
    }

    private zzapw() {
    }

    public static zzapv zza() {
        return (zzapv) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzapw zzapw, zzgsr zzgsr) {
        zzgui zzgui = zzapw.zze;
        if (!zzgui.zzc()) {
            zzapw.zze = zzgtz.zzaO(zzgui);
        }
        zzapw.zze.add(zzgsr);
    }

    static /* synthetic */ void zze(zzapw zzapw, zzgsr zzgsr) {
        zzapw.zzd |= 1;
        zzapw.zzf = zzgsr;
    }

    static /* synthetic */ void zzf(zzapw zzapw, int i10) {
        zzapw.zzh = 4;
        zzapw.zzd = 4 | zzapw.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzapq.zza, "zzh", zzapo.zza});
        } else if (i11 == 3) {
            return new zzapw();
        } else {
            if (i11 == 4) {
                return new zzapv((zzaol) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
