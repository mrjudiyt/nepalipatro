package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdsr implements zzfhs {
    private final Map zza = new HashMap();
    private final zzdsj zzb;
    private final Clock zzc;
    private final Map zzd = new HashMap();

    public zzdsr(zzdsj zzdsj, Set set, Clock clock) {
        this.zzb = zzdsj;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdsq zzdsq = (zzdsq) it.next();
            this.zzd.put(zzdsq.zzc, zzdsq);
        }
        this.zzc = clock;
    }

    private final void zze(zzfhl zzfhl, boolean z10) {
        zzfhl zzb2 = ((zzdsq) this.zzd.get(zzfhl)).zzb;
        if (this.zza.containsKey(zzb2)) {
            String str = true != z10 ? "f." : "s.";
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzb2)).longValue();
            this.zzb.zza().put("label.".concat(((zzdsq) this.zzd.get(zzfhl)).zza), str.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    public final void zzbG(zzfhl zzfhl, String str) {
    }

    public final void zzbH(zzfhl zzfhl, String str, Throwable th) {
        if (this.zza.containsKey(zzfhl)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            zzdsj zzdsj = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsj.zza().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(clock.elapsedRealtime() - ((Long) map.get(zzfhl)).longValue()))));
        }
        if (this.zzd.containsKey(zzfhl)) {
            zze(zzfhl, false);
        }
    }

    public final void zzbI(zzfhl zzfhl, String str) {
        this.zza.put(zzfhl, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    public final void zzd(zzfhl zzfhl, String str) {
        if (this.zza.containsKey(zzfhl)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfhl)).longValue();
            zzdsj zzdsj = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsj.zza().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfhl)) {
            zze(zzfhl, true);
        }
    }
}
