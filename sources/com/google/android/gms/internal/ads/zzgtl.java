package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgtl {
    static final zzgtl zza = new zzgtl(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgtl zzd;
    private final Map zze;

    zzgtl() {
        this.zze = new HashMap();
    }

    public static zzgtl zza() {
        return zza;
    }

    public static zzgtl zzb() {
        Class<zzgtl> cls = zzgtl.class;
        zzgtl zzgtl = zzd;
        if (zzgtl != null) {
            return zzgtl;
        }
        synchronized (cls) {
            zzgtl zzgtl2 = zzd;
            if (zzgtl2 != null) {
                return zzgtl2;
            }
            zzgtl zzb2 = zzgtt.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgtx zzc(zzgvj zzgvj, int i10) {
        return (zzgtx) this.zze.get(new zzgtk(zzgvj, i10));
    }

    zzgtl(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
