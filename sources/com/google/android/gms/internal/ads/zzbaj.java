package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbaj extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzbaj zzb;
    private int zzd;
    private zzgui zze = zzgtz.zzaN();
    private int zzf;
    private int zzg;
    private long zzh;
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private int zzl;

    static {
        zzbaj zzbaj = new zzbaj();
        zzb = zzbaj;
        zzgtz.zzaU(zzbaj.class, zzbaj);
    }

    private zzbaj() {
    }

    public static zzbaf zza() {
        return (zzbaf) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbaj zzbaj, Iterable iterable) {
        zzgui zzgui = zzbaj.zze;
        if (!zzgui.zzc()) {
            zzbaj.zze = zzgtz.zzaO(zzgui);
        }
        zzgsa.zzav(iterable, zzbaj.zze);
    }

    static /* synthetic */ void zze(zzbaj zzbaj, int i10) {
        zzbaj.zzd |= 1;
        zzbaj.zzf = i10;
    }

    static /* synthetic */ void zzf(zzbaj zzbaj, int i10) {
        zzbaj.zzd |= 2;
        zzbaj.zzg = i10;
    }

    static /* synthetic */ void zzg(zzbaj zzbaj, long j10) {
        zzbaj.zzd |= 4;
        zzbaj.zzh = j10;
    }

    static /* synthetic */ void zzh(zzbaj zzbaj, String str) {
        str.getClass();
        zzbaj.zzd |= 8;
        zzbaj.zzi = str;
    }

    static /* synthetic */ void zzi(zzbaj zzbaj, String str) {
        str.getClass();
        zzbaj.zzd |= 16;
        zzbaj.zzj = str;
    }

    static /* synthetic */ void zzj(zzbaj zzbaj, long j10) {
        zzbaj.zzd |= 32;
        zzbaj.zzk = j10;
    }

    static /* synthetic */ void zzk(zzbaj zzbaj, int i10) {
        zzbaj.zzd |= 64;
        zzbaj.zzl = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzbae.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new zzbaj();
        } else {
            if (i11 == 4) {
                return new zzbaf((zzayc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
