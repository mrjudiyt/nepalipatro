package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmw extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgmw zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgnc zzf;
    private zzgoo zzg;

    static {
        zzgmw zzgmw = new zzgmw();
        zzb = zzgmw;
        zzgtz.zzaU(zzgmw.class, zzgmw);
    }

    private zzgmw() {
    }

    public static zzgmv zzc() {
        return (zzgmv) zzb.zzaA();
    }

    public static zzgmw zze(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgmw) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzi(zzgmw zzgmw, zzgnc zzgnc) {
        zzgnc.getClass();
        zzgmw.zzf = zzgnc;
        zzgmw.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzgmw zzgmw, zzgoo zzgoo) {
        zzgoo.getClass();
        zzgmw.zzg = zzgoo;
        zzgmw.zzd |= 2;
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
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgmw();
        } else {
            if (i11 == 4) {
                return new zzgmv((zzgmu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgnc zzf() {
        zzgnc zzgnc = this.zzf;
        return zzgnc == null ? zzgnc.zze() : zzgnc;
    }

    public final zzgoo zzg() {
        zzgoo zzgoo = this.zzg;
        return zzgoo == null ? zzgoo.zze() : zzgoo;
    }
}
