package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfhb {
    public static final zzfhi zza(Callable callable, Object obj, zzfhj zzfhj) {
        return zzb(callable, zzfhj.zzb, obj, zzfhj);
    }

    public static final zzfhi zzb(Callable callable, zzgad zzgad, Object obj, zzfhj zzfhj) {
        return new zzfhi(zzfhj, obj, (String) null, zzfhj.zza, Collections.emptyList(), zzgad.zzb(callable), (zzfhh) null);
    }

    public static final zzfhi zzc(e eVar, Object obj, zzfhj zzfhj) {
        return new zzfhi(zzfhj, obj, (String) null, zzfhj.zza, Collections.emptyList(), eVar, (zzfhh) null);
    }

    public static final zzfhi zzd(zzfgv zzfgv, zzgad zzgad, Object obj, zzfhj zzfhj) {
        return zzb(new zzfha(zzfgv), zzgad, obj, zzfhj);
    }
}
