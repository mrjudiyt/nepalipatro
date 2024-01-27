package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzazd extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzazd zzb;
    private int zzd;
    private String zze = "";
    private zzbat zzf;
    private int zzg;
    private zzbav zzh;
    private int zzi;
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzazd zzazd = new zzazd();
        zzb = zzazd;
        zzgtz.zzaU(zzazd.class, zzazd);
    }

    private zzazd() {
    }

    public static zzazd zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzazd zzazd, String str) {
        zzazd.zzd |= 1;
        zzazd.zze = str;
    }

    static /* synthetic */ void zze(zzazd zzazd, zzbav zzbav) {
        zzbav.getClass();
        zzazd.zzh = zzbav;
        zzazd.zzd |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzazi.zza;
            return zzgtz.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgud, "zzk", zzgud, "zzl", zzgud});
        } else if (i11 == 3) {
            return new zzazd();
        } else {
            if (i11 == 4) {
                return new zzazc((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
