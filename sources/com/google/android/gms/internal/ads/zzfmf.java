package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfmf {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfme zzd = null;

    public zzfmf() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfme zzfme = (zzfme) this.zzc.poll();
        this.zzd = zzfme;
        if (zzfme != null) {
            zzfme.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfme zzfme) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfme zzfme) {
        zzfme.zzb(this);
        this.zzc.add(zzfme);
        if (this.zzd == null) {
            zzc();
        }
    }
}
