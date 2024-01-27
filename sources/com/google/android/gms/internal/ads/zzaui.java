package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaui extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzaui zzb;
    private int zzd;
    private zzaul zze;
    private zzgsr zzf;
    private zzgsr zzg;

    static {
        zzaui zzaui = new zzaui();
        zzb = zzaui;
        zzgtz.zzaU(zzaui.class, zzaui);
    }

    private zzaui() {
        zzgsr zzgsr = zzgsr.zzb;
        this.zzf = zzgsr;
        this.zzg = zzgsr;
    }

    public static zzaui zzc(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzaui) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzaui();
        } else {
            if (i11 == 4) {
                return new zzauh((zzaug) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzaul zzd() {
        zzaul zzaul = this.zze;
        return zzaul == null ? zzaul.zzg() : zzaul;
    }

    public final zzgsr zze() {
        return this.zzg;
    }

    public final zzgsr zzf() {
        return this.zzf;
    }
}
