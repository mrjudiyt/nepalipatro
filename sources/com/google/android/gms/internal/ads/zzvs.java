package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzvs extends zzcv {
    private static final Object zzc = new Object();
    private static final zzbp zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbp zzh;
    private final zzbf zzi;

    static {
        zzar zzar = new zzar();
        zzar.zza("SinglePeriodTimeline");
        zzar.zzb(Uri.EMPTY);
        zzd = zzar.zzc();
    }

    public zzvs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, zzbp zzbp, zzbf zzbf) {
        this.zze = j13;
        this.zzf = j14;
        this.zzg = z10;
        Objects.requireNonNull(zzbp);
        this.zzh = zzbp;
        this.zzi = zzbf;
    }

    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzcs zzd(int i10, zzcs zzcs, boolean z10) {
        zzdx.zza(i10, 0, 1);
        zzcs.zzl((Object) null, z10 ? zzc : null, 0, this.zze, 0, zzd.zza, false);
        return zzcs;
    }

    public final zzcu zze(int i10, zzcu zzcu, long j10) {
        zzdx.zza(i10, 0, 1);
        zzbf zzbf = this.zzi;
        zzcu.zza(zzcu.zza, this.zzh, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, zzbf, 0, this.zzf, 0, 0, 0);
        return zzcu;
    }

    public final Object zzf(int i10) {
        zzdx.zza(i10, 0, 1);
        return zzc;
    }
}
