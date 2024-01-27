package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgyt extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgyt zzb;
    private int zzd;
    private zzgys zze;
    private zzgui zzf = zzgtz.zzaN();
    private zzgsr zzg;
    private zzgsr zzh;
    private int zzi;
    private byte zzj = 2;

    static {
        zzgyt zzgyt = new zzgyt();
        zzb = zzgyt;
        zzgtz.zzaU(zzgyt.class, zzgyt);
    }

    private zzgyt() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zzg = zzgsr;
        this.zzh = zzgsr;
    }

    public static zzgyq zza() {
        return (zzgyq) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgyt zzgyt, zzgyp zzgyp) {
        zzgyp.getClass();
        zzgui zzgui = zzgyt.zzf;
        if (!zzgui.zzc()) {
            zzgyt.zzf = zzgtz.zzaO(zzgui);
        }
        zzgyt.zzf.add(zzgyp);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgyp.class, "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzgyt();
        } else {
            if (i11 == 4) {
                return new zzgyq((zzgxt) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzj = b10;
            return null;
        }
    }
}
