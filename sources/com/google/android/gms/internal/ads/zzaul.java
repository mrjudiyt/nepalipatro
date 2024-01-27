package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaul extends zzgtz implements zzgvk {
    /* access modifiers changed from: private */
    public static final zzaul zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzaul zzaul = new zzaul();
        zzb = zzaul;
        zzgtz.zzaU(zzaul.class, zzaul);
    }

    private zzaul() {
    }

    public static zzauk zze() {
        return (zzauk) zzb.zzaA();
    }

    public static zzaul zzg() {
        return zzb;
    }

    public static zzaul zzh(zzgsr zzgsr) {
        return (zzaul) zzgtz.zzaE(zzb, zzgsr);
    }

    public static zzaul zzi(zzgsr zzgsr, zzgtl zzgtl) {
        return (zzaul) zzgtz.zzaG(zzb, zzgsr, zzgtl);
    }

    static /* synthetic */ void zzl(zzaul zzaul, String str) {
        str.getClass();
        zzaul.zzd |= 1;
        zzaul.zze = str;
    }

    static /* synthetic */ void zzm(zzaul zzaul, long j10) {
        zzaul.zzd |= 16;
        zzaul.zzi = j10;
    }

    static /* synthetic */ void zzn(zzaul zzaul, String str) {
        str.getClass();
        zzaul.zzd |= 2;
        zzaul.zzf = str;
    }

    static /* synthetic */ void zzo(zzaul zzaul, long j10) {
        zzaul.zzd |= 4;
        zzaul.zzg = j10;
    }

    static /* synthetic */ void zzp(zzaul zzaul, long j10) {
        zzaul.zzd |= 8;
        zzaul.zzh = j10;
    }

    public final long zza() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzaul();
        } else {
            if (i11 == 4) {
                return new zzauk((zzauj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
