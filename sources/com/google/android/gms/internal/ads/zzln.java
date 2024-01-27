package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzln {
    private final zzlm zza;
    private final zzll zzb;
    private final zzdy zzc;
    private final zzcv zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzln(zzll zzll, zzlm zzlm, zzcv zzcv, int i10, zzdy zzdy, Looper looper) {
        this.zzb = zzll;
        this.zza = zzlm;
        this.zzd = zzcv;
        this.zzg = looper;
        this.zzc = zzdy;
        this.zzh = i10;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzlm zzc() {
        return this.zza;
    }

    public final zzln zzd() {
        zzdx.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzln zze(Object obj) {
        zzdx.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzln zzf(int i10) {
        zzdx.zzf(!this.zzi);
        this.zze = i10;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzj = z10 | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j10) {
        zzdx.zzf(this.zzi);
        zzdx.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (!this.zzk) {
            if (j10 > 0) {
                wait(j10);
                j10 = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
