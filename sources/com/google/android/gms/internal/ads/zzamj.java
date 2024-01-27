package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzamj {
    private final AtomicInteger zza = new AtomicInteger();
    private final Set zzb = new HashSet();
    private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
    private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
    private final zzalq zze;
    private final zzalz zzf;
    private final zzama[] zzg;
    private zzals zzh;
    private final List zzi = new ArrayList();
    private final List zzj = new ArrayList();
    private final zzalx zzk;

    public zzamj(zzalq zzalq, zzalz zzalz, int i10) {
        zzalx zzalx = new zzalx(new Handler(Looper.getMainLooper()));
        this.zze = zzalq;
        this.zzf = zzalz;
        this.zzg = new zzama[4];
        this.zzk = zzalx;
    }

    public final zzamg zza(zzamg zzamg) {
        zzamg.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzamg);
        }
        zzamg.zzg(this.zza.incrementAndGet());
        zzamg.zzm("add-to-queue");
        zzc(zzamg, 0);
        this.zzc.add(zzamg);
        return zzamg;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzamg zzamg) {
        synchronized (this.zzb) {
            this.zzb.remove(zzamg);
        }
        synchronized (this.zzi) {
            for (zzami zza2 : this.zzi) {
                zza2.zza();
            }
        }
        zzc(zzamg, 5);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzamg zzamg, int i10) {
        synchronized (this.zzj) {
            for (zzamh zza2 : this.zzj) {
                zza2.zza();
            }
        }
    }

    public final void zzd() {
        zzals zzals = this.zzh;
        if (zzals != null) {
            zzals.zzb();
        }
        zzama[] zzamaArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzama zzama = zzamaArr[i10];
            if (zzama != null) {
                zzama.zza();
            }
        }
        zzals zzals2 = new zzals(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzals2;
        zzals2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzama zzama2 = new zzama(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i11] = zzama2;
            zzama2.start();
        }
    }
}
