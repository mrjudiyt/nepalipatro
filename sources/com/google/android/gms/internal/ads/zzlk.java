package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzlk {
    private static final zztw zzt = new zztw(new Object(), -1);
    public final zzcv zza;
    public final zztw zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzil zzf;
    public final boolean zzg;
    public final zzvx zzh;
    public final zzxr zzi;
    public final List zzj;
    public final zztw zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcg zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzlk(zzcv zzcv, zztw zztw, long j10, long j11, int i10, zzil zzil, boolean z10, zzvx zzvx, zzxr zzxr, List list, zztw zztw2, boolean z11, int i11, zzcg zzcg, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzcv;
        this.zzb = zztw;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzil;
        this.zzg = z10;
        this.zzh = zzvx;
        this.zzi = zzxr;
        this.zzj = list;
        this.zzk = zztw2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzcg;
        this.zzp = j12;
        this.zzq = j13;
        this.zzr = j14;
        this.zzs = j15;
        this.zzo = z12;
    }

    public static zzlk zzi(zzxr zzxr) {
        zzcv zzcv = zzcv.zza;
        zztw zztw = zzt;
        return new zzlk(zzcv, zztw, -9223372036854775807L, 0, 1, (zzil) null, false, zzvx.zza, zzxr, zzfvs.zzl(), zztw, false, 0, zzcg.zza, 0, 0, 0, 0, false);
    }

    public static zztw zzj() {
        return zzt;
    }

    public final long zza() {
        long j10;
        long j11;
        if (!zzk()) {
            return this.zzr;
        }
        do {
            j10 = this.zzs;
            j11 = this.zzr;
        } while (j10 != this.zzs);
        return zzfk.zzq(zzfk.zzs(j11) + ((long) (((float) (SystemClock.elapsedRealtime() - j10)) * this.zzn.zzc)));
    }

    public final zzlk zzb() {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlk zzc(zztw zztw) {
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        zzcg zzcg = this.zzn;
        long j10 = this.zzp;
        long j11 = this.zzq;
        long j12 = this.zzr;
        long j13 = this.zzs;
        boolean z11 = this.zzo;
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztw, z10, i10, zzcg, j10, j11, j12, j13, z11);
    }

    public final zzlk zzd(zztw zztw, long j10, long j11, long j12, long j13, zzvx zzvx, zzxr zzxr, List list) {
        long j14 = j11;
        long j15 = j12;
        long j16 = j13;
        zzvx zzvx2 = zzvx;
        zzxr zzxr2 = zzxr;
        List list2 = list;
        zztw zztw2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        zzcg zzcg = this.zzn;
        long j17 = this.zzp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = this.zzo;
        int i11 = this.zze;
        zzil zzil = this.zzf;
        boolean z12 = this.zzg;
        return new zzlk(this.zza, zztw, j14, j15, i11, zzil, z12, zzvx2, zzxr2, list2, zztw2, z10, i10, zzcg, j17, j16, j10, elapsedRealtime, z11);
    }

    public final zzlk zze(boolean z10, int i10) {
        zzcg zzcg = this.zzn;
        long j10 = this.zzp;
        long j11 = this.zzq;
        long j12 = this.zzr;
        long j13 = this.zzs;
        boolean z11 = this.zzo;
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, zzcg, j10, j11, j12, j13, z11);
    }

    public final zzlk zzf(zzil zzil) {
        boolean z10 = this.zzg;
        zzvx zzvx = this.zzh;
        zzxr zzxr = this.zzi;
        List list = this.zzj;
        zztw zztw = this.zzk;
        boolean z11 = this.zzl;
        int i10 = this.zzm;
        zzcg zzcg = this.zzn;
        long j10 = this.zzp;
        long j11 = this.zzq;
        long j12 = this.zzr;
        long j13 = this.zzs;
        boolean z12 = this.zzo;
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzil, z10, zzvx, zzxr, list, zztw, z11, i10, zzcg, j10, j11, j12, j13, z12);
    }

    public final zzlk zzg(int i10) {
        zzil zzil = this.zzf;
        boolean z10 = this.zzg;
        zzvx zzvx = this.zzh;
        zzxr zzxr = this.zzi;
        List list = this.zzj;
        zztw zztw = this.zzk;
        boolean z11 = this.zzl;
        int i11 = this.zzm;
        zzcg zzcg = this.zzn;
        long j10 = this.zzp;
        long j11 = this.zzq;
        long j12 = this.zzr;
        long j13 = this.zzs;
        boolean z12 = this.zzo;
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, i10, zzil, z10, zzvx, zzxr, list, zztw, z11, i11, zzcg, j10, j11, j12, j13, z12);
    }

    public final zzlk zzh(zzcv zzcv) {
        return new zzlk(zzcv, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final boolean zzk() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
