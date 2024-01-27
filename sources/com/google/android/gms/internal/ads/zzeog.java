package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzeog implements zzetw {
    private final Set zza;

    zzeog(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final e zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zza) {
            arrayList.add(add);
        }
        return zzfzt.zzh(new zzeof(arrayList));
    }
}
