package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeo {
    private final zzdy zza;
    private final zzei zzb;
    private final zzem zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzeo(Looper looper, zzdy zzdy, zzem zzem) {
        this(new CopyOnWriteArraySet(), looper, zzdy, zzem, true);
    }

    public static /* synthetic */ boolean zzg(zzeo zzeo, Message message) {
        Iterator it = zzeo.zzd.iterator();
        while (it.hasNext()) {
            ((zzen) it.next()).zzb(zzeo.zzc);
            if (zzeo.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdx.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzeo zza(Looper looper, zzem zzem) {
        return new zzeo(this.zzd, looper, this.zza, zzem, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (!this.zzh) {
                this.zzd.add(new zzen(obj));
            }
        }
    }

    public final void zzc() {
        zzh();
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzg(0)) {
                zzei zzei = this.zzb;
                zzei.zzk(zzei.zzb(0));
            }
            boolean z10 = !this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (!z10) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(int i10, zzel zzel) {
        zzh();
        this.zzf.add(new zzek(new CopyOnWriteArraySet(this.zzd), i10, zzel));
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzen) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzen zzen = (zzen) it.next();
            if (zzen.zza.equals(obj)) {
                zzen.zzc(this.zzc);
                this.zzd.remove(zzen);
            }
        }
    }

    private zzeo(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdy zzdy, zzem zzem, boolean z10) {
        this.zza = zzdy;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzem;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdy.zzb(looper, new zzej(this));
        this.zzi = z10;
    }
}
