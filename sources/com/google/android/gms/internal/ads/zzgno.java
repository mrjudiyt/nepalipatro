package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgno extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgno zzb;
    private int zzd;
    private zzgnr zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgno zzgno = new zzgno();
        zzb = zzgno;
        zzgtz.zzaU(zzgno.class, zzgno);
    }

    private zzgno() {
    }

    public static zzgnn zzc() {
        return (zzgnn) zzb.zzaA();
    }

    public static zzgno zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgno) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzg(zzgno zzgno, zzgnr zzgnr) {
        zzgnr.getClass();
        zzgno.zze = zzgnr;
        zzgno.zzd |= 1;
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
            return new zzgno();
        } else {
            if (i11 == 4) {
                return new zzgnn((zzgnm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgnr zzf() {
        zzgnr zzgnr = this.zze;
        return zzgnr == null ? zzgnr.zze() : zzgnr;
    }
}
