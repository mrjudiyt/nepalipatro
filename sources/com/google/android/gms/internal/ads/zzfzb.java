package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfzb extends zzfzd {
    zzfzb(zzfvn zzfvn, boolean z10) {
        super(zzfvn, z10);
        zzv();
    }

    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfwg.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfzc zzfzc = (zzfzc) it.next();
            zza.add(zzfzc != null ? zzfzc.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
