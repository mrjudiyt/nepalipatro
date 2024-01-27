package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzd {
    public static final zzd zza = new zzd((Object) null, new zzc[0], 0, -9223372036854775807L, 0);
    public static final zzn zzb = zza.zza;
    private static final zzc zzf = new zzc(0).zzb(0);
    private static final String zzg = Integer.toString(1, 36);
    private static final String zzh = Integer.toString(2, 36);
    private static final String zzi = Integer.toString(3, 36);
    private static final String zzj = Integer.toString(4, 36);
    public final int zzc = 0;
    public final long zzd = 0;
    public final int zze;
    private final zzc[] zzk;

    private zzd(Object obj, zzc[] zzcArr, long j10, long j11, int i10) {
        this.zzk = zzcArr;
        this.zze = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            return zzfk.zzE((Object) null, (Object) null) && Arrays.equals(this.zzk, ((zzd) obj).zzk);
        }
    }

    public final int hashCode() {
        return (((int) -9223372036854775807L) * 961) + Arrays.hashCode(this.zzk);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }

    public final zzc zza(int i10) {
        return i10 < 0 ? zzf : this.zzk[i10];
    }

    public final boolean zzb(int i10) {
        zza(-1);
        zzn zzn = zzc.zza;
        return false;
    }
}
