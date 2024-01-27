package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgoo extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzgoo zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzgou zzf;
    /* access modifiers changed from: private */
    public zzgsr zzg = zzgsr.zzb;

    static {
        zzgoo zzgoo = new zzgoo();
        zzb = zzgoo;
        zzgtz.zzaU(zzgoo.class, zzgoo);
    }

    private zzgoo() {
    }

    public static zzgon zzc() {
        return (zzgon) zzb.zzaA();
    }

    public static zzgoo zze() {
        return zzb;
    }

    public static zzgoo zzf(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzgoo) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzj(zzgoo zzgoo, zzgou zzgou) {
        zzgou.getClass();
        zzgoo.zzf = zzgou;
        zzgoo.zzd |= 1;
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
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgoo();
        } else {
            if (i11 == 4) {
                return new zzgon((zzgom) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgou zzg() {
        zzgou zzgou = this.zzf;
        return zzgou == null ? zzgou.zzf() : zzgou;
    }

    public final zzgsr zzh() {
        return this.zzg;
    }
}
