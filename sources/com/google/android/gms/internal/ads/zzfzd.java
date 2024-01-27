package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzfzd extends zzfys {
    private List zza;

    zzfzd(zzfvn zzfvn, boolean z10) {
        super(zzfvn, z10, true);
        List list;
        if (zzfvn.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfwg.zza(zzfvn.size());
        }
        for (int i10 = 0; i10 < zzfvn.size(); i10++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzG(List list);

    /* access modifiers changed from: package-private */
    public final void zzf(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzfzc(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzy(int i10) {
        super.zzy(i10);
        this.zza = null;
    }
}
