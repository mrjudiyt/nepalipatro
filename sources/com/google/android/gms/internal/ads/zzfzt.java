package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfzt extends zzfzv {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfzs zza(java.lang.Iterable r3) {
        /*
            com.google.android.gms.internal.ads.zzfzs r0 = new com.google.android.gms.internal.ads.zzfzs
            com.google.android.gms.internal.ads.zzfvs r3 = com.google.android.gms.internal.ads.zzfvs.zzj(r3)
            r1 = 0
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzt.zza(java.lang.Iterable):com.google.android.gms.internal.ads.zzfzs");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfzs zzb(java.lang.Iterable r3) {
        /*
            com.google.android.gms.internal.ads.zzfzs r0 = new com.google.android.gms.internal.ads.zzfzs
            int r1 = com.google.android.gms.internal.ads.zzfvs.zzd
            java.util.Objects.requireNonNull(r3)
            r1 = 1
            com.google.android.gms.internal.ads.zzfvs r3 = com.google.android.gms.internal.ads.zzfvs.zzj(r3)
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzt.zzb(java.lang.Iterable):com.google.android.gms.internal.ads.zzfzs");
    }

    @SafeVarargs
    public static zzfzs zzc(e... eVarArr) {
        return new zzfzs(true, zzfvs.zzk(eVarArr), (zzfzr) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.util.concurrent.e zzd(java.lang.Iterable r2) {
        /*
            com.google.android.gms.internal.ads.zzfzb r0 = new com.google.android.gms.internal.ads.zzfzb
            com.google.android.gms.internal.ads.zzfvs r2 = com.google.android.gms.internal.ads.zzfvs.zzj(r2)
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzt.zzd(java.lang.Iterable):com.google.common.util.concurrent.e");
    }

    public static e zze(e eVar, Class cls, zzfsk zzfsk, Executor executor) {
        zzfye zzfye = new zzfye(eVar, cls, zzfsk);
        eVar.addListener(zzfye, zzgaj.zzc(executor, zzfye));
        return zzfye;
    }

    public static e zzf(e eVar, Class cls, zzfza zzfza, Executor executor) {
        zzfyd zzfyd = new zzfyd(eVar, cls, zzfza);
        eVar.addListener(zzfyd, zzgaj.zzc(executor, zzfyd));
        return zzfyd;
    }

    public static e zzg(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfzw(th);
    }

    public static e zzh(Object obj) {
        if (obj == null) {
            return zzfzx.zza;
        }
        return new zzfzx(obj);
    }

    public static e zzi() {
        return zzfzx.zza;
    }

    public static e zzj(Callable callable, Executor executor) {
        zzgas zzgas = new zzgas(callable);
        executor.execute(zzgas);
        return zzgas;
    }

    public static e zzk(zzfyz zzfyz, Executor executor) {
        zzgas zzgas = new zzgas(zzfyz);
        executor.execute(zzgas);
        return zzgas;
    }

    @SafeVarargs
    public static e zzl(e... eVarArr) {
        return new zzfzb(zzfvs.zzk(eVarArr), false);
    }

    public static e zzm(e eVar, zzfsk zzfsk, Executor executor) {
        zzfyo zzfyo = new zzfyo(eVar, zzfsk);
        eVar.addListener(zzfyo, zzgaj.zzc(executor, zzfyo));
        return zzfyo;
    }

    public static e zzn(e eVar, zzfza zzfza, Executor executor) {
        int i10 = zzfyp.zzc;
        Objects.requireNonNull(executor);
        zzfyn zzfyn = new zzfyn(eVar, zzfza);
        eVar.addListener(zzfyn, zzgaj.zzc(executor, zzfyn));
        return zzfyn;
    }

    public static e zzo(e eVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (eVar.isDone()) {
            return eVar;
        }
        return zzgap.zzf(eVar, j10, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) {
        if (future.isDone()) {
            return zzgau.zza(future);
        }
        throw new IllegalStateException(zzftl.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgau.zza(future);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new zzfzi((Error) cause);
            }
            throw new zzgat(cause);
        }
    }

    public static void zzr(e eVar, zzfzp zzfzp, Executor executor) {
        Objects.requireNonNull(zzfzp);
        eVar.addListener(new zzfzq(eVar, zzfzp), executor);
    }
}
