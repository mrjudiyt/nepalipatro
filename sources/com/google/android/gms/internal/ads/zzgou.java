package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgou extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgou zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgou zzgou = new zzgou();
        zzb = zzgou;
        zzgtz.zzaU(zzgou.class, zzgou);
    }

    private zzgou() {
    }

    public static zzgot zzd() {
        return (zzgot) zzb.zzaA();
    }

    public static zzgou zzf() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgou();
        } else {
            if (i11 == 4) {
                return new zzgot((zzgos) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgol zzc() {
        int i10 = this.zzd;
        zzgol zzgol = zzgol.UNKNOWN_HASH;
        if (i10 != 0) {
            zzgol = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : zzgol.SHA224 : zzgol.SHA512 : zzgol.SHA256 : zzgol.SHA384 : zzgol.SHA1;
        }
        return zzgol == null ? zzgol.UNRECOGNIZED : zzgol;
    }
}
