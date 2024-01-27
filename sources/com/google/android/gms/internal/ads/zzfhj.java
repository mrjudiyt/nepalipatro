package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfhj {
    /* access modifiers changed from: private */
    public static final e zza = zzfzt.zzh((Object) null);
    /* access modifiers changed from: private */
    public final zzgad zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzfhk zzd;

    public zzfhj(zzgad zzgad, ScheduledExecutorService scheduledExecutorService, zzfhk zzfhk) {
        this.zzb = zzgad;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfhk;
    }

    public final zzfgz zza(Object obj, e... eVarArr) {
        return new zzfgz(this, obj, Arrays.asList(eVarArr), (zzfgy) null);
    }

    public final zzfhi zzb(Object obj, e eVar) {
        return new zzfhi(this, obj, (String) null, eVar, Collections.singletonList(eVar), eVar, (zzfhh) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
