package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbal extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbal zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzban zzo;

    static {
        zzbal zzbal = new zzbal();
        zzb = zzbal;
        zzgtz.zzaU(zzbal.class, zzbal);
    }

    private zzbal() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgud zzgud = zzazi.zza;
            return zzgtz.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", zzgud, "zzf", zzgud, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        } else if (i11 == 3) {
            return new zzbal();
        } else {
            if (i11 == 4) {
                return new zzbak((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
