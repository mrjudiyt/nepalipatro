package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcu {
    private static final String zzA = Integer.toString(8, 36);
    private static final String zzB = Integer.toString(9, 36);
    private static final String zzC = Integer.toString(10, 36);
    private static final String zzD = Integer.toString(11, 36);
    private static final String zzE = Integer.toString(12, 36);
    private static final String zzF = Integer.toString(13, 36);
    public static final Object zza = new Object();
    public static final zzn zzb = zzct.zza;
    private static final Object zzr = new Object();
    private static final zzbp zzs;
    private static final String zzt = Integer.toString(1, 36);
    private static final String zzu = Integer.toString(2, 36);
    private static final String zzv = Integer.toString(3, 36);
    private static final String zzw = Integer.toString(4, 36);
    private static final String zzx = Integer.toString(5, 36);
    private static final String zzy = Integer.toString(6, 36);
    private static final String zzz = Integer.toString(7, 36);
    public Object zzc = zza;
    @Deprecated
    public Object zzd;
    public zzbp zze = zzs;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    @Deprecated
    public boolean zzk;
    public zzbf zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;

    static {
        zzar zzar = new zzar();
        zzar.zza("androidx.media3.common.Timeline");
        zzar.zzb(Uri.EMPTY);
        zzs = zzar.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcu.class.equals(obj.getClass())) {
            zzcu zzcu = (zzcu) obj;
            return zzfk.zzE(this.zzc, zzcu.zzc) && zzfk.zzE(this.zze, zzcu.zze) && zzfk.zzE((Object) null, (Object) null) && zzfk.zzE(this.zzl, zzcu.zzl) && this.zzf == zzcu.zzf && this.zzg == zzcu.zzg && this.zzh == zzcu.zzh && this.zzi == zzcu.zzi && this.zzj == zzcu.zzj && this.zzm == zzcu.zzm && this.zzo == zzcu.zzo && this.zzp == zzcu.zzp && this.zzq == zzcu.zzq;
        }
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        zzbf zzbf = this.zzl;
        if (zzbf == null) {
            i10 = 0;
        } else {
            i10 = zzbf.hashCode();
        }
        long j10 = this.zzf;
        long j11 = this.zzg;
        long j12 = this.zzh;
        int i11 = (((((((((((((hashCode * 961) + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j13 = this.zzo;
        return ((((((i11 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzcu zza(Object obj, zzbp zzbp, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, zzbf zzbf, long j13, long j14, int i10, int i11, long j15) {
        zzbf zzbf2 = zzbf;
        this.zzc = obj;
        this.zze = zzbp == null ? zzs : zzbp;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = zzbf2 != null;
        this.zzl = zzbf2;
        this.zzn = 0;
        this.zzo = j14;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        zzdx.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}
