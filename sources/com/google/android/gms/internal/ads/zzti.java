package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzti {
    private final zzabt zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzgh zze;

    public zzti(zzabt zzabt) {
        this.zza = zzabt;
    }

    public final void zza(zzgh zzgh) {
        if (zzgh != this.zze) {
            this.zze = zzgh;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
