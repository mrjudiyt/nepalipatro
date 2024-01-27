package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeby implements zzfhs {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfia zzc;

    public zzeby(Set set, zzfia zzfia) {
        this.zzc = zzfia;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzebx zzebx = (zzebx) it.next();
            this.zza.put(zzebx.zzb, zzebx.zza);
            this.zzb.put(zzebx.zzc, zzebx.zza);
        }
    }

    public final void zzbG(zzfhl zzfhl, String str) {
    }

    public final void zzbH(zzfhl zzfhl, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfhl)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfhl))), "f.");
        }
    }

    public final void zzbI(zzfhl zzfhl, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfhl)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfhl))));
        }
    }

    public final void zzd(zzfhl zzfhl, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfhl)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfhl))), "s.");
        }
    }
}
