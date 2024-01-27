package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgni extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgni zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzgni zzgni = new zzgni();
        zzb = zzgni;
        zzgtz.zzaU(zzgni.class, zzgni);
    }

    private zzgni() {
    }

    public static zzgnh zzc() {
        return (zzgnh) zzb.zzaA();
    }

    public static zzgni zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzgni();
        } else {
            if (i11 == 4) {
                return new zzgnh((zzgng) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
