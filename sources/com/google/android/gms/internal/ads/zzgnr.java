package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgnr extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgnr zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzgnr zzgnr = new zzgnr();
        zzb = zzgnr;
        zzgtz.zzaU(zzgnr.class, zzgnr);
    }

    private zzgnr() {
    }

    public static zzgnq zzc() {
        return (zzgnq) zzb.zzaA();
    }

    public static zzgnr zze() {
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
            return new zzgnr();
        } else {
            if (i11 == 4) {
                return new zzgnq((zzgnp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
