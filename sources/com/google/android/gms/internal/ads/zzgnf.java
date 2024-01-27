package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgnf extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgnf zzb;
    private int zzd;
    private zzgni zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgnf zzgnf = new zzgnf();
        zzb = zzgnf;
        zzgtz.zzaU(zzgnf.class, zzgnf);
    }

    private zzgnf() {
    }

    public static zzgne zzc() {
        return (zzgne) zzb.zzaA();
    }

    public static zzgnf zze() {
        return zzb;
    }

    public static zzgnf zzf(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgnf) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzh(zzgnf zzgnf, zzgni zzgni) {
        zzgni.getClass();
        zzgnf.zze = zzgni;
        zzgnf.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgnf();
        } else {
            if (i11 == 4) {
                return new zzgne((zzgnd) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgni zzg() {
        zzgni zzgni = this.zze;
        return zzgni == null ? zzgni.zze() : zzgni;
    }
}
