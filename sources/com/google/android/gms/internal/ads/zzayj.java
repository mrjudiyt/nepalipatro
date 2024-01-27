package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzayj extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzayj zzb;
    private int zzd;
    private int zze;
    private zzayn zzf;
    private zzayp zzg;

    static {
        zzayj zzayj = new zzayj();
        zzb = zzayj;
        zzgtz.zzaU(zzayj.class, zzayj);
    }

    private zzayj() {
    }

    public static zzayi zza() {
        return (zzayi) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzayj zzayj, zzayn zzayn) {
        zzayn.getClass();
        zzayj.zzf = zzayn;
        zzayj.zzd |= 2;
    }

    static /* synthetic */ void zze(zzayj zzayj, zzayp zzayp) {
        zzayp.getClass();
        zzayj.zzg = zzayp;
        zzayj.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzayj zzayj, int i10) {
        zzayj.zze = 1;
        zzayj.zzd = 1 | zzayj.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayl.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzayj();
        } else {
            if (i11 == 4) {
                return new zzayi((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
