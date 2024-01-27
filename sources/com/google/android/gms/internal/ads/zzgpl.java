package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgpl extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgpl zzb;
    private int zzd;
    private zzgoz zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgpl zzgpl = new zzgpl();
        zzb = zzgpl;
        zzgtz.zzaU(zzgpl.class, zzgpl);
    }

    private zzgpl() {
    }

    public static zzgpk zzd() {
        return (zzgpk) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzgpl zzgpl, zzgoz zzgoz) {
        zzgoz.getClass();
        zzgpl.zze = zzgoz;
        zzgpl.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzgpl();
        } else {
            if (i11 == 4) {
                return new zzgpk((zzgpi) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgoz zzc() {
        zzgoz zzgoz = this.zze;
        return zzgoz == null ? zzgoz.zze() : zzgoz;
    }

    public final zzgqf zzf() {
        zzgqf zzb2 = zzgqf.zzb(this.zzh);
        return zzb2 == null ? zzgqf.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final int zzk() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
