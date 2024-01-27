package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbav extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbav zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbav zzbav = new zzbav();
        zzb = zzbav;
        zzgtz.zzaU(zzbav.class, zzbav);
    }

    private zzbav() {
    }

    public static zzbau zza() {
        return (zzbau) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbav zzbav, int i10) {
        zzbav.zzd |= 1;
        zzbav.zze = i10;
    }

    static /* synthetic */ void zze(zzbav zzbav, int i10) {
        zzbav.zzd |= 2;
        zzbav.zzf = i10;
    }

    static /* synthetic */ void zzf(zzbav zzbav, int i10) {
        zzbav.zzd |= 4;
        zzbav.zzg = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzbav();
        } else {
            if (i11 == 4) {
                return new zzbau((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
