package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaoc extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzaoc zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private long zzj;
    private long zzk;
    private String zzl = "";
    private long zzm;
    private String zzn = "";
    private String zzo = "";
    private zzgui zzp = zzgtz.zzaN();
    private int zzq;

    static {
        zzaoc zzaoc = new zzaoc();
        zzb = zzaoc;
        zzgtz.zzaU(zzaoc.class, zzaoc);
    }

    private zzaoc() {
    }

    public static zzany zza() {
        return (zzany) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaoc zzaoc, long j10) {
        zzaoc.zzd |= 2;
        zzaoc.zzf = j10;
    }

    static /* synthetic */ void zze(zzaoc zzaoc, String str) {
        str.getClass();
        zzaoc.zzd |= 4;
        zzaoc.zzg = str;
    }

    static /* synthetic */ void zzf(zzaoc zzaoc, String str) {
        str.getClass();
        zzaoc.zzd |= 8;
        zzaoc.zzh = str;
    }

    static /* synthetic */ void zzg(zzaoc zzaoc, String str) {
        zzaoc.zzd |= 16;
        zzaoc.zzi = str;
    }

    static /* synthetic */ void zzh(zzaoc zzaoc, String str) {
        zzaoc.zzd |= 1024;
        zzaoc.zzo = str;
    }

    static /* synthetic */ void zzi(zzaoc zzaoc, String str) {
        str.getClass();
        zzaoc.zzd |= 1;
        zzaoc.zze = str;
    }

    static /* synthetic */ void zzj(zzaoc zzaoc, int i10) {
        zzaoc.zzq = i10 - 1;
        zzaoc.zzd |= 2048;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzaoa.class, "zzq", zzaob.zza});
        } else if (i11 == 3) {
            return new zzaoc();
        } else {
            if (i11 == 4) {
                return new zzany((zzanx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
