package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzym {
    public static final zzyg zza = new zzyg(0, -9223372036854775807L, (zzyf) null);
    public static final zzyg zzb = new zzyg(1, -9223372036854775807L, (zzyf) null);
    public static final zzyg zzc = new zzyg(2, -9223372036854775807L, (zzyf) null);
    public static final zzyg zzd = new zzyg(3, -9223372036854775807L, (zzyf) null);
    /* access modifiers changed from: private */
    public final ExecutorService zze = zzfk.zzC("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */
    public zzyh zzf;
    /* access modifiers changed from: private */
    public IOException zzg;

    public zzym(String str) {
    }

    public static zzyg zzb(boolean z10, long j10) {
        return new zzyg(z10 ? 1 : 0, j10, (zzyf) null);
    }

    public final long zza(zzyi zzyi, zzye zzye, int i10) {
        Looper myLooper = Looper.myLooper();
        zzdx.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzyh(this, myLooper, zzyi, zzye, i10, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzyh zzyh = this.zzf;
        zzdx.zzb(zzyh);
        zzyh.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i10) {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzyh zzyh = this.zzf;
            if (zzyh != null) {
                zzyh.zzb(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzyj zzyj) {
        zzyh zzyh = this.zzf;
        if (zzyh != null) {
            zzyh.zza(true);
        }
        this.zze.execute(new zzyk(zzyj));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
