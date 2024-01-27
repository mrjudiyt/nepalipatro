package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzfys extends zzfyy {
    private static final Logger zza = Logger.getLogger(zzfys.class.getName());
    private zzfvn zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfys(zzfvn zzfvn, boolean z10, boolean z11) {
        super(zzfvn.size());
        this.zzb = zzfvn;
        this.zzc = z10;
        this.zze = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzf(i10, zzfzt.zzp(future));
        } catch (ExecutionException e10) {
            zzI(e10.getCause());
        } catch (Error | RuntimeException e11) {
            zzI(e11);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzx(zzfvn zzfvn) {
        int zzA = zzA();
        int i10 = 0;
        zzfsw.zzj(zzA >= 0, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfvn != null) {
                zzfxs zze2 = zzfvn.iterator();
                while (zze2.hasNext()) {
                    Future future = (Future) zze2.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zzd(th) && zzK(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzfvn zzfvn = this.zzb;
        if (zzfvn != null) {
            return "futures=".concat(zzfvn.toString());
        }
        return super.zza();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfvn zzfvn = this.zzb;
        boolean z10 = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzfvn == null) {
            z10 = false;
        }
        if (z10 && isCancelled) {
            boolean zzt = zzt();
            zzfxs zze2 = zzfvn.iterator();
            while (zze2.hasNext()) {
                ((Future) zze2.next()).cancel(zzt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(Set set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable zzl = zzl();
            zzl.getClass();
            zzK(set, zzl);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zzf(int i10, Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzu();

    /* access modifiers changed from: package-private */
    public final void zzv() {
        zzfvn zzfvn = this.zzb;
        zzfvn.getClass();
        if (zzfvn.isEmpty()) {
            zzu();
        } else if (this.zzc) {
            zzfxs zze2 = this.zzb.iterator();
            int i10 = 0;
            while (zze2.hasNext()) {
                e eVar = (e) zze2.next();
                eVar.addListener(new zzfyq(this, eVar, i10), zzfzh.INSTANCE);
                i10++;
            }
        } else {
            zzfyr zzfyr = new zzfyr(this, this.zze ? this.zzb : null);
            zzfxs zze3 = this.zzb.iterator();
            while (zze3.hasNext()) {
                ((e) zze3.next()).addListener(zzfyr, zzfzh.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzw(e eVar, int i10) {
        try {
            if (eVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, eVar);
            }
        } finally {
            zzx((zzfvn) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzy(int i10) {
        this.zzb = null;
    }
}
