package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzh {
    private final zzk zza;
    private final Clock zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private final Map<Class<? extends zzj>, zzj> zzj;
    private final List<zzt> zzk;

    zzh(zzh zzh2) {
        this.zza = zzh2.zza;
        this.zzb = zzh2.zzb;
        this.zzd = zzh2.zzd;
        this.zze = zzh2.zze;
        this.zzf = zzh2.zzf;
        this.zzg = zzh2.zzg;
        this.zzh = zzh2.zzh;
        this.zzk = new ArrayList(zzh2.zzk);
        this.zzj = new HashMap(zzh2.zzj.size());
        for (Map.Entry next : zzh2.zzj.entrySet()) {
            zzj zzn = zzn((Class) next.getKey());
            ((zzj) next.getValue()).zzc(zzn);
            this.zzj.put((Class) next.getKey(), zzn);
        }
    }

    @TargetApi(19)
    private static <T extends zzj> T zzn(Class<T> cls) {
        try {
            return (zzj) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            if (e10 instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e10);
            } else if (e10 instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e10);
            } else if (Build.VERSION.SDK_INT < 19 || !(e10 instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e10);
            } else {
                throw new IllegalArgumentException("Linkage exception", e10);
            }
        }
    }

    @VisibleForTesting
    public final long zza() {
        return this.zzd;
    }

    @VisibleForTesting
    public final <T extends zzj> T zzb(Class<T> cls) {
        T t10 = (zzj) this.zzj.get(cls);
        if (t10 != null) {
            return t10;
        }
        T zzn = zzn(cls);
        this.zzj.put(cls, zzn);
        return zzn;
    }

    @VisibleForTesting
    public final <T extends zzj> T zzc(Class<T> cls) {
        return (zzj) this.zzj.get(cls);
    }

    /* access modifiers changed from: package-private */
    public final zzk zzd() {
        return this.zza;
    }

    @VisibleForTesting
    public final Collection<zzj> zze() {
        return this.zzj.values();
    }

    public final List<zzt> zzf() {
        return this.zzk;
    }

    @VisibleForTesting
    public final void zzg(zzj zzj2) {
        Preconditions.checkNotNull(zzj2);
        Class cls = zzj2.getClass();
        if (cls.getSuperclass() == zzj.class) {
            zzj2.zzc(zzb(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzh() {
        this.zzi = true;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzi() {
        this.zzf = this.zzb.elapsedRealtime();
        long j10 = this.zze;
        if (j10 != 0) {
            this.zzd = j10;
        } else {
            this.zzd = this.zzb.currentTimeMillis();
        }
        this.zzc = true;
    }

    @VisibleForTesting
    public final void zzj(long j10) {
        this.zze = j10;
    }

    @VisibleForTesting
    public final void zzk() {
        this.zza.zzm().zzk(this);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean zzl() {
        return this.zzi;
    }

    @VisibleForTesting
    public final boolean zzm() {
        return this.zzc;
    }

    @VisibleForTesting
    zzh(zzk zzk2, Clock clock) {
        Preconditions.checkNotNull(zzk2);
        Preconditions.checkNotNull(clock);
        this.zza = zzk2;
        this.zzb = clock;
        this.zzg = 1800000;
        this.zzh = 3024000000L;
        this.zzj = new HashMap();
        this.zzk = new ArrayList();
    }
}
