package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzayn extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzayn zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzayn zzayn = new zzayn();
        zzb = zzayn;
        zzgtz.zzaU(zzayn.class, zzayn);
    }

    private zzayn() {
    }

    public static zzaym zza() {
        return (zzaym) zzb.zzaA();
    }

    public static zzayn zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzayn zzayn, boolean z10) {
        zzayn.zzd |= 1;
        zzayn.zze = z10;
    }

    static /* synthetic */ void zzf(zzayn zzayn, int i10) {
        zzayn.zzd |= 2;
        zzayn.zzf = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzayn();
        } else {
            if (i11 == 4) {
                return new zzaym((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
